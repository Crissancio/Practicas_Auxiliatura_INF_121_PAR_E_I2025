class Producto:
    def __init__(self, nombre, precio):
        self._nombre = nombre
        self._precio = precio
    
    # Getters
    @property
    def nombre(self):
        return self._nombre
    
    @property
    def precio(self):
        return self._precio
    
    # Setters
    @nombre.setter
    def nombre(self, nuevo_nombre):
        self._nombre = nuevo_nombre
    
    @precio.setter
    def precio(self, nuevo_precio):
        self._precio = nuevo_precio
    
    def mostrar_info(self):
        print(f"Producto: {self._nombre} - Precio: ${self._precio:.2f}")


class CarritoCompras:
    MAX_PRODUCTOS = 10
    
    def __init__(self):
        self._productos = []
    
    # Getters
    @property
    def productos(self):
        return self._productos
    
    def agregar_producto(self, producto):
        if len(self._productos) >= self.MAX_PRODUCTOS:
            print(f"Error: No se pueden agregar más de {self.MAX_PRODUCTOS} productos al carrito")
            return False
        
        self._productos.append(producto)
        print(f"Producto '{producto.nombre}' agregado al carrito")
        return True
    
    def mostrar_carrito(self):
        if not self._productos:
            print("El carrito está vacío")
            return
        
        print("Contenido del carrito:")
        print("=" * 30)
        for producto in self._productos:
            producto.mostrar_info()
        
        total = sum(p.precio for p in self._productos)
        print("=" * 30)
        print(f"Total: ${total:.2f}")
        print(f"Productos en carrito: {len(self._productos)}/{self.MAX_PRODUCTOS}")


# Ejemplo de uso
if __name__ == "__main__":
    # Crear productos
    producto1 = Producto("Laptop", 1200.50)
    producto2 = Producto("Teléfono", 599.99)
    producto3 = Producto("Tablet", 350.00)
    producto4 = Producto("Auriculares", 89.90)
    producto5 = Producto("Mouse", 25.50)
    
    # Crear carrito y agregar productos
    carrito = CarritoCompras()
    carrito.agregar_producto(producto1)
    carrito.agregar_producto(producto2)
    carrito.agregar_producto(producto3)
    carrito.agregar_producto(producto4)
    carrito.agregar_producto(producto5)
    
    # Intentar agregar más productos de los permitidos
    for i in range(6, 12):
        p = Producto(f"Producto {i}", i * 10)
        carrito.agregar_producto(p)
    
    # Mostrar contenido del carrito
    carrito.mostrar_carrito()
