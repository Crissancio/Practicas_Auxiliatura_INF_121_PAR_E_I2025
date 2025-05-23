class Habitacion:
    def __init__(self, nombre: str, tamaño: float):
        self.__nombre = nombre
        self.__tamaño = tamaño

    def mostrar_info(self):
        print(f"Habitación: {self.__nombre} - Tamaño: {self.__tamaño} m²")

    def get_nombre(self):
        return self.__nombre

    def get_tamaño(self):
        return self.__tamaño

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def set_tamaño(self, tamaño):
        self.__tamaño = tamaño


class Casa:
    def __init__(self, direccion: str):
        self.__direccion = direccion
        self.__habitaciones = []

    def agregar_habitacion(self, habitacion: Habitacion):
        self.__habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Dirección: {self.__direccion}")
        print("Habitaciones:")
        for h in self.__habitaciones:
            h.mostrar_info()

    def get_direccion(self):
        return self.__direccion

    def set_direccion(self, direccion):
        self.__direccion = direccion

casa = Casa("Av. Principal #456")
casa.agregar_habitacion(Habitacion("Sala", 25.0))
casa.agregar_habitacion(Habitacion("Cocina", 10.5))
casa.agregar_habitacion(Habitacion("Baño", 5.5))

casa.mostrar_casa()
