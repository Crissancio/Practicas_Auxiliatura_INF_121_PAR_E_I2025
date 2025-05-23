#5. Definir las siguientes clases:
#Empleado<nombre, apellido, salario_base, años_antigüedad
#Métodos: calcular_salario() (retorna el salario base más un bono
#del 5% por cada año de antigüedad)
#Gerente (hereda de Empleado)< departamento, bono_gerencial>
#Métodos: calcular_salario() (debe sumar el bono gerencial al
#salario calculado en la clase base)
#Desarrollador (hereda de Empleado) <lenguaje_programación, horas_extras>
#Métodos: calcular_salario() (debe sumar un monto adicional por
#horas extras al salario calculado en la clase base)
#a) Implementa las clases con sus constructores, getters y setters.
#b) Crea instancias de Gerente y Desarrollador y muestra su salario
#calculado.
#c) Muestra todos los gerentes que tienen un bono gerencial mayor a 1000.
#d) Muestra todos los desarrolladores que trabajan más de 10 horas extras.

class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antiguedad = años_antiguedad

    def calcular_salario(self):
        return self.salario_base + self.salario_base * 0.05 * self.años_antiguedad

    def mostrar_salario(self):
        print(f"{self.nombre} {self.apellido} - Salario: {self.calcular_salario():.2f}")

class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial

class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def calcular_salario(self):
        return super().calcular_salario() + self.horas_extras * 50


g1 = Gerente("Carlos", "Lopez", 5000, 10, "TI", 1200)
g2 = Gerente("Ana", "Soto", 4000, 8, "RRHH", 900)
d1 = Desarrollador("Juan", "Perez", 3000, 5, "Java", 12)
d2 = Desarrollador("Maria", "Diaz", 2800, 3, "Python", 8)


g1.mostrar_salario()
g2.mostrar_salario()
d1.mostrar_salario()
d2.mostrar_salario()

print("\nGerentes con bono > 1000:")
for gerente in [g1, g2]:
    if gerente.bono_gerencial > 1000:
        gerente.mostrar_salario()

print("\nDesarrolladores con más de 10 horas extras:")
for dev in [d1, d2]:
    if dev.horas_extras > 10:
        dev.mostrar_salario()
