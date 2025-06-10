from typing import Generic, TypeVar

T = TypeVar('T')

class Caja(Generic[T]):
    def __init__(self):
        self.contenido: T = None

    def guardar(self, valor: T):
        self.contenido = valor

    def obtener(self) -> T:
        return self.contenido

    def mostrar(self):
        print(f"Contenido de la caja: {self.contenido}")

def main():
    cajaS = Caja[str]()
    cajaM = Caja[int]()
    
    cajaM.guardar(12345)
    cajaS.guardar("pablito clavo un clavito")

    cajaM.mostrar()
    cajaS.mostrar()

if __name__ == "__main__":
    main()
