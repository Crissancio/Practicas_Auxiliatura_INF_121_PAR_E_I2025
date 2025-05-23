# TEMA: AGREGACIÓN
# Enunciado:
# 9. Crea un POO para un carrito de compras y sus productos. El carrito contiene productos,
# pero los productos pueden existir independientemente del carrito.
# Además, el carrito no puede contener más de 10 productos.
#
# Producto<nombre, precio>
# Métodos: mostrar_info() (muestra el nombre y el precio del producto)
#
# CarritoCompras<productos (lista de objetos de tipo Producto)>
# Métodos: agregar_producto(producto), mostrar_carrito() (muestra la información de todos los productos en el carrito)
#
# Incisos:
# a. Implementa las clases con sus constructores, getters y setters.
# b. Crea un carrito de compras y agrega varios productos, validando que no se exceda el límite de 10 productos
# c. Muestra la información del carrito y sus productos

# a)
class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def mostrar_info(self):
        print(f"Producto: {self.nombre}, Precio: ${self.precio:.2f}")


class CarritoCompras:
    def __init__(self):
        self.productos = []

    def agregar_producto(self, producto):
        if len(self.productos) < 10:
            self.productos.append(producto)
        else:
            print("No se puede agregar más de 10 productos al carrito")

    def mostrar_carrito(self):
        print("Carrito de Compras:")
        for p in self.productos:
            p.mostrar_info()

def main():
# b. Crea un carrito de compras y agrega varios productos, validando que no se exceda el límite de 10 productos

    p1 = Producto("Pan", 1.50)
    p2 = Producto("Leche", 2.00)
    p3 = Producto("Huevos", 3.20)
    p4 = Producto("Queso", 4.50)
    p5 = Producto("Jugo", 2.80)
    p6 = Producto("Manzana", 3.00)
    p7 = Producto("Cereal", 5.10)
    p8 = Producto("Yogurt", 1.90)
    p9 = Producto("Pollo", 6.70)
    p10 = Producto("Papel higienico", 4.00)
    p11 = Producto("Galletas", 2.50)  # Producto extra para validar el límite

    carrito = CarritoCompras()
    carrito.agregar_producto(p1)
    carrito.agregar_producto(p2)
    carrito.agregar_producto(p3)
    carrito.agregar_producto(p4)
    carrito.agregar_producto(p5)
    carrito.agregar_producto(p6)
    carrito.agregar_producto(p7)
    carrito.agregar_producto(p8)
    carrito.agregar_producto(p9)
    carrito.agregar_producto(p10)
    carrito.agregar_producto(p11) 
# c. Muestra la información del carrito y sus productos
    carrito.mostrar_carrito()

if __name__ == "__main__":
    main()
