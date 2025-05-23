class Producto:
    def __init__(self, nombre, precio):
        self._nombre = nombre
        self._precio = precio

    def mostrar_info(self):
        return f"Producto: {self._nombre}, Precio: ${self._precio:.2f}"

    @property
    def nombre(self):
        return self._nombre

    @property
    def precio(self):
        return self._precio


class CarritoCompras:
    def __init__(self):
        self._productos = []

    def agregar_producto(self, producto):
        if len(self._productos) < 10:
            self._productos.append(producto)
            print(f"Producto '{producto.nombre}' agregado al carrito.")
        else:
            print("No se puede agregar más de 10 productos al carrito.")

    def mostrar_carrito(self):
        if not self._productos:
            print("El carrito está vacío.")
        else:
            print("Productos en el carrito:")
            for producto in self._productos:
                print(producto.mostrar_info())


if __name__ == "__main__":
    producto1 = Producto("Platanos", 10)
    producto2 = Producto("Pan Molde", 19)
    producto3 = Producto("Leche Deslactosada", 8)

    carrito = CarritoCompras()

    carrito.agregar_producto(producto1)
    carrito.agregar_producto(producto2)
    carrito.agregar_producto(producto3)

    carrito.mostrar_carrito()
  
