import json

class Empleado:
    def __init__(self, nombre, edad, salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def __str__(self):
        return f"Nombre: {self.nombre}, Edad: {self.edad}, Salario: {self.salario}"

class ArchivoEmpleado:
    def __init__(self, nombre_archivo):
        self.nombre_archivo = nombre_archivo
        self.empleados = self.cargar_empleados()

    def cargar_empleados(self):
        try:
            with open(self.nombre_archivo, "r") as archivo:
                empleados_dict = json.load(archivo)
                return [Empleado(**emp) for emp in empleados_dict]
        except (FileNotFoundError, json.JSONDecodeError):
            return []

    def guardar_empleados(self):
        with open(self.nombre_archivo, "w") as archivo:
            json.dump([emp.__dict__ for emp in self.empleados], archivo, indent=4)

    def guardarEmpleado(self, empleado):
        self.empleados.append(empleado)
        self.guardar_empleados()

    def buscaEmpleado(self, nombre):
        for empleado in self.empleados:
            if empleado.nombre == nombre:
                return empleado
        return None

    def mayorSalario(self, sueldo):
        for empleado in self.empleados:
            if empleado.salario > sueldo:
                return empleado
        return None

archivo = ArchivoEmpleado("empleados.json")

archivo.guardarEmpleado(Empleado("Carlos", 30, 1500))
archivo.guardarEmpleado(Empleado("Ana", 28, 2500))
archivo.guardarEmpleado(Empleado("Luis", 35, 4000))

empleado = archivo.buscaEmpleado("Ana")
print("empleado encontrado: ", empleado if empleado else "Empleado no encontrado.")

empleado = archivo.mayorSalario(3000)
print("empleado con salario mayor a 3000: ", empleado if empleado else "No hay empleados con salario mayor al ingresado.")
