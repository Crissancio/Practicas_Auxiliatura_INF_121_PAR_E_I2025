class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio
    
    def mostrar_info(self):
        print(f"Producto: {self.nombre}")
        print(f"Precio: ${self.precio}")

class CarritoCompras:
    LIMITE = 10
    
    def __init__(self):
        self.productos = []
    
    def agregar_producto(self, producto):
        if len(self.productos) < self.LIMITE:
            self.productos.append(producto)
            return True
        else:
            print(f"No se puede agregar. Limite de {self.LIMITE} productos alcanzado.")
            return False
    
    def mostrar_carrito(self):
        print("=== Carrito de Compras ===")
        print(f"Productos ({len(self.productos)}/{self.LIMITE}):")
        
        total = 0
        for producto in self.productos:
            producto.mostrar_info()
            total += producto.precio
            print("-------------------")
        
        print(f"Total: ${total}")

# Uso
if __name__ == "__main__":
    # Productos existen independientemente
    laptop = Producto("Laptop", 1200.50)
    telefono = Producto("Telefono", 800.00)
    audifonos = Producto("Audifonos", 150.75)
    mouse = Producto("Mouse", 25.99)
    teclado = Producto("Teclado", 45.50)
    monitor = Producto("Monitor", 300.00)
    usb = Producto("USB 64GB", 20.00)
    disco = Producto("Disco Duro", 120.00)
    camara = Producto("Camara", 250.00)
    tablet = Producto("Tablet", 350.00)
    impresora = Producto("Impresora", 180.00)  # Producto extra para probar límite

    mi_carrito = CarritoCompras()
    mi_carrito.agregar_producto(laptop)
    mi_carrito.agregar_producto(telefono)
    mi_carrito.agregar_producto(audifonos)
    mi_carrito.agregar_producto(mouse)
    mi_carrito.agregar_producto(teclado)
    mi_carrito.agregar_producto(monitor)
    mi_carrito.agregar_producto(usb)
    mi_carrito.agregar_producto(disco)
    mi_carrito.agregar_producto(camara)
    mi_carrito.agregar_producto(tablet)
    mi_carrito.agregar_producto(impresora)  # No debería agregarse
    mi_carrito.mostrar_carrito()

    print("\n=== Productos independientes ===")
    laptop.mostrar_info()
    print("-------------------")
    impresora.mostrar_info()