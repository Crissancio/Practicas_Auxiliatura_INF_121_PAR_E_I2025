from typing import Generic, TypeVar, List

T = TypeVar('T')

class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def agregar(self, elemento: T):
        self.elementos.append(elemento)

    def buscar(self, elemento: T) -> bool:
        return elemento in self.elementos

    def mostrar(self):
        for e in self.elementos:
            print(e)


class Libro:
    def __init__(self, titulo: str):
        self.titulo = titulo
    def __str__(self):
        return f"Libro: {self.titulo}"
    def __eq__(self, other):
        return isinstance(other, Libro) and self.titulo == other.titulo

class Producto:
    def __init__(self, nombre: str):
        self.nombre = nombre
    def __str__(self):
        return f"Producto: {self.nombre}"
    def __eq__(self, other):
        return isinstance(other, Producto) and self.nombre == other.nombre


catalogo_libros = Catalogo[Libro]()
catalogo_libros.agregar(Libro("El Principito"))
catalogo_libros.agregar(Libro("1984"))
catalogo_libros.mostrar()
print("¿Contiene '1984'?", catalogo_libros.buscar(Libro("1984")))


catalogo_productos = Catalogo[Producto]()
catalogo_productos.agregar(Producto("Laptop"))
catalogo_productos.agregar(Producto("Mouse"))
catalogo_productos.mostrar()
print("¿Contiene 'Teclado'?", catalogo_productos.buscar(Producto("Teclado")))
