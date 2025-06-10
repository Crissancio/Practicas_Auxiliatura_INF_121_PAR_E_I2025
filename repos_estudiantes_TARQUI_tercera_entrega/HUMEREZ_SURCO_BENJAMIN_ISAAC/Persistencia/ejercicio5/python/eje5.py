class Medicamento:
    def __init__(self, nombre="", codMedicamento=0, tipo="", precio=0.0):
        self.nombre = nombre
        self.codMedicamento = codMedicamento
        self.tipo = tipo
        self.precio = precio

    def leer(self):
        self.nombre = input("Nombre del medicamento: ")
        self.codMedicamento = int(input("Código del medicamento: "))
        self.tipo = input("Tipo (tos, resfrío, etc.): ")
        self.precio = float(input("Precio: "))

    def mostrar(self):
        print(f"Nombre: {self.nombre}, Código: {self.codMedicamento}, Tipo: {self.tipo}, Precio: {self.precio}")

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
        self.nombreFarmacia = input("Nombre de la farmacia: ")
        self.sucursal = int(input("Número de sucursal: "))
        self.direccion = input("Dirección: ")
        self.nroMedicamentos = int(input("Cantidad de medicamentos: "))
        for i in range(self.nroMedicamentos):
            med = Medicamento()
            print(f"--- Medicamento {i+1} ---")
            med.leer()
            self.m.append(med)

    def mostrar(self):
        print(f"\nFarmacia: {self.nombreFarmacia}, Sucursal: {self.sucursal}, Dirección: {self.direccion}")
        print("Medicamentos:")
        for med in self.m:
            med.mostrar()

    def getDireccion(self):
        return self.direccion

    def getSucursal(self):
        return self.sucursal

    def mostrarMedicamentos(self, tipo):
        for med in self.m:
            if med.getTipo().lower() == tipo.lower():
                med.mostrar()

    def buscaMedicamento(self, nombre):
        for med in self.m:
            if med.nombre.lower() == nombre.lower():
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
        print("Medicamentos para resfríos:")
        for f in self.farmacias:
            f.mostrarMedicamentos("resfrio")

    def precioMedicamentoTos(self):
        suma = 0
        contador = 0
        for f in self.farmacias:
            for med in f.m:
                if med.getTipo().lower() == "tos":
                    suma += med.getPrecio()
                    contador += 1
        return suma / contador if contador != 0 else 0

    def mostrarMedicamentosMenorTos(self):
        print("Medicamentos para la tos (precio menor al promedio):")
        promedio = self.precioMedicamentoTos()
        for f in self.farmacias:
            for med in f.m:
                if med.getTipo().lower() == "tos" and med.getPrecio() < promedio:
                    med.mostrar()

    def mostrarMedicamentosTosSucursal(self, sucursalX):
        for f in self.farmacias:
            if f.getSucursal() == sucursalX:
                print(f"\nMedicamentos para la tos en sucursal {sucursalX}:")
                f.mostrarMedicamentos("tos")

    def mostrarSucursalesConMedicamento(self, nombreMed):
        print(f"\nSucursales que tienen el medicamento '{nombreMed}':")
        for f in self.farmacias:
            if f.buscaMedicamento(nombreMed):
                print(f"Sucursal: {f.getSucursal()}, Dirección: {f.getDireccion()}")




def main():
    arch = ArchFarmacia("archivoFarmacias")

    
    print("\n=== Añadir Farmacia ===")
    arch.adicionar()

    print("\n=== Listar Farmacias ===")
    arch.listar()

    
    sucursal_x = int(input("\nIngrese el número de sucursal para mostrar medicamentos para la tos: "))
    arch.mostrarMedicamentosTosSucursal(sucursal_x)

    
    arch.mostrarSucursalesConMedicamento("Golpex")


if __name__ == "__main__":
    main()
