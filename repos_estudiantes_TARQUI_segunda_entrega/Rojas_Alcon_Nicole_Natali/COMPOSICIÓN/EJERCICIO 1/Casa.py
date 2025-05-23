class Habitacion:
    def __init__(self, nombre, tamaño):
        self.__nombre = nombre
        self.__tamaño = tamaño
    def get_nombre(self):
        return self.__nombre
    def get_tamaño(self):
        return self.__tamaño
    def set_nombre(self, nombre):
        self.__nombre = nombre
    def set_tamaño(self, tamaño):
        self.__tamaño = tamaño
    def mostrar_info(self):
        print(f"{self.__nombre} - Tamaño: {self.__tamaño} m²")


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
        for hab in self.__habitaciones:
            hab.mostrar_info()


mi_casa = Casa("Av. Francisco Zalles #1141")

hab1 = Habitacion("Sala", 23)
hab2 = Habitacion("Cocina", 12)
hab3 = Habitacion("Dormitorio", 16)
hab4 = Habitacion("Baño", 8)

mi_casa.agregar_habitacion(hab1)
mi_casa.agregar_habitacion(hab2)
mi_casa.agregar_habitacion(hab3)
mi_casa.agregar_habitacion(hab4)

mi_casa.mostrar_casa()
