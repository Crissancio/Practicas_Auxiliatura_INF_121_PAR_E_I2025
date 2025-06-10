import pickle
from cliente import Cliente 

class ArchivoCliente:
    def __init__(self, nombre_archivo):
        self.nombre_archivo = nombre_archivo

    def crear_archivo(self):
        """Crea el archivo si no existe"""
        try:
            with open(self.nombre_archivo, "wb") as archivo:
                pickle.dump([], archivo) 
        except Exception as e:
            print("Error al crear archivo:", e)

    def guardar_cliente(self, cliente):
        """Guarda un cliente en el archivo"""
        clientes = self.leer_clientes()
        clientes.append(cliente)
        with open(self.nombre_archivo, "wb") as archivo:
            pickle.dump(clientes, archivo)

    def leer_clientes(self):
        """Lee todos los clientes guardados en el archivo"""
        try:
            with open(self.nombre_archivo, "rb") as archivo:
                return pickle.load(archivo)
        except (FileNotFoundError, EOFError):
            return []

    def buscar_cliente(self, id_cliente):
        """Busca un cliente por ID"""
        clientes = self.leer_clientes()
        for cliente in clientes:
            if cliente.id_cliente == id_cliente:
                return cliente
        return None

    def buscar_celular_cliente(self, id_cliente):
        """Encuentra el cliente por ID y muestra su número de teléfono"""
        return self.buscar_cliente(id_cliente)
