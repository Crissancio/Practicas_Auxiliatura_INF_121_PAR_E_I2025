'''

-------------- EJERCICIO 1 --------------

a) Implementa el método guardarEmpleado(Empleado e) para almacenar
empleados.
b) Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos
del Empleado n.
c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con
sueldo mayor al ingresado.

'''

from Empleado import Empleado
from ArchivoEmpleado import ArchivoEmpleado

def main():
    archivo = ArchivoEmpleado("d:/UMSA/SEGUNDO SEMESTRE/PROGRAMACION II/PRACTICAS AUX/PRACTICA#3/PERSISTENCIA/1/PYTHON/empleados.txt")
    archivo.crearArchivo()
    
    # a)
    empleado1 = Empleado("Luisito", 30, 5000.0)
    empleado2 = Empleado("Cepillin", 25, 6000.0)
    archivo.guardarEmpleado(empleado1)
    archivo.guardarEmpleado(empleado2)
    
    # b)
    encontrado = archivo.buscaEmpleado("Cepillin")
    if encontrado:
        print(encontrado)
    else:
        print("Empleado no encontrado")
    
    # c)
    mayor = archivo.mayorSalario(5500.0)
    if mayor:
        print("Primer empleado con salario mayor a 5500:", mayor)
    else:
        print("No hay empleados con salario mayor a 5500")

if __name__ == "__main__":
    main()