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
        print(f"Nombre: {self.nombre} Tamaño: {self.tamaño}")


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
        for habitacion in self.habitaciones:
            habitacion.mostrar_info()


# MAIN
if __name__ == "__main__":
    print("------------------------CASA-----------------")
    c1 = Casa("Calle Falsa 123")

    h1 = Habitacion("Sala", 20.5)
    h2 = Habitacion("Cocina", 12.0)
    h3 = Habitacion("Dormitorio", 15.0)
    h4 = Habitacion("Baño", 5.5)

    c1.agregar_habitacion(h1)
    c1.agregar_habitacion(h2)
    c1.agregar_habitacion(h3)
    c1.agregar_habitacion(h4)

    c1.mostrar_casa()