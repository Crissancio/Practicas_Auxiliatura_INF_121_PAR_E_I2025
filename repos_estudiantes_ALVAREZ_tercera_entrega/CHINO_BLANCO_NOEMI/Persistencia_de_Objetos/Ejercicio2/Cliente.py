import pickle

class Cliente:
    def __init__(self, id=0, nombre="", telefono=0):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono

    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, Teléfono: {self.telefono}"


class ArchivoCliente:
    def __init__(self, nomA):
        self.nomA = nomA

    def crear_archivo(self):
        with open(self.nomA, "wb") as file:
            pickle.dump([], file)

    def guarda_cliente(self, cliente):
        with open(self.nomA, "rb") as file:
            clientes = pickle.load(file)
        clientes.append(cliente)
        with open(self.nomA, "wb") as file:
            pickle.dump(clientes, file)

    def buscar_cliente(self, c):
        with open(self.nomA, "rb") as file:
            clientes = pickle.load(file)
        for cliente in clientes:
            if cliente.id == c:
                return cliente
        return None

    def buscar_celular_cliente(self, c):
        with open(self.nomA, "rb") as file:
            clientes = pickle.load(file)
        for cliente in clientes:
            if cliente.telefono == c:
                return cliente
        return None



archivo = ArchivoCliente("clientes.dat")
archivo.crear_archivo()

c1 = Cliente(1, "noemi", 123456)
c2 = Cliente(2, "Lucas", 987654)
archivo.guarda_cliente(c1)
archivo.guarda_cliente(c2)


resultado = archivo.buscar_cliente(1)
if resultado:
    print("Cliente encontrado es:", resultado)
else:
    print("Cliente no encontrado.")


resultado = archivo.buscar_celular_cliente(8478473847467)
if resultado:
    print("Cliente con ese celular:", resultado)
else:
    print("No se encontró el cliente con ese número.")
