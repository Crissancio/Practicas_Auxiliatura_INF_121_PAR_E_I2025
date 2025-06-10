class Habitacion:
    def __init__(self, nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño

    def get_nombre(self):
        return self.nombre

    def get_tamaño(self):
        return self.tamaño

    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_tamaño(self, tamaño):
        self.tamaño = tamaño

    def mostrar_info(self):
        print(f"Habitación: {self.nombre} - Tamaño: {self.tamaño} m²")


class Casa:
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []

    def get_direccion(self):
        return self.direccion

    def set_direccion(self, direccion):
        self.direccion = direccion

    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Dirección: {self.direccion}")
        print("Habitaciones:")
        for h in self.habitaciones:
            h.mostrar_info()


if __name__ == "__main__":
    mi_casa = Casa("Av. Siempre Viva 742")

    mi_casa.agregar_habitacion(Habitacion("Sala", 20.5))
    mi_casa.agregar_habitacion(Habitacion("Cocina", 12.3))
    mi_casa.agregar_habitacion(Habitacion("Dormitorio", 15.0))
    mi_casa.agregar_habitacion(Habitacion("Baño", 6.7))

    mi_casa.mostrar_casa()
