class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def mostrar_info(self):
        print(f"  - {self.nombre} | Precio: ${self.precio:.2f}")

class CarritoCompras:
    MAX_PRODUCTOS = 10

    def __init__(self):
        self.productos = []

    def agregar_producto(self, producto):
        if len(self.productos) < self.MAX_PRODUCTOS:
            self.productos.append(producto)
            return True
        else:
            print("❌ El carrito está lleno (límite: 10 productos)")
            return False

    def mostrar_carrito(self):
        print("\n🛒 Contenido del Carrito:")
        for producto in self.productos:
            producto.mostrar_info()
        print(f"Total: {len(self.productos)}/{self.MAX_PRODUCTOS} productos")

if __name__ == "__main__":
    carrito = CarritoCompras()

    # Agregar productos
    carrito.agregar_producto(Producto("Laptop", 1200.50))
    carrito.agregar_producto(Producto("Mouse", 25.99))
    carrito.agregar_producto(Producto("Teclado", 45.75))

    # Intentar exceder el límite
    for i in range(8):
        carrito.agregar_producto(Producto(f"Producto {i + 4}", 10.99))

    # Mostrar contenido
    carrito.mostrar_carrito()