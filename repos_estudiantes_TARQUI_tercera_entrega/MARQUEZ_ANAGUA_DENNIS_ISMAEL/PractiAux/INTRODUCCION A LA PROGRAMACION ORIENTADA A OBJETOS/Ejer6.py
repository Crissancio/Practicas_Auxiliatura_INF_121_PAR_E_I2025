'''
6. Crea una clase Calculadora con operaciones básicas
a)	Agrega métodos para realizar las operaciones básicas
b)	Agrega un método para calcular el promedio de tres números
c)	Agrega un método para calcular las soluciones de una ecuación cuadrática
d)	Realiza operaciones con los métodos y muestra los resultados
'''
import math
class Calculadora:
    def __init__(self,a,b,c):
        self.a = a
        self.b = b
        self.c = c
    def opBasicas(self):
        s = self.a+self.b
        print(f"La suma entre {self.a} y {self.b} es: ",s)
        r = self.a-self.b
        print(f"La resta entre {self.a} y {self.b} es: ", r)
        m = self.a * self.b
        print(f"La multiplicacion entre {self.a} y {self.b} es: ", m)
        d = self.a / self.b
        print(f"La division entre {self.a} y {self.b} es: ", d)
    def Promedio(self):
        prom = (self.a+self.b+self.c)/3
        print(f"El promedio de {self.a} + {self.b} + {self.c} es",prom)
    def ecu(self):
        if self.a == 0:
            print("No es una ecuación cuadrática (a=0).")
            return
        discriminante = (self.b ** 2) - (4 * self.a * self.c)
        if discriminante < 0:
            print("No hay soluciones reales (discriminante < 0).")
        else:
            sol1 = (-self.b + math.sqrt(discriminante)) / (2 * self.a)
            sol2 = (-self.b - math.sqrt(discriminante)) / (2 * self.a)
            print(f"Las soluciones de la ecuación cuadrática son: {sol1} y {sol2}")
calcu1 = Calculadora(a=12,b=42,c=64)
print(calcu1.opBasicas())
print(calcu1.Promedio())
print(calcu1.ecu())