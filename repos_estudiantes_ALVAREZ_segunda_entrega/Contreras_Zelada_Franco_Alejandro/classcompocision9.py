class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def mostrar_info(self):
        print(f"  Producto: {self.nombre}, Precio: ${self.precio:.2f}")

    # Getters
    def get_nombre(self):
        return self.nombre

    def get_precio(self):
        return self.precio

    # Setters
    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_precio(self, precio):
        self.precio = precio


class CarritoCompras:
    LIMITE_PRODUCTOS = 10

    def __init__(self):
        self.productos = []

    def agregar_producto(self, producto):
        if len(self.productos) < self.LIMITE_PRODUCTOS:
            self.productos.append(producto)
            print(f"Producto '{producto.get_nombre()}' agregado al carrito.")
            return True
        else:
            print(f"El carrito ha alcanzado su límite de {self.LIMITE_PRODUCTOS} productos.")
            return False

    def mostrar_carrito(self):
        if self.productos:
            print("Productos en el carrito:")
            for producto in self.productos:
                producto.mostrar_info()
        else:
            print("El carrito está vacío.")

    # Getter
    def get_productos(self):
        return self.productos


# b) Crear un carrito y agregar productos
carrito = CarritoCompras()
manzana = Producto("Manzana", 1.50)
leche = Producto("Leche", 2.00)
pan = Producto("Pan", 1.00)
huevo = Producto("Huevo (docena)", 3.50)
agua = Producto("Agua", 1.00)
cafe = Producto("Café", 4.00)
arroz = Producto("Arroz", 2.50)
fideos = Producto("Fideos", 1.80)
tomate = Producto("Tomate", 0.75)
cebolla = Producto("Cebolla", 0.60)
detergente = Producto("Detergente", 5.00)

carrito.agregar_producto(manzana)
carrito.agregar_producto(leche)
carrito.agregar_producto(pan)
carrito.agregar_producto(huevo)
carrito.agregar_producto(agua)
carrito.agregar_producto(cafe)
carrito.agregar_producto(arroz)
carrito.agregar_producto(fideos)
carrito.agregar_producto(tomate)
carrito.agregar_producto(cebolla)
carrito.agregar_producto(detergente)

# c) Mostrar la información del carrito
carrito.mostrar_carrito()