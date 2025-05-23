
# a) Clases con constructores, getters, setters, y método calcular_salario()
class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antigüedad):
        self._nombre = nombre
        self._apellido = apellido
        self._salario_base = salario_base
        self._años_antigüedad = años_antigüedad

    def get_nombre(self):
        return self._nombre

    def get_apellido(self):
        return self._apellido

    def get_salario_base(self):
        return self._salario_base

    def get_años_antigüedad(self):
        return self._años_antigüedad

    def set_salario_base(self, salario):
        self._salario_base = salario

    def set_años_antigüedad(self, años):
        self._años_antigüedad = años

    def calcular_salario(self):
        bono = self._salario_base * 0.05 * self._años_antigüedad
        return self._salario_base + bono


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self._departamento = departamento
        self._bono_gerencial = bono_gerencial

    def get_bono_gerencial(self):
        return self._bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self._bono_gerencial


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self._lenguaje_programacion = lenguaje_programacion
        self._horas_extras = horas_extras

    def get_horas_extras(self):
        return self._horas_extras

    def calcular_salario(self):
        pago_extra = self._horas_extras * 50  # Suponemos Bs.50 por hora extra
        return super().calcular_salario() + pago_extra

# b) Crear instancias y mostrar salario calculado
gerente1 = Gerente("Renzo", "Espinoza", 5000, 5, "TI", 1500)
desarrollador1 = Desarrollador("Sofía", "López", 4000, 3, "Python", 12)

print("Salario del gerente:", gerente1.calcular_salario())
print("Salario del desarrollador:", desarrollador1.calcular_salario())

#  c) Mostrar gerentes con bono gerencial mayor a 1000
gerentes = [
    gerente1,
    Gerente("Luis", "Fernandez", 5500, 4, "Contabilidad", 800),
    Gerente("María", "Cruz", 6000, 6, "Ventas", 1200)
]

print("\nGerentes con bono gerencial mayor a 1000:")
for g in gerentes:
    if g.get_bono_gerencial() > 1000:
        print(f"{g.get_nombre()} {g.get_apellido()} - Bono: {g.get_bono_gerencial()}")
        
#  d) Mostrar desarrolladores con más de 10 horas extras

desarrolladores = [
    desarrollador1,
    Desarrollador("Jorge", "Vega", 4200, 2, "Java", 8),
    Desarrollador("Elena", "Ríos", 4500, 4, "C++", 15)
]

print("\nDesarrolladores con más de 10 horas extras:")
for d in desarrolladores:
    if d.get_horas_extras() > 10:
        print(f"{d.get_nombre()} {d.get_apellido()} - Horas extras: {d.get_horas_extras()}")