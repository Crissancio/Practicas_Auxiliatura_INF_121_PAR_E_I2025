# 5. Definir las siguientes clases:
# Empleado<nombre, apellido, salario_base, años_antigüedad>
# Métodos: calcular_salario() (retorna el salario base más un bono del 5% por cada año de antigüedad)
# Gerente (hereda de Empleado)<departamento, bono_gerencial>
# Métodos: calcular_salario() (debe sumar el bono gerencial al salario calculado en la clase base)
# Desarrollador (hereda de Empleado) <lenguaje_programación, horas_extras>
# Métodos: calcular_salario() (debe sumar un monto adicional por horas extras al salario calculado en la clase base)
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea instancias de Gerente y Desarrollador y muestra su salario calculado.
# c) Muestra todos los gerentes que tienen un bono gerencial mayor a 1000.
# d) Muestra todos los desarrolladores que trabajan más de 10 horas extras.

# a) Implementación de las clases

class Empleado:
    def __init__(self, nombre, apellido, salario_base, anos_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.anos_antiguedad = anos_antiguedad

    def calcular_salario(self):
        return self.salario_base + (self.salario_base * 0.05 * self.anos_antiguedad)

    def mostrar(self):
        print(f"{self.nombre} {self.apellido} | Salario calculado: {self.calcular_salario():.2f}")


class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, anos_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, anos_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial

    def mostrar(self):
        print(f"Gerente: {self.nombre} {self.apellido} | Departamento: {self.departamento} | Salario calculado: {self.calcular_salario():.2f}")


class Desarrollador(Empleado):
    PAGO_HORA_EXTRA = 20.0

    def __init__(self, nombre, apellido, salario_base, anos_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, anos_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras

    def calcular_salario(self):
        return super().calcular_salario() + (self.horas_extras * Desarrollador.PAGO_HORA_EXTRA)

    def mostrar(self):
        print(f"Desarrollador: {self.nombre} {self.apellido} | Lenguaje: {self.lenguaje_programacion} | Horas extras: {self.horas_extras} | Salario calculado: {self.calcular_salario():.2f}")


# b) Crear instancias de Gerente y Desarrollador y mostrar salario calculado

def main():
    gerentes = [
        Gerente("Juan", "Perez", 3000, 5, "Finanzas", 1200),
        Gerente("Ana", "Lopez", 2800, 3, "Marketing", 900),
        Gerente("Carlos", "Gomez", 3500, 7, "Ventas", 1500)
    ]

    desarrolladores = [
        Desarrollador("Luis", "Martinez", 2000, 2, "Java", 8),
        Desarrollador("Marta", "Diaz", 2100, 4, "Python", 15),
        Desarrollador("Sofia", "Ruiz", 2200, 1, "C#", 5)
    ]

    print("Salarios calculados:")
    for g in gerentes:
        g.mostrar()
    for d in desarrolladores:
        d.mostrar()

    # c) Mostrar gerentes con bono mayor a 1000
    print("\nGerentes con bono gerencial mayor a 1000:")
    for g in gerentes:
        if g.bono_gerencial > 1000:
            g.mostrar()

    # d) Mostrar desarrolladores con más de 10 horas extras
    print("\nDesarrolladores con más de 10 horas extras:")
    for d in desarrolladores:
        if d.horas_extras > 10:
            d.mostrar()


if __name__ == "__main__":
    main()