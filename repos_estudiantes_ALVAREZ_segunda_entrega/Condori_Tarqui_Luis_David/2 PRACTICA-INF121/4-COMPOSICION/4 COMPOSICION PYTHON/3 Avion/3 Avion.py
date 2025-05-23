# TEMA: COMPOSICIÓN
# Enunciado:
# 3. Modelar un avión y sus partes. El avión está compuesto por partes como el motor, las alas y el tren de aterrizaje.
# Parte<nombre, peso (en kg)>
# Métodos: mostrar_info()
# Avión<modelo, fabricante, partes (lista de objetos de tipo Parte)>
# Métodos: agregar_parte(parte), mostrar_avion()
# Incisos:
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea un avión y agrega varias partes.
# c) Muestra la información del avión y sus partes.

# a)
class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def mostrar_info(self):
        print(f"Parte: {self.nombre}, Peso: {self.peso} kg")


class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []

    def agregar_parte(self, parte):
        self.partes.append(parte)

    def mostrar_avion(self):
        print(f"Modelo: {self.modelo}, Fabricante: {self.fabricante}")
        for p in self.partes:
            p.mostrar_info()


def main():
# b) Crea un avión y agrega varias partes.
    motor = Parte("Motor", 1500)
    ala = Parte("Ala", 3000)
    tren = Parte("Tren de aterrizaje", 500)

    avion = Avion("Airbus A380", "Airbus")
    avion.agregar_parte(motor)
    avion.agregar_parte(ala)
    avion.agregar_parte(tren)

# c) Muestra la información del avión y sus partes.
    avion.mostrar_avion()

if __name__ == "__main__":
    main()
