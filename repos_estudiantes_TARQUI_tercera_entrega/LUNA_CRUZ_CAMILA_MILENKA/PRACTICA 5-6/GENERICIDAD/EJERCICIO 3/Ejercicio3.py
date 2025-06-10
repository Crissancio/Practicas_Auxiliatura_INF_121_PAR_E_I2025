#3. Crea una clase genérica Catalogo<T> que almacene productos o libros.
from typing import TypeVar, Generic, List, Optional
T = TypeVar('T')

class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []
    def agregar(self, elemento: T) -> None:
        self.elementos.append(elemento)
    def buscar(self, criterio: str) -> Optional[T]:
        for elemento in self.elementos:
            if isinstance(elemento, Libro) and criterio in elemento.titulo:
                return elemento
            elif isinstance(elemento, Producto) and criterio in elemento.nombre:
                return elemento
        return None
    print("----------------------CATALOGO----------------------------")

class Libro:
    def __init__(self, titulo: str, autor: str):
        self.titulo = titulo
        self.autor = autor
    def __str__(self):
        return f'-----Libro: {self.titulo} por Autor: {self.autor}'

class Producto:
    def __init__(self, nombre: str, precio: float):
        self.nombre = nombre
        self.precio = precio
    def __str__(self):
        return f'------Producto: {self.nombre} - Precio: Bs.{self.precio:.2f}'

catalogo_libros = Catalogo[Libro]()
catalogo_libros.agregar(Libro("El Principito", "Antonir de Saint"))
catalogo_libros.agregar(Libro("Metamorfosis", "Gabriel García Márquez"))

libro_buscado = catalogo_libros.buscar("El Principito")
if libro_buscado:
    print(libro_buscado)

catalogo_productos = Catalogo[Producto]()
catalogo_productos.agregar(Producto("Refrigeradora", 2000))
catalogo_productos.agregar(Producto("Licuadora", 250))

producto_buscado = catalogo_productos.buscar("Refrigeradora")
if producto_buscado:
    print(producto_buscado)