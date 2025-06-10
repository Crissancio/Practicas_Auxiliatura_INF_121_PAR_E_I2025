from Empleado import Empleado
from GestorEmpleado import GestorEmpleado

gestor = GestorEmpleado()

e1 = Empleado("Luis", 30, 3000)
e2 = Empleado("Maria", 28, 4000)

gestor.guardar_empleado(e1)
gestor.guardar_empleado(e2)

print("Buscar por nombre: Maria")
print(gestor.busca_empleado("Maria"))

print("Empleado con salario mayor a 3500:")
print(gestor.mayor_salario(3500))
