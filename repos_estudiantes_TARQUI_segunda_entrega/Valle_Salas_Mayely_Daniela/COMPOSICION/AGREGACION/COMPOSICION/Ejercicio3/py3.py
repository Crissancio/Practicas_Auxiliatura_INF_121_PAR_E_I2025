class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso

    def mostrar_info(self):
        return f'Parte: {self.nombre}, Peso: {self.peso} kg'


class Avion:
    def __init__(self, modelo, fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []

    def agregar_parte(self, parte):
        self.partes.append(parte)

    def mostrar_avion(self):
        info_avion = f'Modelo: {self.modelo}, Fabricante: {self.fabricante}\nPartes:\n'
        for parte in self.partes:
            info_avion += parte.mostrar_info() + '\n'
        return info_avion


motor = Parte("Motor", 500)
alas = Parte("Alas", 1500)
tren_aterrizaje = Parte("T tren de Aterrizaje", 400)

avion = Avion("Airbus A320", "Airbus")
avion.agregar_parte(motor)
avion.agregar_parte(alas)
avion.agregar_parte(tren_aterrizaje)

print(avion.mostrar_avion())
