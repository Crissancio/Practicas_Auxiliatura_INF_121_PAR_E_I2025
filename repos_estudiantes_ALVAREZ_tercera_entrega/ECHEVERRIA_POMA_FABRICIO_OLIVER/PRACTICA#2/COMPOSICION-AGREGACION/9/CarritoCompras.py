from Producto import Producto

class CarritoCompras:
    def __init__(self):
        self.__productos = []

    #A
    def get_productos(self):
        return self.__productos

    def set_productos(self, productos):
        self.__productos = productos

    def agregar_producto(self, producto):
        if len(self.__productos) < 10:
            self.__productos.append(producto)
            print(f"Producto '{producto.get_nombre()}' agregado al carrito.")
        else:
            print("No se puede agregar más productos. El carrito ha alcanzado el límite de 10 productos.")

    def mostrar_carrito(self):
        print("Productos en el carrito:")
        if not self.__productos:
            print("El carrito está vacío.")
        else:
            for producto in self.__productos:
                producto.mostrar_info()