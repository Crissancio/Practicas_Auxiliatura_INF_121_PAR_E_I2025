"""
----------------------ENUNCIADO----------------------

7. Se hace referencia a algunos animales mediante las siguientes clases:

a) Instanciar 1 Perro, 1 Gato y 1 Pájaro.
b) Sobrecargar el método hacerSonido() para que cada animal emita su sonido
característico.
c) Implementar un método moverse() que indique cómo se mueve cada animal
(correr, saltar, volar, etc.).

"""
from perro import Perro
from gato import Gato
from pajaro import Pajaro

if __name__ =="__main__":
#A
    perro = Perro ("Chop Chop",3, "Pastor aleman")
    gato = Gato ("Bolita", "Blanco")
    pajaro = Pajaro ("ns", "Canario")

    animales = [perro, gato, pajaro]

    print ("SONIDOS:")
    for animal in animales:
        animal.hacerSonido()
    print("--------------------------")
    print ("MOVIMIENTO:")
    for animal in animales:
        animal.moverse()