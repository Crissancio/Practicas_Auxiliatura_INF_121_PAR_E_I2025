#Ejercicio 5: Crea una clase genérica Pila<T>
#a) Implementa un método para apilar
#b) Implementa un método para des apilar
#c) Prueba la pila con diferentes tipos de datos
#d) Muestra los datos de la pila

from typing import Generic, TypeVar, List

T = TypeVar('T')

class Pila(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    # a) Apilar
    def apilar(self, elemento: T):
        self.elementos.append(elemento)

    # b) Desapilar
    def desapilar(self) -> T:
        if not self.elementos:
            print("Pila vacía")
            return None
        return self.elementos.pop()

    # d) Mostrar
    def mostrar(self):
        print("Contenido de la pila:")
        for elemento in reversed(self.elementos):
            print(elemento)

# c) Pruebas
pila_int = Pila[int]()
pila_int.apilar(1)
pila_int.apilar(2)
pila_int.mostrar()
pila_int.desapilar()
pila_int.mostrar()

pila_str = Pila[str]()
pila_str.apilar("uno")
pila_str.apilar("dos")
pila_str.mostrar()

pila_float = Pila[float]()
pila_float.apilar(1.1)
pila_float.apilar(2.2)
pila_float.mostrar()
