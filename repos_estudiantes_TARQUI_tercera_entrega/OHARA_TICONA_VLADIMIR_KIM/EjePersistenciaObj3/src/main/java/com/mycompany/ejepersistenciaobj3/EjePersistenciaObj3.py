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

    def guardaCliente(self, cliente):
        self.clientes.append(cliente)

    def buscarCliente(self, c):
        for cli in self.clientes:
            if cli.id == c:
                return cli
        return None

    def buscarCelularCliente(self, c):
        return self.buscarCliente(c)
archivo = ArchivoCliente("clientes.txt")

c1 = Cliente(1, "Ana", 123456789)
c2 = Cliente(2, "Luis", 987654321)
c3 = Cliente(3, "Carla", 111222333)

archivo.guardaCliente(c1)
archivo.guardaCliente(c2)
archivo.guardaCliente(c3)

cliente_buscado = archivo.buscarCliente(2)
if cliente_buscado:
    print("Cliente encontrado por ID:")
    print(cliente_buscado)
else:
    print("Cliente no encontrado.")

cliente_tel = archivo.buscarCelularCliente(3)
if cliente_tel:
    print("Datos del cliente con número:")
    print(cliente_tel)
else:
    print("Cliente no encontrado.")
