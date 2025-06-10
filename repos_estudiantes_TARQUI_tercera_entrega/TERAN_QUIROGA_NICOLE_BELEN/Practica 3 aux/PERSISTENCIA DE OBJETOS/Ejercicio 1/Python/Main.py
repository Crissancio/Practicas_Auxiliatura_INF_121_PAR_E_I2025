from Empleado import Empleado
from ArchivoEmpleado import ArchivoEmpleado

archivo = ArchivoEmpleado("empleados.txt")
archivo.cargarEmpleados()


nuevo = Empleado("María", 29, 3100)
archivo.guardarEmpleado(nuevo)

nuevo = Empleado("Jorge", 26, 5000)
archivo.guardarEmpleado(nuevo)

nuevo = Empleado("David", 21, 4200)
archivo.guardarEmpleado(nuevo)

e = archivo.buscaEmpleado("Julio")
print("Encontrado:", e)

mayor = archivo.mayorSalario(2500)
print("Empleado con mayor salario:", mayor)
