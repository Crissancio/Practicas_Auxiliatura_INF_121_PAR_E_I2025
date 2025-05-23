class Habitacion:
    def __init__(self, nombre, tamaño):
        self.__nombre = nombre
        self.__tamaño = tamaño
    def mostrar_info(self):
        print(f"Nombre de habitacion {self.__nombre}, Tamaño de la habitacion(en metros cuadrados): {self.__tamaño}")
    def get_nombre(self):
        return self.__nombre

    def get_tamano(self):
        return self.__tamano
    def set_nombre(self, nombre):
        self.__nombre = nombre

    def set_tamano(self, tamano):
        self.__tamano = tamano


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
    def agregar_habitacion(self,habitacion):
        self.__habitaciones.append(habitacion)
    def mostrar_casa(self):
        print(f"Direccion de casa: {self.__direccion}")
        print("Habitaciones:")
        for habitacion in self.__habitaciones:
            habitacion.mostrar_info()

casa1 = Casa("Av. Siempre Viva 742")

hab1 = Habitacion("Sala", 25)
hab2 = Habitacion("Cocina", 12)
hab3 = Habitacion("Dormitorio principal", 20)
hab4 = Habitacion("Baño", 8)

casa1.agregar_habitacion(hab1)
casa1.agregar_habitacion(hab2)
casa1.agregar_habitacion(hab3)
casa1.agregar_habitacion(hab4)
casa1.mostrar_casa()
