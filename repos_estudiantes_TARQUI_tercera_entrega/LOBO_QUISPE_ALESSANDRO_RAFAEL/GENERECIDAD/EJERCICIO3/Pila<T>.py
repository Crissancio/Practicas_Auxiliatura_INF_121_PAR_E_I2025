from typing import TypeVar, Generic, Optional

T = TypeVar('T')

class Nodo(Generic[T]):
    def __init__(self, dato: T):
        self.dato: T = dato
        self.siguiente: Optional['Nodo[T]'] = None

class Pila(Generic[T]):
    def __init__(self):
        self.cima: Optional[Nodo[T]] = None
    
    # a) Método para apilar
    def apilar(self, elemento: T) -> None:
        nuevo_nodo = Nodo(elemento)
        nuevo_nodo.siguiente = self.cima
        self.cima = nuevo_nodo
    
    # b) Método para desapilar
    def desapilar(self) -> T:
        if self.cima is None:
            raise IndexError("La pila está vacía")
        dato = self.cima.dato
        self.cima = self.cima.siguiente
        return dato
    
    # d) Método para mostrar los datos de la pila
    def mostrar(self) -> None:
        actual = self.cima
        print("Contenido de la pila (cima primero):", end=" ")
        while actual is not None:
            print(actual.dato, end=" ")
            actual = actual.siguiente
        print()

if __name__ == "__main__":
    # c) Probar la pila con diferentes tipos de datos
    
    # Pila de enteros
    pila_enteros = Pila[int]()
    pila_enteros.apilar(10)
    pila_enteros.apilar(20)
    pila_enteros.apilar(30)
    
    print("Pila de enteros:")
    pila_enteros.mostrar()
    print("Desapilado:", pila_enteros.desapilar())
    pila_enteros.mostrar()
    
    # Pila de cadenas
    pila_cadenas = Pila[str]()
    pila_cadenas.apilar("Hola")
    pila_cadenas.apilar("Mundo")
    pila_cadenas.apilar("Python")
    
    print("\nPila de cadenas:")
    pila_cadenas.mostrar()
    print("Desapilado:", pila_cadenas.desapilar())
    pila_cadenas.mostrar()
