from typing import Generic, TypeVar, List
T = TypeVar('T')
class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []
    def agregar(self, item: T):
        self.elementos.append(item)
    def buscar(self, item: T) -> bool:
        return item in self.elementos
catalogo_libros = Catalogo[str]()
catalogo_libros.agregar("El Quijote")
catalogo_libros.agregar("1984")
print("¿Está '1984' en el catálogo de libros?", catalogo_libros.buscar("1984"))
catalogo_productos = Catalogo[int]()
catalogo_productos.agregar(101)
catalogo_productos.agregar(202)
print("¿Está el producto con código 303?", catalogo_productos.buscar(303))
