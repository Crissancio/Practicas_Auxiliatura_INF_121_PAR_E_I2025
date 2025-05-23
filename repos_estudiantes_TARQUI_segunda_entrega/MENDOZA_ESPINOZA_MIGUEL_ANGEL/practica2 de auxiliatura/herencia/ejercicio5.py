class Empleado:
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.anios_antiguedad = anios_antiguedad
    def get_nombre_completo(self):
        return f"{self.nombre} {self.apellido}"
    def calcular_salario(self):
        bono = self.salario_base * 0.05 * self.anios_antiguedad
        return self.salario_base + bono
    def mostrar(self):
        print(f"{self.get_nombre_completo()} - Salario Base: {self.salario_base}, Antigüedad: {self.anios_antiguedad} años")
class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial
    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial
    def mostrar(self):
        super().mostrar()
        print(f"Departamento: {self.departamento}, Bono Gerencial: {self.bono_gerencial}, Salario Total: {self.calcular_salario()}")
class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras
    def calcular_salario(self):
        pago_extra = self.horas_extras * 50  # suponiendo $50 por hora extra
        return super().calcular_salario() + pago_extra
    def mostrar(self):
        super().mostrar()
        print(f"Lenguaje: {self.lenguaje_programacion}, Horas Extras: {self.horas_extras}, Salario Total: {self.calcular_salario()}")
gerentes = [
    Gerente("Laura", "Pérez", 4000, 5, "Finanzas", 1200),
    Gerente("Carlos", "Sánchez", 4500, 3, "Marketing", 900)
]
desarrolladores = [
    Desarrollador("Ana", "Gómez", 3000, 2, "Python", 12),
    Desarrollador("Luis", "Torres", 3200, 4, "Java", 8)
]
print("--- Salario Gerentes ---")
for g in gerentes:
    g.mostrar()
    print()
print("--- Salario Desarrolladores ---")
for d in desarrolladores:
    d.mostrar()
    print()
print("--- Gerentes con bono gerencial > 1000 ---")
for g in gerentes:
    if g.bono_gerencial > 1000:
        g.mostrar()
        print()
print("--- Desarrolladores con más de 10 horas extras ---")
for d in desarrolladores:
    if d.horas_extras > 10:
        d.mostrar()
        print()