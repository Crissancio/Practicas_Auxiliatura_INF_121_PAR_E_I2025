# Enunciado:
# 1. Sean las siguientes clases:
# Habitacion <nombre, tamaño (en metros cuadrados)>
# Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
# Casa <dirección, habitaciones (lista de objetos de tipo Habitacion)>
# Métodos: agregar_habitacion(habitacion), mostrar_casa() (muestra la dirección y la información de todas las habitaciones)
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea una casa y agrega varias habitaciones.
# c) Muestra la información de la casa y sus habitaciones.

class Habitacion:
    # a) Constructor con atributos
    def __init__(self, nombre, tamano):
        self.nombre = nombre
        self.tamano = tamano

    # a) Método mostrar_info
    def mostrar_info(self):
        print(f"Habitación: {self.nombre} | Tamaño: {self.tamano} m²")

class Casa:
    # a) Constructor con atributos
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []

    # a) Método agregar_habitacion
    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)

    # a) Método mostrar_casa
    def mostrar_casa(self):
        print(f"Dirección: {self.direccion}")
        print("Habitaciones:")
        for habitacion in self.habitaciones:
            habitacion.mostrar_info()

# b) Crear casa y agregar habitaciones
casa = Casa("Av. Siempre Viva 742")
casa.agregar_habitacion(Habitacion("Sala", 20.5))
casa.agregar_habitacion(Habitacion("Dormitorio", 15.0))
casa.agregar_habitacion(Habitacion("Cocina", 10.3))

# c) Mostrar información casa y habitaciones
casa.mostrar_casa()
