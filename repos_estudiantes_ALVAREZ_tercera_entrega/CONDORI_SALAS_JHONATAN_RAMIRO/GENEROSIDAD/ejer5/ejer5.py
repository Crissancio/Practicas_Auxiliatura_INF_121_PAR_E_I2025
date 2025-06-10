from typing import Generic, TypeVar, List
T = TypeVar('T')
class Pila(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []
    def apilar(self, item: T):
        self.elementos.append(item)
    def desapilar(self) -> T:
        if self.elementos:
            return self.elementos.pop()
        raise IndexError("La pila está vacía")
    def mostrar(self):
        print("Contenido de la pila:", self.elementos)
pila_enteros = Pila[int]()
pila_enteros.apilar(10)
pila_enteros.apilar(20)
pila_enteros.mostrar()
pila_enteros.desapilar()
pila_enteros.mostrar()
pila_texto = Pila[str]()
pila_texto.apilar("uno")
pila_texto.apilar("dos")
pila_texto.mostrar()
