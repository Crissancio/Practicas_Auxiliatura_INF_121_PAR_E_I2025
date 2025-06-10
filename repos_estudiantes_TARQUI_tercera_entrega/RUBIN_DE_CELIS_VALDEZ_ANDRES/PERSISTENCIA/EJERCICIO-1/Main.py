from Empleado import Empleado
from ArchivoEmpleado import ArchivoEmpleado
import os

def main():
    archivo_nombre = "empleados.txt"
    if os.path.exists(archivo_nombre):
        os.remove(archivo_nombre)
    archivo = ArchivoEmpleado(archivo_nombre)
    empleados = [
        Empleado("Juan Perez", 35, 2500.50),
        Empleado("Maria Garcia", 28, 3200.75),
        Empleado("Carlos Lopez", 42, 1800.00),
        Empleado("Ana Martinez", 31, 4100.25)
    ]
    print("Guardando empleados...")
    for emp in empleados:
        archivo.guardar_empleado(emp)
    print("\n=== Todos los empleados ===")
    archivo.mostrar_empleados()
    print("\n=== Buscar empleado ===")
    nombre_buscar = "María García"
    empleado_encontrado = archivo.buscar_empleado(nombre_buscar)
    print(f"Buscando '{nombre_buscar}': {empleado_encontrado or 'No encontrado'}")
    print("\n=== Empleado con mayor salario ===")
    salario_minimo = 3000
    empleado_mayor_salario = archivo.mayor_salario(salario_minimo)
    print(f"Primer empleado con salario > ${salario_minimo}: {empleado_mayor_salario or 'No encontrado'}")

if __name__ == "__main__":
    main()