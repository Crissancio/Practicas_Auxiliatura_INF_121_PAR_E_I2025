class Habitacion:
    def __init__(self, nombre, tamano):
        self.nombre = nombre
        self.tamano = tamano

    def mostrar_info(self):
        return f"Habitación: {self.nombre}, Tamaño: {self.tamano} m²"
# SIN GETTERS NI SETTERS
class Casa:
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []

    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Casa ubicada en: {self.direccion}")
        for h in self.habitaciones:
            print(h.mostrar_info())

if __name__ == "__main__":
    casa = Casa("Av. Siempre Viva 742")
    casa.agregar_habitacion(Habitacion("Sala", 25))
    casa.agregar_habitacion(Habitacion("Cocina", 12))
    casa.agregar_habitacion(Habitacion("Dormitorio", 20))
    casa.mostrar_casa()