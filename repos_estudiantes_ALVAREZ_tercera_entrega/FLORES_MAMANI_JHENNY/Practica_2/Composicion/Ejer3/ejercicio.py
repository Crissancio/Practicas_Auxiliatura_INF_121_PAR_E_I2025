class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def mostrar_info(self):
        print(f"Nombre: {self.nombre} | Peso: {self.peso}")


class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []

    def agregar_parte(self, parte):
        self.partes.append(parte)

    def mostrar_avion(self):
        print(f"Modelo: {self.modelo}")
        print(f"Fabricante: {self.fabricante}")
        print("Partes del avión:")
        for parte in self.partes:
            parte.mostrar_info()


def main():
    avion1 = Avion(" bang", "china")
    avion1.agregar_parte(Parte("Motor", 456))
    avion1.agregar_parte(Parte("parte trasera", 234))
    avion1.agregar_parte(Parte("cavinas", 456))
    avion1.agregar_parte(Parte(" montaje", 654))
    avion1.mostrar_avion()


if __name__ == "__main__":
    main()