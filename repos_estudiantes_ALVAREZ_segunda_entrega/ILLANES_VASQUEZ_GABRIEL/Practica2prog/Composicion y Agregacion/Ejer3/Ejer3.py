class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def mostrar_info(self):
        print(f"La parte es: {self.nombre}, su peso es: {self.peso} kg")


class Avion:
    def __init__(self, modelo, fabricante, capacidad_partes):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []
        self.capacidad = capacidad_partes

    def agregar_parte(self, parte):
        if len(self.partes) < self.capacidad:
            self.partes.append(parte)
        else:
            print("No se pueden agregar más partes, capacidad alcanzada.")

    def mostrar(self):
        print(f"Modelo: {self.modelo}, Fabricante: {self.fabricante}")
        for parte in self.partes:
            parte.mostrar_info()



if __name__ == "__main__":
    avion = Avion("Amazonas", "Airbus", 5)

    parte1 = Parte("Ala", 34000)
    parte2 = Parte("Motor", 100)

    avion.agregar_parte(parte1)
    avion.agregar_parte(parte2)

    avion.mostrar()
