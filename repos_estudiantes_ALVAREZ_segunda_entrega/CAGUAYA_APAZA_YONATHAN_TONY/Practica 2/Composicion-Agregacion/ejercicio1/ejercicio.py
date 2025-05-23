# 1. Sean las siguientes clases:
# Habitación<nombre, tamaño (en metros cuadrados)>
# Métodos: mostrar_info() (muestra el nombre y tamaño de la habitación)
#
# Casa<dirección, habitaciones (lista de objetos de tipo Habitación)>
# Métodos: agregar_habitacion(habitacion), mostrar_casa() (muestra la dirección y la información de todas las habitaciones)
#
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea una casa y agrega varias habitaciones.
# c) Muestra la información de la casa y sus habitaciones.

class Habitacion:
    def __init__(self, nombre, tamano):
        self.__nombre = nombre
        self.__tamano = tamano

    def mostrar_info(self):
        return f"Habitación: {self.__nombre}, Tamaño: {self.__tamano} m²"

    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_tamano(self):
        return self.__tamano

    def set_tamano(self, tamano):
        self.__tamano = tamano


class Casa:
    def __init__(self, direccion):
        self.__direccion = direccion
        self.__habitaciones = []
        self.__crear_habitaciones()

    def __crear_habitaciones(self):
        self.__habitaciones.append(Habitacion("Sala", 30))
        self.__habitaciones.append(Habitacion("Cocina", 15))
        self.__habitaciones.append(Habitacion("Dormitorio", 20))

    def get_direccion(self):
        return self.__direccion

    def set_direccion(self, direccion):
        self.__direccion = direccion

    def mostrar_casa(self):
        print(f"Dirección: {self.__direccion}")
        for h in self.__habitaciones:
            print(h.mostrar_info())


casa = Casa("Calle Falsa 123")
casa.mostrar_casa()
