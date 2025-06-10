class Empleado:
    def __init__(self, nombre, edad, salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

class ArchivoEmpleado:
    def __init__(self, nomA):
        self.nomA = nomA
        self.empleados = []

    def crearArchivo(self):
        self.empleados = []

    def guardarEmpleado(self, e):
        self.empleados.append(e)

    def buscaEmpleado(self, nombre):
        for e in self.empleados:
            if e.nombre == nombre:
                return e
        return None

    def mayorSalario(self, sueldo):
        for e in self.empleados:
            if e.salario > sueldo:
                return e
        return None
