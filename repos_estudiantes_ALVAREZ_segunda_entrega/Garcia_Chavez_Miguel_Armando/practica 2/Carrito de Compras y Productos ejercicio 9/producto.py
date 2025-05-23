class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio
    
    def mostrar_info(self):
        return f"Producto: {self.nombre}, Precio: ${self.precio:.2f}"

class CarritoCompras:
    def __init__(self):
        self.productos = []  
    
    def agregar_producto(self, producto):
        if len(self.productos) < 10:
            self.productos.append(producto)
            print(f"Producto {producto.nombre} agregado al carrito")
        else:
            print("El carrito no puede tener más de 10 productos")
    
    def mostrar_carrito(self):
        print("Carrito de Compras:")
        if not self.productos:
            print("El carrito está vacío")
        else:
            for producto in self.productos:
                print(f"- {producto.mostrar_info()}")
            total = sum(p.precio for p in self.productos)
            print(f"Total: ${total:.2f}")


prod1 = Producto("Laptop", 1200.50)
prod2 = Producto("Mouse", 25.99)
prod3 = Producto("Teclado", 45.75)

carrito = CarritoCompras()
carrito.agregar_producto(prod1)
carrito.agregar_producto(prod2)
carrito.agregar_producto(prod3)
carrito.mostrar_carrito()

print("\nProducto independiente:")
print(prod2.mostrar_info())