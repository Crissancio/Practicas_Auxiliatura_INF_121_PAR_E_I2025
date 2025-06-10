from typing import Generic, TypeVar

T = TypeVar('T')

class Caja(Generic[T]):
    def __init__(self):
        self.contenido = None

    def guardar(self, valor: T):
        self.contenido = valor

    def obtener(self) -> T:
        return self.contenido

# Crear instancias con diferentes tipos
caja_entero = Caja[int]()
caja_entero.guardar(123)

caja_texto = Caja[str]()
caja_texto.guardar("Hola mundo")

# Mostrar contenido de las cajas
print("Caja de enteros:", caja_entero.obtener())
print("Caja de texto:", caja_texto.obtener())
