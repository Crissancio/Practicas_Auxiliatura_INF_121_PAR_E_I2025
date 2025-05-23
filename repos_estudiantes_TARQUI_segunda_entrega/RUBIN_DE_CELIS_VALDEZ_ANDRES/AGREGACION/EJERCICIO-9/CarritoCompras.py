from Producto import Producto

class CarritoCompras:
    MAX_PRODUCTOS = 10
    
    def __init__(self):
        self.__productos = []
    
    def agregar_producto(self, producto: Producto) -> bool:
        if len(self.__productos) >= self.MAX_PRODUCTOS:
            print("¡Error! El carrito no puede contener más de 10 productos")
            return False
        self.__productos.append(producto)
        return True
    
    def mostrar_carrito(self) -> None:
        print("\n--- Contenido del Carrito ---")
        for producto in self.__productos:
            producto.mostrar_info()
        print(f"Total productos: {len(self.__productos)}/{self.MAX_PRODUCTOS}")
        print("----------------------------")

    def get_productos(self) -> list[Producto]:
        return self.__productos