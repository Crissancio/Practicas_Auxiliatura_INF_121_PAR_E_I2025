class Pila:
    def __init__(self):
        self.items = []

    def apilar(self, item):
        self.items.append(item)

    def desapilar(self):
        return self.items.pop() if self.items else None

    def mostrar(self):
        print("Contenido de la pila:", self.items)


# Prueba con enteros
pila_enteros = Pila()
pila_enteros.apilar(1)
pila_enteros.apilar(2)
pila_enteros.apilar(3)
pila_enteros.mostrar()
pila_enteros.desapilar()
pila_enteros.mostrar()

# Prueba con strings
pila_textos = Pila()
pila_textos.apilar("uno")
pila_textos.apilar("dos")
pila_textos.mostrar()