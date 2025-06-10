
class Empleado:
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.anios_antiguedad = anios_antiguedad

    def calcular_salario(self):
        bono_antiguedad = self.salario_base * 0.05 * self.anios_antiguedad
        return self.salario_base + bono_antiguedad

    def __str__(self):
        return f"{self.nombre} {self.apellido} - Salario: {self.calcular_salario():.2f}"



class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial

    def __str__(self):
        return f"{super().__str__()} | Departamento: {self.departamento}, Bono Gerencial: {self.bono_gerencial}"


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def calcular_salario(self):
        pago_horas_extras = self.horas_extras * 20  
        return super().calcular_salario() + pago_horas_extras

    def __str__(self):
        return f"{super().__str__()} | Lenguaje: {self.lenguaje_programacion}, Horas extras: {self.horas_extras}"

# SIN GETTERS NI SETTERS
empleados = [
    Gerente("YAMIL", "VILLCA", 3000, 10, "INGENIERIA", 1200),
    Gerente("FRANCO", "QUISPE", 3200, 7, "TURISMO", 800),
    Desarrollador("JOSE", "SALINAS", 2004, 5, "Python", 12),
    Desarrollador("NOEMI", "CHINO", 2604, 3, "CSS", 9)
]

print(" Salarios calculados:")
for emp in empleados:
    print(emp)

print("\n Gerentes con bono gerencial mayor a 1000:")
for emp in empleados:
    if isinstance(emp, Gerente) and emp.bono_gerencial > 1000:
        print(emp)

print("\n Desarrolladores con más de 10 horas extras:")
for emp in empleados:
    if isinstance(emp, Desarrollador) and emp.horas_extras > 10:
        print(emp)
        print("noemi chino blanco")
