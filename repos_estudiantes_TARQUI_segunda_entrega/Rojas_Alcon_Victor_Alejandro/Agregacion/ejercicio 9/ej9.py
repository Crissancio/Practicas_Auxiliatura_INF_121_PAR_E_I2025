class Producto:
    def __init__(self, nombre, precio):
        self._nombre = nombre
        self._precio = precio

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, valor):
        self._nombre = valor

    @property
    def precio(self):
        return self._precio

    @precio.setter
    def precio(self, valor):
        self._precio = valor

    def mostrar_info(self):
        print(f"{self.nombre} | Precio: ${self.precio:.2f}")


class CarritoCompras:
    def __init__(self):
        self._productos = []

    def agregar_producto(self, producto):
        if isinstance(producto, Producto):
            if len(self._productos) < 10:
                self._productos.append(producto)
            else:
                print("El carrito ya no puede contener más de 10 productos.")
        else:
            print("Solo se pueden agregar objetos de tipo Producto.")

    def mostrar_carrito(self):
        if len(self._productos) == 0:
            print("El carrito está vacío.")
        else:
            print("\nCarrito de Compras:")
            for producto in self._productos:
                producto.mostrar_info()

if __name__ == "__main__":
    carrito = CarritoCompras()
    p1 = Producto("Laptop", 899.99)
    p2 = Producto("Auriculares", 49.99)
    p3 = Producto("Smartphone", 399.99)

    carrito.agregar_producto(p1)
    carrito.agregar_producto(p2)
    carrito.agregar_producto(p3)

    carrito.mostrar_carrito()