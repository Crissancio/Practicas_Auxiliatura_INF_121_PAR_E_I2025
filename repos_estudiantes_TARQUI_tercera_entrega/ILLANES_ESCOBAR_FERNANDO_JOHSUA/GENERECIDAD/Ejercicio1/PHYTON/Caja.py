from typing import TypeVar, Generic, Optional

T = TypeVar('T')

class Caja(Generic[T]):
    
    def __init__(self):
        self._contenido: Optional[T] = None
    
    #a)
    def guardar(self, objeto: T) -> None:
        self._contenido = objeto
        print(f"Objeto guardado en la caja: {objeto}")
    
    def obtener(self) -> Optional[T]:
        if self._contenido is not None:
            print(f"Obteniendo objeto de la caja: {self._contenido}")
            return self._contenido
        else:
            print("La caja está vacía")
            return None
    
    def esta_vacia(self) -> bool:
        return self._contenido is None
    
    def __str__(self) -> str:
        if self._contenido is not None:
            return f"Caja[{type(self._contenido).__name__}]: {self._contenido}"
        else:
            return "Caja vacía"