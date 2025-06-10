from typing import TypeVar, Generic

T = TypeVar('T')

class Caja(Generic[T]):
    def __init__(self):
        self._contenido = None
    
    # a) Método para guardar un objeto
    def guardar(self, item: T) -> None:
        self._contenido = item
    
    # a) Método para obtener el objeto guardado
    def obtener(self) -> T:
        return self._contenido



if __name__ == "__main__":
    # Caja para string
    caja_str = Caja[str]()
    caja_str.guardar("Hola Mundo Python")
    
    # Caja para entero
    caja_int = Caja[int]()
    caja_int.guardar(42)
    
    # c) Mostrar el contenido de las cajas
    print(f"Contenido de la caja de str: {caja_str.obtener()}")
    print(f"Contenido de la caja de int: {caja_int.obtener()}")
