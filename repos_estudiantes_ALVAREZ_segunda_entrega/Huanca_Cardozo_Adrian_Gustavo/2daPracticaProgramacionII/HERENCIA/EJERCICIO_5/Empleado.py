class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antigüedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antigüedad = años_antigüedad

    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_apellido(self):
        return self.apellido

    def set_apellido(self, apellido):
        self.apellido = apellido

    def get_salario_base(self):
        return self.salario_base

    def set_salario_base(self, salario_base):
        self.salario_base = salario_base

    def get_años_antigüedad(self):
        return self.años_antigüedad

    def set_años_antigüedad(self, años):
        self.años_antigüedad = años

    def calcular_salario(self):
        bono_antiguedad = self.salario_base * 0.05 * self.años_antigüedad
        return self.salario_base + bono_antiguedad


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def get_bono_gerencial(self):
        return self.bono_gerencial

    def set_bono_gerencial(self, bono):
        self.bono_gerencial = bono

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def get_horas_extras(self):
        return self.horas_extras

    def set_horas_extras(self, horas):
        self.horas_extras = horas

    def calcular_salario(self):
        pago_por_hora_extra = 50
        adicional_horas_extras = self.horas_extras * pago_por_hora_extra
        return super().calcular_salario() + adicional_horas_extras


gerente1 = Gerente("Carlos", "Ramírez", 5000, 5, "Ventas", 1200)
gerente2 = Gerente("Ana", "López", 4800, 3, "Marketing", 800)

desarrollador1 = Desarrollador("Luis", "González", 4000, 4, "Python", 12)
desarrollador2 = Desarrollador("María", "Pérez", 4200, 2, "Java", 8)

print(f"Salario de {gerente1.get_nombre()}: {gerente1.calcular_salario()}")
print(f"Salario de {desarrollador1.get_nombre()}: {desarrollador1.calcular_salario()}")

gerentes = [gerente1, gerente2]
print("\nGerentes con bono mayor a 1000:")
for g in gerentes:
    if g.get_bono_gerencial() > 1000:
        print(f"{g.get_nombre()} {g.get_apellido()} - Bono: {g.get_bono_gerencial()}")

desarrolladores = [desarrollador1, desarrollador2]
print("\nDesarrolladores con más de 10 horas extras:")
for d in desarrolladores:
    if d.get_horas_extras() > 10:
        print(f"{d.get_nombre()} {d.get_apellido()} - Horas extras: {d.get_horas_extras()}")
