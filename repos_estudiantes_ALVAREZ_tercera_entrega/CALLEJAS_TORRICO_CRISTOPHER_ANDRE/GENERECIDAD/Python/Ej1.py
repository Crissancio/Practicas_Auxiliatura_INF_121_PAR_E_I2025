from typing import Generic, TypeVar
T = TypeVar('T')

class Caja(Generic[T]):
    def __init__(self, contenido: T = None):
        self._contenido = contenido

    def guardar(self, contenido: T):
        self._contenido = contenido
    def obtener(self) -> T:
        return self._contenido

    def __str__(self):
        return f"Caja contiene: {self._contenido}"

caja_texto = Caja[str]()
caja_texto.guardar("Callejas Torrico Cristopher")
caja_numerica = Caja[int]()
caja_numerica.guardar(13377384)

print("Contenido de caja_texto:", caja_texto.obtener())
print("Contenido de caja_numerica:", caja_numerica.obtener())