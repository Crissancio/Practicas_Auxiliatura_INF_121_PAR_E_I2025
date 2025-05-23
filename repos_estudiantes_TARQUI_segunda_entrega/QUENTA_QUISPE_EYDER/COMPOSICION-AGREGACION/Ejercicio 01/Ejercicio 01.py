class Habitacion:
    def __init__(self, nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño  

    def mostrar_info(self):
        return f"Habitación: {self.nombre}, Tamaño: {self.tamaño} m²"

class Casa:
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []

    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Dirección: {self.direccion}")
        print("Habitaciones:")
        for hab in self.habitaciones:
            print("  -", hab.mostrar_info())

# b)
casa1 = Casa("Av. Las Palmeras 123")

habitacion1 = Habitacion("Dormitorio principal", 20)
habitacion2 = Habitacion("Sala", 25)
habitacion3 = Habitacion("Cocina", 15)

casa1.agregar_habitacion(habitacion1)
casa1.agregar_habitacion(habitacion2)
casa1.agregar_habitacion(habitacion3)

# c) 
print("== Información de la casa y sus habitaciones ==")
casa1.mostrar_casa()
