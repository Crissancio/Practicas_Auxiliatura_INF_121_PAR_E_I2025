class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def get_nombre(self):
        return self.nombre

    def get_peso(self):
        return self.peso

    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_peso(self, peso):
        self.peso = peso

    def mostrar_info(self):
        print(f"Parte: {self.nombre} - Peso: {self.peso} kg")


class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []

    def get_modelo(self):
        return self.modelo

    def get_fabricante(self):
        return self.fabricante

    def set_modelo(self, modelo):
        self.modelo = modelo

    def set_fabricante(self, fabricante):
        self.fabricante = fabricante

    def agregar_parte(self, parte):
        self.partes.append(parte)

    def mostrar_avion(self):
        print(f"Modelo: {self.modelo}")
        print(f"Fabricante: {self.fabricante}")
        print("Partes del avión:")
        for p in self.partes:
            p.mostrar_info()


# Programa principal
if __name__ == "__main__":
    boeing = Avion("737 MAX", "Boeing")

    boeing.agregar_parte(Parte("Motor", 2500))
    boeing.agregar_parte(Parte("Ala Izquierda", 1800))
    boeing.agregar_parte(Parte("Ala Derecha", 1800))
    boeing.agregar_parte(Parte("Tren de Aterrizaje", 1200))

    boeing.mostrar_avion()
