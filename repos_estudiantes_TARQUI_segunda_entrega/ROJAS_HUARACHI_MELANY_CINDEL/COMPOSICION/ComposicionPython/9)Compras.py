# a) 

class Producto:
    def __init__(self, nombre, precio):
        self._nombre = nombre
        self._precio = precio

    def get_nombre(self):
        return self._nombre

    def get_precio(self):
        return self._precio

    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_precio(self, precio):
        self._precio = precio

    def mostrar_info(self):
        print(f"Producto: {self._nombre}, Precio: ${self._precio:.2f}")



class CarritoCompras:
    def __init__(self):
        self._productos = []

    def get_productos(self):
        return self._productos

    def set_productos(self, productos):
        self._productos = productos

    def agregar_producto(self, producto):
        if len(self._productos) < 10:
            self._productos.append(producto)
            print(f"Producto '{producto.get_nombre()}' agregado al carrito.")
        else:
            print("No se pueden agregar más productos. El carrito está lleno (máximo 10 productos).")

    def mostrar_carrito(self):
        if not self._productos:
            print("El carrito está vacío.")
        else:
            print("Contenido del carrito:")
            for idx, producto in enumerate(self._productos, start=1):
                print(f"{idx}. ", end="")
                producto.mostrar_info()



# b) 

p1 = Producto("Manzana", 0.50)
p2 = Producto("Leche", 1.20)
p3 = Producto("Pan", 0.80)
p4 = Producto("Huevos", 2.50)
p5 = Producto("Arroz", 1.00)
p6 = Producto("Azúcar", 0.75)
p7 = Producto("Café", 3.00)
p8 = Producto("Jabón", 1.50)
p9 = Producto("Pasta", 1.10)
p10 = Producto("Aceite", 4.00)
p11 = Producto("Sal", 0.40)  # Producto extra que no debería agregarse

carrito = CarritoCompras()

carrito.agregar_producto(p1)
carrito.agregar_producto(p2)
carrito.agregar_producto(p3)
carrito.agregar_producto(p4)
carrito.agregar_producto(p5)
carrito.agregar_producto(p6)
carrito.agregar_producto(p7)
carrito.agregar_producto(p8)
carrito.agregar_producto(p9)
carrito.agregar_producto(p10)
carrito.agregar_producto(p11)



# c) 

carrito.mostrar_carrito()
