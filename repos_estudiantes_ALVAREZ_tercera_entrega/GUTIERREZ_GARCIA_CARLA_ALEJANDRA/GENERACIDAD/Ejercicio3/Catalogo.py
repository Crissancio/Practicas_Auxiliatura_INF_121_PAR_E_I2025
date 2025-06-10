from typing import Generic, TypeVar, List

T = TypeVar('T')

class Caja(Generic[T]):
    def __init__(self):
        self.contenido = None

    def guardar(self, objeto: T):
        self.contenido = objeto
        print(f"Objeto guardado: {objeto}")

    def obtener(self) -> T:
        return self.contenido

class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def agregar(self, elemento: T):
        self.elementos.append(elemento)
        print(f"Elemento agregado: {elemento}")

    def buscar(self, nombre: str):
        for elem in self.elementos:
            if hasattr(elem, 'nombre') and elem.nombre == nombre:
                return elem
        return None

class Libro:
    def __init__(self, nombre, autor):
        self.nombre = nombre
        self.autor = autor

    def __str__(self):
        return f"Libro: {self.nombre}, Autor: {self.autor}"

class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio

    def __str__(self):
        return f"Producto: {self.nombre}, Precio: {self.precio}"

catalogo_libros = Catalogo[Libro]()
catalogo_libros.agregar(Libro("El Principito", "Antoine de Saint-Exupéry"))
catalogo_libros.agregar(Libro("Cien años de soledad", "Gabriel García Márquez"))

libro_buscado = catalogo_libros.buscar("El Principito")
if libro_buscado:
    print("Libro encontrado:", libro_buscado)
else:
    print("Libro no encontrado.")

catalogo_productos = Catalogo[Producto]()
catalogo_productos.agregar(Producto("Laptop", 1500))
catalogo_productos.agregar(Producto("Mouse", 25))

producto_buscado = catalogo_productos.buscar("Mouse")
if producto_buscado:
    print("Producto encontrado:", producto_buscado)
else:
    print("Producto no encontrado.")
