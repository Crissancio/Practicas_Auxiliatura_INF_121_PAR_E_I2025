from CarritoCompras import CarritoCompras
from Producto import Producto

class Main():
    #Creamos el Objeto Carrito
    carrito = CarritoCompras()
    cantidad = int(input("¿Cuantos Productos desea Agregar al Carrito?"))
    if cantidad > 10:
        print("Solo se permite 10 productos!")
        cantidad = 10

    for i in range(cantidad):
        print(f"\nProducto {i + 1}")
        nombre = input("Nombre del Producto: ")
        precio = float(input("Precio: "))
        producto = Producto(nombre, precio)
        carrito.agregar_producto(producto)
    #Mostramos el Carrito
    carrito.mostrar_carrito()

if __name__ == "__main__":
    Main()