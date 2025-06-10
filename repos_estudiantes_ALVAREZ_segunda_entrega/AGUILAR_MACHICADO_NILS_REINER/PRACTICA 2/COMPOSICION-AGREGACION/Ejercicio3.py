class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def mostrar_info(self):
        return f"Parte: {self.nombre}, Peso: {self.peso} kg"

# SIN GETTERS NI SETTERS

class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []

    def agregar_parte(self, parte):
        self.partes.append(parte)

    def mostrar_avion(self):
        print(f"Avión modelo: {self.modelo}, Fabricante: {self.fabricante}")
        for p in self.partes:
            print(p.mostrar_info())

if __name__ == "__main__":
    avion = Avion("Boeing 747", "Boeing Co.")
    avion.agregar_parte(Parte("Motor", 3000))
    avion.agregar_parte(Parte("Ala Izquierda", 1500))
    avion.agregar_parte(Parte("Tren de Aterrizaje", 800))
    avion.mostrar_avion()
