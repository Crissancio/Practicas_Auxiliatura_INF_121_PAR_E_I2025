from typing import List 

class Empleado:
    def __init__(self, nombre: str, apellido: str, salario_base: float, años_antiguedad: int):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antiguedad = años_antiguedad

    def calcularSalario(self) -> float:
        porcentaje = self.salario_base * 0.05
        return self.salario_base + (porcentaje * self.años_antiguedad)

    def mostrarInformacion(self):
        print("Nombre:", self.nombre)
        print("Apellido:", self.apellido)
        print("Salario base:", self.salario_base)
        print("Años de antiguedad:", self.años_antiguedad)


class Gerente(Empleado):
    def __init__(self, nombre: str, apellido: str, salario_base: float, años_antiguedad: int, departamento: str, bono_gerencial: float):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcularSalario(self) -> float:
        return super().calcularSalario() + self.bono_gerencial

    def mostrarInformacion(self):
        super().mostrarInformacion()
        print("Departamento:", self.departamento)
        print("Bono gerencial:", self.bono_gerencial)

    def getBonoGerencial(self) -> float:
        return self.bono_gerencial

    def bonoMayorA1000(self) -> bool:
        return self.bono_gerencial > 1000


class Desarrollador(Empleado):
    def __init__(self, nombre: str, apellido: str, salario_base: float, años_antiguedad: int, lenguaje_programacion: str, horas_extras: float):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def calcularSalario(self) -> float:
        return super().calcularSalario() + (self.horas_extras * 20)

    def mostrarInformacion(self):
        super().mostrarInformacion()
        print("Lenguaje de programacion:", self.lenguaje_programacion)
        print("Horas extras:", self.horas_extras)

    def horasExtrasMayorA10(self) -> bool:
        return self.horas_extras > 10


#################################################################################

def gerentesConBonoMayorA1000(empleados: List[Empleado]):
    for empleado in empleados:
        if isinstance(empleado, Gerente):
            if empleado.bonoMayorA1000():
                empleado.mostrarInformacion()


def desarroladormas10horasExtra(empleados: List[Empleado]):
    for empleado in empleados:
        if isinstance(empleado, Desarrollador):
            if empleado.horasExtrasMayorA10():
                empleado.mostrarInformacion()


#################################################################################

if __name__ == "__main__":
    gerente = Gerente("Juan", "Perez", 3000.0, 5, "Ventas", 500.0) 
    gerente2 = Gerente("Alex", "Nina", 1000.0, 3, "Despidos", 1500.0) 
    desarrollador = Desarrollador("Maria", "Gomez", 1500.0, 2, "Java", 10.0) 
    desarrollador2 = Desarrollador("Jose", "Limachi", 9000.0, 10, "Rust", 24.0) 

    print("Salario del gerente:", gerente.calcularSalario())
    print("Salario del desarrollador:", desarrollador.calcularSalario())
    print("")

    empleados: List[Empleado] = [gerente, gerente2, desarrollador, desarrollador2] 

    print("Gerentes con bono mayor a 1000:")
    gerentesConBonoMayorA1000(empleados)
    print("")

    print("Desarrolladores con mas de 10 horas extras:")
    desarroladormas10horasExtra(empleados)