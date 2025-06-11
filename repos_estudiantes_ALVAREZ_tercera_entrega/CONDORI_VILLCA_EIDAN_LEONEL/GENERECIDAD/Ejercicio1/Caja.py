from typing import TypeVar, Generic
T = TypeVar('T')
class Caja(Generic[T]):
    def __init__(self, contenido: T = None):  
        self.contenido: T = contenido

    def guardar(self, valor: T):
        self.contenido = valor

    def obtener(self) -> T:
        return self.contenido
caja_texto = Caja[str]()
caja_numero = Caja[int]()
caja_texto.guardar("Hola mundo")
caja_numero.guardar(123)
print("Caja de texto:", caja_texto.obtener())
print("Caja de número:", caja_numero.obtener())
