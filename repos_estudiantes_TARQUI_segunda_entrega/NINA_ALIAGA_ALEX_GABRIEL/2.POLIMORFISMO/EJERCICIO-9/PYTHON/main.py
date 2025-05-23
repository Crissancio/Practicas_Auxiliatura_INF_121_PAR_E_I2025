class Bloque:
    def __init__(self, tipo):
        self.tipo = tipo

    def accion(self):
        print(f"Acción genérica para el bloque de tipo {self.tipo}.")

    def colocar(self, orientacion):
        print(f"Colocando el bloque de tipo {self.tipo} en la orientación {orientacion}.")

    def romper(self):
        print(f"Rompiendo el bloque de tipo {self.tipo}.")


class BloqueCofre(Bloque):
    def __init__(self, tipo, capacidad, resistencia):
        super().__init__(tipo)
        self.capacidad = capacidad
        self.resistencia = resistencia

    def accion(self):
        print(f"Abriendo el cofre de tipo {self.tipo} con capacidad {self.capacidad} y resistencia {self.resistencia}.")

    def romper(self):
        print(f"Rompiendo el cofre de tipo {self.tipo}. ¡Se liberan los objetos almacenados!")


class BloqueTnt(Bloque):
    def __init__(self, tipo, dano):
        super().__init__(tipo)
        self.dano = dano

    def accion(self):
        print(f"Detonando el TNT de tipo {self.tipo} que causa {self.dano} puntos de daño.")

    def romper(self):
        print(f"Rompiendo el TNT de tipo {self.tipo}. ¡Cuidado, puede explotar!")


class BloqueHorno(Bloque):
    def __init__(self, tipo, color, capacidad_comida):
        super().__init__(tipo)
        self.color = color
        self.capacidad_comida = capacidad_comida

    def accion(self):
        print(f"Cocinando en el horno de tipo {self.tipo} y color {self.color} con capacidad para {self.capacidad_comida} alimentos.")

    def romper(self):
        print(f"Rompiendo el horno de tipo {self.tipo}. ¡Se detiene la cocción!")

def main():

    cofre1 = BloqueCofre("Madera", 20, 100)
    cofre2 = BloqueCofre("Hierro", 30, 150)
    tnt1 = BloqueTnt("Estándar", 90)
    tnt2 = BloqueTnt("Avanzado", 120)
    horno1 = BloqueHorno("Piedra", "Gris", 5)
    horno2 = BloqueHorno("Hierro", "Negro", 8)

    cofre1.accion()
    tnt1.accion()
    horno1.accion()

    cofre1.colocar("suelo")
    tnt1.colocar("pared")
    horno1.colocar("techo")

    cofre1.romper()
    tnt1.romper()
    horno1.romper()

if __name__ == "__main__":
    main()
