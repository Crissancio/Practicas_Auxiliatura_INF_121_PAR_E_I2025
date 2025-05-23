
class Empleado:
    def __init__(self, nombre: str, apellido: str, salario_base: float, anios_antiguedad: int):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.anios_antiguedad = anios_antiguedad

    def calcular_salario(self):
        return self.salario_base + (self.salario_base * 0.05 * self.anios_antiguedad)

    def mostrar_info(self):
        print(f"- Nombre: {self.nombre}\n- Apellido: {self.apellido}\n- Salario Base: {self.salario_base:.2f}\n- Años de Antigüedad: {self.anios_antiguedad}")


class Gerente(Empleado):
    def __init__(self, nombre: str, apellido: str, salario_base: float, anios_antiguedad: int, departamento: str, bono_gerencial: float):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial

    def mostrar_info(self):
        print("\nGerente:")
        print(f"- Departamento: {self.departamento}\n- Bono Gerencial: {self.bono_gerencial}")
        super().mostrar_info()

class Desarrollador(Empleado):
    def __init__(self, nombre: str, apellido: str, salario_base: float, anios_antiguedad: int, lenguaje_programacion: str, horas_extras: int):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def calcular_salario(self):
        return super().calcular_salario() + (self.horas_extras * 20.0)

    def mostrar_info(self):
        print("\nDesarrollador:")
        print(f"- Lenguaje de Programación: {self.lenguaje_programacion}\n- Horas Extras: {self.horas_extras}")
        super().mostrar_info()


if __name__ == "__main__":
    print("--------------------- GERENTES ----------------------------")
    gerentes = [
        Gerente("Juan", "Sánchez", 5000, 20, "Ventas", 2000),
        Gerente("Maria", "Carmen", 4500, 15, "Constructora", 2344)
    ]
    
    for gerente in gerentes:
        gerente.mostrar_info()

    print("\n----------------------------------- DESARROLLADORES ------------------")
    desarrolladores = [
        Desarrollador("Ramiro", "Perez", 3000, 10, "Python", 23),
        Desarrollador("Hank", "Power", 3200, 40, "Java", 24)
    ]

    for desarrollador in desarrolladores:
        desarrollador.mostrar_info()

    print("\n--------- GERENTES CON BONO MAYOR A 1000 ------------")
    for gerente in gerentes:
        if gerente.bono_gerencial > 1000:
            gerente.mostrar_info()

    print("\n------------------- DESARROLLADORES QUE TRABAJAN MÁS DE 10 HORAS EXTRAS --------------")
    for desarrollador in desarrolladores:
        if desarrollador.horas_extras > 10:
            desarrollador.mostrar_info()
