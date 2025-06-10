'''
Ejercicio 1 : Persistencia
a) Implementa el método guardarEmpleado(Empleado e) para almacenar empleados. 
b) Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos del Empleado n. 
c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con sueldo mayor al ingresado.
'''

class Empleado:
    def __init__(self, n, e, s):
        self.nombre = n
        self.edad = e
        self.salario = s

    def __str__(self):
        return f"{self.nombre},{self.edad},{self.salario}"

    @staticmethod
    def desdeCadena(x):
        a = x.split(",")
        nom = a[0]
        edad = int(a[1])
        salario = float(a[2])
        return Empleado(nom, edad, salario)

class ArchivoEmpleado:
    def __init__(self, n):
        self.nomA = n

    def crearArchivo(self):
        try:
            archivo = open(self.nomA, "a")  
            archivo.close()
        except IOError:
            print("Error al crear archivo.")

    # a) Implementa el método guardarEmpleado(Empleado e) para almacenar empleados.
    def guardarEmpleado(self, e):
        try:
            with open(self.nomA, "a") as f:
                f.write(str(e) + "\n")
        except IOError:
            print("se produjo un error al guardar al empleado")

    # b) Implementa buscaEmpleado(String n) a traves del nombre, para ver los datos del Empleado n.
    def buscaEmpleado(self, n):
        try:
            with open(self.nomA, "r") as f:
                for linea in f:
                    e = Empleado.desdeCadena(linea.strip())
                    if e.nombre == n:
                        return e
        except IOError:
            print("se produjo un error al buscar al empleado")
        return None

    # c) Implementa mayorSalario(float sueldo), que devuelva al primer empleado con sueldo mayor al ingresado.
    def mayorSalario(self, s):
        try:
            with open(self.nomA, "r") as f:
                for linea in f:
                    e = Empleado.desdeCadena(linea.strip())
                    if e.salario > s:
                        return e
        except IOError:
            print("Error al buscar salario.")
        return None



if __name__ == "__main__":
    arch = ArchivoEmpleado("empleados.txt")

    arch.crearArchivo()

    # a) guardando al empleado usando el metodo guardarEmpleado(Empleado e)
    e1 = Empleado("Juan", 30, 2500)
    e2 = Empleado("Ana", 28, 3200)
    e3 = Empleado("Luis", 45, 4000)
    arch.guardarEmpleado(e1)
    arch.guardarEmpleado(e2)
    arch.guardarEmpleado(e3)

    # b) buscando el empleado usando el meyodo de buscaEmpleado(String n)
    buscado = arch.buscaEmpleado("Ana")
    if buscado is not None:
        print("Empleado encontrado: " + str(buscado))
    else:
        print("Empleado no encontrado.")

    # c) el mayor salario del empeado usando el metodo mayorSalario(float s)
    conMayorSalario = arch.mayorSalario(3000)
    if conMayorSalario is not None:
        print("Empleado con salario mayor a 3000: " + str(conMayorSalario))
    else:
        print("No se encontró empleado con salario mayor.")
