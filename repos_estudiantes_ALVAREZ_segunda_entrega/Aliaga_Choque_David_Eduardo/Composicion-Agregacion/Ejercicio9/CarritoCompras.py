# a) Implementa las clases con sus constructores, getters y setters
class Producto:
    def __init__(self, nombre, precio):
        self._nombre = nombre
        self._precio = precio

    def get_nombre(self):
        return self._nombre

    def get_precio(self):
        return self._precio

    def set_nombre(self, nuevo_nombre):
        self._nombre = nuevo_nombre

    def set_precio(self, nuevo_precio):
        self._precio = nuevo_precio
        
    def mostrar_info(self):
        print(f"Producto: {self._nombre}, Precio: ${self._precio:.2f}")


class CarritoCompras:
    def __init__(self):
        self._productos = []  

    def agregar_producto(self, producto):
        if len(self._productos) < 10:
            self._productos.append(producto)
            print(f"Producto '{producto.get_nombre()}' agregado al carrito.")
        else:
            print("No se puede agregar más de 10 productos al carrito.")

    def mostrar_carrito(self):
        print("Carrito de Compras:")
        if not self._productos:
            print("El carrito está vacío.")
        else:
            for producto in self._productos:
                producto.mostrar_info()
            print(f"Total de productos: {len(self._productos)}")

# b) Crea un carrito de compras y agrega varios productos, validando que no se exceda el límite de 10 productos
prod1 = Producto("Laptop", 1200.00)
prod2 = Producto("Mouse", 25.50)
prod3 = Producto("Teclado", 45.00)
prod4 = Producto("Monitor", 220.99)
prod5 = Producto("USB", 15.75)
prod6 = Producto("Auriculares", 89.99)
prod7 = Producto("Webcam", 50.00)
prod8 = Producto("Silla Gamer", 135.49)
prod9 = Producto("Tablet", 300.00)
prod10 = Producto("Impresora", 199.90)
prod11 = Producto("Celular", 999.00)  
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
carrito.agregar_producto(prod11)  

# c) Muestra la información del carrito y sus productos
carrito.mostrar_carrito()
