#9. Crea un POO para un carrito de compras y sus productos. El carrito contiene
#productos, pero los productos pueden existir independientemente del carrito.
#Además, el carrito no puede contener más de 10 productos.
#Producto<nombre, precio>
#Métodos: mostrar_info() (muestra el nombre y el precio del producto)
#CarritoCompras<productos (lista de objetos de tipo Producto)>
#Métodos: agregar_producto(producto), mostrar_carrito() (muestra la
#información de todos los productos en el carrito)
#a) Implementa las clases con sus constructores, getters y setters.
#b) Crea un carrito de compras y agrega varios productos, validando que no
#se exceda el límite de 10 productos.
#c) Muestra la información del carrito y sus productos.

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
    LIMITE_PRODUCTOS = 10

    def __init__(self):
        self._productos = []

    def get_productos(self):
        return self._productos

    def agregar_producto(self, producto):
        if len(self._productos) < CarritoCompras.LIMITE_PRODUCTOS:
            self._productos.append(producto)
            print(f"Producto '{producto.get_nombre()}' agregado al carrito.")
        else:
            print(f"El carrito está lleno. No se puede agregar '{producto.get_nombre()}'.")

    def mostrar_carrito(self):
        if self._productos:
            print("Contenido del carrito de compras:")
            for producto in self._productos:
                producto.mostrar_info()
        else:
            print("El carrito de compras está vacío.")


if __name__ == "__main__":
    producto1 = Producto("Laptop", 1200.00)
    producto2 = Producto("Mouse", 25.00)
    producto3 = Producto("Teclado", 75.00)
    producto4 = Producto("Monitor", 300.00)
    producto5 = Producto("Auriculares", 100.00)
    producto6 = Producto("Webcam", 50.00)
    producto7 = Producto("Impresora", 150.00)
    producto8 = Producto("Parlantes", 80.00)
    producto9 = Producto("Micrófono", 60.00)
    producto10 = Producto("SSD", 120.00)
    producto11 = Producto("Cable HDMI", 15.00)

    mi_carrito = CarritoCompras()
    mi_carrito.agregar_producto(producto1)
    mi_carrito.agregar_producto(producto2)
    mi_carrito.agregar_producto(producto3)
    mi_carrito.agregar_producto(producto4)
    mi_carrito.agregar_producto(producto5)
    mi_carrito.agregar_producto(producto6)
    mi_carrito.agregar_producto(producto7)
    mi_carrito.agregar_producto(producto8)
    mi_carrito.agregar_producto(producto9)
    mi_carrito.agregar_producto(producto10)
    mi_carrito.agregar_producto(producto11) 

    mi_carrito.mostrar_carrito()

    
    producto_independiente = Producto("Libro", 20.00)
    producto_independiente.mostrar_info()