"""
-------------ENUNCIADO------------------

1. Crea una clase Persona con nombre, edad y ciudad
a) Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
b) Crea tres personas y muestra su saludo
c) Agrega un método para verificar si es mayor de edad
"""
from Persona import Persona

if __name__ == "__main__":
    #B
    P1= Persona("Fabricio", 20, "La Paz")
    P2= Persona("Steve", 15, "Cochabamba")
    P3= Persona("LuisitoComunica", 33, "Santa Puej")

    print("Saludo")
    
    P1.mostrar_el_saludo()
    P2.mostrar_el_saludo()
    P3.mostrar_el_saludo()
    #C
    print("Mayor de edad")

    print (f"{P1.nombre} es mayor de edad? {'Si' if P1.es_mayor_de_edad() else 'No'}")
    print (f"{P2.nombre} es mayor de edad? {'Si' if P2.es_mayor_de_edad() else 'No'}")
    print (f"{P3.nombre} es mayor de edad? {'Si' if P3.es_mayor_de_edad() else 'No'}")