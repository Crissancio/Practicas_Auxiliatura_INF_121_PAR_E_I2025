class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antiguedad = años_antiguedad

    def calcular_salario(self):
        bono_antiguedad = self.salario_base * 0.05 * self.años_antiguedad
        return self.salario_base + bono_antiguedad

        # Getters
    def get_nombre(self):
        return self.nombre

    def get_apellido(self):
        return self.apellido

    def get_salario_base(self):
        return self.salario_base

    def get_anios_antiguedad(self):
        return self.anios_antiguedad

    def get_nombre_completo(self):
        return f"{self.nombre} {self.apellido}"

    # Setters
    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_apellido(self, apellido):
        self.apellido = apellido

    def set_salario_base(self, salario_base):
        self.salario_base = salario_base

    def set_años_antiguedad(self, años):
        self.años_antiguedad = años
