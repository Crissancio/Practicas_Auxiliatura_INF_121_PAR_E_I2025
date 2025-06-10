from typing import Generic, TypeVar, List

T = TypeVar('T')

class Pila(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def apilar(self, elemento: T):
        self.elementos.append(elemento)

    def desapilar(self):
        if self.elementos:
            return self.elementos.pop()
        return None

    def mostrar(self):
        print("Contenido de la pila:")
        for e in reversed(self.elementos):
            print(e)

    def esta_vacia(self):
        return len(self.elementos) == 0
from EjercicioGenerecidad5 import Pila

pila_int = Pila[int]()
pila_int.apilar(1)
pila_int.apilar(2)
pila_int.apilar(3)
pila_int.mostrar()
print("Desapilado:", pila_int.desapilar())
pila_int.mostrar()

pila_str = Pila[str]()
pila_str.apilar("A")
pila_str.apilar("B")
pila_str.apilar("C")
pila_str.mostrar()
print("Desapilado:", pila_str.desapilar())
pila_str.mostrar()
