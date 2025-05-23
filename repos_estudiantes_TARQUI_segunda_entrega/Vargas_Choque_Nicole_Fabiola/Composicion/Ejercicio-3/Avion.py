class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_peso(self):
        return self.peso

    def set_peso(self, peso):
        self.peso = peso

    def mostrar_info(self):
        print(f"Nombre: {self.nombre} Peso: {self.peso}")


class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []

    def get_modelo(self):
        return self.modelo

    def set_modelo(self, modelo):
        self.modelo = modelo

    def get_fabricante(self):
        return self.fabricante

    def set_fabricante(self, fabricante):
        self.fabricante = fabricante

    def get_partes(self):
        return self.partes

    def set_partes(self, partes):
        self.partes = partes

    def agregar_parte(self, parte):
        self.partes.append(parte)

    def mostrar_avion(self):
        print("------------------------AVIÓN---------------------")
        print(f"Modelo: {self.modelo} Fabricante: {self.fabricante}")
        print("Partes del avión:")
        for parte in self.partes:
            parte.mostrar_info()


# MAIN
if __name__ == "__main__":
    a1 = Avion("Boeing 747", "Boeing")

    p1 = Parte("Motor", 3500)
    p2 = Parte("Alas", 8000)
    p3 = Parte("Tren de Aterrizaje", 1200)
    p4 = Parte("Cabina", 1500)

    a1.agregar_parte(p1)
    a1.agregar_parte(p2)
    a1.agregar_parte(p3)
    a1.agregar_parte(p4)

    a1.mostrar_avion()