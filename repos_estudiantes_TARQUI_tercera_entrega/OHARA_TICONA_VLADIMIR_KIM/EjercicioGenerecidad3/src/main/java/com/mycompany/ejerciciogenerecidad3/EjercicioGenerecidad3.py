from typing import Generic, TypeVar, List

T = TypeVar('T')

class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def agregar(self, elemento: T):
        self.elementos.append(elemento)

    def buscar(self, elemento: T) -> bool:
        return elemento in self.elementos

    def mostrar_todos(self):
        for e in self.elementos:
            print(e)
class Libro:
    def __init__(self, titulo: str):
        self.titulo = titulo

    def __eq__(self, other):
        return isinstance(other, Libro) and self.titulo == other.titulo

    def __str__(self):
        return f"Libro: {self.titulo}"

class Producto:
    def __init__(self, nombre: str):
        self.nombre = nombre

    def __eq__(self, other):
        return isinstance(other, Producto) and self.nombre == other.nombre

    def __str__(self):
        return f"Producto: {self.nombre}"
if __name__ == "__main__":
    catalogo_libros = Catalogo[Libro]()
    catalogo_libros.agregar(Libro("Cien Años de Soledad"))
    catalogo_libros.agregar(Libro("El Principito"))

    print("Catálogo de libros:")
    catalogo_libros.mostrar_todos()

    catalogo_productos = Catalogo[Producto]()
    catalogo_productos.agregar(Producto("Laptop"))
    catalogo_productos.agregar(Producto("Smartphone"))

    print("\nCatálogo de productos:")
    catalogo_productos.mostrar_todos()
