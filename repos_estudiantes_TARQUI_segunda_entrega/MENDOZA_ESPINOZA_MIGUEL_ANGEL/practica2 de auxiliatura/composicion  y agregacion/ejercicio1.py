class Habitacion:
    def __init__(self, nombre, tamano):
        self.nombre = nombre
        self.tamano = tamano  # en metros cuadrados
    def get_nombre(self):
        return self.nombre
    def get_tamano(self):
        return self.tamano
    def set_nombre(self, nombre):
        self.nombre = nombre
    def set_tamano(self, tamano):
        self.tamano = tamano
    def mostrar_info(self):
        print(f"Habitación: {self.nombre}, Tamaño: {self.tamano} m²")
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
        print(f"Dirección: {self.direccion}")
        print("Habitaciones:")
        for hab in self.habitaciones:
            hab.mostrar_info()
habitacion1 = Habitacion("Dormitorio", 12)
habitacion2 = Habitacion("Sala", 20)
habitacion3 = Habitacion("Cocina", 10)
casa = Casa("Calle Falsa 123")
casa.agregar_habitacion(habitacion1)
casa.agregar_habitacion(habitacion2)
casa.agregar_habitacion(habitacion3)
casa.mostrar_casa()