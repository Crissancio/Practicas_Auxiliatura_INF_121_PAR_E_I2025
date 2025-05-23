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

    def __str__(self):
        return f"Producto: {self.__nombre}\nPrecio: {self.__precio:.2f} Bs." 


class CarritoCompras:
    def __init__(self):
        self.__productos = []  
    def agregar_producto(self, producto):
        if len(self.__productos) < 10:
            self.__productos.append(producto)
        else:
            print("No se pueden agregar mas productos al carrito.")

    def mostrar_carrito(self):
        print("Carrito de Compras:")
        print("=" * 30)
        for producto in self.__productos:
            print(producto)
            print("=" * 30)


prod1 = Producto("Arroz (Quintal)", 640.50)
prod2 = Producto("Fideo (5kg)", 59.30)
prod3 = Producto("Aceite (4.5 litros)", 100.00)
prod4 = Producto("Huevos (1 maple)", 33.50)
prod5 = Producto("Harina (1@)", 120.80)
prod6 = Producto("Detergente (600 gr.)", 45.99)
prod7 = Producto("Dentrifico", 39.70)
prod8 = Producto("Shampo", 60.25)
prod9 = Producto("Leche (1 litro)", 7.50)
prod10 = Producto("Papel Higiénico", 30.99)

carrito = CarritoCompras()

carrito.agregar_producto(prod1)
carrito.agregar_producto(prod2)
carrito.agregar_producto(prod3)
carrito.agregar_producto(prod4)
carrito.agregar_producto(prod5)
carrito.agregar_producto(prod6)
carrito.agregar_producto(prod7)
carrito.agregar_producto(prod8)
carrito.agregar_producto(prod9)
carrito.agregar_producto(prod10)

carrito.mostrar_carrito()
