#a)
class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre
    
    def __str__(self):
        return f"---------------EstudianteNombre-------------\n Nombre :{self.nombre}\n Carrera:{self.carrera}\n Semestre:{self.semestre}\n"
    def getNombre(self):
        return self.nombre
    def setNombre(self,nombre):
        self.nombre = nombre
    def getCarrera(self):
        return self.carrera
    def setCarrera(self,carrera):
        self.carrera = carrera
    def getSemestre(self):
        return self.semestre
    def setSemestre(self,semestre):
        self.semestre = semestre

class Universidad:
    def __init__(self,nombre):
        self.nombre = nombre
        self.estudiantes  = []
    
    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)
    
    def __str__(self):
        cad = f"----------------------Universidad----------------------- \n Universidad: {self.nombre}\n"
        for estudiante in self.estudiantes:
            cad += str(estudiante)
        return cad
    
    def getNombre(self):
        return self.nombre
    def setNombre(self,nombre):
        self.nombre = nombre
    def getEstudiantes(self):
        return self.estudiantes
    def setEstudiantes(self,estudiantes):
        self.estudiantes = estudiantes
        
#b)
universidad = Universidad("UMSA")
universidad.agregar_estudiante(Estudiante("Juan", "Ingenieria", 2))
universidad.agregar_estudiante(Estudiante("Maria", "Arquitectura", 3))
universidad.agregar_estudiante(Estudiante("Pedro", "Medicina", 1))
universidad.agregar_estudiante(Estudiante("Ana", "Derecho", 4))
universidad.agregar_estudiante(Estudiante("Luis", "Contaduria", 5))
#c)
print(universidad)
