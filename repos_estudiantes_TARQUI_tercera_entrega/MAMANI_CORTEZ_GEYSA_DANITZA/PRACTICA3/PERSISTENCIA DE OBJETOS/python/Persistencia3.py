import pickle

class Cliente:
    def __init__(self, id, nombre, telefono):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono

    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, Teléfono: {self.telefono}"


class ArchivoCliente:
    def __init__(self, nombre_archivo):
        self.nombre_archivo = nombre_archivo

    def crear_archivo(self):
        with open(self.nombre_archivo, 'wb') as f:
            pickle.dump([], f)

    def guardar_cliente(self, cliente):
        lista = self._leer_archivo()
        lista.append(cliente)
        with open(self.nombre_archivo, 'wb') as f:
            pickle.dump(lista, f)

    def buscar_cliente(self, id):
        lista = self._leer_archivo()
        for cliente in lista:
            if cliente.id == id:
                return cliente
        return None

    def buscar_celular_cliente(self, telefono):
        lista = self._leer_archivo()
        for cliente in lista:
            if cliente.telefono == telefono:
                return cliente
        return None

    def _leer_archivo(self):
        try:
            with open(self.nombre_archivo, 'rb') as f:
                return pickle.load(f)
        except (FileNotFoundError, EOFError):
            return []

# Prueba
archivo = ArchivoCliente("clientes.dat")
archivo.crear_archivo()

c1 = Cliente(1, "Ana", 5551234)
c2 = Cliente(2, "Luis", 5555678)

archivo.guardar_cliente(c1)
archivo.guardar_cliente(c2)

print("Buscar por ID 2:", archivo.buscar_cliente(2))
print("Buscar por teléfono 5551234:", archivo.buscar_celular_cliente(5551234))

