#1. Crea una clase genérica Caja<T> para guardar algún tipo de objeto
from typing import Generic, TypeVar
T = TypeVar('T')

class Caja(Generic[T]):
    def __init__(self):
        self.objeto: T = None 
#a) Agrega métodos guardar() y obtener()
    def guardar(self, objeto: T):
        self.objeto = objeto
    def obtener(self) -> T:
        return self.objeto

if __name__ == "__main__":
#b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo
    caja_string = Caja[str]()
    caja_string.guardar("Fardo Americano")
    print("Contenido de caja 1:", caja_string.obtener())
#c) Muestra el contenido de las cajas
    caja_entero = Caja[int]()
    caja_entero.guardar(1250)
    print("Contenido de caja 2:", caja_entero.obtener())