from typing import List 

class Producto:
    def __init__(self, nombre: str, precio: float):
        self.nombre = nombre
        self.precio = precio

    def getName(self) -> str:
        return self.nombre

    def mostrarInfo(self):
        print(f"Nombre: {self.nombre}, Precio: ${self.precio}")


class CarritoDeCompras:
    MAX_PRODUCTOS = 10 

    def __init__(self):
        self.productos: List[Producto] = [] 

    def agregarProducto(self, producto: Producto):
        if len(self.productos) < self.MAX_PRODUCTOS: 
            self.productos.append(producto)
            print(f"{producto.getName()} agregado al carrito.")
        else:
            print("El carrito está lleno. No se puede agregar más productos.")

    def mostrarProductos(self):
        print("Productos en el carrito:")
        if not self.productos: 
            print("El carrito está vacío.")
            return
        for producto in self.productos:
            producto.mostrarInfo()


if __name__ == "__main__":
    carrito = CarritoDeCompras()
    producto1 = Producto("Laptop", 999.99)
    producto2 = Producto("Smartphone", 499.99)
    producto3 = Producto("Tablet", 299.99)
    producto4 = Producto("Auriculares", 99.99)
    producto5 = Producto("Teclado", 49.99)
    producto6 = Producto("Mouse", 29.99)
    producto7 = Producto("Monitor", 199.99)
    producto8 = Producto("Impresora", 149.99)
    producto9 = Producto("Router", 79.99)
    producto10 = Producto("Cámara", 249.99)

    carrito.agregarProducto(producto1)
    carrito.agregarProducto(producto2)
    carrito.agregarProducto(producto3)
    carrito.agregarProducto(producto4)
    carrito.agregarProducto(producto5)
    carrito.agregarProducto(producto6)
    carrito.agregarProducto(producto7)
    carrito.agregarProducto(producto8)
    carrito.agregarProducto(producto9)
    carrito.agregarProducto(producto10)
    carrito.agregarProducto(Producto("Disco Duro", 59.99))

    print()
    carrito.mostrarProductos()