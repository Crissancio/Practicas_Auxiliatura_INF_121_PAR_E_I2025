from typing import Generic, TypeVar, List

T = TypeVar('T')

class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def agregar(self, elemento: T) -> None:
        self.elementos.append(elemento)

    def buscar(self, elemento: T) -> bool:
        for e in self.elementos:
            if e == elemento:
                return True
        return False

    def mostrar_todo(self) -> None:
        for e in self.elementos:
            print("Elemento:", e)


if __name__ == "__main__":
    catalogo_libros = Catalogo()
    catalogo_libros.agregar("El Principito")
    catalogo_libros.agregar("Cien Años de Soledad")
    catalogo_libros.agregar("La Odisea")

    print("Buscar 'El Principito':", catalogo_libros.buscar("El Principito"))
    print("Buscar 'Harry Potter':", catalogo_libros.buscar("Harry Potter"))
    print("Buscar 'La Odisea':", catalogo_libros.buscar("La Odisea"))

    print("Libros en el catálogo:")
    catalogo_libros.mostrar_todo()

    print("--------")

    catalogo_productos = Catalogo()
    catalogo_productos.agregar("Laptop")
    catalogo_productos.agregar("Teclado")

    print("Buscar 'Mouse':", catalogo_productos.buscar("Mouse"))
    print("Buscar 'Teclado':", catalogo_productos.buscar("Teclado"))

    print("Productos en el catálogo:")
    catalogo_productos.mostrar_todo()
