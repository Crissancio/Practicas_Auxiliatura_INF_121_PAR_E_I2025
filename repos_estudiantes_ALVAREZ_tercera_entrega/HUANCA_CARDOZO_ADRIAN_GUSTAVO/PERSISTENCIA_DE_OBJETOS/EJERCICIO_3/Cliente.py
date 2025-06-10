import pickle
import os

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
        self.clientes = self._cargar_archivo()

    def crearArchivo(self):
        self.clientes = []
        self._guardar_archivo()

    def guardaCliente(self, c: Cliente):
        self.clientes.append(c)
        self._guardar_archivo()

    def buscarCliente(self, c: int):
        for cliente in self.clientes:
            if cliente.id == c:
                return cliente
        return None

    def buscarCelularCliente(self, c: int):
        for cliente in self.clientes:
            if cliente.id == c:
                return f"{cliente} | Celular: {cliente.telefono}"
        return "Cliente no encontrado"

    def _guardar_archivo(self):
        with open(self.nomA, "wb") as f:
            pickle.dump(self.clientes, f)

    def _cargar_archivo(self):
        if os.path.exists(self.nomA):
            with open(self.nomA, "rb") as f:
                return pickle.load(f)
        return []

if __name__ == "__main__":
    archivo_clientes = ArchivoCliente("clientes.pkl")

    cliente1 = Cliente(1, "Juan Perez", 123456789)
    cliente2 = Cliente(2, "Maria Gomez", 987654321)

    archivo_clientes.guardaCliente(cliente1)
    archivo_clientes.guardaCliente(cliente2)

    encontrado = archivo_clientes.buscarCliente(1)
    if encontrado:
        print(encontrado)
    else:
        print("Cliente no encontrado.")

    celular_info = archivo_clientes.buscarCelularCliente(2)
    print(celular_info)
