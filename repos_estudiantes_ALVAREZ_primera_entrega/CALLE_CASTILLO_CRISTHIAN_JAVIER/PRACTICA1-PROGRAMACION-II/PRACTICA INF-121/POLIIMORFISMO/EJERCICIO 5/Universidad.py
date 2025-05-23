class Habitacion:
    def __init__(self, nombre):
        self.nombre = nombre

    def calcular_costo(self, noches):
        return 0

    def reservar(self, noches, personas=None):
        if personas:
            print(f"{self.nombre} reservada por {noches} noche(s) para {personas} persona(s).")
        else:
            print(f"{self.nombre} reservada por {noches} noche(s).")

class HabitacionSimple(Habitacion):
    def __init__(self):
        super().__init__("Habitación Simple")

    def calcular_costo(self, noches):
        return noches * 50  # $50 por noche

class HabitacionDoble(Habitacion):
    def __init__(self):
        super().__init__("Habitación Doble")

    def calcular_costo(self, noches):
        return noches * 80  # $80 por noche

class Suite(Habitacion):
    def __init__(self):
        super().__init__("Suite de Lujo")

    def calcular_costo(self, noches):
        return noches * 150  # $150 por noche


def main():
    simple = HabitacionSimple()
    doble = HabitacionDoble()
    suite = Suite()

    habitaciones = [simple, doble, suite]

    for hab in habitaciones:
        hab.reservar(2)
        hab.reservar(3, 2)
        print(f"Costo por {hab.nombre}: ${hab.calcular_costo(2)}\n")

if __name__ == "__main__":
    main()

# las clases no corresponden a los diagramas de clases del enunciado