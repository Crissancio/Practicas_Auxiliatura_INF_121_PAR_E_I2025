class Gato:
    def __init__(self, nombre, color):
        self.nombre = nombre
        self.color = color
#B
    def hacerSonido (self):
        print(f"{self.nombre} Sonido: Miau Miau")
#C
    def moverse(self):
        print(f"{self.nombre} se mueve saltando")
