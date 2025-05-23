#5. Definir las siguientes clases:
#Empleado<nombre, apellido, salario_base, años_antigüedad
#Métodos: calcular_salario() (retorna el salario base más un bono del 5% por cada año de antigüedad)
#Gerente (hereda de Empleado)< departamento, bono_gerencial>
#salario calculado en la clase base)
#Desarrollador (hereda de Empleado) <lenguaje_programación, horas_extras>
#Métodos: calcular_salario() (debe sumar un monto adicional por horas extras al salario calculado en la clase base)

class Empleado:
    def __init__(self, nombre, apellido, salario_base, años_antigüedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antigüedad = años_antigüedad

    def calcular_salario(self):
        bono_antigüedad = self.salario_base * (0.05 * self.años_antigüedad)
        return self.salario_base + bono_antigüedad

    def mostrar(self):
        print(f"Nombre: {self.nombre} {self.apellido}")
        print(f"Salario base: ${self.salario_base}")
        print(f"Años de antigüedad: {self.años_antigüedad}")
        print(f"Salario total: ${self.calcular_salario():.2f}")



class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial

    def calcular_salario(self):
        salario_base = super().calcular_salario()
        return salario_base + self.bono_gerencial

    def mostrar(self):
        super().mostrar()
        print(f"Departamento: {self.departamento}")
        print(f"Bono gerencial: ${self.bono_gerencial}")
        print("-------------------")



class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antigüedad, lenguaje_programación, horas_extras):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.lenguaje_programación = lenguaje_programación
        self.horas_extras = horas_extras

    def calcular_salario(self):
        salario_base = super().calcular_salario()
        pago_horas_extras = self.horas_extras * 15  # $15 por hora extra
        return salario_base + pago_horas_extras

    def mostrar(self):
        super().mostrar()
        print(f"Lenguaje de programación: {self.lenguaje_programación}")
        print(f"Horas extras: {self.horas_extras}")
        print("-------------------")



if __name__ == "__main__":
    # b) Crear instancias
    gerente1 = Gerente("Carlos", "Gomez", 5000, 5, "TI", 1200)
    gerente2 = Gerente("Ana", "Lopez", 6000, 10, "Finanzas", 800)
    desarrollador1 = Desarrollador("Juan", "Perez", 3000, 3, "Python", 12)
    desarrollador2 = Desarrollador("Maria", "Rodriguez", 3500, 4, "Java", 8)

    # Mostrar salarios calculados
    print("\n=== Salarios Calculados ===")
    gerente1.mostrar()
    gerente2.mostrar()
    desarrollador1.mostrar()
    desarrollador2.mostrar()

    # c) Gerentes con bono gerencial > 1000
    print("\n=== Gerentes con bono > $1000 ===")
    gerentes = [gerente1, gerente2]
    for gerente in gerentes:
        if gerente.bono_gerencial > 1000:
            gerente.mostrar()

    # d) Desarrolladores con >10 horas extras
    print("\n=== Desarrolladores con >10 horas extras ===")
    desarrolladores = [desarrollador1, desarrollador2]
    for dev in desarrolladores:
        if dev.horas_extras > 10:
            dev.mostrar()
