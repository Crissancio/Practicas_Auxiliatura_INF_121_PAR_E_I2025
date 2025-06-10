'''
2. Crea una clase Empleado con nombre y sueldo
a)	Agrega un método para calcular el sueldo anual
b)	Agrega un método para aplicar un aumento del 10%
c)	Crea dos empleados y muestra sus sueldos antes y después del aumento
'''
class Empleado:
    def __init__(self,nombre,sueldo):
        self.nombre = nombre
        self.sueldo = sueldo
    def SueldoAnual(self):
        return self.sueldo*12
    def Aumento(self):
        return (self.SueldoAnual()*10)/100
    def total(self):
        return self.SueldoAnual()+self.Aumento()

empleado1 = Empleado(nombre="gaspacho",sueldo=1800)
print(empleado1.nombre ,"tiene un sueldo anual de:",empleado1.SueldoAnual(),"bs.")
print("Y su sueldo con aumento: ",empleado1.total(),"bs.")

empleado2 = Empleado(nombre="Juanito",sueldo=1500)
print(empleado2.nombre," tiene un Sueldo anual: ",empleado2.SueldoAnual(),"bs.")
print("y su sueldo con aumento es: ",empleado2.total(),"bs.")