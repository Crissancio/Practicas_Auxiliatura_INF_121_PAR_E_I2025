#1. Crea una clase genérica Caja<T> para guardar algún tipo de objeto
from typing import Generic, TypeVar

T = TypeVar('T')
#a)
class Caja(Generic[T]):
    def __init__(self):
        self._contenido: T = None

    def guardar(self, contenido: T):
        self._contenido = contenido

    def obtener(self) -> T:
        return self._contenido

#main
def main():
#b) y c)
    caja_string = Caja[str]()
    caja_string.guardar("Objeto1")
    contenido = caja_string.obtener()
    print("El contenido es:", contenido)

    caja_enteros = Caja[int]()
    caja_enteros.guardar(32)
    numero = caja_enteros.obtener()
    print("El contenido es:", numero)

if __name__ == "__main__":
    main()
