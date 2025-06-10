from typing import TypeVar, Generic, List

T = TypeVar('T')

class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []
    
    # a) Método para agregar elemento
    def agregar(self, elemento: T) -> None:
        self.elementos.append(elemento)
    
    # a) Método para buscar elemento
    def buscar(self, indice: int) -> T:
        if 0 <= indice < len(self.elementos):
            return self.elementos[indice]
        return None
    
    def listar_elementos(self) -> None:
        for elemento in self.elementos:
            print(elemento)

# Clases para probar
class Libro:
    def __init__(self, titulo: str, autor: str):
        self.titulo = titulo
        self.autor = autor
    
    def __str__(self) -> str:
        return f"Libro: {self.titulo} - {self.autor}"

class Producto:
    def __init__(self, nombre: str, precio: float):
        self.nombre = nombre
        self.precio = precio
    
    def __str__(self) -> str:
        return f"Producto: {self.nombre} - ${self.precio:.2f}"

if __name__ == "__main__":
    # b) Probar con libros
    catalogo_libros = Catalogo[Libro]()
    catalogo_libros.agregar(Libro("Cien años de soledad", "Gabriel García Márquez"))
    catalogo_libros.agregar(Libro("1984", "George Orwell"))

    print("Catálogo de Libros:")
    catalogo_libros.listar_elementos()
    print(f"Buscando libro en posición 1: {catalogo_libros.buscar(1)}")

    # c) Probar con productos
    catalogo_productos = Catalogo[Producto]()
    catalogo_productos.agregar(Producto("Laptop", 1200.99))
    catalogo_productos.agregar(Producto("Smartphone", 599.50))

    print("\nCatálogo de Productos:")
    catalogo_productos.listar_elementos()
    print(f"Buscando producto en posición 0: {catalogo_productos.buscar(0)}")
