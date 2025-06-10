from typing import Generic, TypeVar, List

T = TypeVar('T')

class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def agregar(self, elemento: T):
        self.elementos.append(elemento)

    def buscar(self, elemento: T) -> bool:
        return elemento in self.elementos

    def mostrar_todo(self):
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
    def __init__(self, codigo: str, precio: float):
        self.codigo = codigo
        self.precio = precio

    def __eq__(self, other):
        return isinstance(other, Producto) and self.codigo == other.codigo and self.precio == other.precio

    def __str__(self):
        return f"Producto: {self.codigo} - ${self.precio}"

catalogo_libros = Catalogo[Libro]()
catalogo_libros.agregar(Libro("Cien Años de Soledad"))
catalogo_libros.agregar(Libro("El Principito"))
catalogo_libros.mostrar_todo()

catalogo_productos = Catalogo[Producto]()
catalogo_productos.agregar(Producto("A123", 29.99))
catalogo_productos.agregar(Producto("B456", 45.50))
catalogo_productos.mostrar_todo()
