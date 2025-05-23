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
            print(f"✅ Producto agregado: {producto.nombre}")
        else:
            print("❌ No se puede agregar más de 10 productos al carrito.")

    def mostrar_carrito(self):
        print("=== Carrito de Compras ===")
        if not self.productos:
            print("El carrito está vacío.")
        else:
            for p in self.productos:
                print("  -", p.mostrar_info())


# b) 
# Productos independientes
p1 = Producto("Laptop", 1200)
p2 = Producto("Mouse", 25)
p3 = Producto("Teclado", 45)
p4 = Producto("Monitor", 300)
p5 = Producto("Impresora", 150)
p6 = Producto("Cámara", 200)
p7 = Producto("Memoria USB", 15)
p8 = Producto("Disco Duro", 80)
p9 = Producto("Parlantes", 60)
p10 = Producto("Micrófono", 50)
p11 = Producto("Router", 100)  # Producto extra

carrito = CarritoCompras()
productos = [p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11]

for prod in productos:
    carrito.agregar_producto(prod)

# c)
print("\n== Información del Carrito ==")
carrito.mostrar_carrito()
