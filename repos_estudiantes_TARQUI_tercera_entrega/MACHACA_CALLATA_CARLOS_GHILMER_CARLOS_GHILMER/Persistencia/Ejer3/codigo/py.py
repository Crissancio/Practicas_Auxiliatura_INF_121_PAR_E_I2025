class Cliente:
    def __init__(self, id, nombre, telefono):
        self.__id = id
        self.__nombre = nombre
        self.__telefono = telefono

    def get_id(self):
        return self.__id

    def get_nombre(self):
        return self.__nombre

    def get_telefono(self):
        return self.__telefono
    def __str__(self):
        return f"Cliente(ID: {self.__id}, Nombre: {self.__nombre}, Telefono: {self.__telefono})"

class ArchivoCliente:
    def __init__(self, n):
        self.__nomA = n
        self.clientes = []

    def crear_archivo(self):
        with open(self.__nomA, 'w') as f:
            pass
    def guardar_cliente(self, c: Cliente):
        self.clientes.append(c)

    def buscar_cliente(self, c):
        for cli in self.clientes:
            if cli.get_id() == c:
                return cli
        return None

    def buscar_celular(self, c):
        for cli in self.clientes:
            if cli.get_telefono() == c:
                return cli
        return None
    
archivo = ArchivoCliente("clientes.json")
archivo.crear_archivo()

c1 = Cliente(1, "Juan Perez", 67152587)
c2 = Cliente(2, "Ana Gomez", 12345678)
c3 = Cliente(3, "Carlos Martinez", 9876543)

archivo.guardar_cliente(c1)
archivo.guardar_cliente(c2)
archivo.guardar_cliente(c3)

print("Cliente buscado por ID:", archivo.buscar_cliente(2))
print("Cliente buscado por telefono:", archivo.buscar_celular(67152587))
