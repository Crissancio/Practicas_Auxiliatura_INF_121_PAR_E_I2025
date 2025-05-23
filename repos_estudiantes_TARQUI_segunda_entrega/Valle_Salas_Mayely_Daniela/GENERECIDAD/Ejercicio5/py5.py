from typing import TypeVar, Generic, List

T = TypeVar('T')

class Pila(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def apilar(self, item: T) -> None:
        self.elementos.append(item)

    def desapilar(self) -> T:
        if self.es_vacia():
            raise IndexError("Desapilar de una pila vacía.")
        return self.elementos.pop()

    def es_vacia(self) -> bool:
        return len(self.elementos) == 0

    def mostrar(self) -> None:
        for item in reversed(self.elementos):
            print(item)

if __name__ == "__main__":
    pila_enteros = Pila[int]()
    pila_enteros.apilar(45)
    pila_enteros.apilar(12)
    pila_enteros.apilar(20)
    print("Pila de enteros:")
    pila_enteros.mostrar()
    print(f"Desapilando: {pila_enteros.desapilar()}")

    pila_cadenas = Pila[str]()
    pila_cadenas.apilar("doce")
    pila_cadenas.apilar("trece")
    pila_cadenas.apilar("catorce")
    print("\nPila de cadenas:")
    pila_cadenas.mostrar()
    print(f"Desapilando: {pila_cadenas.desapilar()}")

    pila_flotantes = Pila[float]()
    pila_flotantes.apilar(2.5)
    pila_flotantes.apilar(5.1)
    pila_flotantes.apilar(4.3)
    print("\nPila de flotantes:")
    pila_flotantes.mostrar()
    print(f"Desapilando: {pila_flotantes.desapilar()}")

