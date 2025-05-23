"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"3. Crea una clase Coche con marca, modelo y velocidad"
"a) Agrega un método acelerar () que aumente la velocidad en 10"
"b) Agrega un método frenar () que disminuya la velocidad en 5"
"c) Crea dos coches, aceléralos, frénalos y muestra sus velocidades"


class Coche:
    def __init__(self, marca, modelo, velocidad=0):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self):
        self.velocidad += 10

    def frenar(self):
        self.velocidad -= 5

    def mostrar_velocidad(self):
        return f"{self.marca} {self.modelo} tiene una velocidad de {self.velocidad} km/h."


if __name__ == "__main__":
    auto1 = Coche("Toyota", "Supra")
    auto2 = Coche("Nissan", "skyline gtr r34")

    auto1.acelerar()
    auto2.acelerar()

    auto1.frenar()
    auto2.frenar()

    print(auto1.mostrar_velocidad())
    print(auto2.mostrar_velocidad())
