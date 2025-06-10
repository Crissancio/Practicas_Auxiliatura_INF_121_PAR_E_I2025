from typing import Generic, TypeVar, List

T = TypeVar('T')
class Pila(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def apilar(self, elemento: T):
        self.elementos.append(elemento)

    def desapilar(self) -> T:
        if not self.esta_vacia():
            return self.elementos.pop()
        else:
            raise IndexError("La pila está vacía")
    def mostrar(self):
        print("Contenido de la pila")
        for elemento in self.elementos:
            print(elemento)

    def esta_vacia(self) -> bool:
        return len(self.elementos) == 0

pila_enteros = Pila[int]()
pila_enteros.apilar(10)
pila_enteros.apilar(20)
pila_enteros.apilar(30)

print("Pila enteros:")
pila_enteros.mostrar()
print("Elemento desapilado:", pila_enteros.desapilar())
pila_enteros.mostrar()

pila_cadenas = Pila[str]()
pila_cadenas.apilar("uno")
pila_cadenas.apilar("dos")
pila_cadenas.apilar("tres")

print("Pila cadenas:")
pila_cadenas.mostrar()
print("Elemento desapilado:", pila_cadenas.desapilar())
pila_cadenas.mostrar()

pila_primos = Pila[int]()
pila_primos.apilar(2)
pila_primos.apilar(3)
pila_primos.apilar(5)
pila_primos.apilar(7)
pila_primos.apilar(11)

print("Pila números primos:")
pila_primos.mostrar()
print("Elemento desapilado:", pila_primos.desapilar())
pila_primos.mostrar()

