class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def mostrar_info(self):
        print(f"Producto: {self.nombre}, Precio: ${self.precio:.2f}")


class CarritoCompras:
    MAX_PRODUCTOS = 10

    def __init__(self):
        self.productos = []

    def agregar_producto(self, producto):
        if len(self.productos) < CarritoCompras.MAX_PRODUCTOS:
            self.productos.append(producto)
        else:
            print(f"No se puede agregar más de {CarritoCompras.MAX_PRODUCTOS} productos al carrito.")

    def mostrar_carrito(self):
        print("Carrito de Compras:")
        for producto in self.productos:
            producto.mostrar_info()


def main():
    p1 = Producto("Manzana", 1.5)
    p2 = Producto("Pan", 0.8)
    p3 = Producto("Leche", 2.2)

    carrito = CarritoCompras()
    carrito.agregar_producto(p1)
    carrito.agregar_producto(p2)
    carrito.agregar_producto(p3)

    for i in range(4, 12): 
        carrito.agregar_producto(Producto(f"Producto {i}", i))

    carrito.mostrar_carrito()
    
main()
