import pickle
import os
#pickle pra bin "clientes.bin"
class Cliente:
    def __init__(self, id, nombre, telefono):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono

    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, Telefono: {self.telefono}"

archivo = "clientes.bin"
# a) Guardar cliente
def guardar_cliente(c):
    clientes = []
    if os.path.exists(archivo):
        with open(archivo, "rb") as f:
            clientes = pickle.load(f)
    clientes.append(c)
    with open(archivo, "wb") as f:
        pickle.dump(clientes, f)
# b) Buscar cliente por ID
def buscar_cliente(id):
    if not os.path.exists(archivo):
        print("Archivo no encontrado.")
        return
    with open(archivo, "rb") as f:
        clientes = pickle.load(f)
        for c in clientes:
            if c.id == id:
                print("Cliente encontrado:", c)
                return
    print("Cliente no encontrado.")
# c) Mostrar cliente con número de celular
def buscar_celular_cliente(id):
    if not os.path.exists(archivo):
        print("Archivo no encontrado.")
        return
    with open(archivo, "rb") as f:
        clientes = pickle.load(f)
        for c in clientes:
            if c.id == id:
                print("Cliente con celular encontrado:", c)
                return
    print("Cliente no encontrado.")
if __name__ == "__main__":
    # a)
    c1 = Cliente(1, "Lucía", 78965412)
    c2 = Cliente(2, "Jorge", 72233445)
    guardar_cliente(c1)
    guardar_cliente(c2)

    # b)
    buscar_cliente(2)

    # c)
    buscar_celular_cliente(1)
