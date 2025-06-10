#5: Crea una clase genérica Pila<T>
from typing import TypeVar, Generic, List
T = TypeVar('T')

class Pila(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []
#a) Implementa un método para apilar
    def apilar(self, item: T) -> None:
        self.elementos.append(item)
#b) Implementa un método para des apilar
    def desapilar(self) -> T:
        if self.es_vacia():
            raise IndexError("**Desapilar una pila vacía.")
        return self.elementos.pop()
    def es_vacia(self) -> bool:
        return len(self.elementos) == 0
    def mostrar(self) -> None:
        for item in reversed(self.elementos):
            print(item)
#c) Prueba la pila con diferentes tipos de datos
#d) Muestra los datos de la pila
if __name__ == "__main__":
    pila_enteros = Pila[int]()
    pila_enteros.apilar(20)
    pila_enteros.apilar(8)
    pila_enteros.apilar(16)
    print("**Pila de enteros:")
    pila_enteros.mostrar()
    print(f"---------Desapilando: {pila_enteros.desapilar()}")

    pila_cadenas = Pila[str]()
    pila_cadenas.apilar("quince")
    pila_cadenas.apilar("dies y ocho")
    pila_cadenas.apilar("catorce")
    print("\n**Pila de cadenas:")
    pila_cadenas.mostrar()
    print(f"---------Desapilando: {pila_cadenas.desapilar()}")

    pila_flotantes = Pila[float]()
    pila_flotantes.apilar(3.1)
    pila_flotantes.apilar(5.1)
    pila_flotantes.apilar(4.3)
    print("\n-----------Pila de flotantes:")
    pila_flotantes.mostrar()
    print(f"---Desapilando: {pila_flotantes.desapilar()}")