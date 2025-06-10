from Empleado import Empleado
from ArchivoEmpleado import ArchivoEmpleado

if __name__ == "__main__":
    nombre_archivo = "empleados_ejercicio1.txt"
    archivo_empleado = ArchivoEmpleado(nombre_archivo)

    archivo_empleado.limpiar_archivo()

    print("\n--- Guardando Empleados ---")
    emp1 = Empleado("Maria Celeste", 30, 55000.00)
    emp2 = Empleado("Carlos Johnson", 25, 48000.50)
    emp3 = Empleado("Abel Fernandez", 45, 72000.75)
    emp4 = Empleado("Santiago Barrancos", 32, 60000.00) 

    archivo_empleado.guardar_empleado(emp1)
    archivo_empleado.guardar_empleado(emp2)
    archivo_empleado.guardar_empleado(emp3)
    archivo_empleado.guardar_empleado(emp4)

    print("\n--- Buscando Empleados por Nombre ---")
    # b) 
    nombre_busqueda1 = "Carlos Johnson"
    empleado_encontrado1 = archivo_empleado.busca_empleado(nombre_busqueda1)
    if empleado_encontrado1:
        print(f"Empleado '{nombre_busqueda1}' encontrado: {empleado_encontrado1}")
    else:
        print(f"Empleado '{nombre_busqueda1}' no encontrado.")

    nombre_busqueda2 = "Maria Celeste"
    empleado_encontrado2 = archivo_empleado.busca_empleado(nombre_busqueda2)
    if empleado_encontrado2:
        print(f"Empleado '{nombre_busqueda2}' encontrado: {empleado_encontrado2}")
    else:
        print(f"Empleado '{nombre_busqueda2}' no encontrado.")

    nombre_busqueda3 = "David Lopez"
    empleado_encontrado3 = archivo_empleado.busca_empleado(nombre_busqueda3)
    if empleado_encontrado3:
        print(f"Empleado '{nombre_busqueda3}' encontrado: {empleado_encontrado3}")
    else:
        print(f"Empleado '{nombre_busqueda3}' no encontrado.")

    print("\n--- Buscando Empleado con Salario Mayor ---")
    # c)
    sueldo_minimo_1 = 50000.00
    empleado_mayor_salario1 = archivo_empleado.mayor_salario(sueldo_minimo_1)
    if empleado_mayor_salario1:
        print(f"Primer empleado con salario mayor a {sueldo_minimo_1:.2f}: {empleado_mayor_salario1}")
    else:
        print(f"Ningún empleado encontrado con salario mayor a {sueldo_minimo_1:.2f}.")

    sueldo_minimo_2 = 75000.00
    empleado_mayor_salario2 = archivo_empleado.mayor_salario(sueldo_minimo_2)
    if empleado_mayor_salario2:
        print(f"Primer empleado con salario mayor a {sueldo_minimo_2:.2f}: {empleado_mayor_salario2}")
    else:
        print(f"Ningun empleado encontrado con salario mayor a {sueldo_minimo_2:.2f}.")

    
    print(f"\nContenido final del archivo '{nombre_archivo}':")
    try:
        with open(nombre_archivo, 'r') as f:
            print(f.read())
    except FileNotFoundError:
        print("El archivo no existe aun")
