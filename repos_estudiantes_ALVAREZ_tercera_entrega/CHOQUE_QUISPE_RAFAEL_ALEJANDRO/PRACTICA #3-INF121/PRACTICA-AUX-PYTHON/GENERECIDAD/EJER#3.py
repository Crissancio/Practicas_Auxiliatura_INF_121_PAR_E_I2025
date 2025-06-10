# a) Crear una clase genérica Catalogo<T> con métodos agregar() y buscar()
from typing import Generic, TypeVar, List
T = TypeVar('T')
class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def agregar(self, item: T):
        self.elementos.append(item)

    def buscar(self, criterio) -> List[T]:
        return [item for item in self.elementos if criterio(item)]
    
# b) Probar el catálogo con libros
class Libro:
    def __init__(self, titulo: str, autor: str):
        self.titulo = titulo
        self.autor = autor

    def __str__(self):
        return f"{self.titulo} de {self.autor}"

# c) Probar el catálogo con productos
class Producto:
    def __init__(self, codigo: str, precio: float):
        self.codigo = codigo
        self.precio = precio

    def __str__(self):
        return f"Producto {self.codigo} - ${self.precio}"

# Prueba de incisos b) y c)
if __name__ == "__main__":
    # b) Probar con libros
    catalogo_libros = Catalogo[Libro]()
    catalogo_libros.agregar(Libro("Cien Años de Soledad", "Gabriel García Márquez"))
    catalogo_libros.agregar(Libro("El Principito", "Antoine de Saint-Exupéry"))

    print("Libros cuyo título contiene 'Principito':")
    for libro in catalogo_libros.buscar(lambda l: "Principito" in l.titulo):
        print(libro)

    # c) Probar con productos
    catalogo_productos = Catalogo[Producto]()
    catalogo_productos.agregar(Producto("A123", 10.5))
    catalogo_productos.agregar(Producto("B456", 25.0))

    print("\nProductos con precio mayor a 15:")
    for prod in catalogo_productos.buscar(lambda p: p.precio > 15):
        print(prod)
