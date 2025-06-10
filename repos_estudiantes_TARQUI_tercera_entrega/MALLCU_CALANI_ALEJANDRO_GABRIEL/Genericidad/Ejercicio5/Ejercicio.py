from typing import Generic, TypeVar, List

T = TypeVar('T')

class Pila(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def apilar(self, elemento: T):
        self.elementos.append(elemento)

    def desapilar(self) -> T | None:
        if self.elementos:
            return self.elementos.pop()
        return None

    def obtener_elementos(self) -> List[T]:
        return self.elementos

print("📥 Apilando datos...")

# c) Prueba con diferentes tipos de datos
pila_enteros = Pila[int]()
pila_enteros.apilar(10)
pila_enteros.apilar(20)
pila_enteros.apilar(30)
print(f"📦 Elemento desapilado (int): {pila_enteros.desapilar()}")

pila_cadenas = Pila[str]()
pila_cadenas.apilar("Hola")
pila_cadenas.apilar("Mundo")
print(f"📦 Elemento desapilado (str): {pila_cadenas.desapilar()}")

pila_decimales = Pila[float]()
pila_decimales.apilar(3.14)
print(f"📦 Elemento desapilado (float): {pila_decimales.desapilar()}")

# d) Mostrar datos de la pila
print(f"\n📋 Contenido actual de la pila int: {pila_enteros.obtener_elementos()}")
print(f"📋 Contenido actual de la pila str: {pila_cadenas.obtener_elementos()}")
print(f"📋 Contenido actual de la pila float: {pila_decimales.obtener_elementos()}")
