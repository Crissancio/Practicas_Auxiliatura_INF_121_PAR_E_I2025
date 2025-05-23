class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antiguedad):
        self.nombre = nombre 
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antiguedad = años_antiguedad
        
    def calcular_salario(self):
        return self.salario_base + (self.salario_base * 0.05 * self.años_antiguedad)
    
    def mostrar(self):
        print(f"Nombre: {self.nombre} {self.apellido}")
        print(f"Salario total: {self.calcular_salario()}")
        
    def get_nombre(self):
        return self.nombre

    def get_apellido(self):
        return self.apellido

    def get_salario_base(self):
        return self.salario_base

    def get_años_antiguedad(self):
        return self.años_antiguedad

    def set_nombre(self, nombre):
        self.nombre = nombre

    def set_apellido(self, apellido):
        self.apellido = apellido

    def set_salario_base(self, salario):
        self.salario_base = salario

    def set_años_antiguedad(self, años):
        self.años_antiguedad = años


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial
    def get_departamento(self):
        return self.departamento

    def get_bono_gerencial(self):
        return self.bono_gerencial

    def set_departamento(self, departamento):
        self.departamento = departamento

    def set_bono_gerencial(self, bono):
        self.bono_gerencial = bono
    
    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial

class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)    
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras
        
    def get_lenguaje_programacion(self):
        return self.lenguaje_programacion

    def get_horas_extras(self):
        return self.horas_extras


    def set_lenguaje_programacion(self, lenguaje):
        self.lenguaje_programacion = lenguaje

    def set_horas_extras(self, horas):
        self.horas_extras = horas


    def calcular_salario(self):
        monto_por_hora = 50 
        extra = self.horas_extras * monto_por_hora
        return super().calcular_salario() + extra

gerente1 = Gerente("Rafael", "Calderon", 5000, 4, "Marketing", 1500)
desarrollador1 = Desarrollador("Jhoana", "Calderon", 4000, 3, "Python", 12)

print("Gerente:")
gerente1.mostrar()
print("\nDesarrollador:")
desarrollador1.mostrar()


gerentes = [
    gerente1,
    Gerente("Zulema", "Gomez", 4800, 2, "Finanzas", 900),
    Gerente("Marcos", "Castro", 5100, 5, "Ventas", 1100)
]

print("\nGerentes con bono gerencial mayor a 1000:")
for g in gerentes:
    if g.get_bono_gerencial() > 1000:
        g.mostrar()


desarrolladores = [
    desarrollador1,
    Desarrollador("Nils", "Torres", 3800, 2, "Java", 8),
    Desarrollador("Diego", "Ramos", 4200, 4, "C++", 15)
]

print("\nDesarrolladores con más de 10 horas extras:")
for d in desarrolladores:
    if d.get_horas_extras() > 10:
        d.mostrar()
        
