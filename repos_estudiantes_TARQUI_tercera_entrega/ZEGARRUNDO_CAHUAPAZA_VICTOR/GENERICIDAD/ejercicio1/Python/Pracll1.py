from typing import Generic, TypeVar

T = TypeVar('T')

class Caja(Generic[T]):
    def __init__(self):
        self._contenido: T = None

    def guardar(self, valor: T):
        self._contenido = valor

    def obtener(self) -> T:
        return self._contenido

# Crear dos instancias con distintos tipos
caja_texto = Caja[str]()
caja_texto.guardar("Hola World")

caja_numero = Caja[int]()
caja_numero.guardar(123)

# Mostrar contenido
print("Caja de texto:", caja_texto.obtener())
print("Caja de número:", caja_numero.obtener())
