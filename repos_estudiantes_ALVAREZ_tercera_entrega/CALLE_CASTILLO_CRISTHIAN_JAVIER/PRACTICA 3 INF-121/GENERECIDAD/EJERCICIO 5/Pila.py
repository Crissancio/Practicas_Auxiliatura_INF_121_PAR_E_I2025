class Pila:
    def __init__(self):
        self.elementos = []
    
    def apilar(self, elemento):
        """Agrega un elemento a la pila"""
        self.elementos.append(elemento)
    
    def desapilar(self):
        """Elimina y devuelve el elemento superior de la pila"""
        if self.esta_vacia():
            return None
        return self.elementos.pop()
    
    def esta_vacia(self):
        """Verifica si la pila está vacía"""
        return len(self.elementos) == 0
    
    def mostrar(self):
        """Muestra todos los elementos de la pila"""
        print("Contenido de la pila (de arriba a abajo):")
        for elemento in reversed(self.elementos):
            print(elemento)

# Prueba con diferentes tipos de datos
if __name__ == "__main__":
    # Pila de enteros
    pila_enteros = Pila()
    pila_enteros.apilar(10)
    pila_enteros.apilar(20)
    pila_enteros.apilar(30)
    print("\nPila de enteros:")
    pila_enteros.mostrar()
    print("Desapilado:", pila_enteros.desapilar())
    
    # Pila de cadenas
    pila_cadenas = Pila()
    pila_cadenas.apilar("Hola")
    pila_cadenas.apilar("Mundo")
    pila_cadenas.apilar("Python")
    print("\nPila de cadenas:")
    pila_cadenas.mostrar()
    print("Desapilado:", pila_cadenas.desapilar())
    
    # Pila de objetos personalizados
    class Persona:
        def __init__(self, nombre, edad):
            self.nombre = nombre
            self.edad = edad
        
        def __str__(self):
            return f"{self.nombre} ({self.edad} años)"
    
    pila_personas = Pila()
    pila_personas.apilar(Persona("Juan", 25))
    pila_personas.apilar(Persona("María", 30))
    print("\nPila de personas:")
    pila_personas.mostrar()
    print("Desapilado:", pila_personas.desapilar())