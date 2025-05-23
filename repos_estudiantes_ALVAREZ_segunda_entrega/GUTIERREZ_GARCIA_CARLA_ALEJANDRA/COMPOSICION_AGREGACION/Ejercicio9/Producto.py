class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def mostrar_info(self):
        print(f"Producto: {self.nombre}, Precio: {self.precio}")

    def get_nombre(self):
        return self.nombre

    def get_precio(self):
        return self.precio

    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_precio(self, precio):
        self.precio = precio

class CarritoCompras:
    def __init__(self):
        self.productos = []

    def agregar_producto(self, producto):
        if len(self.productos) < 10:
            self.productos.append(producto)
            print(f"Producto '{producto.get_nombre()}' agregado al carrito.")
        else:
            print("No se puede agregar mas productos. El carrito ya tiene 10 productos.")

    def mostrar_carrito(self):
        print("Productos en el carrito:")
        for p in self.productos:
            p.mostrar_info()

    def get_productos(self):
        return self.productos


carrito = CarritoCompras()
productos = [
    Producto("Leche", 8.5),
    Producto("Pan", 3.0),
    Producto("Queso", 15.0),
    Producto("Jamon", 12.0),
    Producto("Huevos", 10.0),
    Producto("Mantequilla", 9.0),
    Producto("Cafe", 20.0),
    Producto("Azucar", 7.0),
    Producto("Arroz", 6.0),
    Producto("Aceite", 18.0),
    Producto("Sal", 2.0)  
]

for prod in productos:
    carrito.agregar_producto(prod)

carrito.mostrar_carrito()