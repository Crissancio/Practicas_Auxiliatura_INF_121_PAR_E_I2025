import pickle


class Cliente:
    def __init__(self, id, nombre, celular):
        self.id = id
        self.nombre = nombre
        self.celular = celular

    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, Celular: {self.celular}"


def guardar_cliente(c):
    with open("clientes.pkl", "ab") as f:
        pickle.dump(c, f)


def buscar_cliente(id_cliente):
    try:
        with open("clientes.pkl", "rb") as f:
            while True:
                c = pickle.load(f)
                if c.id == id_cliente:
                    print("Cliente encontrado:", c)
                    return
    except EOFError:
        print("Cliente no encontrado.")
    except FileNotFoundError:
        print("Archivo no encontrado.")


def buscar_celular_cliente(id_cliente):
    try:
        with open("clientes.pkl", "rb") as f:
            while True:
                c = pickle.load(f)
                if c.id == id_cliente:
                    print(f"Celular del cliente {c.nombre}: {c.celular}")
                    return
    except EOFError:
        print("Cliente no encontrado.")
    except FileNotFoundError:
        print("Archivo no encontrado.")
guardar_cliente(Cliente(1, "Laura", "78912345"))
buscar_cliente(1)
buscar_celular_cliente(1)