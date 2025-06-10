class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antigüedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antigüedad = años_antigüedad

    def calcular_salario(self):
        return self.salario_base * (1 + 0.05 * self.años_antigüedad)

    # Getters
    def get_salario_base(self):
        return self.salario_base

    def get_años_antigüedad(self):
        return self.años_antigüedad

    # Setters
    def set_salario_base(self, salario_base):
        self.salario_base = salario_base

    def set_años_antigüedad(self, años_antigüedad):
        self.años_antigüedad = años_antigüedad


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial

    # Getter
    def get_bono_gerencial(self):
        return self.bono_gerencial

    # Setter
    def set_bono_gerencial(self, bono_gerencial):
        self.bono_gerencial = bono_gerencial


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, lenguaje_programación, horas_extras, tarifa_hora_extra=50):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.lenguaje_programación = lenguaje_programación
        self.horas_extras = horas_extras
        self.tarifa_hora_extra = tarifa_hora_extra

    def calcular_salario(self):
        return super().calcular_salario() + (self.horas_extras * self.tarifa_hora_extra)

    # Getter
    def get_horas_extras(self):
        return self.horas_extras

    # Setter
    def set_horas_extras(self, horas_extras):
        self.horas_extras = horas_extras


# b) Crear instancias y mostrar salario calculado
gerente1 = Gerente("Ana", "Perez", 5000, 5, "Ventas", 1500)
desarrollador1 = Desarrollador("Carlos", "Lopez", 4000, 3, "Python", 12)

print(f"Salario de {gerente1.nombre} {gerente1.apellido}: ${gerente1.calcular_salario():.2f}")
print(f"Salario de {desarrollador1.nombre} {desarrollador1.apellido}: ${desarrollador1.calcular_salario():.2f}")

# c) Mostrar gerentes con bono gerencial mayor a 1000
gerentes = [
    Gerente("Ana", "Perez", 5000, 5, "Ventas", 1500),
    Gerente("Luis", "Gonzales", 6000, 8, "Marketing", 900),
    Gerente("Sofia", "Vargas", 5500, 6, "Finanzas", 1200),
]

print("Gerentes con bono gerencial mayor a 1000:")
for gerente in gerentes:
    if gerente.get_bono_gerencial() > 1000:
        print(f"{gerente.nombre} {gerente.apellido}, Bono: ${gerente.get_bono_gerencial()}")

# d) Mostrar desarrolladores con más de 10 horas extras
desarrolladores = [
    Desarrollador("Carlos", "Lopez", 4000, 3, "Python", 12),
    Desarrollador("Elena", "Ruiz", 4500, 4, "Java", 8),
    Desarrollador("Pedro", "Diaz", 3800, 2, "JavaScript", 15),
]

print("Desarrolladores con más de 10 horas extras:")
for desarrollador in desarrolladores:
    if desarrollador.get_horas_extras() > 10:
        print(f"{desarrollador.nombre} {desarrollador.apellido}, Horas Extras: {desarrollador.get_horas_extras()}")