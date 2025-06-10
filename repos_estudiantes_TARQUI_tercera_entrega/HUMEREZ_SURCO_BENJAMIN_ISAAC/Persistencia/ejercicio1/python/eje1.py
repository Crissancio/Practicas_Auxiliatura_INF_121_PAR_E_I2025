class Empleado:
    def __init__(self, nombre: str, edad: int, salario: float):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def __str__(self):
        return f"Nombre: {self.nombre}, Edad: {self.edad}, Salario: {self.salario}"

class ArchivoEmpleado:
    def __init__(self, nomA: str):
        self.nomA = nomA
        self.empleados = []

    def guardarEmpleado(self, e: Empleado):
        self.empleados.append(e)

    def buscaEmpleado(self, n: str):
        for e in self.empleados:
            if e.nombre == n:
                return e
        return None

    def mayorSalario(self, sueldo: float):
        for e in self.empleados:
            if e.salario > sueldo:
                return e
        return None


archivo = ArchivoEmpleado("Empleados2025")
archivo.guardarEmpleado(Empleado("Ana", 25, 3000))
archivo.guardarEmpleado(Empleado("Luis", 30, 4500))
archivo.guardarEmpleado(Empleado("Pedro", 28, 3200))

print("Buscar Luis:", archivo.buscaEmpleado("Luis"))
print("Mayor salario que 3100:", archivo.mayorSalario(3100))
