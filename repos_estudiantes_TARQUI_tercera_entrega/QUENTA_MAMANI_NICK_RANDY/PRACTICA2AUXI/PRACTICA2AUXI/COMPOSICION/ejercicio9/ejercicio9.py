# 9. Crea un POO para un carrito de compras y sus productos. El carrito contiene
# productos, pero los productos pueden existir independientemente del carrito.
# Además, el carrito no puede contener más de 10 productos.
# Producto<nombre, precio>
# Métodos: mostrar_info() (muestra el nombre y el precio del producto)
# CarritoCompras<productos (lista de objetos de tipo Producto)>
# Métodos: agregar_producto(producto), mostrar_carrito() (muestra la
# información de todos los productos en el carrito)
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea un carrito de compras y agrega varios productos, validando que no
# se exceda el límite de 10 productos.
# c) Muestra la información del carrito y sus productos.
class Producto:
    def __init__(self, nombre, precio): 
        self.nombre, self.precio = nombre, precio
    def mostrar_info(self): 
        print(f"{self.nombre} - Bs. {self.precio}")

class CarritoCompras:
    def __init__(self): 
        self.productos = []
    def agregar_producto(self, producto):
        if len(self.productos) < 10: 
            self.productos.append(producto)
        else: 
            print("Límite de 10 productos alcanzado")
    def mostrar_carrito(self):
        print("Carrito de Compras:")
        for p in self.productos: 
            p.mostrar_info()

carrito = CarritoCompras()
for i in range(1, 12):  
    carrito.agregar_producto(Producto(f"Producto{i}", i * 10))
carrito.mostrar_carrito()
