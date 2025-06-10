import pickle

class Medicamento:
    def __init__(self, nombre, cod, tipo, precio):
        self.nombre = nombre
        self.cod = cod
        self.tipo = tipo
        self.precio = precio

    def mostrar(self):
        print(f"Medicamento: {self.nombre}, Tipo: {self.tipo}, Precio: {self.precio} Bs")

class Farmacia:
    def __init__(self, nombre, sucursal, direccion, medicamentos):
        self.nombre = nombre
        self.sucursal = sucursal
        self.direccion = direccion
        self.medicamentos = medicamentos

    def mostrar(self):
        print(f"Farmacia: {self.nombre}, Sucursal: {self.sucursal}, Dirección: {self.direccion}")
        for m in self.medicamentos:
            m.mostrar()

class ArchFarmacia:
    def __init__(self, nombre_archivo):
        self.na = nombre_archivo

    def crear_archivo(self):
        with open(self.na, 'wb'):
            pass

    def adicionar(self, farmacia):
        with open(self.na, 'ab') as f:
            pickle.dump(farmacia, f)

    def listar(self):
        with open(self.na, 'rb') as f:
            try:
                while True:
                    farmacia = pickle.load(f)
                    farmacia.mostrar()
            except EOFError:
                pass

    def mostrar_medicamentos_tos(self, x):
        with open(self.na, 'rb') as f:
            try:
                while True:
                    farmacia = pickle.load(f)
                    if farmacia.sucursal == x:
                        print(f"Medicamentos para la tos en sucursal {x}:")
                        for m in farmacia.medicamentos:
                            if m.tipo.lower() == "tos":
                                m.mostrar()
            except EOFError:
                pass

    def mostrar_farmacias_con_golpex(self):
        with open(self.na, 'rb') as f:
            try:
                while True:
                    farmacia = pickle.load(f)
                    for m in farmacia.medicamentos:
                        if m.nombre.lower() == "golpex":
                            print(f"Sucursal: {farmacia.sucursal}, Dirección: {farmacia.direccion}")
            except EOFError:
                pass
def mostrar():
    arch = ArchFarmacia("farmacias.bolivar")
    arch.crear_archivo()

    m1 = Medicamento("Golpex", 101, "Tos", 12.5)
    m2 = Medicamento("Ibuprofeno", 102, "Dolor", 8.0)
    m3 = Medicamento("Desenfriol", 103, "Resfrio", 10.0)
    m4 = Medicamento("Bronquilin", 104, "Tos", 11.0)

    f1 = Farmacia("Farmacia Chavez", 1, "Calle bolivar", [m1, m2])
    f2 = Farmacia("Farmacia Farmacol", 2, "Avenida B #456", [m3, m4])

   
    arch.adicionar(f1)
    arch.adicionar(f2)

    print(" LISTADO DE FARMACIAS ")
    arch.listar()

    print(" MEDICAMENTOS PARA LA TOS EN SUCURSAL 4")
    arch.mostrar_medicamentos_tos(4)

    print(" FARMACIAS QUE TIENEN GOLPEX ")
    arch.mostrar_farmacias_con_golpex()

mostrar()
