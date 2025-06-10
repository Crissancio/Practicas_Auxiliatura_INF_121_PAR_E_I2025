# Ejercicio 5: Crea una clase genérica Pila<T>
# a) Implementa un método para apilar
# b) Implementa un método para des apilar
# c) Prueba la pila con diferentes tipos de datos
# d) Muestra los datos de la pila
class Pila:
    def __init__(self):
        self.elementos = []

    def apilar(self, elem):
        self.elementos.append(elem)

    def desapilar(self):
        if self.elementos:
            return self.elementos.pop()
        return None

    def mostrar(self):
        print("Pila:", self.elementos)


pila_float = Pila()
pila_float.apilar(3.14)
pila_float.apilar(2.71)
pila_float.mostrar()
print("Desapilado:", pila_float.desapilar())

pila_char = Pila()
pila_char.apilar("A")
pila_char.apilar("Z")
pila_char.mostrar()
print("Desapilado:", pila_char.desapilar())


