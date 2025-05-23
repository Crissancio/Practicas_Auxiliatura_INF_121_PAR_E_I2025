class Empleado:
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.anios_antiguedad = anios_antiguedad

    def calcular_salario(self):
        bono = self.salario_base * 0.05 * self.anios_antiguedad
        return self.salario_base + bono

    def mostrar(self):
        print(f"{self.nombre} {self.apellido} - Salario: {self.calcular_salario()}")

class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial

    def mostrar(self):
        super().mostrar()
        print(f"Departamento: {self.departamento} - Bono Gerencial: {self.bono_gerencial}")

class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, anios_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, anios_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def calcular_salario(self):
        pago_extra = self.horas_extras * 60 
        return super().calcular_salario() + pago_extra

    def mostrar(self):
        super().mostrar()
        print(f"Lenguaje: {self.lenguaje_programacion} - Horas Extras: {self.horas_extras}")
g1 = Gerente("Sebastián", "Ramírez", 3500, 7, "Marketing", 1500)
g2 = Gerente("Alejandra", "Castro", 3100, 4, "Operaciones", 1100)
d1 = Desarrollador("Gabriel", "Mendoza", 2300, 3, "C++", 15)
d2 = Desarrollador("Sofía", "Hernández", 2600, 5, "JavaScript", 10)

print("\n--- Mostrar salarios ---")
g1.mostrar()
print()
g2.mostrar()
print()
d1.mostrar()
print()
d2.mostrar()

print("\n--- Gerentes con bono mayor a 1000 ---")
if g1.bono_gerencial > 1000:
    g1.mostrar()
if g2.bono_gerencial > 1000:
    g2.mostrar()

print("\n--- Desarrolladores con más de 10 horas extras ---")
if d1.horas_extras > 10:
    d1.mostrar()
if d2.horas_extras > 10:
    d2.mostrar()
