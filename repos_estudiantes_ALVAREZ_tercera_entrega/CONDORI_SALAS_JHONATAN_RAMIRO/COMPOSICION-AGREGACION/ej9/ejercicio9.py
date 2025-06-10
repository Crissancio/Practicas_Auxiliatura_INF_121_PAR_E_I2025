class Producto:
    def __init__(self, nombre, precio):
        self._nombre = nombre
        self._precio = precio

    # Getters
    def get_nombre(self):
        return self._nombre

    def get_precio(self):
        return self._precio

    # Setters
    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_precio(self, precio):
        self._precio = precio

    def mostrar_info(self):
        print(f"Producto: {self._nombre}, Precio: {self._precio} Bs")


class CarritoCompras:
    def __init__(self):
        self._productos = []

    # Getter
    def get_productos(self):
        return self._productos

    # Setter
    def set_productos(self, productos):
        self._productos = productos

    def agregar_producto(self, producto):
        if len(self._productos) < 10:
            self._productos.append(producto)
        else:
            print("No se pueden agregar más de 10 productos al carrito.")

    def mostrar_carrito(self):
        print("Contenido del carrito:")
        for producto in self._productos:
            producto.mostrar_info()

# Crear productos
p1 = Producto("Leche", 7.5)
p2 = Producto("Pan", 2.0)
p3 = Producto("Queso", 15.0)

# Crear carrito y agregar productos
carrito = CarritoCompras()
carrito.agregar_producto(p1)
carrito.agregar_producto(p2)
carrito.agregar_producto(p3)

# Mostrar contenido del carrito
carrito.mostrar_carrito()
