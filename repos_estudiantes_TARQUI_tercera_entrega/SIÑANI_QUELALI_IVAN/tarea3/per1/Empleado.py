class Empleado:
    def __init__(self, nombre, edad, salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def __str__(self):
        return f"Empleado: {self.nombre}, Edad: {self.edad}, Salario: {self.salario}"
