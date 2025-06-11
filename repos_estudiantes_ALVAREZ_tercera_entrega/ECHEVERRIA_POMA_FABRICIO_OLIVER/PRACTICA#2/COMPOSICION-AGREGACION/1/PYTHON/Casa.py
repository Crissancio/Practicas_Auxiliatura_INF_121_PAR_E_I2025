class Casa:
    def __init__(self, dirección):
        self.__dirección = dirección
        self.__habitaciones = []

    #A
    def get_dirección(self):
        return self.__dirección

    def set_dirección(self, dirección):
        self.__dirección = dirección

    def get_habitaciones(self):
        return self.__habitaciones

    def set_habitaciones(self, habitaciones):
        self.__habitaciones = habitaciones

    def agregar_habitacion(self, habitacion):
        self.__habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Dirección: {self.__dirección}")
        print("Habitaciones:")
        for habitacion in self.__habitaciones:
            habitacion.mostrar_info()