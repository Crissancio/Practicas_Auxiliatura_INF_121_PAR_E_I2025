class Empleado:
    def __init__(self, nombre, apellido, salario_base, anos_antiguedad):
        self.nombre = nombre
        self.apellido = apellido
        self.salario_base = salario_base
        self.anos_antiguedad = anos_antiguedad
    
    def get_nombre(self):
        return self.nombre
    
    def get_apellido(self):
        return self.apellido
    
    def get_salario_base(self):
        return self.salario_base
    
    def get_anos_antiguedad(self):
        return self.anos_antiguedad
    
    def set_nombre(self, nombre):
        self.nombre = nombre
    
    def set_apellido(self, apellido):
        self.apellido = apellido
    
    def set_salario_base(self, salario_base):
        self.salario_base = salario_base
    
    def set_anos_antiguedad(self, anos_antiguedad):
        self.anos_antiguedad = anos_antiguedad
    
    def calcular_salario(self):
        bono_antiguedad = self.salario_base * 0.05 * self.anos_antiguedad
        return self.salario_base + bono_antiguedad
    
    def mostrar_info(self):
        return f"Empleado: {self.nombre} {self.apellido}, Salario Base: {self.salario_base} Bs, Anos de Antiguedad: {self.anos_antiguedad}, Salario Total: {self.calcular_salario():.2f} Bs"

class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, anos_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido, salario_base, anos_antiguedad)
        self.departamento = departamento
        self.bono_gerencial = bono_gerencial
    
    def get_departamento(self):
        return self.departamento
    
    def get_bono_gerencial(self):
        return self.bono_gerencial
    
    def set_departamento(self, departamento):
        self.departamento = departamento
    
    def set_bono_gerencial(self, bono_gerencial):
        self.bono_gerencial = bono_gerencial
    
    def calcular_salario(self):
        salario_base_con_antiguedad = super().calcular_salario()
        return salario_base_con_antiguedad + self.bono_gerencial
    
    def mostrar_info(self):
        return f"Gerente: {super().mostrar_info()}, Departamento: {self.departamento}, Bono Gerencial: {self.bono_gerencial} Bs"
    
    def tiene_bono_mayor_1000(self):
        return self.bono_gerencial > 1000
    
    @staticmethod
    def mostrar_bono_mayor_1000(lista_gerentes):
        print("GERENTES CON BONO MAYOR A Bs 1000")
        for gerente in lista_gerentes:
            if gerente.tiene_bono_mayor_1000():
                print(gerente.mostrar_info())

class Desarrollador(Empleado):
    def __init__(self, nombre, apellido, salario_base, anos_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre, apellido, salario_base, anos_antiguedad)
        self.lenguaje_programacion = lenguaje_programacion
        self.horas_extras = horas_extras
    
    def get_lenguaje_programacion(self):
        return self.lenguaje_programacion
    
    def get_horas_extras(self):
        return self.horas_extras
    
    def set_lenguaje_programacion(self, lenguaje_programacion):
        self.lenguaje_programacion = lenguaje_programacion
    
    def set_horas_extras(self, horas_extras):
        self.horas_extras = horas_extras
    
    def calcular_salario(self):
        salario_antiguedad = super().calcular_salario()
        pago_horas_extras = self.horas_extras * 25  # 25 Bs por hora extra
        return salario_antiguedad + pago_horas_extras
    
    def mostrar_info(self):
        return f"Desarrollador: {super().mostrar_info()}, Lenguaje: {self.lenguaje_programacion}, Horas Extras: {self.horas_extras}"
    
    def trabaja_mas_10_horas(self):
        return self.horas_extras > 10
    
    @staticmethod
    def mostrar_mas_10_horas(lista_desarrolladores):
        print("DESARROLLADORES CON MAS DE 10 HORAS EXTRAS")
        for desarrollador in lista_desarrolladores:
            if desarrollador.trabaja_mas_10_horas():
                print(desarrollador.mostrar_info())

gerente1 = Gerente("Mario", "Nartin", 5000, 3, "Ventas", 1500)
gerente2 = Gerente("Matias", "Garces", 6000, 5, "Marketing", 800)
gerente3 = Gerente("Margaret", "Casas", 5500, 4, "Recursos Humanos", 1200)

desa1 = Desarrollador("Leo", "Quispe", 4000, 2, "Python", 15)
desa2 = Desarrollador("Lucia", "Huanca", 4500, 3, "Java", 8)
desa3 = Desarrollador("Carla", "Mamani", 4200, 1, "JavaScript", 12)

print("\nGerentes:")
print(gerente1.mostrar_info())
print(gerente2.mostrar_info())
print(gerente3.mostrar_info())

print("\nDesarrolladores:")
print(desa1.mostrar_info())
print(desa2.mostrar_info())
print(desa3.mostrar_info())

print("\n")
gerentes = [gerente1, gerente2, gerente3]
Gerente.mostrar_bono_mayor_1000(gerentes)

print("\n")
desarrolladores = [desa1, desa2, desa3]
Desarrollador.mostrar_mas_10_horas(desarrolladores)