from datetime import datetime
#b)
class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac):
        self.__ci = ci
        self.__nombre = nombre
        self.__apellido = apellido
        self.__celular = celular
        self.__fecha_Nac = datetime.strptime(fecha_Nac, "%Y-%m-%d") 
    
    def __str__(self):
        return f"""
        ------Persona-------\n
        CI: {self.__ci} \n
        Nombre: {self.__nombre}\n
        Apellido: {self.__apellido}\n
        Celular: {self.__celular}\n
        Fecha de Nacimiento: {self.__fecha_Nac.strftime("%Y-%m-%d")}\n
    """
    def getCi(self):
        return self.__ci
    def setCi(self, ci):
        self.__ci = ci
        
    def getNombre(self):
        return self.__nombre
    def setNombre(self, nombre):
        self.__nombre = nombre
    
    def getApellido(self):
        return self.__apellido
    def setApellido(self, apellido):
        self.__apellido = apellido
    
    def getCelular(self):
        return self.__celular
    def setCelular(self, celular):
        self.__celular = celular
    
    def getFechaNac(self):
        return self.__fecha_Nac
    def setFechaNac(self, fecha_Nac):
        self.__fecha_Nac = fecha_Nac
    
    
class Estudiante(Persona):
    def __init__(self,ci,nombre,apellido,celular,fecha_Nac,ru,fecha_Ingreso,semestre):
        super().__init__(ci,nombre,apellido,celular,fecha_Nac)
        self.__ru = ru
        self.__fecha_Ingreso = fecha_Ingreso
        self.__semestre = semestre
    
    def __str__(self):
        return         super().__str__() + f"""
                ------Estudiante-------\n
                R.U: {self.__ru}\n
                Fecha de ingreso: {self.__fecha_Ingreso} \n
                Semestre: {self.__semestre}
    """
    def getRu(self):
        return self.__ru
    def setRu(self, ru):
        self.__ru = ru
    
    def getFechaIngreso(self):
        return self.__fecha_Ingreso
    def setFechaIngreso(self, fecha_Ingreso):
        self.__fecha_Ingreso = fecha_Ingreso
    
    def getSemestre(self):
        return self.__semestre
    def setSemestre(self, semestre):
        self.__semestre = semestre
    
class Docente(Persona):
    def __init__(self, ci,nombre,apellido,celular,fecha_Nac,nit,profesion,especialidad):
        super().__init__(ci,nombre,apellido,celular,fecha_Nac)
        self.__nit = nit
        self.__profesion = profesion
        self.__especialidad = especialidad
    
    def __str__(self):
        return         super().__str__()+  f"""
                    ------Docente-------\n
                NIT: {self.__nit}\n
                Profesión: {self.__profesion}\n
                Especialidad: {self.__especialidad}
    """
    
    def getNit(self):
        return self.__nit
    def setNit(self, nit):
        self.__nit = nit
        
    def getProfesion(self):
        return self.__profesion
    def setProfesion(self, profesion):
        self.__profesion = profesion
    
    def getEspecialidad(self):
        return self.__especialidad
    def setEspecialidad(self, especialidad):
        self.__especialidad = especialidad
        
#Main
#c)
personas = [
        Estudiante("1","Pablo","Jimenez",7743892, "1995-08-22", 1, "Septiembre 10 del 2018", 8),
        Estudiante("2","Raul","Garcia",7312293, "2004-10-20", 2, "Enero 20 del 2023", 3),
        Docente("4","Sergio","Jimenez",6783332,"1993-08-10",123,"Ingeniero","Sistemas"),
        Docente("5","Maria","Santos",7738211,"1899-4-24",456,"Contador","Finanzas"),
]

def calcular_edad( fecha_Nac):
    hoy = datetime.today()
    edad = hoy.year - fecha_Nac.year
    if(hoy.month, hoy.day) < (fecha_Nac.month , fecha_Nac.day):
        edad -= 1
    return edad
#c)
print("-----------------------------------------------------------")
print("Estudiantes con más de 25 años:")
for p in personas:
    if isinstance(p, Estudiante) and calcular_edad(p.getFechaNac()) > 25:
        print(p)

#d)
print("-----------------------------------------------------------")
print("Docente Masculino con profesion 'Ingeniero' y mayor de todos:")

mayor_docente = None
mayor_edad = -1
for persona in personas:
    if isinstance(persona, Docente) and persona.getProfesion() == "Ingeniero":
        edad = calcular_edad(persona.getFechaNac())
        if edad > mayor_edad:
            mayor_edad  = edad
            mayor_docente = persona

if mayor_docente:
    print(mayor_docente)
    print(f"Edad: {mayor_edad} años")
else:
    print("No se encontró un docente masculino con profesion 'Ingeniero' ")

#e)
print("-----------------------------------------------------------")
print("Personas con el mismo apellido:")
for estudiante in personas:
    if isinstance(estudiante, Estudiante):
        for docente in personas:
            if isinstance(docente, Docente):
                if estudiante.getApellido().lower() == docente.getApellido().lower():
                    print(estudiante,"\n")
                    print(docente,"\n")