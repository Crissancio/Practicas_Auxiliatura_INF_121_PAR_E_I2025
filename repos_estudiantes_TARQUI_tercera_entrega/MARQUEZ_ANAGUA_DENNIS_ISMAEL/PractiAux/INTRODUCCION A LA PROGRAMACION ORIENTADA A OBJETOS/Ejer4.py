'''
4. Crea una clase Producto con nombre, y precio
a)	Agrega un método para aplicar un descuento del 10% si su precio es par, caso contrario del 15%
b)	Crea tres productos, aplica descuentos y muestra los precios
c)	Crea cuatro productos, aplica descuentos y muestra la suma de sus precios
'''
class Producto:
    def __init__(self,nombre,precio):
        self.nombre = nombre
        self.precio = precio
    def Descuento(self):
        if self.precio%2==0:
            self.precio = int((self.precio*10)/100)
        else:
            self.precio = int((self.precio*15)/100)

producto1 = Producto (nombre="leche", precio=20)
producto1.Descuento()
print(f"{producto1.nombre} tiene un descuento de {producto1.precio}bs.")

producto2 = Producto (nombre="huevos", precio=10)
producto2.Descuento()
print(f"{producto2.nombre} tiene un descuento de {producto2.precio}bs.")

producto3 = Producto (nombre="mantequilla", precio=35)
producto3.Descuento()
print(f"{producto3.nombre} tiene un descuento de {producto3.precio}bs.")

producto4 = Producto (nombre="arroz", precio=20)
producto4.Descuento()
print(f'La suma total de los 4 productos es {producto4.precio+producto3.precio+producto2.precio+producto1.precio}')