class Cliente:
    def __init__(self, id, nombre, telefono):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono
class ArchivoCliente:
    def __init__(self, nomA):
        self.nomA = nomA
        self.clientes = []
    def guardarCliente(self, c):
        self.clientes.append(c)
    def buscarCliente(self, id):
        for cli in self.clientes:
            if cli.id == id:
                return cli
        return None
    def buscarCelularCliente(self, id):
        for cli in self.clientes:
            if cli.id == id:
                return (cli.nombre, cli.telefono)
        return None
