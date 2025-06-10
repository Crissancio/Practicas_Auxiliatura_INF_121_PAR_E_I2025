import pickle
import os

class Empleado:
    def __init__(self, nombre, sueldo):
        self.nombre = nombre
        self.sueldo = sueldo
    
    def getNombre(self):
        return self.nombre
    
    def getSueldo(self):
        return self.sueldo
    
    def setNombre(self, nombre):
        self.nombre = nombre
    
    def setSueldo(self, sueldo):
        self.sueldo = sueldo

class Persistencia:
    ARCHIVO = "empleados.dat"
    
    @classmethod
    def guardarEmpleado(cls, e):
        try:
            empleados = cls.cargarEmpleados()
            if empleados is None:
                empleados = []
            
            empleados.append(e)
            
            with open(cls.ARCHIVO, 'wb') as f:
                pickle.dump(empleados, f)
            return True
        except Exception as ex:
            print(f"Error al guardar empleado: {str(ex)}")
            return False
    
    @classmethod
    def buscarEmpleado(cls, n):
        try:
            empleados = cls.cargarEmpleados()
            if empleados is None:
                return None
            
            for emp in empleados:
                if emp.getNombre() == n:
                    return emp
            return None
        except Exception as ex:
            print(f"Error al buscar empleado: {str(ex)}")
            return None
    
    @classmethod
    def mayorSalario(cls, sueldo):
        try:
            empleados = cls.cargarEmpleados()
            if empleados is None:
                return None
            
            mayor = None
            for emp in empleados:
                if emp.getSueldo() > sueldo:
                    if mayor is None or emp.getSueldo() > mayor.getSueldo():
                        mayor = emp
            return mayor
        except Exception as ex:
            print(f"Error al buscar empleado con mayor salario: {str(ex)}")
            return None
    
    @classmethod
    def cargarEmpleados(cls):
        try:
            if not os.path.exists(cls.ARCHIVO):
                return []
            
            with open(cls.ARCHIVO, 'rb') as f:
                return pickle.load(f)
        except Exception as ex:
            print(f"Error al cargar empleados: {str(ex)}")
            return None

# Ejemplo
if __name__ == "__main__":
    # Crear empleados
    emp1 = Empleado("Juan Pérez", 2500.50)
    emp2 = Empleado("María Gómez", 3200.75)
    emp3 = Empleado("Carlos Ruiz", 1800.25)
    
    # Guardar empleados
    if Persistencia.guardarEmpleado(emp1):
        print(f"Empleado guardado: {emp1.getNombre()}")
    if Persistencia.guardarEmpleado(emp2):
        print(f"Empleado guardado: {emp2.getNombre()}")
    if Persistencia.guardarEmpleado(emp3):
        print(f"Empleado guardado: {emp3.getNombre()}")
    
    # Buscar empleado
    encontrado = Persistencia.buscarEmpleado("María Gómez")
    if encontrado:
        print(f"Empleado encontrado: {encontrado.getNombre()} - Sueldo: {encontrado.getSueldo()}")
    
    # Buscar mayor salario
    mayor = Persistencia.mayorSalario(2000.0)
    if mayor:
        print(f"Empleado con mayor salario: {mayor.getNombre()} - Sueldo: {mayor.getSueldo()}")