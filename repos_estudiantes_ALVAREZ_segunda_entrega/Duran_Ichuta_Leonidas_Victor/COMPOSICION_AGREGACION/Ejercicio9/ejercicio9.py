#9. Crea un POO para un carrito de compras y sus productos.
#El carrito contiene productos,
#pero los productos pueden existir independientemente del carrito.
#Además, el carrito no puede contener más de 10 productos.
#Producto<nombre, precio>
#Métodos: mostrar_info() (muestra el nombre y el precio del producto)
#CarritoCompras<productos (lista de objetos de tipo Producto)>
#Métodos: agregar_producto(producto), mostrar_carrito()
#(muestra la información de todos los productos en el carrito)
class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def mostrar_info(self):
        print(f"Producto: {self.nombre}")
        print(f"Precio: ${self.precio:.2f}")
        print("-------------------")


    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_precio(self):
        return self.precio

    def set_precio(self, precio):
        self.precio = precio



class CarritoCompras:
    LIMITE = 10  # Constante de clase

    def __init__(self):
        self.productos = []  

    def agregar_producto(self, producto):
        if len(self.productos) < self.LIMITE:
            self.productos.append(producto)
            print(f"- '{producto.nombre}' agregado al carrito")
        else:
            print(f"X El carrito esta lleno (limite: {self.LIMITE} productos)")

    def mostrar_carrito(self):
        print("\n Contenido del carrito:")
        if not self.productos:
            print("El carrito esta vacio")
        else:
            for producto in self.productos:
                producto.mostrar_info()
        print(f"Total de productos: {len(self.productos)}/{self.LIMITE}")


    def get_productos(self):
        return self.productos

if __name__ == "__main__":
    # b) Crear productos independientes
    pilfrut = Producto("Pilfrut", 1.50)
    leche = Producto("Leche", 6.50)
    pan = Producto("Pan", 1.00)
    celular = Producto("Celular", 2500.00)

    # Crear carrito y agregar productos
    mi_carrito = CarritoCompras()

    # Agregar productos (algunos se agregarán, otros no por el límite)
    productos_para_agregar = [pilfrut, leche, pan, celular] * 3  # 12 productos (3 sets de 4)
    
    for producto in productos_para_agregar:
        mi_carrito.agregar_producto(producto)

    # c) Mostrar información del carrito
    mi_carrito.mostrar_carrito()

    # Demostración de agregación: Los productos existen sin el carrito
    print("\n Productos independientes \n(fuera del carrito):")
    pan.mostrar_info()
