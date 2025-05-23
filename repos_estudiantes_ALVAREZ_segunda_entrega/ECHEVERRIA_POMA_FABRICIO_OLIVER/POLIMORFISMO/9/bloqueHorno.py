class BloqueHorno:
    def __init__ (self, color, capacidadComida):
        self.color = color
        self.capacidadComida = capacidadComida
#B
    def accion(self):
        print (f"Enciende el horno para meter pan xd")
#C
    def colocar(self, orientacion):
        print (f"Colocando un BloqueHorno ({self.color}) en {orientacion}")
#D   
    def romper(self):
        print (f"El horno se rompe y el pan desaparece magicamente")