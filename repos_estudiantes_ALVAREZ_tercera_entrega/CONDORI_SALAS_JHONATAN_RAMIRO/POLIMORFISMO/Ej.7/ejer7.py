from abc import ABC, abstractmethod

class Animal(ABC):
    def __init__(self, nombre):
        self.nombre = nombre
    def hacerSonido(self):
        pass
    def moverse(self):
        pass
class Perro(Animal):
    def __init__(self, nombre, edad, raza):
        super().__init__(nombre)
        self.edad = edad
        self.raza = raza

    def hacerSonido(self):
        return "Guau guau"

    def moverse(self):
        return "Corre y salta"
class Gato(Animal):
    def __init__(self, nombre, color):
        super().__init__(nombre)
        self.color = color

    def hacerSonido(self):
        return "Miau Miau" 

    def moverse(self):
        return "Salta y camina sigilosamente"

class Pajaro(Animal):
    def __init__(self, nombre, tipo):
        super().__init__(nombre)
        self.tipo = tipo

    def hacerSonido(self):
        return "Pío pío"

    def moverse(self):
        return "Vuela y camina"

perro = Perro("Firulais", 5, "Labrador")
gato = Gato("Misu", "Negro")
pajaro = Pajaro("Piolín", "Canario")

animales = [perro, gato, pajaro]

for animal in animales:
    print(f"{animal.nombre} dice: {animal.hacerSonido()}")
    print(f"{animal.nombre} se mueve así: {animal.moverse()}")
    print()
