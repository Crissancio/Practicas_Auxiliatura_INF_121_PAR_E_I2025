class Medicamento:
    def __init__(self, nombre="", cod=0, tipo="", precio=0.0):
        self.nombre = nombre
        self.codMedicamento = cod
        self.tipo = tipo
        self.precio = precio

    def __str__(self):
        return f"{self.nombre},{self.codMedicamento},{self.tipo},{self.precio}"

    @staticmethod
    def from_string(data):
        nombre, cod, tipo, precio = data.strip().split(",")
        return Medicamento(nombre, int(cod), tipo, float(precio))


class Farmacia:
    def __init__(self, nombre="", sucursal=0, direccion=""):
        self.nombreFarmacia = nombre
        self.sucursal = sucursal
        self.direccion = direccion
        self.medicamentos = []

    def __str__(self):
        meds = ";".join(str(m) for m in self.medicamentos)
        return f"{self.nombreFarmacia}|{self.sucursal}|{self.direccion}|{len(self.medicamentos)}|{meds}"

    @staticmethod
    def from_string(data):
        partes = data.strip().split("|")
        f = Farmacia(partes[0], int(partes[1]), partes[2])
        nro_meds = int(partes[3])
        if len(partes) > 4 and partes[4]:
            meds = partes[4].split(";")
            for m in meds:
                f.medicamentos.append(Medicamento.from_string(m))
        return f


class ArchFarmacia:
    def __init__(self, nombre_archivo):
        self.na = nombre_archivo

    def crear_archivo(self):
        with open(self.na, "w") as f:
            pass

    def adicionar(self, farmacia):
        with open(self.na, "a") as f:
            f.write(str(farmacia) + "\n")

    def listar(self):
        with open(self.na, "r") as f:
            for linea in f:
                farmacia = Farmacia.from_string(linea)
                print(f"Sucursal {farmacia.sucursal} - {farmacia.nombreFarmacia}")
                for med in farmacia.medicamentos:
                    print(f"  Medicamento: {med.nombre} | Tipo: {med.tipo} | Precio: {med.precio}")
                print()

    def mostrar_medicamentos_resfrios(self):
        with open(self.na, "r") as f:
            for linea in f:
                farmacia = Farmacia.from_string(linea)
                for med in farmacia.medicamentos:
                    if med.tipo.lower() == "resfrio":
                        print(f"{med.nombre} - {farmacia.nombreFarmacia}")

    def precio_medicamento_tos(self):
        total = 0.0
        with open(self.na, "r") as f:
            for linea in f:
                farmacia = Farmacia.from_string(linea)
                for med in farmacia.medicamentos:
                    if med.tipo.lower() == "tos":
                        total += med.precio
        return total

    def mostrar_medicamentos_menor_tos(self, sucursal_x):
        with open(self.na, "r") as f:
            for linea in f:
                farmacia = Farmacia.from_string(linea)
                if farmacia.sucursal == sucursal_x:
                    print(f"\nMedicamentos para la TOS de la sucursal {sucursal_x}:")
                    for med in farmacia.medicamentos:
                        if med.tipo.lower() == "tos":
                            print(f"- {med.nombre} - S/{med.precio}")

    def buscar_medicamento_en_farmacias(self, nombre_medicamento):
        with open(self.na, "r") as f:
            for linea in f:
                farmacia = Farmacia.from_string(linea)
                for med in farmacia.medicamentos:
                    if med.nombre.lower() == nombre_medicamento.lower():
                        print(f"Medicamento '{nombre_medicamento}' encontrado en:")
                        print(f"  Sucursal: {farmacia.sucursal}")
                        print(f"  Dirección: {farmacia.direccion}")
                        return
        print(f"No se encontró '{nombre_medicamento}' en ninguna farmacia.")


if __name__ == "__main__":
    arch = ArchFarmacia("farmacias.txt")
    arch.crear_archivo()

    f1 = Farmacia("Farmacia San Juan", 1, "Av. Siempre Viva 123")
    f1.medicamentos.append(Medicamento("Golpex", 101, "tos", 8.50))
    f1.medicamentos.append(Medicamento("Frenadol", 102, "resfrio", 10.0))

    f2 = Farmacia("Farmacia Central", 2, "Calle Salud 456")
    f2.medicamentos.append(Medicamento("Bronquiosan", 201, "tos", 7.20))
    f2.medicamentos.append(Medicamento("Antigripal", 202, "resfrio", 11.50))

    arch.adicionar(f1)
    arch.adicionar(f2)

    print("Lista completa de farmacias:")
    arch.listar()

    print("\n Medicamentos de tipo 'tos' en sucursal 1:")
    arch.mostrar_medicamentos_menor_tos(1)

    print("\nBuscando medicamento 'Golpex':")
    arch.buscar_medicamento_en_farmacias("Golpex")

    print(f"\n Precio total de medicamentos para la tos: S/{arch.precio_medicamento_tos():.2f}")

