# Enunciado:
# 9. Crea un POO para un carrito de compras y sus productos.
# El carrito contiene productos, pero los productos pueden existir independientemente del carrito.
# Además, el carrito no puede contener más de 10 productos.
#
# Producto <nombre, precio>
# Métodos: mostrar_info() (muestra el nombre y el precio del producto)
#
# CarritoCompras <productos (lista de objetos Producto)>
# Métodos: agregar_producto(producto), mostrar_carrito() (muestra la info de todos los productos en el carrito)
#
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea un carrito de compras y agrega varios productos, validando que no se exceda el límite de 10 productos.
# c) Muestra la información del carrito y sus productos.

class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def mostrar_info(self):
        print(f"Producto: {self.nombre} | Precio: ${self.precio:.2f}")

class CarritoCompras:
    def __init__(self):
        self.productos = []

    def agregar_producto(self, producto):
        if len(self.productos) < 10:
            self.productos.append(producto)
        else:
            print("No se puede agregar más de 10 productos al carrito.")

    def mostrar_carrito(self):
        if not self.productos:
            print("El carrito está vacío.")
        else:
            print("Contenido del Carrito:")
            for producto in self.productos:
                producto.mostrar_info()

# b) Crear carrito y agregar productos
p1 = Producto("Laptop", 950.00)
p2 = Producto("Mouse", 25.99)
p3 = Producto("Teclado", 45.00)

carrito = CarritoCompras()
carrito.agregar_producto(p1)
carrito.agregar_producto(p2)
carrito.agregar_producto(p3)

for i in range(8):
    carrito.agregar_producto(Producto(f"Producto Extra {i+1}", 10.00))

carrito.agregar_producto(Producto("Producto fuera de límite", 1.00))

# c) Mostrar la información del carrito y sus productos
carrito.mostrar_carrito()
