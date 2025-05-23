class Animal:
    def __init__(self, nombre, edad):
        self.nombre = nombre
        self.edad = edad

    def emitir_sonido(self):
        return "Este animal hace un sonido."

class Leon(Animal):
    def __init__(self, nombre, edad, territorio):
        super().__init__(nombre, edad)
        self.territorio = territorio

    def emitir_sonido(self):
        return f"{self.nombre} ruge fuerte desde {self.territorio}"

class Elefante(Animal):
    def __init__(self, nombre, edad, peso):
        super().__init__(nombre, edad)
        self.peso = peso

    def emitir_sonido(self):
        return f"{self.nombre} barrita con un peso de {self.peso} kg"

class Mono(Animal):
    def __init__(self, nombre, edad, nivel_travesura):
        super().__init__(nombre, edad)
        self.nivel_travesura = nivel_travesura

    def emitir_sonido(self):
        return f"{self.nombre} grita travieso con nivel {self.nivel_travesura}"

animales = [
    Leon("Simba", 5, "Sabana"),
    Elefante("Dumbo", 10, 1200),
    Mono("George", 3, 8)
]

print("== Zoológico ==")
for animal in animales:
    print(animal.emitir_sonido())
