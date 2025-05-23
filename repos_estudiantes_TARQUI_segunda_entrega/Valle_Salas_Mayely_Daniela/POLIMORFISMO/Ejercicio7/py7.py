class Animal:
    def __init__(self, nombre):
        self.nombre = nombre

    def hacer_sonido(self):
        raise NotImplementedError("Este método debe ser sobreescrito en la clase hija")

    def moverse(self):
        raise NotImplementedError("Este método debe ser sobreescrito en la clase hija")

class Perro(Animal):
    def __init__(self, nombre, edad, raza):
        super().__init__(nombre)
        self.edad = edad
        self.raza = raza

    def hacer_sonido(self):
        return "Guau!"

    def moverse(self):
        return "Corre"

class Gato(Animal):
    def __init__(self, nombre, color):
        super().__init__(nombre)
        self.color = color

    def hacer_sonido(self):
        return "Miau!"

    def moverse(self):
        return "Salta"

class Pajaro(Animal):
    def __init__(self, nombre, tipo):
        super().__init__(nombre)
        self.tipo = tipo

    def hacer_sonido(self):
        return "Pío!"

    def moverse(self):
        return "Vuela"

perro = Perro(nombre="Falcon", edad=16, raza="Chapi")
gato = Gato(nombre="Manolo", color="Negro Atigrado")
pajaro = Pajaro(nombre="Julio", tipo="Loro")

print(f"{perro.nombre} hace sonido: {perro.hacer_sonido()} y se mueve: {perro.moverse()}")
print(f"{gato.nombre} hace sonido: {gato.hacer_sonido()} y se mueve: {gato.moverse()}")
print(f"{pajaro.nombre} hace sonido: {pajaro.hacer_sonido()} y se mueve: {pajaro.moverse()}")
