'''
9.	Para los bloques del juego Minecraft se usará los siguientes objetos:

a)	Crear e instanciar al menos 2 bloques de cada tipo
b)	Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque.
c)	Sobrecarga colocar() para permitir colocar un bloque en diferentes orientaciones (por ejemplo, en el suelo o en la pared).
d)	Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando distintos mensajes según el tipo de bloque y que puede suceder al romperlos.

'''
class BloqueMinecraft:
    def __init__(self, tipo):
        self.tipo = tipo
    def accion(self):
        pass
    def colocar(self, orientacion="suelo"):
        print(f"Colocando el bloque en la orientación: {orientacion}")
    def romper(self):
        pass

class BloqueCofre(BloqueMinecraft):
    def __init__(self, capacidad, resistencia, tipo):
        super().__init__(tipo)
        self.capacidad = capacidad
        self.resistencia = resistencia
    def accion(self):
        print(f"El BloqueCofre de tipo '{self.tipo}' puede guardar {self.capacidad} ítems.")
    def romper(self):
        print(f"El BloqueCofre se quebro. Su resistencia era de {self.resistencia}.")

class BloqueTnt(BloqueMinecraft):
    def __init__(self, tipo, daño):
        super().__init__(tipo)
        self.daño = daño
    def accion(self):
        print(f"El BloqueTnt tipo '{self.tipo}' causa daño de {self.daño} al explotar.")
    def romper(self):
        print(f"Cuidado con romper el BloqueTnt de tipo '{self.tipo}'")

class BloqueHorno(BloqueMinecraft):
    def __init__(self, color, capacidadComida):
        super().__init__("Horno")
        self.color = color
        self.capacidadComida = capacidadComida

    def accion(self):
        print(f"El BloqueHorno de color '{self.color}' puede cocinar hasta {self.capacidadComida} unidades de comida.")

    def romper(self):
        print(f"¡El BloqueHorno se ha roto! Perdiste la capacidad de cocinar alimentos.")

bloque_cofre1 = BloqueCofre(capacidad=64, resistencia=100, tipo="Madera")
bloque_cofre2 = BloqueCofre(capacidad=128, resistencia=150, tipo="Hierro")

bloque_tnt1 = BloqueTnt(tipo="Explosivo", daño=250)
bloque_tnt2 = BloqueTnt(tipo="Fuego", daño=300)

bloque_horno1 = BloqueHorno(color="Negro", capacidadComida=5)
bloque_horno2 = BloqueHorno(color="Rojo", capacidadComida=10)

print("\nAcciones de Bloques")
bloque_cofre1.accion()
bloque_tnt1.accion()
bloque_horno1.accion()

print("\nColocar Bloques")
bloque_cofre2.colocar("pared")
bloque_tnt2.colocar("suelo")
bloque_horno2.colocar("techo")

print("\nRomper Bloques")
bloque_cofre1.romper()
bloque_tnt1.romper()
bloque_horno1.romper()
