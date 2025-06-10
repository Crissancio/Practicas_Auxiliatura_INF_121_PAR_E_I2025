class Coche:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad
    # Inciso a
    def acelerar(self):
        self.velocidad = self.velocidad + 10
        return f"El coche {self.marca} {self.modelo} acelero a {self.velocidad} km/h"
    # Inciso b
    def frenar(self):
        self.velocidad = self.velocidad - 5
        return f"El coche {self.marca} {self.modelo} freno a {self.velocidad} km/h"
# Inciso c
coche = Coche("Toyota", "Corolla", 100)
print(coche.acelerar())
print(coche.frenar())
coche = Coche("Ford", "Fiesta", 120)
print(coche.acelerar())
print(coche.frenar())

