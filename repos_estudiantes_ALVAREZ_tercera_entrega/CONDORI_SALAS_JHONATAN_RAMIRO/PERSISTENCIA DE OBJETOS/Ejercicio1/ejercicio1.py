import pickle
class Empleado:
    def __init__(self, nombre, edad, salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario
    def __str__(self):
        return f'Nombre: {self.nombre}, Edad: {self.edad}, Salario: {self.salario}'
class ArchivoEmpleado:
    def __init__(self, nomA):
        self.nomA = nomA
    def crearArchivo(self):
        with open(self.nomA, 'wb') as f:
            pickle.dump([], f)
    def guardarEmpleado(self, e):
        empleados = []
        try:
            with open(self.nomA, 'rb') as f:
                empleados = pickle.load(f)
        except FileNotFoundError:
            pass
        empleados.append(e)
        with open(self.nomA, 'wb') as f:
            pickle.dump(empleados, f)
    def buscaEmpleado(self, n):
        with open(self.nomA, 'rb') as f:
            empleados = pickle.load(f)
        for emp in empleados:
            if emp.nombre == n:
                return emp
        return None
    def mayorSalario(self, sueldo):
        with open(self.nomA, 'rb') as f:
            empleados = pickle.load(f)
        for emp in empleados:
            if emp.salario > sueldo:
                return emp
        return None
if __name__ == '__main__':
    archivo = ArchivoEmpleado('empleados.dat')
    archivo.crearArchivo()
    e1 = Empleado("Luis", 30, 2500)
    e2 = Empleado("Ana", 28, 3000)
    e3 = Empleado("Mario", 40, 1800)
    archivo.guardarEmpleado(e1)
    archivo.guardarEmpleado(e2)
    archivo.guardarEmpleado(e3)
    print("Buscar Empleado Ana:")
    encontrado = archivo.buscaEmpleado("Ana")
    print(encontrado if encontrado else "No encontrado")
    print("\nEmpleado con salario mayor a 2000:")
    mejor = archivo.mayorSalario(2000)
    print(mejor if mejor else "No hay")
