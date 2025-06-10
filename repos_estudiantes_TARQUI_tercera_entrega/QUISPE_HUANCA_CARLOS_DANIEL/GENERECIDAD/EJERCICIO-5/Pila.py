from typing import TypeVar, Generic, List

T = TypeVar('T')


class Pila(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def apilar(self, elemento: T) -> None:
        self.elementos.append(elemento)

    def desapilar(self) -> T:
        if self.esta_vacia():
            raise IndexError("La pila está vacía")
        return self.elementos.pop()

    def esta_vacia(self) -> bool:
        return len(self.elementos) == 0

    def __str__(self) -> str:
        return str(self.elementos)


if __name__ == "__main__":
    pila_enteros = Pila[int]()
    pila_enteros.apilar(1)
    pila_enteros.apilar(2)
    pila_enteros.apilar(3)
    print("Pila de enteros:", pila_enteros)
    print("Desapilado:", pila_enteros.desapilar())

    pila_cadenas = Pila[str]()
    pila_cadenas.apilar("Hola")
    pila_cadenas.apilar("Mundo")
    print("\nPila de cadenas:", pila_cadenas)

    pila_flotantes = Pila[float]()
    pila_flotantes.apilar(3.14)
    pila_flotantes.apilar(2.71)
    print("\nPila de flotantes:", pila_flotantes)