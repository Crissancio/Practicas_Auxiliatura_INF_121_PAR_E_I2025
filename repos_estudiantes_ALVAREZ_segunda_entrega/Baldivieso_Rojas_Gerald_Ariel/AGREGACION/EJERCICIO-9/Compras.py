class Producto:
    def __init__(self, nombre, precio):
        self.__nombre = nombre
        self.__precio = precio
    
    def getNombre(self):
        return self.__nombre
    def setNombre(self, nombre):
        self.__nombre = nombre
    def getPrecio(self):
        return self.__precio
    def setPrecio(self, precio):
        self.__precio = precio
    def mostrar_info(self):
        print(f"Nombre: {self.__nombre} Precio: {self.__precio}")
    
class CarritoCompras:
    def __init__(self):
        self.__productos = []
    def agregar_producto(self, producto):
        if len(self.__productos) <= 9:
            self.__productos.append(producto)
        else:
            for k in range (9999):
                print("ERROR NO PUEDES AÑADIR MAS DE 10 PRODUCTO!!!!  bobo")
    
    def mostrar_carrito(self):
        print("Productos de carrito")
        for producto in self.__productos:
            producto.mostrar_info()


producto1 = Producto("Leche", 90)
producto2 = Producto("Galleta", 3)
producto3 = Producto("Huevo", 20)
producto4 = Producto("celular", 923)
producto5 = Producto("Tomate", 5)
producto6 = Producto("Taza", 80)
producto7 = Producto("Platano", 5)
producto8 = Producto("Coca cola", 10)
producto9 = Producto("Pollo", 29)
producto10 = Producto("Cordero", 45)
#producto11 = Producto("Taza", 80)

carro1 = CarritoCompras()

carro1.agregar_producto(producto1)
carro1.agregar_producto(producto2)
carro1.agregar_producto(producto3)
carro1.agregar_producto(producto4)
carro1.agregar_producto(producto5)
carro1.agregar_producto(producto6)
carro1.agregar_producto(producto7)
carro1.agregar_producto(producto8)
carro1.agregar_producto(producto9)
carro1.agregar_producto(producto10)
#carro1.agregar_producto(producto11)

carro1.mostrar_carrito()