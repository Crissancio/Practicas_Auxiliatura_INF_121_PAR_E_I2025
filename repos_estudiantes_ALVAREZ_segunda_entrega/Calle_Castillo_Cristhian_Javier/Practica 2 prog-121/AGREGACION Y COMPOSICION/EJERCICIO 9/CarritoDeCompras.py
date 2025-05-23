class Producto:
    def __init__(self, nombre, precio):
        self._nombre = nombre
        self._precio = precio

    def get_nombre(self):
        return self._nombre

    def get_precio(self):
        return self._precio

    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_precio(self, precio):
        self._precio = precio

    def mostrar_info(self):
        print(f"Producto: {self._nombre}")
        print(f"Precio: ${self._precio:.2f}")
        print("------------------------")


class CarritoCompras:
    LIMITE = 10

    def __init__(self):
        self._productos = []

    def get_productos(self):
        return self._productos

    def agregar_producto(self, producto):
        if len(self._productos) < self.LIMITE:
            self._productos.append(producto)
            return True
        else:
            print("No se puede agregar más de 10 productos al carrito.")
            return False

    def mostrar_carrito(self):
        print("Carrito de Compras:")
        for producto in self._productos:
            producto.mostrar_info()
        print(f"Total de productos: {len(self._productos)}")


if __name__ == "__main__":
    # Crear productos
    p1 = Producto("Laptop", 1200.50)
    p2 = Producto("Mouse", 25.99)
    p3 = Producto("Teclado", 45.00)
    p4 = Producto("Monitor", 150.75)
    p5 = Producto("Audífonos", 35.00)
    p6 = Producto("USB", 10.00)
    p7 = Producto("Disco Duro", 85.00)
    p8 = Producto("Silla Gamer", 220.00)
    p9 = Producto("Cámara Web", 50.00)
    p10 = Producto("Micrófono", 70.00)
    p11 = Producto("Tablet", 300.00)  # Excede el límite

    # Crear carrito de compras
    carrito = CarritoCompras()

    # Agregar productos
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

    # Intentar agregar un producto extra
    carrito.agregar_producto(p11)

    # Mostrar carrito
    carrito.mostrar_carrito()
