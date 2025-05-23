from habitacion import Habitacion

class Casa:
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []

    def get_direccion(self):
        return self.direccion

    def get_habitaciones(self):
        return self.habitaciones

    def set_direccion(self, direccion):
        self.direccion = direccion

    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Direccion: {self.direccion}")
        print("Habitaciones:")
        for hab in self.habitaciones:
            hab.mostrar_info()
