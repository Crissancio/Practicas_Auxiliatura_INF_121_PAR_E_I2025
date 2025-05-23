# 5. Definir las siguientes clases:
# Empleado<nombre, apellido, salario_base, años_antigüedad>
# Métodos: calcular_salario() (retorna el salario base más un bono del 5% por cada año de antigüedad)
#
# Gerente (hereda de Empleado)<departamento, bono_gerencial>
# Métodos: calcular_salario() (debe sumar el bono gerencial al salario calculado en la clase base)
#
# Desarrollador (hereda de Empleado) <lenguaje_programación, horas_extras>
# Métodos: calcular_salario() (debe sumar un monto adicional por horas extras al salario calculado en la clase base)
#
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea instancias de Gerente y Desarrollador y muestra su salario calculado.
# c) Muestra todos los gerentes que tienen un bono gerencial mayor a 1000.
# d) Muestra todos los desarrolladores que trabajan más de 10 horas extras.

class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antiguedad):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__salario_base = salario_base
        self.__años_antiguedad = años_antiguedad

    def calcular_salario(self):
        return self.__salario_base + (self.__salario_base * 0.05 * self.__años_antiguedad)

    def get_nombre(self):
        return self.__nombre

    def get_apellido(self):
        return self.__apellido

    def get_salario_base(self):
        return self.__salario_base

    def get_años_antiguedad(self):
        return self.__años_antiguedad

    def inciso_b(self, empleados):
        print("Inciso b) Salario calculado de cada empleado:")
        for e in empleados:
            print(f"{e.get_nombre()} {e.get_apellido()} - Salario: {e.calcular_salario()}")

    def inciso_c(self, empleados):
        print("Inciso c) Gerentes con bono gerencial mayor a 1000:")
        for e in empleados:
            if isinstance(e, Gerente) and e.get_bono_gerencial() > 1000:
                print(f"{e.get_nombre()} {e.get_apellido()} - Bono: {e.get_bono_gerencial()}")

    def inciso_d(self, empleados):
        print("Inciso d) Desarrolladores con más de 10 horas extras:")
        for e in empleados:
            if isinstance(e, Desarrollador) and e.get_horas_extras() > 10:
                print(f"{e.get_nombre()} {e.get_apellido()} - Horas extras: {e.get_horas_extras()}")


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.__departamento = departamento
        self.__bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.__bono_gerencial

    def get_bono_gerencial(self):
        return self.__bono_gerencial


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.__lenguaje_programacion = lenguaje_programacion
        self.__horas_extras = horas_extras

    def calcular_salario(self):
        return super().calcular_salario() + (self.__horas_extras * 50)

    def get_horas_extras(self):
        return self.__horas_extras


empleados = [
    Gerente("Carlos", "Ramos", 3000, 5, "Ventas", 1200),
    Gerente("Lucia", "Salas", 4000, 6, "Marketing", 900),
    Desarrollador("Ana", "Rojas", 2500, 4, "Python", 12),
    Desarrollador("Pedro", "Gomez", 2700, 2, "Java", 8)
]

empleado_aux = Empleado("", "", 0, 0)
empleado_aux.inciso_b(empleados)
empleado_aux.inciso_c(empleados)
empleado_aux.inciso_d(empleados)
