class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_precio(self):
        return self.precio

    def set_precio(self, precio):
        self.precio = precio

    def mostrar_info(self):
        print(f"Nombre: {self.nombre} Precio: {self.precio}")


class CarritoCompras:
    def __init__(self):
        self.productos = []

    def get_productos(self):
        return self.productos

    def set_productos(self, productos):
        self.productos = productos

    def agregar_producto(self, producto):
        self.productos.append(producto)

    def mostrar_carrito(self):
        print("----------------------------CARRITO-------------------")
        for producto in self.productos:
            producto.mostrar_info()


# MAIN
if __name__ == "__main__":
    p1 = Producto("Sandía", 15.7)
    p2 = Producto("Cereal", 24.3)
    p3 = Producto("Pollo", 30.2)
    p4 = Producto("Orégano", 5.6)

    c1 = CarritoCompras()

    c1.agregar_producto(p1)
    c1.agregar_producto(p2)
    c1.agregar_producto(p3)
    c1.agregar_producto(p4)

    c1.mostrar_carrito()