from typing import TypeVar, Generic

T = TypeVar('T')

class Caja(Generic[T]):
   
    def __init__(self):
        self._contenido: T = None 

    def guardar(self, objeto: T):
        
        self._contenido = objeto

    def obtener(self) -> T:
        
        return self._contenido

    def __str__(self):
        
        return f"Contenido de la Caja: {self._contenido}"