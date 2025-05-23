class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def mostrar_info(self):
        return f"- {self.nombre}: {self.peso} kg"

    def get_nombre(self):
        return self.nombre

    def get_peso(self):
        return self.peso


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
        print("Partes:")
        for p in self.partes:
            print(p.mostrar_info())


# b) Crear avión y agregar partes
avion = Avion("Boeing 747", "Boeing")
avion.agregar_parte(Parte("Motor", 3000))
avion.agregar_parte(Parte("Ala Izquierda", 1500))
avion.agregar_parte(Parte("Ala Derecha", 1500))
avion.agregar_parte(Parte("Tren de Aterrizaje", 1200))

# c) Mostrar información
avion.mostrar_avion()

