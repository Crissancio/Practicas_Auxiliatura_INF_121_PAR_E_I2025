from typing import TypeVar, Generic, List, Optional

T = TypeVar('T')

class Catalogo(Generic[T]):
    
    def __init__(self):
        self._elementos: List[T] = []
    
    #a)
    def agregar(self, elemento: T) -> None:
        self._elementos.append(elemento)
        print(f"Elemento agregado al catálogo: {elemento}")
    
    def buscar(self, criterio) -> Optional[T]:
        for elemento in self._elementos:
            if hasattr(elemento, 'titulo') and elemento.titulo == criterio:
                return elemento
            elif hasattr(elemento, 'nombre') and elemento.nombre == criterio:
                return elemento
        return None
    
    def mostrar_todos(self) -> None:
        if not self._elementos:
            print("El catálogo está vacío")
        else:
            print("Elementos en el catálogo:")
            for i, elemento in enumerate(self._elementos, 1):
                print(f"{i}. {elemento}")
    
    def size(self) -> int:
        return len(self._elementos)