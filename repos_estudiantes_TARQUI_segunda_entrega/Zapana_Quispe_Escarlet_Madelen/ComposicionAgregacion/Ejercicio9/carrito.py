class Producto:
    def __init__(self,nombre,precio):
        self._nombre=nombre
        self._precio=precio
    def getNombre(self):
        return self._nombre
    def getPrecio(self):
        return self._precio
    def setNombre(self,nombre):
        self._nombre=nombre
    def setPrecio(self,precio):
        self._precio=precio
    def mostrar_info(self):
        print(f"Nombre: {self._nombre} | Precio:{self._precio}")
class CarritoCompras:
    def __init__(self):
        self._productos=[]
    def getProductos(self):
        return self._productos
    def setProductos(self,productos):
        self._productos=productos
    def agregarproductos(self,p):
        self._productos.append(p)
    def mostrar_carrito(self):
        print("productos del carrito")
        for producto in self._productos:
            producto.mostrar_info()
c=CarritoCompras()
c.agregarproductos(Producto("MAntequilla",45))
c.agregarproductos(Producto("Cafe",70))
c.agregarproductos(Producto("carne",65))
c.agregarproductos(Producto("leche",120))
c.agregarproductos(Producto("Te",33))
c.mostrar_carrito()
