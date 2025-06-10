'''
3. Crea una clase Coche con marca, modelo y velocidad
a)	Agrega un método acelerar () que aumente la velocidad en 10
b)	Agrega un método frenar () que disminuya la velocidad en 5
c)	Crea dos coches, aceléralos, frénalos y muestra sus velocidades
'''
class Coche:
    def __init__(self,marca,modelo,velocidad):
        self.marca = marca
        self.modelo = modelo
        self.velocidad = velocidad
    def Acelera(self):
        self.velocidad += 10
    def Frenar(self):
        self.velocidad -= 5

coche1 = Coche(marca="Toyota", modelo="Ty123", velocidad=100)
coche2 = Coche(marca="Suzuki", modelo="Sz456", velocidad=200)

coche1.Acelera()
coche1.Frenar()
coche2.Acelera()
coche2.Frenar()

print("Su aceleracion maxima es de",coche1.marca ,coche1.modelo,"y su velociad al final es de",coche1.velocidad)
print("Su aceleracion maxima es de",coche2.marca ,coche2.modelo,"y su velociad al final es de",coche2.velocidad)