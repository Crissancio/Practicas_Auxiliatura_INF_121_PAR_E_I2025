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
        print(f"Nombre: {self._nombre}, Precio: ${self._precio:.2f}")


class CarritoCompras:
    def __init__(self):
        self._productos = []
        self._limite = 10

    # Getter
    def get_productos(self):
        return self._productos

    # Setter (aunque en este caso, la manipulación de la lista se hace con métodos específicos)
    def set_productos(self, productos):
        if len(productos) <= self._limite:
            self._productos = productos
        else:
            print(f"Error: El carrito no puede contener más de {self._limite} productos.")

    def agregar_producto(self, producto):
        if len(self._productos) < self._limite:
            self._productos.append(producto)
            print(f"Producto '{producto.get_nombre()}' agregado al carrito.")
        else:
            print(f"Error: El carrito está lleno. No se pueden agregar más de {self._limite} productos.")

    def mostrar_carrito(self):
        if not self._productos:
            print("El carrito está vacío.")
        else:
            print("Productos en el carrito:")
            for producto in self._productos:
                producto.mostrar_info()

# b) Crear un carrito de compras y agregar varios productos
carrito = CarritoCompras()

producto1 = Producto("Camiseta", 25.99)
producto2 = Producto("Pantalón", 49.50)
producto3 = Producto("Zapatos", 79.99)
producto4 = Producto("Sombrero", 15.00)
producto5 = Producto("Bolso", 35.75)
producto6 = Producto("Gafas de sol", 29.95)
producto7 = Producto("Reloj", 99.00)
producto8 = Producto("Bufanda", 18.50)
producto9 = Producto("Guantes", 22.00)
producto10 = Producto("Calcetines", 9.99)
producto11 = Producto("Chaqueta", 65.00) # Este producto intentará exceder el límite

carrito.agregar_producto(producto1)
carrito.agregar_producto(producto2)
carrito.agregar_producto(producto3)
carrito.agregar_producto(producto4)
carrito.agregar_producto(producto5)
carrito.agregar_producto(producto6)
carrito.agregar_producto(producto7)
carrito.agregar_producto(producto8)
carrito.agregar_producto(producto9)
carrito.agregar_producto(producto10)
carrito.agregar_producto(producto11) # Intentará agregar un undécimo producto

# c) Mostrar la información del carrito y sus productos
print("\nInformación del carrito de compras:")
carrito.mostrar_carrito()
