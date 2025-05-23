class Habitacion:
    def __init__(self, nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño

    def mostrar_info(self):
        print(f"  Nombre: {self.nombre}, Tamaño: {self.tamaño} m²")

    # Getters
    def get_nombre(self):
        return self.nombre

    def get_tamaño(self):
        return self.tamaño

    # Setters
    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_tamaño(self, tamaño):
        self.tamaño = tamaño


class Casa:
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []

    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Dirección de la Casa: {self.direccion}")
        print("Habitaciones:")
        for habitacion in self.habitaciones:
            habitacion.mostrar_info()

    # Getter
    def get_direccion(self):
        return self.direccion

    def get_habitaciones(self):
        return self.habitaciones

    # Setter
    def set_direccion(self, direccion):
        self.direccion = direccion


# b) Crear una casa y agregar varias habitaciones
casa1 = Casa("Calle Falsa 123")
casa1.agregar_habitacion(Habitacion("Dormitorio Principal", 25))
casa1.agregar_habitacion(Habitacion("Sala de Estar", 30))
casa1.agregar_habitacion(Habitacion("Cocina", 15))
casa1.agregar_habitacion(Habitacion("Baño", 8))

# c) Mostrar la información de la casa y sus habitaciones
casa1.mostrar_casa()
