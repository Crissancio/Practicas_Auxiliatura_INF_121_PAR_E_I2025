class Pila:
    def __init__(self):
        self.elementos = []
    
    def apilar(self, elemento):
        self.elementos.append(elemento)
    
    def desapilar(self):
        if self.esta_vacia():
            raise IndexError("La pila está vacía!!!")
        return self.elementos.pop()
    
    def esta_vacia(self):
        return len(self.elementos) == 0
    
    def cima(self):
        if self.esta_vacia():
            return None
        return self.elementos[-1]
    
    def tamano(self):
        return len(self.elementos)
    
    def __str__(self):
        return f"Pila({self.elementos})"

print("-----Pila de enteros-----")
pila_enteros = Pila()
pila_enteros.apilar(10)
pila_enteros.apilar(20)
pila_enteros.apilar(30)

print("Pila actual:", pila_enteros)
print("Cima:", pila_enteros.cima())
print("Desapilado:", pila_enteros.desapilar())
print("Pila despues de desapilar:", pila_enteros)


print("\n------Pila de cadenas------")
pila_cadenas = Pila()
pila_cadenas.apilar("Quiero")
pila_cadenas.apilar("Aprobar")
pila_cadenas.apilar("Auxi")

print("Pila actual:", pila_cadenas)
print("Desapilado:", pila_cadenas.desapilar())
print("Desapilado:", pila_cadenas.desapilar())
print("Pila despues de desapilar:", pila_cadenas)


print("\n------Pila de objetos personalizados------")
class Producto:
    def __init__(self, nombre, precio):
        self.nombre = nombre
        self.precio = precio
    
    def __repr__(self):
        return f"Producto({self.nombre}, ${self.precio})"

pila_productos = Pila()
pila_productos.apilar(Producto("Laptop", 1200))
pila_productos.apilar(Producto("Mouse", 25))
pila_productos.apilar(Producto("Teclado", 50))

print("Pila actual:", pila_productos)
print("Cima:", pila_productos.cima())
print("Desapilado:", pila_productos.desapilar())
print("Pila despues de desapilar:", pila_productos)