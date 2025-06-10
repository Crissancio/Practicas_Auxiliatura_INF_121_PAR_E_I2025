from typing import TypeVar, Generic

T = TypeVar('T')


class Caja(Generic[T]):
    def __init__(self):
        self._contenido = None

    def guardar(self, item: T) -> None:
        self._contenido = item

    def obtener(self) -> T:
        return self._contenido

    def __str__(self) -> str:
        return f"Caja contiene: {self._contenido}"


if __name__ == "__main__":
    caja_enteros = Caja[int]()
    caja_enteros.guardar(7)

    caja_cadena = Caja[str]()
    caja_cadena.guardar("Hola Mundo")

    print(caja_enteros)
    print(caja_cadena)