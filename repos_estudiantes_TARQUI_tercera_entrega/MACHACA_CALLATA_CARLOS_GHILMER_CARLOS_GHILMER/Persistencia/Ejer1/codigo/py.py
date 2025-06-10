class Empleado:
    def __init__(self, nombre, edad, salario):
        self.__nombre = nombre
        self.__edad = edad
        self.__salario = salario

    def __str__(self):
        return f"Nombre: {self.__nombre}, Edad: {self.__edad}, Salario: {self.__salario}"

    def get_nombre(self):
        return self.__nombre

    def get_edad(self):
        return self.__edad

    def get_salario(self):
        return self.__salario

class ArchivoEmpleado:
    def __init__(self, n):
        self.__nomA = n
        self.empleados = []

    def crear_archivo(self):
        with open(self.__nomA, 'w') as f:
            pass

    def guardar_empleado(self, e: Empleado):
        self.empleados.append(e)

    def busca_empleado(self, n: str):
        for e in self.empleados:
            if e.get_nombre() == n:
                return e
        return None

    def mayor_salario(self, sueldo: float):
        for e in self.empleados:
            if e.get_salario() > sueldo:
                return e
        return None

archivo = ArchivoEmpleado("empleados.json")
archivo.crear_archivo()

e1 = Empleado("Julian", 28, 3000.0)
e2 = Empleado("Marcos", 35, 4500.0)
e3 = Empleado("Trevor", 40, 2800.0)

archivo.guardar_empleado(e1)
archivo.guardar_empleado(e2)
archivo.guardar_empleado(e3)

print("Empleado buscado:", archivo.busca_empleado("Marcos"))
print("Empleado con mayor salario:", archivo.mayor_salario(2900.0))