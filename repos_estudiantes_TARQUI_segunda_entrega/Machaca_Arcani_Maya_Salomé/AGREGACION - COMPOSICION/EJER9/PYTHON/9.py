class Producto:
    def __init__(self, nombre: str, precio: float):
        self.__nombre = nombre
        self.__precio = precio

    def mostrar_info(self):
        print(f"Producto: {self.__nombre}, Precio: ${self.__precio:.2f}")

    def get_nombre(self): return self.__nombre
    def get_precio(self): return self.__precio
    def set_nombre(self, nombre): self.__nombre = nombre
    def set_precio(self, precio): self.__precio = precio


class CarritoCompras:
    def __init__(self):
        self.__productos = []

    def agregar_producto(self, producto: Producto):
        if len(self.__productos) < 10:
            self.__productos.append(producto)
        else:
            print("No se puede agregar más de 10 productos al carrito.")

    def mostrar_carrito(self):
        print("Carrito de Compras:")
        if not self.__productos:io.")
        for p in self.__productos:
            p.mostrar_info()
            print("------")

    def get_productos(self): return self.__productos


p1 = Producto("Laptop", 4500.00)
p2 = Producto("Mouse", 150.50)
p3 = Producto("Teclado", 250.75)

carrito = CarritoCompras()
carrito.agregar_producto(p1)
carrito.agregar_producto(p2)
carrito.agregar_producto(p3)

carrito.mostrar_carrito()
