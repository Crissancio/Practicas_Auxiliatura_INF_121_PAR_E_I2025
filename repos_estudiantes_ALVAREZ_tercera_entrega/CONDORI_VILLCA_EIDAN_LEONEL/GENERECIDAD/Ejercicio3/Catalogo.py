from typing import Generic, TypeVar

T = TypeVar('T')
class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos = []

    def agregar(self, elemento: T):
        self.elementos.append(elemento)

    def buscar(self, elemento: T) -> bool:
        return elemento in self.elementos

    def mostrar(self):
        for e in self.elementos:
            print(e)
class Libro:
    def __init__(self, titulo):
        self.titulo = titulo

    def __str__(self):
        return f"Libro: {self.titulo}"

    def __eq__(self, other):
        return isinstance(other, Libro) and self.titulo == other.titulo

class Producto:
    def __init__(self, nombre):
        self.nombre = nombre

    def __str__(self):
        return f"Producto: {self.nombre}"

    def __eq__(self, other):
        return isinstance(other, Producto) and self.nombre == other.nombre

catalogo_libros = Catalogo[Libro]()
catalogo_libros.agregar(Libro("Don Quijote"))
catalogo_libros.agregar(Libro("Amor sin materia"))
catalogo_productos = Catalogo[Producto]()
catalogo_productos.agregar(Producto("Lampara"))
catalogo_productos.agregar(Producto("Mesa"))
print("Catálogo de Libros:")
catalogo_libros.mostrar()
print("Buscar 'Amor sin materia':", catalogo_libros.buscar(Libro("Amor sin materia")))
print("\nCatálogo de Productos:")
catalogo_productos.mostrar()
print("Buscar 'Mesa':", catalogo_productos.buscar(Producto("Mesa")))
