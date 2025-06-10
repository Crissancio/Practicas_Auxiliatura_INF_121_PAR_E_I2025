class Pila:
    def __init__(self):
        self.elementos = []

    def apilar(self, elemento):
        self.elementos.append(elemento)

    def desapilar(self):
        return self.elementos.pop() if self.elementos else None

    def mostrar_pila(self):
        print("Contenido de la pila:", self.elementos)

pila_enteros = Pila()
pila_enteros.apilar(10)
pila_enteros.apilar(20)
pila_enteros.mostrar_pila()
print("Elemento desapilado:", pila_enteros.desapilar())
pila_enteros.mostrar_pila()

pila_cadenas = Pila()
pila_cadenas.apilar("Hola")
pila_cadenas.apilar("Mundo")
pila_cadenas.mostrar_pila()
print("Elemento desapilado:", pila_cadenas.desapilar())
pila_cadenas.mostrar_pila()


