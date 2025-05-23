class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antiguedad):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__salario_base = salario_base
        self.__años_antiguedad = años_antiguedad

    def get_nombre(self):
        return self.__nombre

    def get_apellido(self):
        return self.__apellido

    def get_salario_base(self):
        return self.__salario_base

    def get_años_antiguedad(self):
        return self.__años_antiguedad

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def set_apellido(self, apellido):
        self.__apellido = apellido

    def set_salario_base(self, salario_base):
        self.__salario_base = salario_base

    def set_años_antiguedad(self, años_antiguedad):
        self.__años_antiguedad = años_antiguedad

    def calcular_salario(self):
        bono = self.__salario_base * 0.05 * self.__años_antiguedad
        return self.__salario_base + bono

class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.__departamento = departamento
        self.__bono_gerencial = bono_gerencial

    def get_departamento(self):
        return self.__departamento

    def get_bono_gerencial(self):
        return self.__bono_gerencial

    def set_departamento(self, departamento):
        self.__departamento = departamento

    def set_bono_gerencial(self, bono_gerencial):
        self.__bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.__bono_gerencial

class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.__lenguaje_programacion = lenguaje_programacion
        self.__horas_extras = horas_extras

    def get_lenguaje_programacion(self):
        return self.__lenguaje_programacion

    def get_horas_extras(self):
        return self.__horas_extras

    def set_lenguaje_programacion(self, lenguaje_programacion):
        self.__lenguaje_programacion = lenguaje_programacion

    def set_horas_extras(self, horas_extras):
        self.__horas_extras = horas_extras

    def calcular_salario(self):
        monto_horas_extras = self.__horas_extras * 50 
        return super().calcular_salario() + monto_horas_extras

print("-------Salarios calculados:-------")
gerente1 = Gerente("Ana", "Lopez", 3000, 5, "Ventas", 1200)
desarrollador1 = Desarrollador("Luis", "Perez", 2500, 3, "Python", 12)

print(f"Gerente: {gerente1.get_nombre()} {gerente1.get_apellido()}, Salario: {gerente1.calcular_salario()}")
print(f"Desarrollador: {desarrollador1.get_nombre()} {desarrollador1.get_apellido()}, Salario: {desarrollador1.calcular_salario()}")

print("-------Gerentes con bono gerencial mayor a 1000:-------")
gerente2 = Gerente("Carlos", "Gomez", 3200, 2, "RRHH", 900)
gerentes = [gerente1, gerente2]
for g in gerentes:
    if g.get_bono_gerencial() > 1000:
        print(f"{g.get_nombre()} {g.get_apellido()} - Bono: {g.get_bono_gerencial()}")

print("-------Desarrolladores con más de 10 horas extras:-------")
desarrollador2 = Desarrollador("Maria", "Suarez", 2600, 4, "Java", 8)
desarrolladores = [desarrollador1, desarrollador2]
for d in desarrolladores:
    if d.get_horas_extras() > 10:
        print(f"{d.get_nombre()} {d.get_apellido()} - Horas extras: {d.get_horas_extras()}")