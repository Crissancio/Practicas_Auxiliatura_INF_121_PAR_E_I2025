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
        print(f"Habitacion: {self.nombre}, Tamaño: {self.tamano} m²")
