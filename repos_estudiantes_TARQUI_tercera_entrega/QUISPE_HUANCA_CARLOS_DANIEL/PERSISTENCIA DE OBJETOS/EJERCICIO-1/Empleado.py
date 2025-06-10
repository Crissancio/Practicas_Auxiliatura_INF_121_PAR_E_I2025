import pickle
import os


class Empleado:
    def __init__(self, nombre, edad, salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def __str__(self):
        return f"Nombre: {self.nombre}, Edad: {self.edad}, Salario: {self.salario}"


class ArchivoEmpleado:
    def __init__(self, nomA):
        self.nomA = nomA
        self.empleados = []
        if os.path.exists(self.nomA):
            with open(self.nomA, 'rb') as f:
                self.empleados = pickle.load(f)

    def crearArchivo(self):
        pass

    def guardarEmpleado(self, e):
        self.empleados.append(e)
        with open(self.nomA, 'wb') as f:
            pickle.dump(self.empleados, f)

    def buscaEmpleado(self, n):
        for emp in self.empleados:
            if emp.nombre.lower() == n.lower():
                return emp
        return None

    def mayorSalario(self, s):
        for emp in self.empleados:
            if emp.salario > s:
                return emp
        return None


if __name__ == "__main__":
    archivo = ArchivoEmpleado("empleados.dat")

    archivo.guardarEmpleado(Empleado("Juan Pérez", 35, 4500))
    archivo.guardarEmpleado(Empleado("María Gómez", 28, 5200))
    archivo.guardarEmpleado(Empleado("Carlos Ruiz", 42, 3800))

    emp = archivo.buscaEmpleado("María Gómez")
    if emp:
        print("Empleado encontrado:", emp)
    else:
        print("Empleado no encontrado")

    emp_mayor = archivo.mayorSalario(4000)
    if emp_mayor:
        print("Empleado con salario mayor a 4000:", emp_mayor)
    else:
        print("No hay empleados con salario mayor a 4000")