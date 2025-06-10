class Medicamento:
    def __init__(self):
        self.nombre = ""
        self.codMedicamento = 0
        self.tipo = ""
        self.precio = 0.0

    def leer(self):
        self.nombre = input("Nombre del medicamento: ")
        self.codMedicamento = int(input("Código: "))
        self.tipo = input("Tipo (Tos, Resfrio, etc.): ")
        self.precio = float(input("Precio: "))

    def mostrar(self):
        print(f"{self.nombre} - {self.tipo} - {self.precio}")

    def getTipo(self):
        return self.tipo

    def getPrecio(self):
        return self.precio


class Farmacia:
    def __init__(self):
        self.nombreFarmacia = ""
        self.sucursal = 0
        self.direccion = ""
        self.nroMedicamentos = 0
        self.m = []

    def leer(self):
        self.nombreFarmacia = input("Nombre farmacia: ")
        self.sucursal = int(input("Sucursal: "))
        self.direccion = input("Dirección: ")
        self.nroMedicamentos = int(input("Cuántos medicamentos: "))
        for _ in range(self.nroMedicamentos):
            med = Medicamento()
            med.leer()
            self.m.append(med)

    def mostrar(self):
        print(f"{self.nombreFarmacia} - Sucursal {self.sucursal} - {self.direccion}")
        for med in self.m:
            med.mostrar()

    def getDireccion(self):
        return self.direccion

    def getSucursal(self):
        return self.sucursal

    def mostrarMedicamentos(self, tipo):
        for med in self.m:
            if med.getTipo() == tipo:
                med.mostrar()

    def buscaMedicamento(self, nombreBuscado):
        for med in self.m:
            if med.nombre == nombreBuscado:
                return True
        return False


class ArchFarmacia:
    def __init__(self, na):
        self.na = na
        self.farmacias = []

    def crearArchivo(self):
        self.farmacias = []

    def adicionar(self):
        f = Farmacia()
        f.leer()
        self.farmacias.append(f)

    def listar(self):
        for f in self.farmacias:
            f.mostrar()

    def mostrarMedicamentosResfrios(self):
        for f in self.farmacias:
            f.mostrarMedicamentos("Resfrio")

    def precioMedicamentoTos(self):
        total = 0.0
        for f in self.farmacias:
            for med in f.m:
                if med.getTipo() == "Tos":
                    total += med.getPrecio()
        print(f"Precio total medicamentos para la Tos: {total}")

    def mostrarMedicamentosMenorTos(self):
        for f in self.farmacias:
            for med in f.m:
                if med.getTipo() == "Tos" and med.getPrecio() < 20.0:
                    med.mostrar()

    def mostrarMedicamentosTosSucursal(self, x):
        for f in self.farmacias:
            if f.getSucursal() == x:
                f.mostrarMedicamentos("Tos")

    def buscarFarmaciaConMedicamento(self, nombreMed):
        for f in self.farmacias:
            if f.buscaMedicamento(nombreMed):
                print(f"Sucursal: {f.getSucursal()} - Dirección: {f.getDireccion()}")
archivo = ArchFarmacia("farmacias.dat")
archivo.crearArchivo()
archivo.adicionar()  
archivo.listar()

sucursal_deseada = int(input("Ingrese la sucursal: "))
archivo.mostrarMedicamentosTosSucursal(sucursal_deseada)

archivo.buscarFarmaciaConMedicamento("Golpex")
