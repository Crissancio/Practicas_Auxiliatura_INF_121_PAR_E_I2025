'''

TEMA AGREGACION


----------------EJERCICIO 9----------------

Crea un POO para un carrito de compras y sus productos. El carrito contiene
productos, pero los productos pueden existir independientemente del carrito.
Además, el carrito no puede contener más de 10 productos.
Producto&lt;nombre, precio&gt;
Métodos: mostrar_info() (muestra el nombre y el precio del producto)
CarritoCompras&lt;productos (lista de objetos de tipo Producto)&gt;
Métodos: agregar_producto(producto), mostrar_carrito() (muestra la
información de todos los productos en el carrito)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea un carrito de compras y agrega varios productos, validando que no
se exceda el límite de 10 productos.
c) Muestra la información del carrito y sus productos.
'''

from CarritoCompras import CarritoCompras
from Producto import Producto

#B)
carrito = CarritoCompras()

productos = [
    Producto("Laptop", 1200.0),
    Producto("Teléfono", 800.0),
    Producto("Auriculares", 50.0),
    Producto("Teclado", 30.0),
    Producto("Mouse", 20.0),
    Producto("Monitor", 300.0),
    Producto("Impresora", 150.0),
    Producto("Cámara", 500.0),
    Producto("Altavoces", 80.0),
    Producto("Tablet", 400.0),
    Producto("Reloj", 200.0),
    Producto("Cargador", 15.0),
]

for producto in productos:
    carrito.agregar_producto(producto)

#C)
print("\nInformación del carrito:")
carrito.mostrar_carrito()