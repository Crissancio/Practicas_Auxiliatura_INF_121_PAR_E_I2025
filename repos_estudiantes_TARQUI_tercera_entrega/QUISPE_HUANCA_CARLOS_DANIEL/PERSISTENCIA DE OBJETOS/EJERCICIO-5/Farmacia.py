import pickle
import os


class Medicamento:
    def __init__(self, nombre="", codMedicamento=0, lipo="", precio=0.0):
        self.nombre = nombre
        self.codMedicamento = codMedicamento
        self.lipo = lipo
        self.precio = precio

    def mostrar(self):
        print(f"Nombre: {self.nombre} - Código: {self.codMedicamento} - Tipo: {self.lipo} - Precio: ${self.precio:.2f}")

    def getTipo(self):
        return self.lipo

    def getPrecio(self):
        return self.precio


class Farmacia:
    def __init__(self, nombreFarmacia="", sucursal=0, direction="", noMedicamentos=0):
        self.nombreFarmacia = nombreFarmacia
        self.sucursal = sucursal
        self.direction = direction
        self.noMedicamentos = noMedicamentos
        self.m = [Medicamento() for _ in range(100)]

    def mostrar(self):
        print(f"\nFarmacia: {self.nombreFarmacia}")
        print(f"Sucursal: {self.sucursal}")
        print(f"Dirección: {self.direction}")
        print("Medicamentos disponibles:")

        for i in range(self.noMedicamentos):
            self.m[i].mostrar()

    def getDireccion(self):
        return self.direction

    def getSucursal(self):
        return self.sucursal

    def mostrarMedicamentos(self, tipo):
        print(f"\nMedicamentos para {tipo} en {self.nombreFarmacia}:")
        for i in range(self.noMedicamentos):
            if self.m[i].getTipo().lower() == tipo.lower():
                self.m[i].mostrar()

    def buscaMedicamento(self, nombre_med):
        for i in range(self.noMedicamentos):
            if self.m[i].nombre.lower() == nombre_med.lower():
                return True
        return False


class ArchFarmacia:
    def __init__(self, na="farmacias.dat"):
        self.na = na

    def creaArchivo(self):
        farmacias = []

        f1 = Farmacia("Farmacia Central", 1, "Av. Principal 123", 3)
        f1.m[0] = Medicamento("Golpex", 101, "Tos", 15.50)
        f1.m[1] = Medicamento("Aspirina", 102, "Dolor", 8.75)
        f1.m[2] = Medicamento("Jarabe", 103, "Tos", 12.30)
        farmacias.append(f1)

        f2 = Farmacia("Farmacia del Pueblo", 2, "Calle Secundaria 456", 4)
        f2.m[0] = Medicamento("Golpex", 201, "Tos", 16.00)
        f2.m[1] = Medicamento("Ibuprofeno", 202, "Dolor", 9.25)
        f2.m[2] = Medicamento("Antigripal", 203, "Resfriado", 18.40)
        f2.m[3] = Medicamento("Jarabe", 204, "Tos", 11.80)
        farmacias.append(f2)

        f3 = Farmacia("Farmacia Salud", 3, "Av. Libertad 789", 2)
        f3.m[0] = Medicamento("Paracetamol", 301, "Dolor", 7.90)
        f3.m[1] = Medicamento("Antigripal", 302, "Resfriado", 17.60)
        farmacias.append(f3)

        with open(self.na, "wb") as arch:
            pickle.dump(farmacias, arch)

        print("Archivo creado con datos de ejemplo")

    def listar(self):
        if not os.path.exists(self.na):
            print("El archivo no existe")
            return

        with open(self.na, "rb") as arch:
            farmacias = pickle.load(arch)

        print("\nLISTADO DE FARMACIAS")
        for farmacia in farmacias:
            farmacia.mostrar()

    def mostrarMedicamentosTos(self, sucursal_x):
        if not os.path.exists(self.na):
            print("El archivo no existe")
            return

        with open(self.na, "rb") as arch:
            farmacias = pickle.load(arch)

        encontrada = False
        for farmacia in farmacias:
            if farmacia.getSucursal() == sucursal_x:
                encontrada = True
                print(f"\nMedicamentos para la tos en sucursal {sucursal_x}:")
                for i in range(farmacia.noMedicamentos):
                    if farmacia.m[i].getTipo().lower() == "tos":
                        farmacia.m[i].mostrar()

        if not encontrada:
            print(f"No se encontró la sucursal {sucursal_x}")

    def buscarGolpex(self):
        if not os.path.exists(self.na):
            print("El archivo no existe")
            return

        with open(self.na, "rb") as arch:
            farmacias = pickle.load(arch)

        print("\nSucursales que tienen Golpex:")
        for farmacia in farmacias:
            if farmacia.buscaMedicamento("Golpex"):
                print(f"Sucursal: {farmacia.getSucursal()} - Dirección: {farmacia.getDireccion()}")


def main():
    archivo = ArchFarmacia()
    archivo.creaArchivo()
    archivo.listar()
    print("\nMedicamentos para la tos")
    archivo.mostrarMedicamentosTos(2)
    print("\nSucursales con Golpex")
    archivo.buscarGolpex()


if __name__ == "__main__":
    main()