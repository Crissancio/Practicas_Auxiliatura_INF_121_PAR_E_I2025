class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre 
        self.precio = precio
    
    def mostrar_info(self):
        print(f"Nombre: {self.nombre}, Precio: {self.precio}")
        
    def getNombre(self):
        return self.nombre
    
    def getPrecio(self):
        return self.precio
        
    def setNombre(self, nombre):
        self.nombre = nombre
        
    def setPrecio(self, precio):
        self.precio = precio

class CarritoCompras:
    def __init__(self):
        self.productos = []
        
    def agregar_producto(self, nombre, precio):
        if len(self.productos) < 10:
            producto = Producto(nombre, precio)
            self.productos.append(producto)
            print(f"Producto '{nombre}'")
        else:
            print("No se puede agregar")

    def mostrar_carrito(self):
        print("Información de los productos en el carrito:")
        for producto in self.productos:
            producto.mostrar_info()


carrito = CarritoCompras()

productos_para_agregar = [
    ("Manzana", 1.5),
    ("Pan", 0.5),
    ("Leche", 8),
    ("Queso", 10),
    ("Jugo", 12),
    ("Galletas", 12),
    ("Arroz", 4.5),
    ("Azúcar", 4.5),
    ("Sal", 0.5),
    ("Aceite", 24),
    ("Huevos", 1)  
]

for nombre, precio in productos_para_agregar:
    carrito.agregar_producto(nombre, precio)


carrito.mostrar_carrito()
