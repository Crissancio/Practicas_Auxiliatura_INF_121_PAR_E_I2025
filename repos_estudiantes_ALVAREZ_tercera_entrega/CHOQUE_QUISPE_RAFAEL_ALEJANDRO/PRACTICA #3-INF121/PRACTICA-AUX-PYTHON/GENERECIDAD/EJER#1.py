# a) Crear una clase genérica Caja<T> con métodos guardar() y obtener()
from typing import Generic, TypeVar
T = TypeVar('T')
class Caja(Generic[T]):
    def __init__(self):
        self.contenido: T = None

    def guardar(self, item: T):
        self.contenido = item

    def obtener(self) -> T:
        return self.contenido

# b) Crear dos instancias de la clase Caja<T> con diferentes tipos de datos
# c) Mostrar el contenido de las cajas
if __name__ == "__main__":
    # b)
    caja_texto = Caja[str]()
    caja_texto.guardar("Hola Mundo")

    caja_numero = Caja[int]()
    caja_numero.guardar(123)
    # c)
    print("Contenido de caja_texto:", caja_texto.obtener())
    print("Contenido de caja_numero:", caja_numero.obtener())
