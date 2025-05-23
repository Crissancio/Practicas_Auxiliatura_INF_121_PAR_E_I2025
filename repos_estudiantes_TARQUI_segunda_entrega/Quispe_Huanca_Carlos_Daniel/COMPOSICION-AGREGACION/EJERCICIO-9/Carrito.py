class Producto:
    def __init__(self, nombre, precio):
        self._nombre = nombre
        self._precio = precio

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, nuevo_nombre):
        self._nombre = nuevo_nombre

    @property
    def precio(self):
        return self._precio

    @precio.setter
    def precio(self, nuevo_precio):
        self._precio = nuevo_precio

    def mostrar_info(self):
        print(f"Producto: {self._nombre} - Precio: ${self._precio:.2f}")


class CarritoCompras:
    def __init__(self):
        self._productos = []

    @property
    def productos(self):
        return self._productos

    def agregar_producto(self, producto):
        if len(self._productos) >= 10:
            print("Error: El carrito no puede contener más de 10 productos")
        else:
            self._productos.append(producto)
            print(f"Producto '{producto.nombre}' agregado al carrito")

    def mostrar_carrito(self):
        if not self._productos:
            print("El carrito está vacío")
        else:
            print("Contenido del carrito:")
            print(f"Total de productos: {len(self._productos)}")
            for producto in self._productos:
                producto.mostrar_info()
            total = sum(p.precio for p in self._productos)
            print(f"Total a pagar: ${total:.2f}")


if __name__ == "__main__":
    producto1 = Producto("Laptop", 1200.50)
    producto2 = Producto("Mouse", 25.99)
    producto3 = Producto("Teclado", 45.75)
    producto4 = Producto("Monitor", 350.00)
    producto5 = Producto("USB 32GB", 12.50)

    carrito = CarritoCompras()

    carrito.agregar_producto(producto1)
    carrito.agregar_producto(producto2)
    carrito.agregar_producto(producto3)
    carrito.agregar_producto(producto4)
    carrito.agregar_producto(producto5)

    for i in range(6, 12):
        p = Producto(f"Producto {i}", i * 10)
        carrito.agregar_producto(p)

    carrito.mostrar_carrito()