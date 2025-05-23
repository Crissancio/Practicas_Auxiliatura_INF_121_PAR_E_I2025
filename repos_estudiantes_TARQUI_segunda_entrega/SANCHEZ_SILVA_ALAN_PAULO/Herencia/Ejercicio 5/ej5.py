class Empleado:
    def __init__(self,nombre, apellido, salario_base, años_antiguedad):
        self.__nombre = nombre
        self.__apellido = apellido
        self.__salario_base = salario_base
        self.__años_antiguiedad = años_antiguedad
    
    def calcular_salario(self):
        bono = 0.05 * self.__años_antiguiedad * self.__salario_base
        return self.__salario_base + bono
    
    def __str__(self):
        return f"""
        -----------Empleado----------\n
        Nombre: {self.__nombre}\n
        Apellido: {self.__apellido}\n
        Salario base: {self.__salario_base}\n
        Años de antiguedad: {self.__años_antiguiedad}\n
    """
    
    def getNombre(self):
        return self.__nombre
    def setNombre(self, nombre):
        self.__nombre = nombre
        
    def getApellido(self):
        return self.__apellido 
    def setApellido(self, apellido):
        self.__apellido = apellido
    
    def getSalarioBase(self):
        return self.__salario_base
    def setSalarioBase(self,salario_base):
        self.__salario_base = salario_base
    
    def getAñosAntiguedad(self):
        return self.__años_antiguiedad
    def setAñosAntiguedad(self, años_antiguedad):
        self.__años_antiguiedad = años_antiguedad
    
class Gerente(Empleado):
    def __init__(self, nombre, apellido, salario_base, años_antiguedad, departamento, bono_gerencial):
        super().__init__(nombre, apellido,salario_base,años_antiguedad)
        self.__departamento = departamento
        self.__bono_gerencial = bono_gerencial
        
    def calcular_salario(self):
        return super().calcular_salario() + self.__bono_gerencial
    
    def __str__(self):
        return super().__str__()+f"""
        -----------Gerente----------\n
        Departamento: {self.__departamento}\n
        Bono gerencial: {self.__bono_gerencial}
    """
    
    def getDepartamento(self):
        return self.__departamento
    def setDepartamento(self,departamento):
        self.__departamento = departamento
    
    def getBonoGerencial(self):
        return self.__bono_gerencial
    def setBonoGerencial(self, bono_gerencial):
        self.__bono_gerencial = bono_gerencial

class Desarrollador(Empleado):
    def __init__(self, nombre, apellido,salario_base,años_antiguedad, lenguaje_programacion, horas_extras):
        super().__init__(nombre,apellido,salario_base,años_antiguedad)
        self.__lenguaje_programacion = lenguaje_programacion
        self.__horas_extras = horas_extras
    
    def calcular_salario(self):
        monto_adicional = self.__horas_extras * 20
        return super().calcular_salario() + monto_adicional
    
    def __str__(self):
        return super().__str__()+ f"""
                -----------Desarrollador----------\n
                Lenguaje de Programacion: {self.__lenguaje_programacion}\n
                Horas extras: {self.__horas_extras}
    """
    
    def getLenguajeProgramacion(self):
        return self.__lenguaje_programacion
    def setLenguajeProgramacion(self, lenguaje_programacion):
        self.__lenguaje_programacion = lenguaje_programacion
    
    def getHorasExtra(self):
        return self.__horas_extras
    def setHorasExtra(self, horas_extra):
        self.__horas_extras = horas_extra
    
#Main
#b)
gerente_1 = Gerente("Fernando", "Chavez", 10000, 3, "La Paz", 2000)
gerente_2 = Gerente("Pamela", "Diaz",9000, 2, "Santa Cruz", 1200)
gerente_3 = Gerente("Rodrigo", "Mendez",11000, 1, "Oruro", 900)


desarrolador_1 = Desarrollador("Luis", "Marquez", 14000, 5, "Python", 7)
desarrolador_2 = Desarrollador("Henry", "Garcia", 7000,2, "Java", 12)
desarrolador_3 = Desarrollador("Andrea", "Aguilar", 5000, 1, "JavaScript", 11)

print("-------------Salarios---------------------")
print("Salario del gerente: ",gerente_1.calcular_salario(), "Bs")
print("Salario del desarrolador:",desarrolador_1.calcular_salario(), "Bs")

#c)
print("--------------------------------------")
print("Gerentes que tienen mas de 1000 de bono gerencial:")
gerentes = [gerente_1 , gerente_2 , gerente_3]
for gerente in gerentes:
    if gerente.getBonoGerencial() > 1000:
        print(gerente)
        
#d)
print("--------------------------------------")
print("Desarroladores que trabajan más de 10 horas extra:")
desarroladores =[desarrolador_1, desarrolador_2, desarrolador_3]
for desarrolador in desarroladores:
    if desarrolador.getHorasExtra() > 10:
        print(desarrolador)