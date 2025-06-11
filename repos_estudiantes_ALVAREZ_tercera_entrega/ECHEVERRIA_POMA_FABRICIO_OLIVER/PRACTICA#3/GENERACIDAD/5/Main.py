''''
--------------------- EJERCICIO 5 ---------------------



Crea una clase genérica Pila<T>
a) Implementa un método para apilar
b) Implementa un método para des apilar
c) Prueba la pila con diferentes tipos de datos
d) Muestra los datos de la pila

'''

from Pila import Pila

def main():
    # c)
    print("PRUEBA CON CADENAS:")
    print("-" * 30)
    
    pila_cadenas: Pila[str] = Pila[str]()
    pila_cadenas.apilar("Python")
    pila_cadenas.apilar("Java")
    pila_cadenas.apilar("C++")
    
    pila_cadenas.mostrar()
    
    print("\nDesapilando:")
    elemento = pila_cadenas.desapilar()
    if elemento:
        print(f"Elemento desapilado: {elemento}")
    pila_cadenas.mostrar()
    
    # c)
    print("\nPRUEBA CON NÚMEROS:")
    print("-" * 30)
    
    pila_numeros: Pila[int] = Pila[int]()
    pila_numeros.apilar(42)
    pila_numeros.apilar(100)
    pila_numeros.apilar(7)
    
    pila_numeros.mostrar()
    
    print("\nDesapilando:")
    elemento = pila_numeros.desapilar()
    if elemento:
        print(f"Elemento desapilado: {elemento}")
    pila_numeros.mostrar()

if __name__ == "__main__":
    main()