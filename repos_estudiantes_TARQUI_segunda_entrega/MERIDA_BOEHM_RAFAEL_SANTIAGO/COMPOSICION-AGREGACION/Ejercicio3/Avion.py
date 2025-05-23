class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_peso(self):
        return self.peso

    def set_peso(self, peso):
        self.peso = peso

    def mostrar_info(self):
        print(f"Parte: {self.nombre}, Peso: {self.peso} kg")

class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []

    def get_modelo(self):
        return self.modelo

    def set_modelo(self, modelo):
        self.modelo = modelo

    def get_fabricante(self):
        return self.fabricante

    def set_fabricante(self, fabricante):
        self.fabricante = fabricante

    def get_partes(self):
        return self.partes

    def agregar_parte(self, parte):
        self.partes.append(parte)

    def mostrar_avion(self):
        print(f"Modelo: {self.modelo}, Fabricante: {self.fabricante}")
        print("Partes del avión:")
        for parte in self.partes:
            parte.mostrar_info()
# Crear el avión
avion1 = Avion("Boeing 747", "Boeing Company")
# Crear partes del avión
motor = Parte("Motor", 1500)
alas = Parte("Alas", 3000)
tren = Parte("Tren de Aterrizaje", 1200)
cabina = Parte("Cabina de mando", 900)
# Agregar partes al avión
avion1.agregar_parte(motor)
avion1.agregar_parte(alas)
avion1.agregar_parte(tren)
avion1.agregar_parte(cabina)
# Mostrar la información del avión y sus partes
avion1.mostrar_avion()
