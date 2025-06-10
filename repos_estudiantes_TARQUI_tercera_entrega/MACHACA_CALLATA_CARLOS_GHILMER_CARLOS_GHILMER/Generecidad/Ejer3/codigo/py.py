from typing import Generic, TypeVar, List

T = TypeVar('T')

class Catalogo(Generic[T]):
    def __init__(self):
        self._elementos: List[T] = []

    def agregar(self, elemento: T):
        self._elementos.append(elemento)

    def buscar(self, elemento: T) -> bool:
        return elemento in self._elementos

    def obtener_todos(self) -> List[T]:
        return self._elementos


class Libro:
    def __init__(self, titulo: str, autor: str):
        self.__titulo = titulo
        self.__autor = autor

    def get_titulo(self):
        return self.__titulo

    def get_autor(self):
        return self.__autor

    def __str__(self):
        return f"Libro: {self.__titulo} - Autor: {self.__autor}"

    def __eq__(self, other):
        return isinstance(other, Libro) and \
               self.__titulo == other.__titulo and \
               self.__autor == other.__autor


class Producto:
    def __init__(self, nombre: str, precio: float):
        self.__nombre = nombre
        self.__precio = precio

    def get_nombre(self):
        return self.__nombre

    def get_precio(self):
        return self.__precio

    def __str__(self):
        return f"Producto: {self.__nombre} - Precio: Bs{self.__precio:.2f}"

    def __eq__(self, other):
        return isinstance(other, Producto) and \
               self.__nombre == other.__nombre and \
               self.__precio == other.__precio



libros = Catalogo[Libro]()
libros.agregar(Libro("Los Secretos de Youtube", "Thegrefg"))
libros.agregar(Libro("La Odisea", "Homero"))

print("Está Los Secretos de Youtube? ", libros.buscar(Libro("Los Secretos de Youtube", "Thegrefg")))
print("Libros en catálogo:")
for libro in libros.obtener_todos():
    print(" -", libro)

print()

productos = Catalogo[Producto]()
productos.agregar(Producto("Chocolates", 60.00))
productos.agregar(Producto("Oreos", 3.50))

print("Está Chocolates? ", productos.buscar(Producto("Chocolates", 60.00)))
print("Productos en catálogo:")
for producto in productos.obtener_todos():
    print(" -", producto)

