class Habitacion:
    def __init__(self, nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_tamaño(self):
        return self.tamaño

    def set_tamaño(self, tamaño):
        self.tamaño = tamaño

    def mostrar_info(self):
        print(f"Habitación: {self.nombre}, Tamaño: {self.tamaño} m²")


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
        print(f"Dirección de la casa: {self.direccion}")
        print("Habitaciones:")
        for h in self.habitaciones:
            h.mostrar_info()


habitacion1 = Habitacion("Sala", 25)
habitacion2 = Habitacion("Cocina", 15)
habitacion3 = Habitacion("Dormitorio", 20)
habitacion4 = Habitacion("Baño", 8)

casa = Casa("Av. Arce N° 123")
casa.agregar_habitacion(habitacion1)
casa.agregar_habitacion(habitacion2)
casa.agregar_habitacion(habitacion3)
casa.agregar_habitacion(habitacion4)

casa.mostrar_casa()
