# ejercicio1_caja.py
#Crea una clase genérica Caja&lt;T&gt; para guardar algún tipo de objeto
#a) Agrega métodos guardar() y obtener()
#b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo
#c) Muestra el contenido de las cajas

from typing import TypeVar, Generic

T = TypeVar('T')

class Caja(Generic[T]):
    def __init__(self):
        self._contenido = None

    def guardar(self, elemento: T):
        self._contenido = elemento

    def obtener(self) -> T:
        return self._contenido

def main():
    caja1 = Caja[str]()
    caja2 = Caja[int]()

    caja1.guardar("Hola Mundo")
    caja2.guardar(42)

    print("Caja 1 contiene:", caja1.obtener())
    print("Caja 2 contiene:", caja2.obtener())

if __name__ == "__main__":
    main()
