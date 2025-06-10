from typing import Generic, TypeVar, List, Optional

T = TypeVar('T')

class Pila(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def apilar(self, item: T):
        self.elementos.append(item)

    def desapilar(self) -> Optional[T]:
        if self.elementos:
            return self.elementos.pop()
        return None

    def mostrar(self):
        print("Contenido de la pila (cima al final):")
        for item in reversed(self.elementos):
            print(item)

pila_texto = Pila[str]()
pila_texto.apilar("uno")
pila_texto.apilar("dos")
pila_texto.mostrar()
print("Desapilado:", pila_texto.desapilar())
pila_texto.mostrar()

pila_numeros = Pila[int]()
pila_numeros.apilar(10)
pila_numeros.apilar(20)
pila_numeros.mostrar()
print("Desapilado:", pila_numeros.desapilar())
pila_numeros.mostrar()
