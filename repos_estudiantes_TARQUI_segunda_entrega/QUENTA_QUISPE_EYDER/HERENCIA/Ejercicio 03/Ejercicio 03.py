class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antiguedad = años_antiguedad

    def calcular_salario(self):
        bono = self.salario_base * 0.05 * self.años_antiguedad
        return self.salario_base + bono

    def mostrar(self):
        return f"{self.nombre} {self.apellido}, Salario Base: {self.salario_base}, Años Antigüedad: {self.años_antiguedad}"


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial

    def mostrar(self):
        return super().mostrar() + f", Departamento: {self.departamento}, Bono Gerencial: {self.bono_gerencial}"


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def calcular_salario(self):
        bono_extra = self.horas_extras * 50
        return super().calcular_salario() + bono_extra

    def mostrar(self):
        return super().mostrar() + f", Lenguaje: {self.lenguaje_programacion}, Horas Extra: {self.horas_extras}"


#Datos de prueba
gerentes = [
    Gerente("Carlos", "Mamani", 4000, 10, "TI", 1200),
    Gerente("Lucía", "Torrez", 3500, 5, "Recursos Humanos", 800)
]

desarrolladores = [
    Desarrollador("Ana", "López", 3000, 4, "Python", 12),
    Desarrollador("Pedro", "Gómez", 2800, 3, "Java", 8)
]

#Mostrar salarios calculados
print("== Salarios de Gerentes ==")
for g in gerentes:
    print(g.mostrar())
    print(f"Salario calculado: {g.calcular_salario()}\n")

print("== Salarios de Desarrolladores ==")
for d in desarrolladores:
    print(d.mostrar())
    print(f"Salario calculado: {d.calcular_salario()}\n")

#c)
print("== Gerentes con bono gerencial mayor a 1000 ==")
for g in gerentes:
    if g.bono_gerencial > 1000:
        print(g.mostrar())

#d)
print("\n== Desarrolladores con más de 10 horas extra ==")
for d in desarrolladores:
    if d.horas_extras > 10:
        print(d.mostrar())
