''''

TEMA COMPOSICION

----------------EJERCICIO 3----------------


Crea un POO de clases para modelar un avión y sus partes. El avión está
compuesto por partes como el motor, las alas y el tren de aterrizaje. Si el avión
se destruye, las partes también se destruyen.
Parte<nombre, peso (en kg)
Métodos: mostrar_info() (muestra el nombre y el peso de la parte)
Avión<modelo, fabricante, partes (lista de objetos de tipo Parte)
Métodos: agregar_parte(parte), mostrar_avión() (muestra el modelo, fabricante
y la información de todas las partes)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea un avión y agrega varias partes.
c) Muestra la información del avión y sus partes.
'''
from Avion import Avion
from Parte import Parte

#B)
avion = Avion("Boeing 737", "Boeing")
avion.agregar_parte(Parte("Motor", 1500.5))
avion.agregar_parte(Parte("Ala Izquierda", 800.0))
avion.agregar_parte(Parte("Tren de Aterrizaje", 400.0))

#C)
avion.mostrar_avión()