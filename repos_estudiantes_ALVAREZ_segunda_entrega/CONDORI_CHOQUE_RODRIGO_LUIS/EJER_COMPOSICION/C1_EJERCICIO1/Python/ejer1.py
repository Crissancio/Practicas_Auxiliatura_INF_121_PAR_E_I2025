class Ejercicio3:
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
            for h in self.habitaciones:
                h.mostrar_info()

    def main(self):
        casa = self.Casa("Calle Sucre #45")
        casa.agregar_habitacion(self.Habitacion("Sala", 20))
        casa.agregar_habitacion(self.Habitacion("Cocina", 10))
        casa.agregar_habitacion(self.Habitacion("Dormitorio", 15))
        casa.agregar_habitacion(self.Habitacion("Baño", 5))

        print("=== Información de la Casa ===")
        casa.mostrar_casa()

Ejercicio3().main()
