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
        return f"Producto: {self._nombre} | Precio: ${self._precio:.2f}"

class CarritoCompras:
    def __init__(self):
        self._productos = []  # Agregación: los productos pueden existir fuera del carrito

    def get_productos(self):
        return self._productos

    def agregar_producto(self, producto):
        if len(self._productos) < 10:
            self._productos.append(producto)
            print(f"✅ {producto.get_nombre()} agregado al carrito.")
        else:
            print("❌ No se puede agregar más productos. Límite de 10 alcanzado.")

    def mostrar_carrito(self):
        print("\n🛒 Carrito de Compras:")
        if self._productos:
            for producto in self._productos:
                print(f"  - {producto.mostrar_info()}")
        else:
            print("Carrito vacío.")
# Creación de productos
producto1 = Producto("Laptop", 1200)
producto2 = Producto("Auriculares", 150)
producto3 = Producto("Mouse", 50)
producto4 = Producto("Teclado", 80)
producto5 = Producto("Monitor", 300)
producto6 = Producto("Disco Duro", 100)
producto7 = Producto("Memoria USB", 25)
producto8 = Producto("Silla Gamer", 250)
producto9 = Producto("Impresora", 180)
producto10 = Producto("Tablet", 400)
producto11 = Producto("Smartphone", 900)  # Este superará el límite

# Creación del carrito y agregación de productos
carrito = CarritoCompras()
productos_a_agregar = [producto1, producto2, producto3, producto4, producto5, 
                       producto6, producto7, producto8, producto9, producto10, producto11]

for producto in productos_a_agregar:
    carrito.agregar_producto(producto)

# Mostrar la información del carrito y sus productos
carrito.mostrar_carrito()
