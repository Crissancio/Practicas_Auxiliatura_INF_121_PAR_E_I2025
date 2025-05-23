class Coche:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self):
        self.velocidad += 10

    def frenar(self):
        self.velocidad -= 5

    def __str__(self):
        return f"Coche{{ marca={self.marca}, modelo={self.modelo}, velocidad={self.velocidad} }}"

def main():
    c1 = Coche("Toyota", "Corolla", 150)
    c2 = Coche("Mercedes Benz", "CLA", 100)

    c1.acelerar()
    c2.acelerar()

    c1.frenar()
    c2.frenar()

    print(c1)
    print(c2)

if __name__ == "__main__":
    main()
