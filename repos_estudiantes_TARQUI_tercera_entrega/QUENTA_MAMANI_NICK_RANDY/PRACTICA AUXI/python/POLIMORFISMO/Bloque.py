"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"9. Para los bloques del juego Minecraft se usará los siguientes objetos:"

"a) Crear e instanciar al menos 2 bloques de cada tipo"
"b) Sobrescribe accion() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando"
"distintos mensajes según el tipo de bloque."
"c) Sobrecarga colocar() para permitir colocar un bloque en diferentes"
"orientaciones (por ejemplo, en el suelo o en la pared)."
"d) Sobrescribe romper() en BloqueCofre, BloqueTnt y BloqueHorno, mostrando"
"distintos mensajes según el tipo de bloque y que puede suceder al romperlos."

class Bloque:
    def __init__(self, tipo):
        self.tipo = tipo

    def accion(self):
        print("Acción genérica del bloque.")

    def colocar(self, orientacion, coordenada=None):
        if coordenada:
            print(f"Bloque colocado en orientación {orientacion} en coordenadas {coordenada}.")
        else:
            print(f"Bloque colocado en orientación: {orientacion}.")

    def romper(self):
        print("El bloque se ha roto.")

class BloqueCofre(Bloque):
    def __init__(self, capacidad, tipo):
        super().__init__(tipo)
        self.capacidad = capacidad

    def accion(self):
        print(f"El cofre puede almacenar objetos. Capacidad: {self.capacidad}.")

    def romper(self):
        print("El cofre se ha roto y los objetos se han perdido.")

class BloqueTnt(Bloque):
    def __init__(self, daño, tipo):
        super().__init__(tipo)
        self.daño = daño

    def accion(self):
        print(f"El TNT explota causando un daño de: {self.daño}.")

    def romper(self):
        print("El TNT se ha roto sin explotar.")

class BloqueHorno(Bloque):
    def __init__(self, capacidad_comida, tipo):
        super().__init__(tipo)
        self.capacidad_comida = capacidad_comida

    def accion(self):
        print(f"El horno cocina alimentos. Capacidad: {self.capacidad_comida}.")

    def romper(self):
        print("El horno se ha roto y los alimentos se han perdido.")

if __name__ == "__main__":
    cofre1 = BloqueCofre(20, "Cofre de madera")
    cofre2 = BloqueCofre(40, "Cofre de hierro")
    tnt1 = BloqueTnt(50, "TNT normal")
    tnt2 = BloqueTnt(100, "TNT reforzada")
    horno1 = BloqueHorno(5, "Horno de piedra")
    horno2 = BloqueHorno(10, "Horno industrial")

    cofre1.accion()
    tnt1.colocar("suelo")
    horno2.colocar("pared", (12, 15, 20))
    tnt2.romper()
