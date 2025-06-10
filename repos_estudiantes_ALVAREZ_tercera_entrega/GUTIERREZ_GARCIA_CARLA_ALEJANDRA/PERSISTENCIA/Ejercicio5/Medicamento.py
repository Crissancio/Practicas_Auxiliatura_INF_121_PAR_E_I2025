import pickle
import os

class Medicamento:
    def __init__(self, nombre, cod_medicamento, tipo, precio):
        self.nombre = nombre
        self.cod_medicamento = cod_medicamento
        self.tipo = tipo
        self.precio = precio

    def mostrar(self):
        print(f"Medicamento [Nombre: {self.nombre}, Código: {self.cod_medicamento}, Tipo: {self.tipo}, Precio: {self.precio}]")

class Farmacia:
    def __init__(self, nombre_farmacia, sucursal, direccion, medicamentos=None):
        self.nombre_farmacia = nombre_farmacia
        self.sucursal = sucursal
        self.direccion = direccion
        self.medicamentos = medicamentos if medicamentos else []

    def mostrar(self):
        print(f"Farmacia [Nombre: {self.nombre_farmacia}, Sucursal: {self.sucursal}, Dirección: {self.direccion}]")
        for m in self.medicamentos:
            m.mostrar()

    def mostrar_medicamentos(self, tipo_filtro):
        for m in self.medicamentos:
            if m.tipo.lower() == tipo_filtro.lower():
                m.mostrar()

    def contiene_medicamento(self, nombre_med):
        for m in self.medicamentos:
            if m.nombre.lower() == nombre_med.lower():
                return True
        return False

class ArchFarmacia:
    def __init__(self, nombre_archivo):
        self.nombre_archivo = nombre_archivo

    def crear_archivo(self):
        with open(self.nombre_archivo, "wb") as f:
            pickle.dump([], f)
        print("Archivo creado correctamente.")

    def adicionar_farmacia(self, farmacia):
        farmacias = self._leer_archivo()
        farmacias.append(farmacia)
        self._escribir_archivo(farmacias)

    def listar(self):
        farmacias = self._leer_archivo()
        for f in farmacias:
            f.mostrar()

    def mostrar_medicamentos_tos(self, suc):
        farmacias = self._leer_archivo()
        for f in farmacias:
            if f.sucursal == suc:
                print(f"Medicamentos tipo 'tos' en sucursal {suc}:")
                f.mostrar_medicamentos("tos")
                return
        print("No se encontró la sucursal.")

    def mostrar_sucursal_golpex(self):
        farmacias = self._leer_archivo()
        for f in farmacias:
            if f.contiene_medicamento("Golpex"):
                print(f"Sucursal: {f.sucursal}, Dirección: {f.direccion}")
                return
        print("No se encontró el medicamento 'Golpex'.")

    def _leer_archivo(self):
        if not os.path.exists(self.nombre_archivo):
            return []
        with open(self.nombre_archivo, "rb") as f:
            return pickle.load(f)

    def _escribir_archivo(self, farmacias):
        with open(self.nombre_archivo, "wb") as f:
            pickle.dump(farmacias, f)

if __name__ == "__main__":
    arch = ArchFarmacia("farmacias.dat")
    arch.crear_archivo()

    # Crear medicamentos y farmacias
    m1 = Medicamento("Golpex", 1001, "tos", 15.50)
    m2 = Medicamento("Paracetamol", 1002, "fiebre", 5.00)
    f1 = Farmacia("Cruz Roja", 1, "Av. Libertad", [m1, m2])

    m3 = Medicamento("Bronquix", 2001, "tos", 12.00)
    f2 = Farmacia("San Miguel", 2, "Calle 10", [m3])

    arch.adicionar_farmacia(f1)
    arch.adicionar_farmacia(f2)

    print("\n--- Todas las farmacias ---")
    arch.listar()

    print("\n--- Medicamentos para la tos en sucursal 1 ---")
    arch.mostrar_medicamentos_tos(1)

    print("\n--- Sucursal y dirección que tienen el medicamento 'Golpex' ---")
    arch.mostrar_sucursal_golpex()