#Sea el siguiente diagrama de clases:
#a)Implementar el diagrama de clases.
#b)Implementa guardarProducto(Producto p) para almacenar productos.
#c)Implementa buscaProducto(int c) buscando el código, para mostrar los datos de un producto.
import pickle


class Producto:
    def __init__(self, codigo, nombre, precio):
        self.codigo = codigo
        self.nombre = nombre
        self.precio = precio

    def __str__(self):
        return f"Código: {self.codigo}, Nombre: {self.nombre}, Precio: {self.precio}"


def guardar_producto(p):
    with open("productos.pkl", "ab") as f:
        pickle.dump(p, f)


def buscar_producto(codigo):
    try:
        with open("productos.pkl", "rb") as f:
            while True:
                p = pickle.load(f)
                if p.codigo == codigo:
                    print("Producto encontrado:", p)
                    return
    except EOFError:
        print("Producto no encontrado.")
    except FileNotFoundError:
        print("Archivo no encontrado.")

guardar_producto(Producto(101, "Teclado", 80))
buscar_producto(101)