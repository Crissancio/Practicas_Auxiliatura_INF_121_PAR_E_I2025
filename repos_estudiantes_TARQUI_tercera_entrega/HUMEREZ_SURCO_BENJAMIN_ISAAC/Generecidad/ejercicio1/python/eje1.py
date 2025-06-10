from typing import Generic, TypeVar

T = TypeVar('T')

class Caja(Generic[T]):
    def __init__(self):
        self.objeto = None

    def guardar(self, objeto: T):
        self.objeto = objeto

    def obtener(self) -> T:
        return self.objeto



caja_entero = Caja[int]()
caja_entero.guardar(123)

caja_texto = Caja[str]()
caja_texto.guardar("Hola mundo")


print("Caja de entero:", caja_entero.obtener())
print("Caja de texto:", caja_texto.obtener())
