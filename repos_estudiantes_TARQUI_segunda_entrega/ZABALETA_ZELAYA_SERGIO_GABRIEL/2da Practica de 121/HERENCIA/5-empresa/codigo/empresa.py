class Empleado:
    def __init__(self, nombre="", apellido="", salario_base=0.0, años_antigüedad=0):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.años_antigüedad = años_antigüedad
    
    def calcular_salario(self):
        return self.salario_base + (self.salario_base * 0.05 * self.años_antigüedad)

class Gerente(Empleado):
    def __init__(self, nombre="", apellido="", salario_base=0.0, años_antigüedad=0, 
                 departamento="", bono_gerencial=0.0):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial
    
    def calcular_salario(self):
        return super().calcular_salario() + self.bono_gerencial

class Desarrollador(Empleado):
    def __init__(self, nombre="", apellido="", salario_base=0.0, años_antigüedad=0, 
                 lenguaje_programación="", horas_extras=0):
        super().__init__(nombre, apellido, salario_base, años_antigüedad)
        self.lenguaje_programación = lenguaje_programación
        self.horas_extras = horas_extras
    
    def calcular_salario(self):
        return super().calcular_salario() + (self.horas_extras * 20)

# Pruebas
if __name__ == "__main__":
    # b) Crear instancias
    gerente1 = Gerente("Ana", "Gómez", 5000, 5, "TI", 1500)
    gerente2 = Gerente("Carlos", "López", 6000, 8, "Finanzas", 800)
    
    dev1 = Desarrollador("Luisa", "Martínez", 4000, 3, "Java", 15)
    dev2 = Desarrollador("Pedro", "Sánchez", 3500, 2, "Python", 8)

    # Mostrar salarios
    print(f"Salario Gerente 1: ${gerente1.calcular_salario():.2f}")
    print(f"Salario Gerente 2: ${gerente2.calcular_salario():.2f}")
    print(f"Salario Desarrollador 1: ${dev1.calcular_salario():.2f}")
    print(f"Salario Desarrollador 2: ${dev2.calcular_salario():.2f}")

    # c) Gerentes con bono > 1000
    print("\nGerentes con bono > 1000:")
    for gerente in [gerente1, gerente2]:
        if gerente.bono_gerencial > 1000:
            print(f"{gerente.nombre} {gerente.apellido} - Bono: ${gerente.bono_gerencial:.2f}")

    # d) Desarrolladores con >10 horas extras
    print("\nDesarrolladores con >10 horas extras:")
    for dev in [dev1, dev2]:
        if dev.horas_extras > 10:
            print(f"{dev.nombre} {dev.apellido} - Horas extras: {dev.horas_extras}")