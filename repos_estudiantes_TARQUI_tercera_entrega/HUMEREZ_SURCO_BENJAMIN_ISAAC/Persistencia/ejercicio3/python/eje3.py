class Cliente:
    def __init__(self, id, nombre, telefono):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono

    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, Teléfono: {self.telefono}"


class ArchivoCliente:
    def __init__(self, nomA):
        self.nomA = nomA
        self.clientes = []

    def crearArchivo(self):
        self.clientes = []

    def guardaCliente(self, c):
        self.clientes.append(c)

    def buscarCliente(self, c):
        for cliente in self.clientes:
            if cliente.id == c:
                return cliente
        return None

    def buscarCelularCliente(self, c):
        for cliente in self.clientes:
            if cliente.telefono == c:
                return cliente
        return None



archivo = ArchivoCliente("clientes.txt")
archivo.guardaCliente(Cliente(1, "Ana", 123456))
archivo.guardaCliente(Cliente(2, "Luis", 987654))

print(archivo.buscarCliente(1)) 
print(archivo.buscarCelularCliente(987654))  
