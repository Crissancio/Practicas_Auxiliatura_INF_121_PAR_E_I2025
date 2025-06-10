'''7.	Se hace referencia a algunos animales mediante las siguientes clases:

a)	Instanciar 1 Perro, 1 Gato y 1 Pájaro.
b)	Sobrecargar el método hacerSonido() para que cada animal emita su sonido característico.
c)	Implementar un método moverse() que indique cómo se mueve cada animal (correr, saltar, volar, etc.).
'''

class Perro:
    def __init__(self, nombre, edad, raza):
        self.nombre = nombre
        self.edad = edad
        self.raza = raza

    def hacerSonido(self):
        return "LADRIDOOO"

    def moverse(self):
        return "Saltos largos"

class Gato:
    def __init__(self, nombre, color):
        self.nombre = nombre
        self.color = color

    def hacerSonido(self):
        return "REAULL RAULL"

    def moverse(self):
        return "Flexibilidad maxima"

class Pajaro:
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo

    def hacerSonido(self):
        return "CANTO"

    def moverse(self):
        return "Vuelo alto"

perro1 = Perro(nombre="ZEUS", edad=10, raza="Golden Retriver")
gato1 = Gato(nombre="TEODORO", color="Naranjoso")
pajaro1 = Pajaro(nombre="Piolin", tipo="Canario")

print("Perro")
print(f"Nombre: {perro1.nombre}, Edad: {perro1.edad}, Raza: {perro1.raza}")
print(f"Sonido: {perro1.hacerSonido()}")
print(f"Movimiento: {perro1.moverse()}")

print("\nGato")
print(f"Nombre: {gato1.nombre}, Color: {gato1.color}")
print(f"Sonido: {gato1.hacerSonido()}")
print(f"Movimiento: {gato1.moverse()}")

print("\nPájaro")
print(f"Nombre: {pajaro1.nombre}, Tipo: {pajaro1.tipo}")
print(f"Sonido: {pajaro1.hacerSonido()}")
print(f"Movimiento: {pajaro1.moverse()}")
