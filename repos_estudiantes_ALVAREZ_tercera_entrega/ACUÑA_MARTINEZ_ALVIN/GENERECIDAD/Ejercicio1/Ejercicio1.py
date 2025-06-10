# a)
from typing import Generic, TypeVar

T = TypeVar('T')

class Caja(Generic[T]):
    def __init__(self):
        self.contenido: T = None

    def guardar(self, objeto: T):
        self.contenido = objeto

    def obtener(self) -> T:
        return self.contenido

# b)
caja_texto = Caja[str]()
caja_numero = Caja[int]()

caja_texto.guardar("Hola Mundo")
caja_numero.guardar(123)

# c)
print("Caja de texto:", caja_texto.obtener())
print("Caja de número:", caja_numero.obtener())
