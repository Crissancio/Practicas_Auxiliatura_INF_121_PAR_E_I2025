# Clase Habitación
class Habitacion:
    def __init__(self, nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño  # en metros cuadrados
    
    def mostrar_info(self):
        print(f"Habitación: {self.nombre}, Tamaño: {self.tamaño} m²")

class Casa:
    def __init__(self, dirección):
        self.dirección = dirección
        self.habitaciones = []
    
    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)
    
    def mostrar_casa(self):
        print(f"Casa en: {self.dirección}")
        print("Habitaciones:")
        for habitacion in self.habitaciones:
            habitacion.mostrar_info()

if __name__ == "__main__":

    mi_casa = Casa("Av. Siempre Viva 123")

    mi_casa.agregar_habitacion(Habitacion("Sala", 20.5))
    mi_casa.agregar_habitacion(Habitacion("Cocina", 15.0))
    mi_casa.agregar_habitacion(Habitacion("Dormitorio Principal", 25.0))
    mi_casa.agregar_habitacion(Habitacion("Baño", 8.0))

    mi_casa.mostrar_casa()