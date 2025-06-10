class Habitacion:
    def __init__(self, nombre, tamano):
        self.nombre = nombre
        self.tamano = tamano

    def mostrar_info(self):
        print(f"Habitación: {self.nombre}, Tamaño: {self.tamano} m²")


class Casa:
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []

    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Dirección: {self.direccion}")
        print("Habitaciones:")
        for h in self.habitaciones:
            h.mostrar_info()


# Uso
casa = Casa("Av. Siempre Viva 742")
casa.agregar_habitacion(Habitacion("Sala", 20.5))
casa.agregar_habitacion(Habitacion("Cocina", 12.3))
casa.agregar_habitacion(Habitacion("Dormitorio", 15.7))

casa.mostrar_casa()
