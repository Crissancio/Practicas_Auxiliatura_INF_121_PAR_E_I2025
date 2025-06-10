#5. Sea el siguiente diagrama de clases:
#Carrera de Informática - UMSAPágina 16
#a) Crear, leer y mostrar un Archivo de Farmacias
#b) Mostrar los medicamentos para la tos, de la Sucursal numero X
#c) Mostrar el número de sucursal y su dirección que tienen el medicamento“Golpex”

class Medicamento:
    def __init__(self, nombre, cod, tipo, precio):
        self.nombre = nombre
        self.codMedicamento = cod
        self.tipo = tipo
        self.precio = precio

    def mostrar(self):
        print(f"{self.nombre} - {self.tipo} - ${self.precio}")

class Farmacia:
    def __init__(self, nombre, sucursal, direccion):
        self.nombreFarmacia = nombre
        self.sucursal = sucursal
        self.direccion = direccion
        self.medicamentos = []

    def agregar_medicamento(self, medicamento):
        self.medicamentos.append(medicamento)

    def mostrar(self):
        print(f"Sucursal {self.sucursal} - {self.direccion}")
        for m in self.medicamentos:
            m.mostrar()

    def mostrar_medicamentos(self, tipo):
        for m in self.medicamentos:
            if m.tipo.lower() == tipo.lower():
                m.mostrar()

    def busca_medicamento(self, nombre):
        return any(m.nombre.lower() == nombre.lower() for m in self.medicamentos)

class ArchFarmacia:
    def __init__(self):
        self.farmacias = []

    def crear_archivo(self):
        f1 = Farmacia("Farmacia Uno", 1, "Av. Siempre Viva")
        f1.agregar_medicamento(Medicamento("Tosin", 101, "tos", 10.5))
        f1.agregar_medicamento(Medicamento("Golpex", 102, "analgésico", 12.0))

        f2 = Farmacia("Farmacia Dos", 2, "Calle Luna")
        f2.agregar_medicamento(Medicamento("Tosfin", 103, "tos", 8.5))

        self.farmacias.append(f1)
        self.farmacias.append(f2)

    def listar(self):
        for f in self.farmacias:
            f.mostrar()

    def mostrar_medicamentos_tos(self, sucursal):
        for f in self.farmacias:
            if f.sucursal == sucursal:
                f.mostrar_medicamentos("tos")

    def mostrar_sucursal_con_golpex(self):
        for f in self.farmacias:
            if f.busca_medicamento("Golpex"):
                print(f"Sucursal: {f.sucursal}, Dirección: {f.direccion}")

# Ejecutar
arch = ArchFarmacia()
arch.crear_archivo()
arch.listar()                    # a)
arch.mostrar_medicamentos_tos(1) # b)
arch.mostrar_sucursal_con_golpex() # c)
