from typing import List

class Habitacion:
    def __init__(self, nombre: str, tamano: int):
        self.nombre = nombre
        self.tamano = tamano

    def mostrarInformacion(self):
        print(f"Habitacion: {self.nombre}, Tamaño: {self.tamano} m2")


class Casa:
    def __init__(self, direccion: str):
        self.direccion = direccion
        self.habitaciones: List[Habitacion] = [] 

    def agregarHabitacion(self, habitacion: Habitacion):
        self.habitaciones.append(habitacion)

    def mostrarCasa(self):
        print(f"Casa en dirección: {self.direccion}")
        print("Habitaciones:")
        for habitacion in self.habitaciones:
            habitacion.mostrarInformacion()


if __name__ == "__main__":
    casa = Casa("Calle Principal 123")
    cocina = Habitacion("Cocina", 20)
    salon = Habitacion("Salón", 30)
    dormitorio = Habitacion("Dormitorio", 15)
    bano = Habitacion("Baño", 10)
    casa.agregarHabitacion(cocina)
    casa.agregarHabitacion(salon)
    casa.agregarHabitacion(dormitorio)
    casa.agregarHabitacion(bano)

    casa.mostrarCasa()