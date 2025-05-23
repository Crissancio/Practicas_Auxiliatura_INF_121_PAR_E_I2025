#a)
class Producto:
    def __init__(self,nombre,precio):
        self.nombre = nombre
        self.precio = precio
    
    def __str__(self):
        return f"-----------------Producto------------------\n Nombre: {self.nombre}\n Precio: {self.precio}\n"
    def getNombre(self):
        return self.nombre
    def setNombre(self,nombre):
        self.nombre = nombre
    def getPrecio(self):
        return self.precio
    def setPrecio(self,precio):
        self.precio = precio
class Carrito:
    def __init__(self):
        self.nroProductos = 0
        self.productos = []
    def agregar_producto(self,producto):
        self.productos.append(producto)
        self.nroProductos += 1
    
    def esMenos10Productos(self):
        if self.nroProductos > 10:
            print("El carrito no puede tener más de 10 productos.")
            return False
        else:
            return True
    
    
    def __str__(self):
        cad = "-----------------Carrito------------------\n"
        for producto in self.productos:
            cad += str(producto)
        return cad
    def getProductos(self):
        return self.productos
    def setProductos(self,productos):
        self.productos = productos
#b)
carrito = Carrito()
carrito.agregar_producto(Producto("Leche",10))#producto 1
carrito.agregar_producto(Producto("Pan", 5))#producto 2
carrito.agregar_producto(Producto("Azucar", 2))#producto 3
carrito.agregar_producto(Producto("Sal", 1))#producto 4
carrito.agregar_producto(Producto("Arroz", 3))#producto 5
carrito.agregar_producto(Producto("Aceite", 15))#producto 6
carrito.agregar_producto(Producto("Carne", 20))# producto 7
carrito.agregar_producto(Producto("Pescado", 25))# producto 8
carrito.agregar_producto(Producto("Verdura", 8))# producto 9
carrito.agregar_producto(Producto("Fruta", 12))# producto 10
# carrito.agregar_producto(Producto("Galleta", 4))# producto 11
if(carrito.esMenos10Productos()):
    #c)
    print(carrito)
