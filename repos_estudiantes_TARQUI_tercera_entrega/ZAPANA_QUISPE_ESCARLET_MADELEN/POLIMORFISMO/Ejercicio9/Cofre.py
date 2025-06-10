class BloqueCofre:
    def __init__(self, capacidad, resistencia, tipo):
        self.__capacidad = capacidad
        self.__resistencia = resistencia
        self.__tipo = tipo

    def accion(self):
        print(f"Se abre el cofre de tipo: {self.__tipo}")

    def colocar(self, orientacion):
        print(f"BloqueCofre colocado en: {orientacion}")

    def romper(self):
        print("El cofre se rompió y se perdieron los objetos.")
class BloqueTnt:
    def __init__(self, tipo, daño):
        self.__tipo = tipo
        self.__daño = daño

    def accion(self):
        print(f"La TNT de tipo {self.__tipo} ha sido activada!")

    def colocar(self, orientacion):
        print(f"BloqueTnt colocado en: {orientacion}")

    def romper(self):
        print(f"La TNT explotó causando {self.__daño} de daño.")
class BloqueHorno:
    def __init__(self, color, capacidad_comida):
        self.__color = color
        self.__capacidad_comida = capacidad_comida

    def accion(self):
        print(f"El horno de color {self.__color} está cocinando comida.")

    def colocar(self, orientacion):
        print(f"BloqueHorno colocado en: {orientacion}")

    def romper(self):
        print("El horno se rompió y la comida se perdió.")


def main():
    cofre1 = BloqueCofre(100, 80, "Hierro")
    cofre2 = BloqueCofre(150, 90, "Oro")

    tnt1 = BloqueTnt("Básica", 50)
    tnt2 = BloqueTnt("Mega", 100)

    horno1 = BloqueHorno("Negro", 5)
    horno2 = BloqueHorno("Rojo", 10)

    print("\n--- ACCION BLOQUES ---")
    cofre1.accion()
    cofre2.accion()
    tnt1.accion()
    (tnt2.accion())
    horno1.accion()
    horno2.accion()

    print("\n--- COLOCAR BLOQUES ---")
    cofre1.colocar("pared")
    tnt1.colocar("suelo")
    horno1.colocar("techo")

    print("\n--- ROMPER BLOQUES ---")
    cofre2.romper()
    tnt2.romper()
    horno2.romper()


if __name__ == "__main__":
    main()
