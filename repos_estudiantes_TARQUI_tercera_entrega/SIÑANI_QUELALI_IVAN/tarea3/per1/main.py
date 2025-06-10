from archivo_empleado import ArchivoEmpleado
from empleado import Empleado
archivo = ArchivoEmpleado("empleados.pkl")
archivo.crear_archivo()
# Guardar empleados
archivo.guardar_empleado(Empleado("Juan", 30, 2500.50))
archivo.guardar_empleado(Empleado("Ana", 28, 3200.00))
archivo.guardar_empleado(Empleado("Carlos", 35, 2800.75))
# Buscarnombre
encontrado = archivo.busca_empleado("Ana")
print("Empleado encontrado:", encontrado)
#mayor a 2600
mayor_salario = archivo.mayor_salario(2600)
print("Empleado con salario mayor a 2600:", mayor_salario)
