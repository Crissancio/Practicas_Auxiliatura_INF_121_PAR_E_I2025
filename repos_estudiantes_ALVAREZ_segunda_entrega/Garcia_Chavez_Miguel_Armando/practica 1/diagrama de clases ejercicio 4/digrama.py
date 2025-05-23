from abc import ABC, abstractmethod

class Empleado(ABC):
    def __init__(self, nombre, apellido):
        self.nombre = nombre
        self.apellido = apellido
    
    @abstractmethod
    def getSalario(self):
        pass

class TFijo(Empleado):
    def __init__(self, nombre, apellido, sueldo):
        super().__init__(nombre, apellido)
        self.sueldo = sueldo
    
    def getSalario(self):
        return self.sueldo

class TComisionista(Empleado):
    def __init__(self, nombre, apellido, sueldo_base, comision):
        super().__init__(nombre, apellido)
        self.sueldo_base = sueldo_base
        self.comision = comision
    
    def getSalario(self):
        return self.sueldo_base + self.comision

if __name__ == "__main__":
    # Crear empleados
    empleado1 = TFijo("Pablo", "Taborga", 5000)
    empleado2 = TFijo("Gabriela ", "Gamboa", 6000)
    empleado3 = TComisionista("Isabel ", "Garcia", 3000, 1500)
    empleado4 = TComisionista("Kratos", "Esparta", 3500, 1200)

    print(f"Salario de {empleado1.nombre}: {empleado1.getSalario()}")
    print(f"Salario de {empleado3.nombre}: {empleado3.getSalario()}")

    empleados_fijos = [empleado1, empleado2]
    mayor_salario = max(empleados_fijos, key=lambda x: x.getSalario())
    print(f"\nEmpleado fijo con mayor salario: {mayor_salario.nombre} {mayor_salario.apellido} - Salario: {mayor_salario.getSalario()}")

    empleados_comision = [empleado3, empleado4]
    menor_salario = min(empleados_comision, key=lambda x: x.getSalario())
    print(f"Empleado comisionista con menor salario: {menor_salario.nombre} {menor_salario.apellido} - Salario: {menor_salario.getSalario()}")