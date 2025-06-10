class Coche:
    def __init__(self, marca, modelo, velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad

    def acelerar(self, mas):
        self.velocidad += mas
        return f"La velocidad del coche{self.marca} {self.modelo} aumentó a {self.velocidad} km/h"

    def frenar(self, menos):
        self.velocidad -= menos
        if self.velocidad < 0:
            self.velocidad = 0
            return f"El coche {self.marca} se detuvo"
        return f"La velocidad del coche {self.marca} disminuyó a {self.velocidad} km/h"


C1=Coche("Toyota", 1234, 30)
C2=Coche("Suzuki",1368,40)

print(C1.acelerar(10))
print(C2.acelerar(10))

print(C1.frenar(5))
print(C2.frenar(5))

print(C1.frenar(40))