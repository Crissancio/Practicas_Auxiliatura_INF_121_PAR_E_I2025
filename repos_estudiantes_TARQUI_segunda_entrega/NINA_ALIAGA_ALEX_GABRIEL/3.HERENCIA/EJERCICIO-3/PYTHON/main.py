class Persona:
    def __init__(self, CI, nombre, apellido, celular, fecha_Nac):
        self.CI = CI
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac

    def mostrarDatos(self):
        print("CI:", self.CI)
        print("Nombre:", self.nombre)
        print("Apellido:", self.apellido)
        print("Celular:", self.celular)
        print("Fecha de Nacimiento:", self.fecha_Nac)

    def getEdad(self):
        edad = 2025 - self.fecha_Nac 
        return edad

    def getApellido(self):
        return self.apellido


###################################################################################################

class Estudiante(Persona):
    def __init__(self, CI, nombre, apellido, celular, fecha_Nac, RU, fecha_Ingreso, semestre):
        super().__init__(CI, nombre, apellido, celular, fecha_Nac)
        self.RU = RU
        self.fecha_Ingreso = fecha_Ingreso
        self.semestre = semestre

    def mostrarDatos(self):
        super().mostrarDatos()
        print("RU:", self.RU)
        print("Fecha de Ingreso:", self.fecha_Ingreso)
        print("Semestre:", self.semestre)


class Docente(Persona):
    def __init__(self, CI, nombre, apellido, celular, fecha_Nac, NIT, profesion, especialidad):
        super().__init__(CI, nombre, apellido, celular, fecha_Nac)
        self.NIT = NIT
        self.profesion = profesion
        self.especialidad = especialidad

    def mostrarDatos(self):
        super().mostrarDatos()
        print("NIT:", self.NIT)
        print("Profesion:", self.profesion) 
        print("Especialidad:", self.especialidad)  

    def getProfesion(self):
        return self.profesion


#################################################################################

def mostrarEstudiantesMayoresDe25(personas):
    for persona in personas:
        if isinstance(persona, Estudiante) and persona.getEdad() > 25:
            print("Estudiantes mayores de 25 años:\n")
            persona.mostrarDatos()

def mostrarDocenteIngenieroDeMayorEdad(personas):
    ingenieroMayor = None
    for persona in personas:
        if isinstance(persona, Docente) and persona.getProfesion() == "Ingeniero":
            if ingenieroMayor is None or persona.getEdad() > ingenieroMayor.getEdad():
                ingenieroMayor = persona 

    if ingenieroMayor:
        print("Docente Ingeniero de mayor edad:\n")
        ingenieroMayor.mostrarDatos()
    else:
        print("No hay docentes Ingenieros")

def mostrarEstudianteYDocenteConElMismoApellido(personas):
    estudiantes = []
    docentes = []
    for persona in personas:
        if isinstance(persona, Estudiante):
            estudiantes.append(persona)
        elif isinstance(persona, Docente):
            docentes.append(persona)

    for estudiante in estudiantes:
        for docente in docentes:
            if estudiante.getApellido() == docente.getApellido():
                print("Estudiante y Docente con el mismo apellido:\n")
                estudiante.mostrarDatos()
                print("")
                docente.mostrarDatos()

#################################################################################

if __name__ == "__main__":
    estudiante = Estudiante("12345678", "Juan", "Perez", 77777777, 2000, "20200000", "01/01/2020", 1)
    estudiante2 = Estudiante("87654321", "Luz", "Gonzalez", 66666666, 1980, "2020000,1", "01/01/2020", 1) 
    docente = Docente("87654321", "Melissa", "Limachi", 66666666, 1980, 1234567, "Ingeniero", "nose")
    docente2 = Docente("87654321", "Maria", "Gonzalez", 66666666, 1980, 123456, "Doctor", "nose")

    personas = [estudiante, estudiante2, docente, docente2]

    mostrarEstudiantesMayoresDe25(personas)
    print("--------------------------------------------------------------\n")
    mostrarDocenteIngenieroDeMayorEdad(personas)
    print("--------------------------------------------------------------\n")
    mostrarEstudianteYDocenteConElMismoApellido(personas)