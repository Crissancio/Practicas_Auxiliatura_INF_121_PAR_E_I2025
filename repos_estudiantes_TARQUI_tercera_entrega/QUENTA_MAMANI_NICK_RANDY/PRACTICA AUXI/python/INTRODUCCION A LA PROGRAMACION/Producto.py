"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"4. Crea una clase Producto con nombre, y precio"
"a) Agrega un método para aplicar un descuento del 10% si su precio es par, caso contrario del 15%"
"b) Crea tres productos, aplica descuentos y muestra los precios"
"c) Crea cuatro productos, aplica descuentos y muestra la suma de sus precios"

class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def aplicar_descuento(self):
        if self.precio % 2 == 0:
            self.precio *= 0.90 
        else:
            self.precio *= 0.85  


if __name__ == "__main__":
    print("Primera parte: Tres productos")
    producto1 = Producto("Producto 1", 200)
    producto2 = Producto("Producto 2", 135)
    producto3 = Producto("Producto 3", 50)

    productos_tres = [producto1, producto2, producto3]
    for producto in productos_tres:
        producto.aplicar_descuento()
        print(f"{producto.nombre} tiene un precio de: {producto.precio:.2f}")

    print("Segunda parte: Cuatro productos")
    producto4 = Producto("Producto 1", 100)
    producto5 = Producto("Producto 2", 75)
    producto6 = Producto("Producto 3", 120)
    producto7 = Producto("Producto 4", 90)

    productos_cuatro = [producto4, producto5, producto6, producto7]
    suma_total = 0
    for producto in productos_cuatro:
        producto.aplicar_descuento()
        print(f"{producto.nombre} tiene un precio de: {producto.precio:.2f}")
        suma_total += producto.precio

    print(f"suma total despues del descuentos es: {suma_total:.2f}")
