'''

TEMA: COMPOSICION

----------------EJERCICIO 1----------------

1. Sean las siguientes clases:

Habitación&lt;nombre, tamaño (en metros cuadrados)
Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
Casa&lt;dirección, habitaciones (lista de objetos de tipo Habitación)
Métodos: agregar_habitacion(habitacion), mostrar_casa() (muestra la
dirección y la información de todas las habitaciones)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea una casa y agrega varias habitaciones.
c) Muestra la información de la casa y sus habitaciones.
'''

from Casa import Casa
from Habitacion import Habitacion

#B)
casa = Casa("Calle Principal 123")
casa.agregar_habitacion(Habitacion("Sala", 25.5))
casa.agregar_habitacion(Habitacion("Cocina", 15.0))
casa.agregar_habitacion(Habitacion("Dormitorio", 20.0))

#C)
casa.mostrar_casa()