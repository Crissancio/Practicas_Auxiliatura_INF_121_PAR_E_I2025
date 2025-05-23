# Clase Producto (puede existir independientemente del carrito)
class Producto:
    def __init__(self, nombre: str, precio: float):
        self.nombre = nombre
        self.precio = precio

    def mostrar_info(self):
        print(f"📦 Producto: {self.nombre} | Precio: ${self.precio:.2f}")


class CarritoCompras:
    LIMITE = 10  

    def __init__(self):
        self.productos = []  

    def agregar_producto(self, producto: Producto):
        if len(self.productos) < self.LIMITE:
            self.productos.append(producto)
            print(f"✅ Producto agregado: {producto.nombre}")
        else:
            print("❌ No se puede agregar más productos, se alcanzó el límite.")

    def mostrar_carrito(self):
        print("\n🛒 Carrito de compras:")
        if not self.productos:
            print("El carrito está vacío.")
            return

        print("-------------------------------------------")
        for producto in self.productos:
            producto.mostrar_info()
        print("-------------------------------------------")
        print(f"Total de productos en el carrito: {len(self.productos)}")


if __name__ == "__main__":
    carrito = CarritoCompras()
    productos = [
        Producto("Aceite", 23.33), Producto("Coca-Cola", 3.33), Producto("Ace", 2.33),
        Producto("Pepsi", 23.0), Producto("Jabón", 2.34), Producto("Leche", 4.50),
        Producto("Pan", 1.25), Producto("Huevos", 3.99), Producto("Arroz", 10.0),
        Producto("Harina", 5.75), Producto("Chocolate", 8.99)  # Producto que excede el límite
    ]
    for producto in productos:
        carrito.agregar_producto(producto)

    carrito.mostrar_carrito()
