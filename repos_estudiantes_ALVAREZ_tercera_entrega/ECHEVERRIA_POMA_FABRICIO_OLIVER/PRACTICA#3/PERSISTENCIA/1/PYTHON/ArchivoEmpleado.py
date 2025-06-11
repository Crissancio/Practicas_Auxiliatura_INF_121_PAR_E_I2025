from Empleado import Empleado

class ArchivoEmpleado:
    def __init__(self, nomA: str):
        self.nomA = nomA
    
    def crearArchivo(self):
        try:
            with open(self.nomA, 'w') as f:
                f.write("")
        except IOError as e:
            print(f"Error creando archivo: {e}")
    
    def guardarEmpleado(self, e: 'Empleado'):
        try:
            with open(self.nomA, 'a') as f:
                f.write(f"{e.nombre},{e.edad},{e.salario}\n")
        except IOError as e:
            print(f"Error guardando empleado: {e}")
    
    def buscaEmpleado(self, n: str):
        try:
            with open(self.nomA, 'r') as f:
                for line in f:
                    nombre, edad, salario = line.strip().split(',')
                    if nombre == n:
                        return Empleado(nombre, int(edad), float(salario))
        except IOError as e:
            print(f"Error buscando empleado: {e}")
        return None
    
    def mayorSalario(self, s: float):
        try:
            with open(self.nomA, 'r') as f:
                for line in f:
                    nombre, edad, salario = line.strip().split(',')
                    if float(salario) > s:
                        return Empleado(nombre, int(edad), float(salario))
        except IOError as e:
            print(f"Error buscando salario mayor: {e}")
        return None