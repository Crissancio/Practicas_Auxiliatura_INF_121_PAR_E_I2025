import json

class Cliente:
    def __init__(self, id_cliente, nombre, celular):
        self.id_cliente = id_cliente
        self.nombre = nombre
        self.celular = celular

    def __str__(self):
        return f"ID: {self.id_cliente}, Nombre: {self.nombre}, Celular: {self.celular}"

class ArchivoCliente:
    def __init__(self, nombre_archivo):
        self.nombre_archivo = nombre_archivo
        self.clientes = self.cargar_clientes()

    def cargar_clientes(self):
        try:
            with open(self.nombre_archivo, "r") as archivo:
                clientes_dict = json.load(archivo)
                return [Cliente(**cliente) for cliente in clientes_dict]
        except (FileNotFoundError, json.JSONDecodeError):
            return []

    def guardar_clientes(self):
        with open(self.nombre_archivo, "w") as archivo:
            json.dump([cliente.__dict__ for cliente in self.clientes], archivo, indent=4)

    def guardarCliente(self, cliente):
        self.clientes.append(cliente)
        self.guardar_clientes()

    def buscarCliente(self, id_cliente: int):
        for cliente in self.clientes:
            if cliente.id_cliente == id_cliente:
                return cliente
        return None

    def buscarCelularCliente(self, id_cliente: int):
        cliente = self.buscarCliente(id_cliente)
        if cliente:
            return f"Cliente: {cliente.nombre}, Celular: {cliente.celular}"
        return "Cliente no encontrado"

archivo = ArchivoCliente("clientes.json")

archivo.guardarCliente(Cliente(1, "Jose", "76640210"))
archivo.guardarCliente(Cliente(2, "Sara", "94301234"))
archivo.guardarCliente(Cliente(3, "Andre", "70970456"))

cliente_encontrado = archivo.buscarCliente(2)
print("cliente encontrado por ID: ", cliente_encontrado if cliente_encontrado else "Cliente no encontrado.")

print("cliente encontrado: ", archivo.buscarCelularCliente(3))
