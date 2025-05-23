class Producto():
    def __init__(self, nombre, precio):
        self.nombre=nombre
        self.precio=precio
    
    def mostrar_info(self):
        print("< PRODUCTO >")
        print("Nombre: ",self.nombre)
        print("Precio: ",self.precio)
    
    def getNombre(self):
        return self.nombre
    
    def setNombre(self, nombre):
        self.nombre=nombre
    