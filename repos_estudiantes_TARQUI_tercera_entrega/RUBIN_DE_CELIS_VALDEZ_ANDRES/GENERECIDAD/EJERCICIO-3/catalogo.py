from typing import Generic, TypeVar, List, Callable

T = TypeVar('T')

class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []
    
    def agregar(self, elemento: T) -> None:
        self.elementos.append(elemento)
    
    def buscar(self, criterio: Callable[[T], bool]) -> List[T]:
        return [elem for elem in self.elementos if criterio(elem)]
    
    def __str__(self) -> str:
        return "\n".join(str(elem) for elem in self.elementos)
