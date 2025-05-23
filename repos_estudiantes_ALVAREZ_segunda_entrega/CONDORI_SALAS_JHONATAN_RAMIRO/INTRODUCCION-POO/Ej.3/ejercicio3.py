class Coche:

    def __init__(self, marca, modelo, velocidad=0):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self):
        self.velocidad += 10
        print(f"Velocidad después de acelerar: {self.velocidad} km/h")

    def frenar(self):
        self.velocidad -= 5
        print(f"Velocidad después de frenar: {self.velocidad} km/h")

coche1 = Coche("Toyota", "Corolla")
coche2 = Coche("Ford", "Focus")

print("Acelerar coche1:")
coche1.acelerar()

print("\nFrenar coche1:")
coche1.frenar()

print("\nAcelerar y frenar coche2:")
coche2.acelerar()
coche2.frenar()

print(f"\nVelocidad final del coche1 ({coche1.marca} {coche1.modelo}): {coche1.velocidad} km/h")
print(f"Velocidad final del coche2 ({coche2.marca} {coche2.modelo}): {coche2.velocidad} km/h")
