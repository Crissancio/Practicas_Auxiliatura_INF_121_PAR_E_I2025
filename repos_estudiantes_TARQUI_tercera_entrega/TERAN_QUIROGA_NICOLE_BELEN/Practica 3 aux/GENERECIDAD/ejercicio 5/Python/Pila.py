class Pila:
    def __init__(self):
        self.elementos = []
    def apilar(self, dato):
        self.elementos.append(dato)
    def desapilar(self):
        if self.elementos:
            return self.elementos.pop()
        return None
    def mostrar(self):
        print("Contenido de la pila:", self.elementos)
pt = Pila()
pt.apilar("como?")
pt.apilar("cuando?")
pt.mostrar()
pt.desapilar()
pt.mostrar()
pn = Pila()
pn.apilar(10)
pn.apilar(20)
pn.mostrar()
