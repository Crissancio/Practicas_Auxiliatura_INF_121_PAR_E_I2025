class Cliente:
    def __init__(self, id: int, nombre: str, telefono: int):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono


class ArchivoCliente:
    def __init__(self, n: str):
        self.nomA = n
        self.clientes = []

    def crearArchivo(self):
        self.clientes = []

    def guardaCliente(self, c: Cliente):
        self.clientes.append(c)

    def buscarCliente(self, c: int) -> Cliente:
        for cliente in self.clientes:
            if cliente.id == c:
                return cliente
        return None

    def buscarCelularCliente(self, c: int) -> Cliente:
        for cliente in self.clientes:
            if cliente.telefono == c:
                return cliente
        return None


if __name__ == "__main__":
    archivo = ArchivoCliente("clientes_db")
    archivo.crearArchivo()

    cliente1 = Cliente(1, "Juan Pérez", 65281904)
    cliente2 = Cliente(2, "María García", 77823412)
    cliente3 = Cliente(3, "Carlos López", 66832910)

    archivo.guardaCliente(cliente1)
    archivo.guardaCliente(cliente2)
    archivo.guardaCliente(cliente3)

    encontrado = archivo.buscarCliente(2)
    if encontrado:
        print(f"Cliente encontrado por ID: {encontrado.nombre}, Tel: {encontrado.telefono}")

    encontrado = archivo.buscarCelularCliente(66832910)
    if encontrado:
        print(f"Cliente encontrado por celular: {encontrado.nombre}, Tel: {encontrado.telefono}")
