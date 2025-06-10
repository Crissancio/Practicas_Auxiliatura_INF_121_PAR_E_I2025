class Coche:
    def __init__(self, marca, modelo, velocidad=0):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad
    def acelerar(self):
        self.velocidad += 10
    def frenar(self):
        self.velocidad -= 5 if self.velocidad >= 5 else self.velocidad 
    
coche1 = Coche("Toyota", "Corolla")
coche2 = Coche("Susuki", "Focus")

coche1.acelerar()
coche1.frenar()
coche2.acelerar()
coche2.frenar()


print(f"Velocidad de {coche1.marca} {coche1.modelo}: {coche1.velocidad} km/h")
print(f"Velocidad de {coche2.marca} {coche2.modelo}: {coche2.velocidad} km/h")
 
 
