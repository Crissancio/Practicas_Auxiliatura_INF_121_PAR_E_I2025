class Habitacion:
    def __init__(self, nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño

    def mostrar_info(self):
        return f"- {self.nombre}: {self.tamaño} m²"

    def get_nombre(self):
        return self.nombre

    def get_tamaño(self):
        return self.tamaño


class Casa:
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []

    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Dirección de la casa: {self.direccion}")
        print("Habitaciones:")
        for h in self.habitaciones:
            print(h.mostrar_info())


# b) Crear casa y agregar habitaciones
casa = Casa("Calle Falsa 123")
casa.agregar_habitacion(Habitacion("Cocina", 12))
casa.agregar_habitacion(Habitacion("Sala", 20))
casa.agregar_habitacion(Habitacion("Dormitorio", 15))

# c) Mostrar información
casa.mostrar_casa()
