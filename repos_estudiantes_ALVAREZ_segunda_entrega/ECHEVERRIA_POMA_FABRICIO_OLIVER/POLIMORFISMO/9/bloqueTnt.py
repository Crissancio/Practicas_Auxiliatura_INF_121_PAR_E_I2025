class BloqueTnt:
    def __init__ (self, tipo, daño):
        self.tipo = tipo
        self.daño = daño
#B
    def accion(self):
        print(f"Enciende el TNT, ojo que explota")
#C   
    def colocar (self, orientacion):
        print(f"Colocando un BloqueTnt ({self.tipo}) en {orientacion}")
#D
    def romper (self):
        print(f"El TNT explota y causa un daño inmenso")