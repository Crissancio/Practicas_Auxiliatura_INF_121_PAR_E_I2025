from typing import TypeVar, Generic

T = TypeVar('T')

class Caja(Generic[T]):
    def __init__(self, contenido: T):
        self.contenido = contenido
        
    def conseguir_contenido(self) -> T:
        return self.contenido
    
caja_str = Caja[str]("Chocolates") 
caja_int = Caja[int](7)

print(caja_str.conseguir_contenido())
print(caja_int.conseguir_contenido())

