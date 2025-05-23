class Perro:
    def __init__(self, nombre, edad, raza):
        self.nombre = nombre
        self.edad = edad
        self.raza = raza
#B
    def hacerSonido (self):
        print(f"{self.nombre} Sonido: Guaf Guaf")
#C  
    def moverse(self):
        print(f"{self.nombre} se mueve corriendo")