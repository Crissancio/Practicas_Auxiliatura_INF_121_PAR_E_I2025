class Pila:
    def __init__(self):
        self.items = []

    def apilar(self, item):
       
        self.items.append(item)
        print(f"Apilado: {item}")

    def desapilar(self):
       
        if not self.esta_vacia():
            item = self.items.pop()
            print(f"Desapilado: {item}")
            return item
        else:
            print("La pila está vacía, no se puede desapilar.")
            return None

    def esta_vacia(self):
        
        return len(self.items) == 0

    def tamano(self):
       
        return len(self.items)

    def ver_cima(self):
        
        if not self.esta_vacia():
            return self.items[-1]
        else:
            print("La pila está vacía.")
            return None

    def mostrar_datos(self):
       
        if not self.esta_vacia():
            print("Datos de la pila (de arriba a abajo):")
            for item in reversed(self.items):
                print(item)
        else:
            print("La pila está vacía, no hay datos para mostrar.")



print("--- Prueba con Pila de Enteros ---")
pila_enteros = Pila()
pila_enteros.apilar(10)
pila_enteros.apilar(20)
pila_enteros.apilar(30)
pila_enteros.mostrar_datos()
pila_enteros.desapilar()
pila_enteros.mostrar_datos()
print(f"Cima de la pila de enteros: {pila_enteros.ver_cima()}")
print("-" * 30)

print("\n--- Prueba con Pila de Cadenas ---")
pila_cadenas = Pila()
pila_cadenas.apilar("Hola")
pila_cadenas.apilar("Mundo")
pila_cadenas.apilar("Python")
pila_cadenas.mostrar_datos()
pila_cadenas.desapilar()
pila_cadenas.desapilar()
pila_cadenas.mostrar_datos()
print("-" * 30)

print("\n--- Prueba con Pila de Booleanos y Flotantes ---")
pila_mixta = Pila()
pila_mixta.apilar(True)
pila_mixta.apilar(3.14)
pila_mixta.apilar(False)
pila_mixta.mostrar_datos()
pila_mixta.desapilar()
pila_mixta.mostrar_datos()
pila_mixta.desapilar()
pila_mixta.desapilar()
pila_mixta.desapilar() 
print("-" * 30)