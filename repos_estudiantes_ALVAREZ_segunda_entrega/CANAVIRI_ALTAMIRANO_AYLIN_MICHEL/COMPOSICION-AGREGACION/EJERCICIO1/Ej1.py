class Habitacion:
    def __init__(self, nombre, tamano):
        self.__nombre = nombre
        self.__tamano = tamano  

    def get_nombre(self):
        return self.__nombre

    def get_tamano(self):
        return self.__tamano

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def set_tamano(self, tamano):
        self.__tamano = tamano

    def mostrar_info(self):
        print(f"Habitación: {self.__nombre}, Tamaño: {self.__tamano} m²")


class Casa:
    def __init__(self, direccion):
        self.__direccion = direccion
        self.__habitaciones = []

    def get_direccion(self):
        return self.__direccion

    def get_habitaciones(self):
        return self.__habitaciones

    def set_direccion(self, direccion):
        self.__direccion = direccion

    def agregar_habitacion(self, habitacion):
        self.__habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Dirección de la casa: {self.__direccion}")
        print("Habitaciones:")
        for habitacion in self.__habitaciones:
            habitacion.mostrar_info()

casa = Casa("Av. Siempre Viva 742")
casa.agregar_habitacion(Habitacion("Sala", 20))
casa.agregar_habitacion(Habitacion("Cocina", 12))
casa.agregar_habitacion(Habitacion("Dormitorio", 15))
casa.agregar_habitacion(Habitacion("Baño", 6))

casa.mostrar_casa()