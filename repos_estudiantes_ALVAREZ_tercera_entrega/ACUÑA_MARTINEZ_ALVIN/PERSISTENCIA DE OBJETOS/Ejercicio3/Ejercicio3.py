# a)
class Cliente:
    def __init__(self, id, nombre, telefono):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono

    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, Telefono: {self.telefono}"

# a)
class ArchivoCliente:
    def __init__(self, nomA):
        self.nomA = nomA
        self.clientes = []

    def crearArchivo(self):
        self.clientes = []

    def guardaCliente(self, c):
        self.clientes.append(c)

    # b)
    def buscarCliente(self, c):
        for cliente in self.clientes:
            if cliente.id == c:
                return cliente
        return None

    # c)
    def buscarCelularCliente(self, c):
        cliente = self.buscarCliente(c)
        if cliente:
            return f"Datos del Cliente: {cliente}, Celular: {cliente.telefono}"
        else:
            return "Cliente no encontrado."

if __name__ == "__main__":
    archivo = ArchivoCliente("clientes.dat")
    archivo.crearArchivo()

    c1 = Cliente(1, "Juan Perez", 123456789)
    c2 = Cliente(2, "Maria Lopez", 987654321)

    archivo.guardaCliente(c1)
    archivo.guardaCliente(c2)

    print(archivo.buscarCliente(1))
    print(archivo.buscarCelularCliente(2))
