class Habitacion:
    def __init__(self, nombre, tamano):
        self.nombre = nombre
        self.tamano = tamano  

    def mostrar_info(self):
        print(f"Habitacion: {self.nombre}, Tamano: {self.tamano} m2")

    def get_nombre(self):
        return self.nombre

    def get_tamano(self):
        return self.tamano

    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_tamano(self, tamano):
        self.tamano = tamano

class Casa:
    def __init__(self, direccion):
        self.direccion = direccion
        self.habitaciones = []

    def agregar_habitacion(self, habitacion):
        self.habitaciones.append(habitacion)

    def mostrar_casa(self):
        print(f"Direccion: {self.direccion}")
        print("Habitaciones:")
        for h in self.habitaciones:
            h.mostrar_info()

    def get_direccion(self):
        return self.direccion

    def set_direccion(self, direccion):
        self.direccion = direccion

    def get_habitaciones(self):
        return self.habitaciones


casa = Casa("Esteban Arce #1452")
habitacion1 = Habitacion("Sala", 20)
habitacion2 = Habitacion("Cocina", 15)
habitacion3 = Habitacion("Dormitorio", 25)

casa.agregar_habitacion(habitacion1)
casa.agregar_habitacion(habitacion2)
casa.agregar_habitacion(habitacion3)

casa.mostrar_casa()