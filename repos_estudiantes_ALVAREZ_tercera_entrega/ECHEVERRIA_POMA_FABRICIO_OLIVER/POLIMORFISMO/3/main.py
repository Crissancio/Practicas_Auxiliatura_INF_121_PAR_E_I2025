"""
---------------------ENUNCIADO---------------------

3. Un restaurante organiza a su personal mediante las siguientes clases:

a) Instanciar 1 Cocinero, 2 objetos Mesero y 2 objetos Administrativo.
b) Sobrecargar el método SueldoTotal para mostrar el sueldo total,
sumándole las horas extra, considerando el sueldo por hora y la propina
en caso de los meseros.
c) Sobrecargar el método para mostrar a aquellos Empleados que tengan
SueldoMes igual a X.
"""

from cocinero import Cocinero
from mesero import Mesero
from administrativo import Administrativo

if __name__ == "__main__":
    #A
    cocinero =Cocinero("Sr. Gordillo", 1500, 7, 100)
    mesero1 = Mesero("Lucho", 1000, 5, 20, 100)
    mesero2 = Mesero("Girasol", 1100, 10, 21, 200)
    admin1 = Administrativo("Elon", 2000, "Gerente")
    admin2 = Administrativo("Bill", 2500, "Coordinador")

    empleados = [cocinero, mesero1, mesero2, admin1, admin2]

print("Sueldo total de cada empleado:")
print(f"Cocinero {cocinero.nombre}: {cocinero.sueldoTotal()}")
print(f"Mesero {mesero1.nombre}: {mesero1.sueldoTotal()}")
print(f"Mesero {mesero2.nombre}: {mesero2.sueldoTotal()}")
print(f"Administrativo {admin1.nombre}: {admin1.sueldoTotal()}")
print(f"Administrativo {admin2.nombre}: {admin2.sueldoTotal()}")
print("----------------------------------------")
#C
X= 1500
print(f"Empleados con sueldo de {X}:")
for empleado in empleados:
    empleado.sueldoPorMes(X)
