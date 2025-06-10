# a)
from typing import Generic, TypeVar, List

T = TypeVar('T')

class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def agregar(self, elemento: T):
        self.elementos.append(elemento)

    def buscar(self, elemento: T) -> bool:
        return elemento in self.elementos

# b)
catalogo_libros = Catalogo[str]()
catalogo_libros.agregar("El Quijote")
catalogo_libros.agregar("Cien años de soledad")
print("Libro encontrado:", catalogo_libros.buscar("El Quijote"))

# c)
catalogo_productos = Catalogo[str]()
catalogo_productos.agregar("Laptop")
catalogo_productos.agregar("Celular")
print("Producto encontrado:", catalogo_productos.buscar("Tablet"))
