# a)
from typing import Generic, TypeVar, List

T = TypeVar('T')

class Pila(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def apilar(self, elemento: T):
        self.elementos.append(elemento)

    # b)
    def desapilar(self) -> T:
        if self.elementos:
            return self.elementos.pop()
        return None

    # d)
    def mostrar(self):
        print("Contenido de la pila:", self.elementos)

# c)
pila_enteros = Pila[int]()
pila_enteros.apilar(10)
pila_enteros.apilar(20)
pila_enteros.apilar(30)

pila_textos = Pila[str]()
pila_textos.apilar("Uno")
pila_textos.apilar("Dos")

# d)
pila_enteros.mostrar()
pila_enteros.desapilar()
pila_enteros.mostrar()

pila_textos.mostrar()
pila_textos.desapilar()
pila_textos.mostrar()
