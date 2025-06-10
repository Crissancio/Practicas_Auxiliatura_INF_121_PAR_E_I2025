#Ejercicio 5: Crea una clase genérica Pila<T>
from typing import TypeVar, Generic, List

T = TypeVar('T')

class Pila(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []  
    
    #a)Método para apilar
    def push(self, item: T) -> None:
        self.elementos.append(item)
    
    #b)Método para desapilar
    def pop(self) -> T:
        if not self.esta_vacia():
            return self.elementos.pop()
        else:
            raise IndexError("La pila está vacía")
    def esta_vacia(self) -> bool:
        return len(self.elementos) == 0
    
    #d)Mostrar datos de la pila
    def mostrar(self) -> None:
        print("Contenido de la pila:")
        for item in reversed(self.elementos):
            print(item)

#c)Prueba diferentes tipos de datos
if __name__ == "__main__":
    #Enteros
    pila_enteros = Pila[int]()
    pila_enteros.push(1)
    pila_enteros.push(10)
    pila_enteros.push(30)
    pila_enteros.mostrar()
    print("Desapilado:", pila_enteros.pop())
    
    #Strings
    pila_str = Pila[str]()
    pila_str.push("Hello")
    pila_str.push("Bye")
    pila_str.mostrar()
    
    #Objetos personalizados
    class Persona:
        def __init__(self, nombre: str):
            self.nombre = nombre
        def __str__(self):
            return f"Persona: {self.nombre}"
    
    pila_personas = Pila[Persona]()
    pila_personas.push(Persona("Rosa"))
    pila_personas.push(Persona("Jaime"))
    pila_personas.mostrar()
