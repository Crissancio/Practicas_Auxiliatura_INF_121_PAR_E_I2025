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

    def get_habitaciones(self):
        return self.habitaciones

    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Dirección de la casa: {self.direccion}")
        print("Habitaciones:")
        for habitacion in self.habitaciones:
            habitacion.mostrar_info()
# Crear una casa
casa1 = Casa("Av. Siempre Viva 742")
# Crear habitaciones
hab1 = Habitacion("Sala", 20)
hab2 = Habitacion("Cocina", 12)
hab3 = Habitacion("Dormitorio", 18)
hab4 = Habitacion("Baño", 8)
# Agregar habitaciones a la casa
casa1.agregar_habitacion(hab1)
casa1.agregar_habitacion(hab2)
casa1.agregar_habitacion(hab3)
casa1.agregar_habitacion(hab4)
casa1.mostrar_casa()