class Empleado:
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.anios_antiguedad = anios_antiguedad

    def calcular_salario(self):
        return self.salario_base + (self.salario_base * 0.05 * self.anios_antiguedad)

class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial

class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def calcular_salario(self):
        extra = self.horas_extras * 50
        return super().calcular_salario() + extra

def main():
    g1 = Gerente("Ana", "Lopez", 5000, 5, "Marketing", 1200)
    g2 = Gerente("Luis", "Mendez", 4500, 2, "Ventas", 800)

    d1 = Desarrollador("Carlos", "Perez", 4000, 3, "Java", 12)
    d2 = Desarrollador("Laura", "Ramirez", 4200, 4, "Python", 8)
    print(f"Salario de gerente {g1.nombre}: {g1.calcular_salario()}")
    print(f"Salario de gerente {g2.nombre}: {g2.calcular_salario()}")

    print(f"Salario de desarrollador {d1.nombre}: {d1.calcular_salario()}")
    print(f"Salario de desarrollador {d2.nombre}: {d2.calcular_salario()}")
    print("\nGerentes con bono gerencial mayor a 1000:")
    gerentes = [g1, g2]
    for g in gerentes:
        if g.bono_gerencial > 1000:
            print(f"{g.nombre} {g.apellido} - Bono: {g.bono_gerencial}")
    print("\nDesarrolladores con más de 10 horas extra:")
    desarrolladores = [d1, d2]
    for d in desarrolladores:
        if d.horas_extras > 10:
            print(f"{d.nombre} {d.apellido} - Horas extras: {d.horas_extras}")

if __name__ == "__main__":
    main()