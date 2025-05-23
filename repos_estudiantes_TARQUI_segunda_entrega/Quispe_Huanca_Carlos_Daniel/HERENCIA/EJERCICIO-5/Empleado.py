class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antigüedad):
        self._nombre = nombre
        self._apellido = apellido
        self._salario_base = salario_base
        self._años_antigüedad = años_antigüedad

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, value):
        self._nombre = value

    @property
    def apellido(self):
        return self._apellido

    @apellido.setter
    def apellido(self, value):
        self._apellido = value

    @property
    def salario_base(self):
        return self._salario_base

    @salario_base.setter
    def salario_base(self, value):
        self._salario_base = value

    @property
    def años_antigüedad(self):
        return self._años_antigüedad

    @años_antigüedad.setter
    def años_antigüedad(self, value):
        self._años_antigüedad = value

    def calcular_salario(self):
        bono_antigüedad = self._salario_base * 0.05 * self._años_antigüedad
        return self._salario_base + bono_antigüedad

    def __str__(self):
        return f"{self._nombre} {self._apellido}"


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self._departamento = departamento
        self._bono_gerencial = bono_gerencial

    @property
    def departamento(self):
        return self._departamento

    @departamento.setter
    def departamento(self, value):
        self._departamento = value

    @property
    def bono_gerencial(self):
        return self._bono_gerencial

    @bono_gerencial.setter
    def bono_gerencial(self, value):
        self._bono_gerencial = value

    def calcular_salario(self):
        salario_base = super().calcular_salario()
        return salario_base + self._bono_gerencial

    def __str__(self):
        return f"Gerente: {super().__str__()} - Depto: {self._departamento}"


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, lenguaje_programación, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self._lenguaje_programación = lenguaje_programación
        self._horas_extras = horas_extras

    @property
    def lenguaje_programación(self):
        return self._lenguaje_programación

    @lenguaje_programación.setter
    def lenguaje_programación(self, value):
        self._lenguaje_programación = value

    @property
    def horas_extras(self):
        return self._horas_extras

    @horas_extras.setter
    def horas_extras(self, value):
        self._horas_extras = value

    def calcular_salario(self):
        salario_base = super().calcular_salario()
        return salario_base + (self._horas_extras * 50)

    def __str__(self):
        return f"Desarrollador: {super().__str__()} - Lenguaje: {self._lenguaje_programación}"

gerente1 = Gerente("Juan", "Pérez", 5000, 5, "Ventas", 1200)
gerente2 = Gerente("María", "Gómez", 6000, 8, "TI", 800)
desarrollador1 = Desarrollador("Carlos", "López", 4000, 3, "Python", 15)
desarrollador2 = Desarrollador("Ana", "Martínez", 4500, 4, "Java", 8)

print("Salarios calculados:")
print(f"{gerente1}: ${gerente1.calcular_salario():.2f}")
print(f"{gerente2}: ${gerente2.calcular_salario():.2f}")
print(f"{desarrollador1}: ${desarrollador1.calcular_salario():.2f}")
print(f"{desarrollador2}: ${desarrollador2.calcular_salario():.2f}")

print("\nGerentes con bono gerencial mayor a 1000:")
gerentes = [gerente1, gerente2]
for gerente in gerentes:
    if gerente.bono_gerencial > 1000:
        print(f"{gerente} - Bono: ${gerente.bono_gerencial}")

print("\nDesarrolladores con más de 10 horas extras:")
desarrolladores = [desarrollador1, desarrollador2]
for dev in desarrolladores:
    if dev.horas_extras > 10:
        print(f"{dev} - Horas extras: {dev.horas_extras}")