class Empleado:
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.anios_antiguedad = anios_antiguedad

    def calcular_salario(self):
        return self.salario_base + (self.salario_base * 0.05 * self.anios_antiguedad)

    def mostrar_info(self):
        print(f"{self.nombre} {self.apellido} - Salario: Bs{self.calcular_salario():.2f}")


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Departamento: {self.departamento}, Bono gerencial: Bs{self.bono_gerencial:.2f}")


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def calcular_salario(self):
        return super().calcular_salario() + (self.horas_extras * 10)

    def mostrar_info(self):
        super().mostrar_info()
        print(f"Lenguaje: {self.lenguaje_programacion}, Horas extras: {self.horas_extras}")

gerente = Gerente("Ana", "Gonzalez", 5000, 10, "Finanzas", 1000)
desarrollador = Desarrollador("Luis", "Ramirez", 3000, 5, "Python", 20)

print("Información del Gerente:")
gerente.mostrar_info()

print("\nInformación del Desarrollador:")
desarrollador.mostrar_info()
