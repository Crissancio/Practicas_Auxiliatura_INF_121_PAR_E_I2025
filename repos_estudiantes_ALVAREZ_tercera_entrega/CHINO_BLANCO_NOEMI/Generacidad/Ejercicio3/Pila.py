class Pila:
    def __init__(self):
        self.elementos = []

    def apilar(self, elemento):
        self.elementos.append(elemento)

    def desapilar(self):
        if self.esta_vacia():
            return None
        return self.elementos.pop()

    def mostrar(self):
        print("Contenido de la pila:")
        for elemento in reversed(self.elementos):
            print(elemento)

    def esta_vacia(self):
        return len(self.elementos) == 0

def pruebas():
    print("Pila de enteros")
    pila_enteros = Pila()
    pila_enteros.apilar(10)
    pila_enteros.apilar(20)
    pila_enteros.apilar(30)
    pila_enteros.mostrar()
    print("Desapilar:", pila_enteros.desapilar())
    pila_enteros.mostrar()

    print("\nPila de cadenas")
    pila_cadenas = Pila()
    pila_cadenas.apilar("Hola")
    pila_cadenas.apilar("Mundo")
    pila_cadenas.mostrar()
    print("Desapilar:", pila_cadenas.desapilar())
    pila_cadenas.mostrar()

pruebas()

