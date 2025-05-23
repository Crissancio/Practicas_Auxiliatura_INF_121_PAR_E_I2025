class Parte:
    def __init__(self, nombre, peso):
        self.nombre = nombre
        self.peso = peso  

    def mostrar_info(self):
        return f"Parte: {self.nombre}, Peso: {self.peso} kg"

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
            print("  -", p.mostrar_info())

# b)

motor = Parte("Motor", 1500)
alas = Parte("Alas", 1200)
tren_aterrizaje = Parte("Tren de Aterrizaje", 800)
cabina = Parte("Cabina", 600)

avion1 = Avion("Boeing 747", "Boeing")
avion1.agregar_parte(motor)
avion1.agregar_parte(alas)
avion1.agregar_parte(tren_aterrizaje)
avion1.agregar_parte(cabina)

# c) 
print("== Información del Avión y sus Partes ==")
avion1.mostrar_avion()
