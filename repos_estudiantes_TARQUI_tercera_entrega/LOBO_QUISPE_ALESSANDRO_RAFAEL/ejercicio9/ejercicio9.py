class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def mostrar_info(self):
        print(f"Producto: {self.nombre}, Precio: ${self.precio:.2f}")


class CarritoCompras:
    def __init__(self):
        self.productos = []

    def agregar_producto(self, producto):
        if len(self.productos) < 10:
            self.productos.append(producto)
        else:
            print("No se pueden agregar más de 10 productos.")

    def mostrar_carrito(self):
        print("Carrito de Compras:")
        for producto in self.productos:
            producto.mostrar_info()


# Ejemplo de uso
carrito = CarritoCompras()
carrito.agregar_producto(Producto("Laptop", 999.99))
carrito.agregar_producto(Producto("Mouse", 25.50))
carrito.agregar_producto(Producto("Teclado", 45.00))

carrito.mostrar_carrito()
