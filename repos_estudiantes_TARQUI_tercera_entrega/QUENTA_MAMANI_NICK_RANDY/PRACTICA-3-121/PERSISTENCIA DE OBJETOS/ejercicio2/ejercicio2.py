# 2. Sea el siguiente diagrama de clases:
# a) Implementar el diagrama de clases.
# b) Implementa buscarCliente(int c) a través del id.
# c) Implementa buscarCelularCliente(int c), que devuelva los datos del cliente
# junto al número de celular.
import json
class Producto:
    def __init__(self, codigo, nombre, precio):
        self.codigo = codigo
        self.nombre = nombre
        self.precio = precio

    def to_dict(self):
        return {"codigo": self.codigo, "nombre": self.nombre, "precio": self.precio}


def guardarProducto(p):
    with open("productos.json", "a") as f:
        f.write(json.dumps(p.to_dict()) + "\n")


def buscaProducto(codigo):
    with open("productos.json", "r") as f:
        for line in f:
            prod = json.loads(line)
            if prod["codigo"] == codigo:
                return prod
    return None

guardarProducto(Producto(99, "Mouse", 30))
guardarProducto(Producto(66, "Teclado", 70))
print("Producto 99:", buscaProducto(66))
