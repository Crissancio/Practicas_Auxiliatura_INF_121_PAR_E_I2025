# 9. Crea un POO para un carrito de compras y sus productos.
# El carrito contiene productos, pero los productos pueden existir independientemente del carrito.
# Además, el carrito no puede contener más de 10 productos.
#
# Producto<nombre, precio>
# Métodos: mostrar_info() (muestra el nombre y el precio del producto)
#
# CarritoCompras<productos (lista de objetos de tipo Producto)>
# Métodos: agregar_producto(producto), mostrar_carrito() (muestra la información de todos los productos en el carrito)
#
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea un carrito de compras y agrega varios productos, validando que no se exceda el límite de 10 productos.
# c) Muestra la información del carrito y sus productos.

class Producto:
    def __init__(self, nombre, precio):
        self.__nombre = nombre
        self.__precio = precio

    def mostrar_info(self):
        return f"{self.__nombre} - ${self.__precio}"

    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_precio(self):
        return self.__precio

    def set_precio(self, precio):
        self.__precio = precio


class CarritoCompras:
    def __init__(self):
        self.__productos = []

    def agregar_producto(self, producto):
        if len(self.__productos) < 10:
            self.__productos.append(producto)
        else:
            print("No se puede agregar más de 10 productos al carrito.")

    def mostrar_carrito(self):
        if not self.__productos:
            print("El carrito está vacío.")
        else:
            print("Productos en el carrito:")
            for p in self.__productos:
                print(p.mostrar_info())

p1 = Producto("Leche", 8)
p2 = Producto("Pan", 3)
p3 = Producto("Huevos", 10)
p4 = Producto("Arroz", 7)
p5 = Producto("Carne", 20)
p6 = Producto("Jugo", 5)
p7 = Producto("Fruta", 12)
p8 = Producto("Aceite", 15)
p9 = Producto("Pasta", 6)
p10 = Producto("Cereal", 9)
p11 = Producto("Extra", 1)

carrito = CarritoCompras()
for p in [p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11]:
    carrito.agregar_producto(p)

carrito.mostrar_carrito()
