class Empleado:
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad):
        self._nombre = nombre
        self._apellido = apellido
        self._salario_base = salario_base
        self._anios_antiguedad = anios_antiguedad
    def get_nombre(self):
        return self._nombre
    def get_apellido(self):
        return self._apellido
    def get_salario_base(self):
        return self._salario_base
    def get_anios_antiguedad(self):
        return self._anios_antiguedad
    def set_nombre(self, nombre):
        self._nombre = nombre
    def set_apellido(self, apellido):
        self._apellido = apellido
    def set_salario_base(self, salario):
        self._salario_base = salario
    def set_anios_antiguedad(self, anios):
        self._anios_antiguedad = anios
    def calcular_salario(self):
        bono_antiguedad = self._salario_base * 0.05 * self._anios_antiguedad
        return self._salario_base + bono_antiguedad
    def mostrar_info(self):
        print(f"{self._nombre} {self._apellido} - Salario base: {self._salario_base}, Antigüedad: {self._anios_antiguedad}")
class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self._departamento = departamento
        self._bono_gerencial = bono_gerencial
    def get_departamento(self):
        return self._departamento
    def get_bono_gerencial(self):
        return self._bono_gerencial
    def calcular_salario(self):
        return super().calcular_salario() + self._bono_gerencial
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Departamento: {self._departamento}, Bono gerencial: {self._bono_gerencial}, Salario total: {self.calcular_salario()}")
class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self._lenguaje_programacion = lenguaje_programacion
        self._horas_extras = horas_extras
    def get_lenguaje_programacion(self):
        return self._lenguaje_programacion
    def get_horas_extras(self):
        return self._horas_extras
    def calcular_salario(self):
        salario_extra = self._horas_extras * 50
        return super().calcular_salario() + salario_extra
    def mostrar_info(self):
        super().mostrar_info()
        print(f"Lenguaje: {self._lenguaje_programacion}, Horas extras: {self._horas_extras}, Salario total: {self.calcular_salario()}")
gerente1 = Gerente("Carlos", "Mamani", 5000, 5, "TI", 1500)
gerente2 = Gerente("Ana", "López", 4500, 4, "Recursos Humanos", 800)
dev1 = Desarrollador("Luis", "Fernández", 4000, 3, "Python", 12)
dev2 = Desarrollador("María", "Gonzales", 4200, 2, "Java", 8)
print("GERENTES:")
gerente1.mostrar_info()
gerente2.mostrar_info()
print("\nDESARROLLADORES:")
dev1.mostrar_info()
dev2.mostrar_info()
print("\nGerentes con bono mayor a 1000:")
for g in [gerente1, gerente2]:
    if g.get_bono_gerencial() > 1000:
        g.mostrar_info()
print("\nDesarrolladores con más de 10 horas extras:")
for d in [dev1, dev2]:
    if d.get_horas_extras() > 10:
        d.mostrar_info()
