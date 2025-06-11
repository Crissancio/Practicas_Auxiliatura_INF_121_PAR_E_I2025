class BloqueCofre:
    def __init__(self, capacidad, resistencia, tipo):
        self.capacidad = capacidad
        self.resistencia = resistencia
        self.tipo = tipo
#B
    def accion(self):
        print(f"Abre el cofre para guardar objetos")
#C
    def colocar(self, orientacion):
        print(f"Colocando un BloqueCofre ({self.tipo}) en {orientacion}")
#D
    def romper(self):
        print (f"El cofre se rompe y los objetos desaparecen en el aire")
        