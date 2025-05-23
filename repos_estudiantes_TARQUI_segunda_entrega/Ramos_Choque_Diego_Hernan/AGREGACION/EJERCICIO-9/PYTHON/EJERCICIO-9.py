class Producto:
    def __init__(self, nombre, precio):
        self._nombre = nombre
        self._precio = precio

    def get_nombre(self):
        return self._nombre

    def set_nombre(self, nombre):
        self._nombre = nombre

    def get_precio(self):
        return self._precio

    def set_precio(self, precio):
        self._precio = precio

    def mostrar_info(self):
        return f"{self._nombre}, ${self._precio}"


class CarritoCompras:
    def __init__(self):
        self._productos = []

    def get_productos(self):
        return self._productos

    def agregar_producto(self, producto):
        if len(self._productos) < 10:
            self._productos.append(producto)

    def mostrar_carrito(self):
        print("Carrito de Compras:")
        for producto in self._productos:
            print(producto.mostrar_info())


p1 = Producto("Manzanas", 3.50)
p2 = Producto("Pan", 2.00)
p3 = Producto("Leche", 1.80)
p4 = Producto("Queso", 4.00)
p5 = Producto("Huevos", 2.50)
p6 = Producto("Jugo", 3.00)
p7 = Producto("Cereal", 4.20)
p8 = Producto("Yogurt", 1.60)
p9 = Producto("Galletas", 2.30)
p10 = Producto("Chocolate", 1.90)
p11 = Producto("Arroz", 2.70)

carrito = CarritoCompras()
carrito.agregar_producto(p1)
carrito.agregar_producto(p2)
carrito.agregar_producto(p3)
carrito.agregar_producto(p4)
carrito.agregar_producto(p5)
carrito.agregar_producto(p6)
carrito.agregar_producto(p7)
carrito.agregar_producto(p8)
carrito.agregar_producto(p9)
carrito.agregar_producto(p10)
carrito.agregar_producto(p11)

carrito.mostrar_carrito()
