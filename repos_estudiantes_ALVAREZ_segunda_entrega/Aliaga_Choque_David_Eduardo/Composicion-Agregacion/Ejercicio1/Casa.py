# a) Implementa las clases con sus constructores, getters y setters
class Habitacion:
    def __init__(self, nombre, tamano):
        self.nombre = nombre
        self.tamano = tamano

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_tamano(self):
        return self.tamano

    def set_tamano(self, tamano):
        self.tamano = tamano

    def mostrar_info(self):
        print(f"Habitación: {self.nombre}, Tamaño: {self.tamano} m²")

class Casa:
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []

    def get_direccion(self):
        return self.direccion

    def set_direccion(self, direccion):
        self.direccion = direccion

    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Dirección de la casa: {self.direccion}")
        print("Habitaciones:")
        for habitacion in self.habitaciones:
            habitacion.mostrar_info()

# b) Crea una casa y agrega varias habitaciones

casa = Casa("Calle Heroes de Puno")

habitacion1 = Habitacion("Sala", 25)
habitacion2 = Habitacion("Cocina", 12)
habitacion3 = Habitacion("Dormitorio", 20)
habitacion4 = Habitacion("Baño", 14)

casa.agregar_habitacion(habitacion1)
casa.agregar_habitacion(habitacion2)
casa.agregar_habitacion(habitacion3)
casa.agregar_habitacion(habitacion4)

# c) Muestra la información de la casa y sus habitaciones

casa.mostrar_casa()