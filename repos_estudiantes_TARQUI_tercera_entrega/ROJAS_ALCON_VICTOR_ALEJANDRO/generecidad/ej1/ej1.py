from typing import Generic, TypeVar

T = TypeVar('T')

class Caja(Generic[T]):
    def _init_(self):
        self.contenido = None

    def guardar(self, item: T):
        self.contenido = item

    def obtener(self) -> T:
        return self.contenido

caja_texto = Caja[str]()
caja_texto.guardar("Hola Auxi")

caja_numero = Caja[int]()
caja_numero.guardar(123456)

print("Caja de texto:", caja_texto.obtener())
print("Caja de número:", caja_numero.obtener())
