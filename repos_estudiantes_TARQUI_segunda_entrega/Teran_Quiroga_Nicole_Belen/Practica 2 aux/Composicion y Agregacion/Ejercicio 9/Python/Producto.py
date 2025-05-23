class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio
    def mostrar(self):
        print("Producto:", self.nombre)
        print("Precio:", self.precio)
class CarritoCompras:
    def __init__(self):
        self.productos = []
    def agregar(self, producto):
        if len(self.productos) < 10:
            self.productos.append(producto)
        else:
            print("No se pueden agregar más productos")
    def mostrar(self):
        print("Carrito de Compras:")
        for p in self.productos:
            p.mostrar()
c = CarritoCompras()
for i in range(12):
    c.agregar(Producto("Producto" + str(i+1), i * 10))
c.mostrar()
