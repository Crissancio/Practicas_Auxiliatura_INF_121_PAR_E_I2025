from typing import TypeVar, Generic, List, Optional

T = TypeVar('T')

class Pila(Generic[T]):
    def __init__(self):
        self._elementos: List[T] = []
    # a)
    def apilar(self, elemento: T) -> None:
        self._elementos.append(elemento)
    # b)
    def desapilar(self) -> Optional[T]:
        if self._elementos:
            return self._elementos.pop()
        return None
    # d)
    def mostrar(self) -> None:
        if not self._elementos:
            print("La pila está vacía")
        else:
            print("Contenido de la pila (de arriba a abajo):")
            for i, elemento in enumerate(reversed(self._elementos), 1):
                print(f"{i}. {elemento}")
    
    def esta_vacia(self) -> bool:
        return len(self._elementos) == 0