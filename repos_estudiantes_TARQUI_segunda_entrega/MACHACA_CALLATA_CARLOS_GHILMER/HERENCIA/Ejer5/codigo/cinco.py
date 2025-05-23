class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antiguedad = años_antiguedad

    def get_nombre(self):
        return self.nombre

    def get_apellido(self):
        return self.apellido

    def get_salario_base(self):
        return self.salario_base

    def get_años_antiguedad(self):
        return self.años_antiguedad

    def calcular_salario(self):
        salario = self.salario_base
        if self.años_antiguedad > 5:
            salario += self.salario_base * 0.05
        return salario


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, departamento, bonus):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.departamento = departamento
        self.bonus = bonus

    def get_departamento(self):
        return self.departamento

    def get_bonus(self):
        return self.bonus

    def calcular_salario(self):
        salario = super().calcular_salario()
        if self.get_años_antiguedad() > 5:
            salario += self.get_salario_base() * 0.10
        return salario + self.bonus

    def mostrar_bono(self):
        if self.get_bonus() > 1000:
            print(f"Gerente {self.get_nombre()} {self.get_apellido()} tiene un bono de: {self.get_bonus()}")
        else:
            print(f"Gerente {self.get_nombre()} {self.get_apellido()} no tiene bono")


class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def get_lenguaje_programacion(self):
        return self.lenguaje_programacion

    def get_horas_extras(self):
        return self.horas_extras

    def calcular_salario(self):
        salario = super().calcular_salario()
        if self.get_años_antiguedad() > 5:
            salario += self.get_salario_base()
        return salario + (self.horas_extras * 20)

    def mostrar_horas_extras(self):
        if self.get_horas_extras() > 10:
            print(f"Desarrollador {self.get_nombre()} {self.get_apellido()} tiene horas extras: {self.get_horas_extras()}")
        else:
            print(f"Desarrollador {self.get_nombre()} {self.get_apellido()} no tiene horas extras")


empleado1 = Empleado("Carlos", "Machaca", 3000, 6)
desarrollador1 = Desarrollador("Ana", "Mantilla", 3500, 4, "Java", 11)
gerente1 = Gerente("Luis", "Cornejo", 5000, 7, "La Paz", 2000)

print(f"El Salario de {empleado1.get_nombre()} {empleado1.get_apellido()}: {empleado1.calcular_salario()}")
print(f"{gerente1.get_nombre()} {gerente1.get_apellido()} es de {gerente1.get_departamento()} y su salario es de: {gerente1.calcular_salario()}")
gerente1.mostrar_bono()
print(f"Su lenguaje de Programación de {desarrollador1.get_nombre()} {desarrollador1.get_apellido()} es {desarrollador1.get_lenguaje_programacion()} y su salario es de: {desarrollador1.calcular_salario()}")
desarrollador1.mostrar_horas_extras()