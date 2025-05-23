class Producto:
    def __init__(self, nombre, precio):
        self.__nombre = nombre
        self.__precio = precio

    def get_nombre(self):
        return self.__nombre

    def get_precio(self):
        return self.__precio

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def set_precio(self, precio):
        self.__precio = precio

    def mostrar_info(self):
        print(f"Producto: {self.__nombre}, Precio: Bs{self.__precio:.2f}")

class CarritoCompras:
    def __init__(self):
        self.__productos = []

    def get_productos(self):
        return self.__productos

    def set_productos(self, productos):
        if len(productos) <= 10:
            self.__productos = productos
        else:
            print("****No se puede establecer más de 10 productos en el carrito.****")

    def agregar_producto(self, producto):
        if len(self.__productos) < 10:
            self.__productos.append(producto)
            print(f"Producto '{producto.get_nombre()}' agregado al carrito.")
        else:
            print("****No se pueden agregar más de 10 productos al carrito.****")

    def mostrar_carrito(self):
        print("-------Carrito de Compras:-------")
        if not self.__productos:
            print("El carrito está vacío.")
        else:
            for prod in self.__productos:
                prod.mostrar_info()

p1 = Producto("Manzana", 30.50)
p2 = Producto("Pan", 10.50)
p3 = Producto("Leche", 14.50)
p4 = Producto("Queso", 12.50)
p5 = Producto("Huevos", 33.20)
p6 = Producto("Cereal", 22.50)
p7 = Producto("Jugo", 12.20)
p8 = Producto("Arroz", 280.50)
p9 = Producto("Pollo", 40.20)
p10 = Producto("Pasta", 18.60)
p11 = Producto("Galletas", 15.30)

carrito = CarritoCompras()

productos = [p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11]
for prod in productos:
    carrito.agregar_producto(prod)

carrito.mostrar_carrito()