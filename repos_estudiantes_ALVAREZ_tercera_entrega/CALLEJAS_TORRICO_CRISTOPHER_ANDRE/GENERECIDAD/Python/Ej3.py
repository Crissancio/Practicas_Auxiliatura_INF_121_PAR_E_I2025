from typing import Generic, TypeVar, List

T = TypeVar('T')

class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def agregar(self, elemento: T):
        self.elementos.append(elemento)

    def buscar(self, criterio) -> List[T]:
        return [elem for elem in self.elementos if criterio(elem)]

    def mostrar(self):
        for elem in self.elementos:
            print(elem)
class Libro:
    def __init__(self, titulo: str, autor: str):
        self.titulo = titulo
        self.autor = autor

    def __str__(self):
        return f"Libro: {self.titulo}, Autor: {self.autor}"

class Producto:
    def __init__(self, nombre: str, precio: float):
        self.nombre = nombre
        self.precio = precio

    def __str__(self):
        return f"Producto: {self.nombre}, Precio: ${self.precio}"

catalogo_libros = Catalogo[Libro]()
catalogo_libros.agregar(Libro("Clean Code: A Handbook of Agile Software Craftsmanship", "Robert C. Martin"))
catalogo_libros.agregar(Libro("Object-Oriented Software Engineering: A Use Case Driven Approach", "Ivar Jacobson"))
catalogo_libros.agregar(Libro("Refactoring: Improving the Design of Existing Code", "Martin Fowler"))


print("Catálogo de Libros:")
catalogo_libros.mostrar()

print("Buscar libro de 'Ivar Jacobson':")
resultados = catalogo_libros.buscar(lambda libro: libro.autor == "Ivar Jacobson")
for libro in resultados:
    print(libro)

catalogo_productos = Catalogo[Producto]()
catalogo_productos.agregar(Producto("Laptop", 1500))
catalogo_productos.agregar(Producto("Mouse", 25))
catalogo_productos.agregar(Producto("Teclado", 45))

print("Catálogo de Productos:")
catalogo_productos.mostrar()

print("Buscar producto con precio > 30:")
resultados = catalogo_productos.buscar(lambda producto: producto.precio > 30)
for producto in resultados:
    print(producto)
