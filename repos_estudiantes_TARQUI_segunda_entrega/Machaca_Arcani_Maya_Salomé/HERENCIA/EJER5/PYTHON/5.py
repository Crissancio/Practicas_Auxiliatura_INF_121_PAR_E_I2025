class Empleado:
    def __init__(self, nombre: str, apellido: str, salario_base: float, años_antiguedad: int):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__salario_base = salario_base
        self.__años_antiguedad = años_antiguedad

    def calcular_salario(self) -> float:
        bono = self.__salario_base * 0.05 * self.__años_antiguedad
        return self.__salario_base + bono

    def mostrar(self):
        print(f"{self.__nombre} {self.__apellido}")
        print(f"Salario base: {self.__salario_base}")
        print(f"Años de antigüedad: {self.__años_antiguedad}")

    def get_apellido(self):
        return self.__apellido

    def get_nombre(self):
        return self.__nombre

    def get_salario_base(self):
        return self.__salario_base


class Gerente(Empleado):
    def __init__(self, nombre: str, apellido: str, salario_base: float, años_antiguedad: int,
                 departamento: str, bono_gerencial: float):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.__departamento = departamento
        self.__bono_gerencial = bono_gerencial

    def calcular_salario(self) -> float:
        return super().calcular_salario() + self.__bono_gerencial

    def mostrar(self):
        super().mostrar()
        print(f"Departamento: {self.__departamento}")
        print(f"Bono gerencial: {self.__bono_gerencial}")

    def get_bono_gerencial(self):
        return self.__bono_gerencial


class Desarrollador(Empleado):
    def __init__(self, nombre: str, apellido: str, salario_base: float, años_antiguedad: int,
                 lenguaje_programacion: str, horas_extras: int):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.__lenguaje_programacion = lenguaje_programacion
        self.__horas_extras = horas_extras

    def calcular_salario(self) -> float:
        pago_extra = self.__horas_extras * 50 
        return super().calcular_salario() + pago_extra

    def mostrar(self):
        super().mostrar()
        print(f"Lenguaje: {self.__lenguaje_programacion}")
        print(f"Horas extras: {self.__horas_extras}")

    def get_horas_extras(self):
        return self.__horas_extras


gerentes = [
    Gerente("Laura", "Pérez", 3000, 10, "Finanzas", 1200),
    Gerente("Mario", "Suárez", 2500, 5, "Ventas", 800)
]

desarrolladores = [
    Desarrollador("Ana", "López", 2000, 3, "Python", 15),
    Desarrollador("Luis", "Gómez", 2200, 4, "Java", 8)
]

# b) 
print("Salarios de gerentes:")
for g in gerentes:
    g.mostrar()
    print(f"Salario total: {g.calcular_salario()}\n")

print("Salarios de desarrolladores:")
for d in desarrolladores:
    d.mostrar()
    print(f"Salario total: {d.calcular_salario()}\n")

# c) 
print("Gerentes con bono gerencial > 1000:")
for g in gerentes:
    if g.get_bono_gerencial() > 1000:
        g.mostrar()
        print()

# d)
print("Desarrolladores con más de 10 horas extras:")
for d in desarrolladores:
    if d.get_horas_extras() > 10:
        d.mostrar()
        print()
