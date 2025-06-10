#3. Crea una clase genérica Catalogo<T> que almacene productos o libros.
from typing import Generic, TypeVar, List

T = TypeVar('T')
#a)
class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def agregar(self, elemento: T):
        self.elementos.append(elemento)

    def buscar(self, elemento: T) -> bool:
        return elemento in self.elementos

    def mostrar_catalogo(self):
        for elemento in self.elementos:
            print(elemento)
class Libro:
    def __init__(self, titulo: str, autor: str):
        self.titulo = titulo
        self.autor = autor

    def __eq__(self, other):
        return isinstance(other, Libro) and self.titulo == other.titulo and self.autor == other.autor

    def __str__(self):
        return f"Libro: {self.titulo} - Autor: {self.autor}"

class Producto:
    def __init__(self, nombre: str, precio: float):
        self.nombre = nombre
        self.precio = precio

    def __eq__(self, other):
        return isinstance(other, Producto) and self.nombre == other.nombre and self.precio == other.precio

    def __str__(self):
        return f"Producto: {self.nombre} - Precio: ${self.precio}"
def main():
    # b)
    catalogo_libros = Catalogo[Libro]()
    l1 = Libro("Cien Años de Soledad", "Gabriel García Márquez")
    l2 = Libro("1984", "George Orwell")
    catalogo_libros.agregar(l1)
    catalogo_libros.agregar(l2)

    print("Catálogo de Libros:")
    catalogo_libros.mostrar_catalogo()
    print("¿Está '1984'?", catalogo_libros.buscar(Libro("1984", "George Orwell")))
    print()

    # c)
    catalogo_productos = Catalogo[Producto]()
    p1 = Producto("Laptop", 1500.0)
    p2 = Producto("Mouse", 25.0)
    catalogo_productos.agregar(p1)
    catalogo_productos.agregar(p2)

    print("Catálogo de Productos:")
    catalogo_productos.mostrar_catalogo()
    print("¿Está el 'Mouse'?", catalogo_productos.buscar(Producto("Mouse", 25.0)))

if __name__ == "__main__":
    main()
