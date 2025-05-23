# a
class Habitacion:
    def __init__(self, nombre: str, tamaño: float):
        self._nombre = nombre
        self._tamaño = tamaño

    @property
    def nombre(self):
        return self._nombre

    @property
    def tamaño(self):
        return self._tamaño

    @nombre.setter
    def nombre(self, valor):
        self._nombre = valor

    @tamaño.setter
    def tamaño(self, valor):
        self._tamaño = valor

    def mostrar_info(self):
        print(f"Habitación: {self.nombre}, Tamaño: {self.tamaño} m²")


class Casa:
    def __init__(self, direccion: str):
        self._direccion = direccion
        self._habitaciones = []

    @property
    def direccion(self):
        return self._direccion

    @property
    def habitaciones(self):
        return self._habitaciones

    @direccion.setter
    def direccion(self, valor):
        self._direccion = valor

    def agregar_habitacion(self, habitacion: Habitacion):
        self._habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Dirección: {self.direccion}")
        print("Habitaciones:")
        for habitacion in self.habitaciones:
            habitacion.mostrar_info()

# b
mi_casa = Casa("Calle Falsa 123")

sala = Habitacion("Sala", 20.5)
cocina = Habitacion("Cocina", 15.0)
dormitorio = Habitacion("Dormitorio", 25.0)

mi_casa.agregar_habitacion(sala)
mi_casa.agregar_habitacion(cocina)
mi_casa.agregar_habitacion(dormitorio)
# c
mi_casa.mostrar_casa()
