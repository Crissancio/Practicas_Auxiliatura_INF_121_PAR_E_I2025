# la solucion no corresponde al diagrama asignado en el ejericio

class Minecraft:
    def accion(self):
        pass
    def romper(self):
        pass
    # el metodo colocar debe ser un metodo de cada clase
    def colocar(self, orientacion = "suelo"):
        print(f"Bloque en {orientacion}")

class BloqueCofre(Minecraft):
    def __init__(self, capacidad, resistencia, tipo):
        self.__capacidad = capacidad
        self.__resistencia = resistencia
        self.__tipo = tipo
    def accion(self):
        print("El cofre se puede guardar objetos")
    def romper(self):
        print("cofre se rompio")

class BloqueTnt(Minecraft):
    def __init__(self, tipo, daño):
        self.__tipo = tipo
        self.__daño = daño
    def accion(self):
        print("va a explotar!!!")
    def romper(self):
        print(f"la dinamita exploto causando {self.__daño}")
class BloqueHorno(Minecraft):
    def __init__(self, color, capacidadComida):
        self.__color = color
        self.__capacidadComida = capacidadComida
    def accion(self):
        print("Sirvepara hacer comida")
    def romper(self):
        print("Ya no se puede cocinar")

cofre1 = BloqueCofre(20, 5, "Madera")
cofre2 = BloqueCofre(40, 7, "Hierro")
tnt1 = BloqueTnt("Explosiva", 50)
tnt2 = BloqueTnt("Nuclear", 100)
horno1 = BloqueHorno("Gris", 10)
horno2 = BloqueHorno("Negro", 15)
print("-----------------------------------------")
cofre1.accion()
tnt1.accion()
horno1.accion()
print("-----------------------------------------")
cofre2.romper()
tnt2.romper()
horno2.romper()
print("-----------------------------------------")
cofre1.colocar()
tnt1.colocar("pared")