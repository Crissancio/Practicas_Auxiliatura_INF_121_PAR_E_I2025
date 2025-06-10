class Cliente:
    def __init__(self, id: int, nombre: str, telefono: int):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono

    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, Teléfono: {self.telefono}"


class ArchivoCliente:
    def __init__(self, n: str):
        self.nomA = n
        self.clientes = []

    def crearArchivo(self):
        self.clientes = []
        print(f"Archivo '{self.nomA}' creado.")

    def guardaCliente(self, c: Cliente):
        self.clientes.append(c)
        print(f"Cliente con ID {c.id} guardado.")

    def buscarCliente(self, c: int) -> Cliente:
        for cliente in self.clientes:
            if cliente.id == c:
                return cliente
        return None

    def buscarCelularCliente(self, c: int):
        cliente = self.buscarCliente(c)
        if cliente:
            return f"{cliente} (Número de celular: {cliente.telefono})"
        else:
            return "Cliente no encontrado."


if __name__ == "__main__":

    cliente1 = Cliente(1, "Juan Pérez", 123456789)
    cliente2 = Cliente(2, "María López", 987654321)

    archivo.guardaCliente(cliente1)
    archivo.guardaCliente(cliente2)

    print("\nBuscar cliente con ID 1:")
    encontrado = archivo.buscarCliente(1)
    if encontrado:
        print(encontrado)
    else:
        print("Cliente no encontrado.")

    print("\nBuscar celular del cliente con ID 2:")
    print(archivo.buscarCelularCliente(2))
