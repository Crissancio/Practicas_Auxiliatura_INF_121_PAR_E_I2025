
class Habitacion:
    def __init__(self, nombre, tamano):
        self.nombre = nombre
        self.tamano = tamano  

    def get_nombre(self):
        return self.nombre

    def get_tamano(self):
        return self.tamano

    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_tamano(self, tamano):
        self.tamano = tamano

    def mostrar_info(self):
        return f"Habitación: {self.nombre}, Tamaño: {self.tamano} m²"

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
        print(f" Dirección: {self.direccion}")
        print(" Habitaciones:")
        
        for h in self.habitaciones:
            print(f"   {h.mostrar_info()}")
            



casa1 = Casa("Calle 2222, CAlle sucre")

habitacion1 = Habitacion("Sala", 34)
habitacion2 = Habitacion("Comedor", 16)
habitacion3 = Habitacion("Dormitorio", 87)
habitacion4 = Habitacion("Baño", 5)

casa1.agregar_habitacion(habitacion1)
casa1.agregar_habitacion(habitacion2)
casa1.agregar_habitacion(habitacion3)
casa1.agregar_habitacion(habitacion4)

casa1.mostrar_casa()

