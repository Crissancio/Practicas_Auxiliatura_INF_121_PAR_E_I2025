class Pajaro:
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo
#B
    def hacerSonido (self):
        print(f"{self.nombre} Sonido: Pio Pio")
#C
    def moverse(self):
        print(f"{self.nombre} se mueve volando")
