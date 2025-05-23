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

    def mostrarInfo(self):
        print("-----------------")
        print(self.nombre," con un peso de: ", self.peso, "Kg")

    def destruir_parte(self):
        self.nombre = "Parte destruida"
        self.peso = 0

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
    
    def agregar_partes(self, parte):
        self.partes.append(parte)
    
    def mostrar_avion(self):
        print("\nAVION")
        print("Modelo: ", self.modelo)
        print("Fabricante: ", self.fabricante)
        print("PARTES DEL AVION")
        for p in self.partes:
            p.mostrarInfo()
    
    def destruir_avion(self):
        self.modelo = "DESTRUIDO"
        self.fabricante = "DESTRUIDO"
        for p in self.partes:
            p.destruir_parte()

parte1 = Parte("Motor", 5000)
parte2 = Parte("Alas", 8000)
parte3 = Parte("Tren de Aterrizaje", 2000)
parte4 = Parte("Fuselaje", 15000)

avion = Avion("Boeing 737-800", "Boeing Commercial Airplanes")
avion.agregar_partes(parte1)
avion.agregar_partes(parte2)
avion.agregar_partes(parte3)
avion.agregar_partes(parte4)

avion.mostrar_avion()

avion.destruir_avion()
avion.mostrar_avion()