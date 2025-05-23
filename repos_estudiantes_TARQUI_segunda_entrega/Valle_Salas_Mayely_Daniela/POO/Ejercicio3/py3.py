class Coche:
    def __init__(self, marca, modelo):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = 0  

    def acelerar(self):
        self.velocidad += 10  

    def frenar(self):
        self.velocidad -= 5  
        if self.velocidad < 0:
            self.velocidad = 0

coche1 = Coche("Nissan", "Kicks Play")
coche2 = Coche("BMW", " BMW X5 M")

coche1.acelerar()
coche2.acelerar()
coche2.acelerar()  

coche1.frenar()
coche2.frenar()

print(f"Velocidad del {coche1.marca} {coche1.modelo}: {coche1.velocidad} km/h")
print(f"Velocidad del {coche2.marca} {coche2.modelo}: {coche2.velocidad} km/h")
