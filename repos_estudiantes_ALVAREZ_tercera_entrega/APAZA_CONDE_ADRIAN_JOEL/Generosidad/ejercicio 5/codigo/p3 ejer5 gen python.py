'''
5: Crea una clase genérica Pila<T> 
a) Implementa un método para apilar 
b) Implementa un método para des apilar 
c) Prueba la pila con diferentes tipos de datos 
d) Muestra los datos de la pila
'''
class Pila:
    def __init__(self, n):
        self.n = n
        self.d = [None] * n 
        self.tope = -1

    # a) Implementa un método para apilar
    def apilar(self, x):
        if self.tope == self.n - 1:
            print(f"Pila llena. No se puede apilar {x}")
            return
        self.tope += 1
        self.d[self.tope] = x

    # b) Implementa un método para desapilar
    def desapilar(self):
        if self.esVacia():
            print("pila vacía")
            return None
        elemento = self.d[self.tope]
        self.tope -= 1
        return elemento

    def esVacia(self):
        return self.tope == -1

    def esLlena(self):
        return self.tope == self.n - 1

    def mostrar(self):
        if self.esVacia():
            print("pila vacía")
            return
        
        print("contenido de la pila primer dato:")
        for i in range(self.tope, -1, -1):
            print(f" {self.d[i]} ")
            print("-----")
        print(f"capacidad de la pila: {self.n}, elementos de la pila: {self.tope + 1}")

if __name__ == "__main__":
    # c) probando con numeros enteros
    print("pila de numeros enteros")
    pilaEnteros = Pila(5)
    pilaEnteros.apilar(10)
    pilaEnteros.apilar(20)
    pilaEnteros.apilar(30)
    # d) mostrando los datos de la pila de numeros enteros
    pilaEnteros.mostrar()
    print(f"desapilado: {pilaEnteros.desapilar()}")
    pilaEnteros.mostrar()
    # c) probando con cadenas
    print("pila de cadenas")
    pilaCadenas = Pila(3)
    pilaCadenas.apilar("Adrian")
    pilaCadenas.apilar("Andrea")
    pilaCadenas.apilar("Angel")
    # d) mostrando los datos de la pila de cadenas
    pilaCadenas.mostrar()
    print(f"desapilado: {pilaCadenas.desapilar()}")
    pilaCadenas.mostrar()
