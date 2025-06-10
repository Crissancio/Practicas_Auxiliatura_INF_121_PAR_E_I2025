import os
import pickle
from cliente import Cliente

class GestorCliente:
    def __init__(self, archivo="clientes.pkl"):
        self.archivo = archivo

    def guardar_cliente(self, cliente: Cliente):
        lista = self.leer_todos()
        lista.append(cliente)
        with open(self.archivo, 'wb') as f:
            pickle.dump(lista, f)

    def leer_todos(self):
        if not os.path.exists(self.archivo):
            return []
        with open(self.archivo, 'rb') as f:
            return pickle.load(f)

    def buscar_cliente(self, id: int):
        for c in self.leer_todos():
            if c.id == id:
                return c
        return None

    def buscar_celular_cliente(self, id: int):
        c = self.buscar_cliente(id)
        if c:
            return f"Datos del cliente: {c}\nCelular: {c.celular}"
        return "Cliente no encontrado."
