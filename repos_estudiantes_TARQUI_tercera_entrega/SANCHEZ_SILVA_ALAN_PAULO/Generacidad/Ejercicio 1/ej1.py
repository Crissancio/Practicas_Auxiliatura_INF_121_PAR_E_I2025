from typing import Generic , TypeVar

T = TypeVar('T')

class Caja(Generic[T]):
    def __init__(self):
        self.__contenido: T = None
    
    def guardar(self, valor:T):
        self.__contenido = valor
    
    def obtener(self) -> T:
        return self.__contenido
    
#Main
caja_numero = Caja[int]()
caja_numero.guardar(310)

caja_nombre = Caja[str]()
caja_nombre.guardar("Juan Antonio Torrez Pedraza")

print("Caja de numero:" , caja_numero.obtener())
print("Caja de nombre:" , caja_nombre.obtener())