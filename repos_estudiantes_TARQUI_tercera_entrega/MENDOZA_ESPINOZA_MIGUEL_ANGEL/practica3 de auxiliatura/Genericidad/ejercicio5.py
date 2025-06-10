class Pila:
    def __init__(self):
        self.elementos = []

    def apilar(self, elemento):
        self.elementos.append(elemento)

    def desapilar(self):
        return self.elementos.pop()

    def mostrar(self):
        print(self.elementos)

# Prueba
pila_texto = Pila()
pila_texto.apilar("uno")
pila_texto.apilar("dos")
pila_texto.mostrar()
pila_texto.desapilar()
pila_texto.mostrar()

pila_numeros = Pila()
pila_numeros.apilar(10)
pila_numeros.apilar(20)
pila_numeros.mostrar()
