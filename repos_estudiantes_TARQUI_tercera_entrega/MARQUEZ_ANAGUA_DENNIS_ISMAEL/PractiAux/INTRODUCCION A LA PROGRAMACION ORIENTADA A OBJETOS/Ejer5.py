'''
5. Crea una clase Estudiante con nombre, nota_1, nota_2
a)	Agrega un método para calcular el promedio
b)	Agrega un método para verificar si aprobó (promedio >=6)
c)	Crea tres estudiantes, muestra sus promedios y si aprobaron
'''
class Estudiante:
    def __init__(self,nombre,nota1,nota2):
        self.nombre = nombre
        self.nota1 = nota1
        self.nota2 = nota2
    def calcProm(self):

        if (self.nota1)+(self.nota2)/2>=6:
            return True
        else:
            return False
    def prom(self):
        return self.calcProm()

est1 = Estudiante(nombre="Xavier",nota1=7,nota2=4)
est1.calcProm()
print(f'El estudiante {est1.nombre} aprobo? {est1.prom()}')

est2 = Estudiante(nombre="Jorge",nota1=4,nota2=2)
est1.calcProm()
print(f'El estudiante {est2.nombre} aprobo? {est2.prom()}')

est3 = Estudiante(nombre="roxana",nota1=9,nota2=8)
est1.calcProm()
print(f'El estudiante {est3.nombre} aprobo? {est3.prom()}')