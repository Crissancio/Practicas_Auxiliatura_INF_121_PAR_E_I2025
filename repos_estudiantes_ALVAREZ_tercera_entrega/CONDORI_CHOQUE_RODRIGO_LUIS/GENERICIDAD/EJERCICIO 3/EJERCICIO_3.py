#3. Crea una clase genérica Catalogo&lt;T&gt; que almacene productos o libros.
#a) Agrega métodos para agregar y buscar elemento
#b) Prueba el catálogo con libros
#c) Prueba el catálogo con productos

from typing import Generic, TypeVar, List

T = TypeVar('T')

class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def agregar(self, elemento: T):
        self.elementos.append(elemento)

    def buscar(self, elemento: T) -> bool:
        return elemento in self.elementos

    def mostrar(self):
        for e in self.elementos:
            print(e)

class Libro:
    def __init__(self, titulo: str):
        self.titulo = titulo

    def __eq__(self, other):
        return isinstance(other, Libro) and self.titulo == other.titulo

    def __str__(self):
        return f"Libro: {self.titulo}"

def main():
    catalogo = Catalogo[Libro]()
    catalogo.agregar(Libro("Python Básico"))
    catalogo.agregar(Libro("Algoritmos"))

    catalogo.mostrar()
    print("¿Existe 'Algoritmos'? ->", catalogo.buscar(Libro("Algoritmos")))

if __name__ == "__main__":
    main()
