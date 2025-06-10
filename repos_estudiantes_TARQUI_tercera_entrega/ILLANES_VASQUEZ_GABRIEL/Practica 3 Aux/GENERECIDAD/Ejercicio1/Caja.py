from typing import TypeVar, Generic

T = TypeVar('T')

class Caja(Generic[T]):
    def __init__(self, contenido: T = None):
        self.contenido = contenido

    def obtener(self) -> T:
        return self.contenido

    def guardar(self, contenido: T) -> None:
        self.contenido = contenido

    def mostrar(self) -> None:
        print("El contenido es:", self.contenido)
if __name__ == "__main__":
    C1 = Caja[str]("Carta de cumpleaños")
    C1.guardar("Carta de Recomendación")

    C2 = Caja (250)
    C2.guardar(250)

    print("--------")
    print(C1.obtener())
    C1.mostrar()

    print("--------")
    print(C2.obtener())
    C2.mostrar()
