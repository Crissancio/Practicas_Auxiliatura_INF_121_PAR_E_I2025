class Animal:
    def __init__(self, nombre):
        self.nombre = nombre

    def hacer_sonido(self):
        print(f"{self.nombre} hace un sonido.")

    def moverse(self):
        print(f"{self.nombre} se mueve.")

class Perro(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)

    def hacer_sonido(self):
        print(f"{self.nombre} ladra: ¡Guau guau!")

    def moverse(self):
        print(f"{self.nombre} corre y salta.")

class Gato(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)

    def hacer_sonido(self):
        print(f"{self.nombre} maúlla: ¡Miau miau!")

    def moverse(self):
        print(f"{self.nombre} salta y trepa.")

class Pajaro(Animal):
    def __init__(self, nombre):
        super().__init__(nombre)

    def hacer_sonido(self):
        print(f"{self.nombre} canta: ¡Pío pío!")

    def moverse(self):
        print(f"{self.nombre} vuela y salta.")

def main():
    perro = Perro("Buddy")
    gato = Gato("Whiskers")
    pajaro = Pajaro("Tweety")

    perro.hacer_sonido()
    gato.hacer_sonido()
    pajaro.hacer_sonido()

    perro.moverse()
    gato.moverse()
    pajaro.moverse()

if __name__ == "__main__":
    main()
