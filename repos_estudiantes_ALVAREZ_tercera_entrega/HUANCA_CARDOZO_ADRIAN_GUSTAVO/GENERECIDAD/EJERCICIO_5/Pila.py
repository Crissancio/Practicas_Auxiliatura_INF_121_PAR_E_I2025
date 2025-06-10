from typing import Generic, TypeVar, List, Optional

T = TypeVar('T')

class Pila(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def apilar(self, elemento: T) -> None:
        self.elementos.append(elemento)

    def desapilar(self) -> Optional[T]:
        if not self.esta_vacia():
            return self.elementos.pop()
        else:
            return None

    def esta_vacia(self) -> bool:
        return len(self.elementos) == 0

    def mostrar(self) -> None:
        print("Elementos en la pila:", self.elementos)


pila_enteros = Pila[int]()
pila_enteros.apilar(10)
pila_enteros.apilar(20)
pila_enteros.mostrar()
print("Desapilado:", pila_enteros.desapilar())
pila_enteros.mostrar()

print()

pila_textos = Pila[str]()
pila_textos.apilar("Hola")
pila_textos.apilar("Mundo")
pila_textos.mostrar()
print("Desapilado:", pila_textos.desapilar())
pila_textos.mostrar()
