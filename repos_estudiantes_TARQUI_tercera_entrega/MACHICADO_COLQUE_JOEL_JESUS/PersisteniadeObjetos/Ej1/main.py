import csv

class Empleado:
    def __init__(self, nombre: str, edad: int, salario: float):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def __str__(self):
        return f"Empleado: {self.nombre}, Edad: {self.edad}, Salario: {self.salario}"

class ArchivoEmpleado:
    def __init__(self, nom_archivo: str):
        self.nom_archivo = nom_archivo

    def crear_archivo(self):
        try:
            with open(self.nom_archivo, 'x') as file:
                pass  # Crea el archivo vacío
        except FileExistsError:
            pass  # El archivo ya existe

    def guardar_empleado(self, empleado: Empleado):
        with open(self.nom_archivo, 'a', newline='') as file:
            writer = csv.writer(file)
            writer.writerow([empleado.nombre, empleado.edad, empleado.salario])

    def buscar_empleado(self, nombre: str) -> Empleado:
        with open(self.nom_archivo, 'r') as file:
            reader = csv.reader(file)
            for row in reader:
                if row[0].lower() == nombre.lower():
                    return Empleado(row[0], int(row[1]), float(row[2]))
        return None

    def mayor_salario(self, sueldo_min: float) -> Empleado:
        with open(self.nom_archivo, 'r') as file:
            reader = csv.reader(file)
            for row in reader:
                if float(row[2]) > sueldo_min:
                    return Empleado(row[0], int(row[1]), float(row[2]))
        return None

archivo = ArchivoEmpleado("empleados.txt")
archivo.crear_archivo()

# Guardar empleados
archivo.guardar_empleado(Empleado("Ana", 30, 2500.0))
archivo.guardar_empleado(Empleado("Luis", 40, 3200.0))
archivo.guardar_empleado(Empleado("Carlos", 35, 2800.0))
archivo.guardar_empleado(Empleado("María", 28, 3000.0))


# Buscar empleado
buscado = archivo.buscar_empleado("Luis")
print(f"Empleado encontrado: {buscado}")

# Mayor salario
mejor_pagado = archivo.mayor_salario(2800.0)
print(f"Empleado con mayor salario: {mejor_pagado}")