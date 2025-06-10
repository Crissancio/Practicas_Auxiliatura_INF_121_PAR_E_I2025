class Medicamento:
    def __init__(self, nombre, cod, tipo, precio):
        self.nombre = nombre
        self.codMedicamento = cod
        self.tipo = tipo
        self.precio = precio

    def mostrar(self):
        print(f"Nombre: {self.nombre}, Tipo: {self.tipo}, Precio: {self.precio}")


class Farmacia:
    def __init__(self, nombre, sucursal, direccion):
        self.nombreFarmacia = nombre
        self.sucursal = sucursal
        self.direccion = direccion
        self.medicamentos = []

    def agregarMedicamento(self, m):
        self.medicamentos.append(m)

    def mostrar(self):
        print(f"Farmacia: {self.nombreFarmacia}, Sucursal: {self.sucursal}, Dirección: {self.direccion}")
        for m in self.medicamentos:
            m.mostrar()

    def tieneMedicamento(self, nombreMed):
        return any(m.nombre.lower() == nombreMed.lower() for m in self.medicamentos)


class ArchFarmacia:
    def __init__(self):
        self.lista = []

    def adicionar(self, f):
        self.lista.append(f)

    def crearArchivo(self):
        print("== a) Archivo de farmacias creado y leído:")
        for f in self.lista:
            f.mostrar()

    def mostrarMedicamentosTos(self, sucursalX):
        print(f"\n== b) Medicamentos para la tos en la sucursal {sucursalX}:")
        for f in self.lista:
            if f.sucursal == sucursalX:
                for m in f.medicamentos:
                    if m.tipo.lower() == "tos":
                        m.mostrar()

    def buscarMedicamento(self, nombreMed):
        print(f"\n== c) Farmacias que tienen el medicamento {nombreMed}:")
        for f in self.lista:
            if f.tieneMedicamento(nombreMed):
                print(f"Sucursal: {f.sucursal}, Dirección: {f.direccion}")


if __name__ == "__main__":
    m1 = Medicamento("Golpex", 1, "Tos", 10.5)
    m2 = Medicamento("Paracetamol", 2, "Fiebre", 5.0)
    m3 = Medicamento("Broncolin", 3, "Tos", 8.0)

    f1 = Farmacia("Farmacia Central", 101, "Calle 1")
    f1.agregarMedicamento(m1)
    f1.agregarMedicamento(m2)

    f2 = Farmacia("Farmacia Sur", 102, "Avenida 9")
    f2.agregarMedicamento(m3)

    arch = ArchFarmacia()
    arch.adicionar(f1)
    arch.adicionar(f2)

    arch.crearArchivo()                      # inciso a)
    arch.mostrarMedicamentosTos(101)         # inciso b)
    arch.buscarMedicamento("Golpex")         # inciso c)
