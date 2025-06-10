import json

class Medicamento:
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo

    def __str__(self):
        return f"Medicamento: {self.nombre}, Tipo: {self.tipo}"

    def to_dict(self):
        return {
            "nombre": self.nombre,
            "tipo": self.tipo
        }

    @staticmethod
    def from_dict(data):
        return Medicamento(data["nombre"], data["tipo"])


class Sucursal:
    def __init__(self, numero, direccion, medicamentos=None):
        self.numero = numero
        self.direccion = direccion
        self.medicamentos = medicamentos if medicamentos else []

    def agregar_medicamento(self, medicamento):
        self.medicamentos.append(medicamento)

    def obtener_medicamentos_por_tipo(self, tipo):
        return [med for med in self.medicamentos if med.tipo == tipo]

    def __str__(self):
        return f"Sucursal {self.numero}, Dirección: {self.direccion}"

    def to_dict(self):
        return {
            "numero": self.numero,
            "direccion": self.direccion,
            "medicamentos": [med.to_dict() for med in self.medicamentos]
        }

    @staticmethod
    def from_dict(data):
        medicamentos = [Medicamento.from_dict(m) for m in data["medicamentos"]]
        return Sucursal(data["numero"], data["direccion"], medicamentos)


class ArchivoFarmacias:
    def __init__(self, nombre_archivo):
        self.nombre_archivo = nombre_archivo
        self.sucursales = self.cargar_sucursales()

    def cargar_sucursales(self):
        try:
            with open(self.nombre_archivo, "r") as archivo:
                data = json.load(archivo)
                return [Sucursal.from_dict(s) for s in data]
        except (FileNotFoundError, json.JSONDecodeError):
            return []

    def guardar_sucursales(self):
        with open(self.nombre_archivo, "w") as archivo:
            json.dump([sucursal.to_dict() for sucursal in self.sucursales], archivo, indent=4)

    def guardarSucursal(self, sucursal):
        self.sucursales.append(sucursal)
        self.guardar_sucursales()

    def mostrarMedicamentosTos(self, numero_sucursal):
        for sucursal in self.sucursales:
            if sucursal.numero == numero_sucursal:
                return sucursal.obtener_medicamentos_por_tipo("Tos")
        return []

    def buscarSucursalPorMedicamento(self, nombre_medicamento):
        resultado = []
        for sucursal in self.sucursales:
            if any(med.nombre == nombre_medicamento for med in sucursal.medicamentos):
                resultado.append((sucursal.numero, sucursal.direccion))
        return resultado

    def mostrarTodasLasSucursales(self):
        print("=== Archivo Completo de Farmacias ===")
        for sucursal in self.sucursales:
            print(sucursal)
            for med in sucursal.medicamentos:
                print(f"  - {med}")
        print("=====================================")

archivo = ArchivoFarmacias("farmacias.json")

sucursal1 = Sucursal(1, "Prado")
sucursal2 = Sucursal(2, "Miraflores")

sucursal1.agregar_medicamento(Medicamento("Golpex", "dolor"))
sucursal1.agregar_medicamento(Medicamento("clorferinamina", "picazon"))
sucursal2.agregar_medicamento(Medicamento("ibuprofeno", "tos"))
sucursal2.agregar_medicamento(Medicamento("medicasp", "cabello"))

archivo.guardarSucursal(sucursal1)
archivo.guardarSucursal(sucursal2)

archivo.mostrarTodasLasSucursales()

print("Medicamentos para la tos en sucursal 2:")
for med in archivo.mostrarMedicamentosTos(2):
    print(med)

print("Sucursales con Golpex:")
for suc in archivo.buscarSucursalPorMedicamento("Golpex"):
    print(f"Sucursal {suc[0]} - Dirección: {suc[1]}")
