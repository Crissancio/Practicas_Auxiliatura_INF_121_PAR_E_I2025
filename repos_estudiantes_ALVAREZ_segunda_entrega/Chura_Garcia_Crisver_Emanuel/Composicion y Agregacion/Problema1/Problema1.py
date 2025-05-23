# 1.Sean las siguientes clases:
# a) Implementa las clases con sus constructores, getters y setters.
class Habitacion:
    def __init__(self, nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_tamaño(self):
        return self.tamaño

    def set_tamaño(self, tamaño):
        self.tamaño = tamaño

    def mostrar_info(self):
        print(f"Habitación: {self.get_nombre()} tamaño: {self.get_tamaño()}")


class Casa:
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []

    def get_direccion(self):
        return self.direccion

    def set_direccion(self, direccion):
        self.direccion = direccion

    def get_habitaciones(self):
        return self.habitaciones

    def set_habitaciones(self, habitaciones):
        self.habitaciones = habitaciones

    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Casa:\nDirección: {self.get_direccion()} \nHabitaciones:")
        for habitacion in self.habitaciones:
            habitacion.mostrar_info()

#b) Crea una casa y agrega varias habitaciones.
casa = Casa("Calle Max Ardiles, Zona Ascinalss")
casa.agregar_habitacion(Habitacion("Dormitorio principal", 50.23))
casa.agregar_habitacion(Habitacion("Dormitorio de visitas", 49.93))
casa.agregar_habitacion(Habitacion("Sala", 32.56))
casa.agregar_habitacion(Habitacion("Cocina", 25.66))
casa.agregar_habitacion(Habitacion("Baño", 25.30))
print("c) Muestra la información de la casa y sus habitaciones.")
casa.mostrar_casa()

