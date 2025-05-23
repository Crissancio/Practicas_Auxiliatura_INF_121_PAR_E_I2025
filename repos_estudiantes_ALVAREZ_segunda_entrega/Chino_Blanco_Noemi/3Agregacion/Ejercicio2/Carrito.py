
class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def mostrar_info(self):
        return f"{self.nombre} - bs{self.precio:.2f}"

class CarritoCompras:
    def __init__(self):
        self.productos = []

    def agregar_producto(self, producto):
        if len(self.productos) < 10:
            self.productos.append(producto)
        else:
            print(" No se puede agregar más de 10 productos.")

    def mostrar_carrito(self):
        print(" Carrito de Compras:")
        for p in self.productos:
            print(" -", p.mostrar_info())

print(" Noemí Chino Blanco\n")

carrito = CarritoCompras()
p1 = Producto("Pan", 6)
p2 = Producto("Leche", 3.0)
p3 = Producto("Huevos", 4.2)

carrito.agregar_producto(p1)
carrito.agregar_producto(p2)
carrito.agregar_producto(p3)

carrito.mostrar_carrito()
