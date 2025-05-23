class Habitacion:
    def __init__(self, nombre, tamano):
        self._nombre = nombre
        self._tamano = tamano

    def mostrar_info(self):
        return f"Nombre: {self._nombre}, Tamaño: {self._tamano} m²"

    def get_nombre(self):
        return self._nombre

    def get_tamano(self):
        return self._tamano

    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_tamano(self, tamano):
        self._tamano = tamano


class Casa:
    def __init__(self, direccion):
        self._direccion = direccion
        self._habitaciones = []

    def agregar_habitacion(self, habitacion):
        self._habitaciones.append(habitacion)

    def mostrar_casa(self):
        info_casa = f"Dirección: {self._direccion}\nHabitaciones:\n"
        for habitacion in self._habitaciones:
            info_casa += f"- {habitacion.mostrar_info()}\n"
        return info_casa

    def get_direccion(self):
        return self._direccion

    def set_direccion(self, direccion):
        self._direccion = direccion


if __name__ == "__main__":
    habitacion1 = Habitacion("Sala", 25)
    habitacion2 = Habitacion("Dormitorio", 20)
    habitacion3 = Habitacion("Cocina", 15)

    casa = Casa("Calle Alfredo Otero #7497")
    casa.agregar_habitacion(habitacion1)
    casa.agregar_habitacion(habitacion2)
    casa.agregar_habitacion(habitacion3)

    print(casa.mostrar_casa())

