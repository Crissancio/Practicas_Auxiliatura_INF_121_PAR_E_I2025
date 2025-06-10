class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre 
        self.carrera = carrera
        self.semestre = semestre
        
    def mostrar_info(self):
        print (f"Nombre: {self.nombre}, Carrera: {self.carrera}, Semestre: {self.semestre}")
    
    def getNombre(self):
        return self.nombre
    
    def getCarrera(self):
        return self.carrera
    
    def getSemestre(self):
        return self.semestre
    
    def setNombre(self, nombre):
        self.nombre = nombre
        
    def setCarrera(self, carrera):
        self.carrera = carrera 
        
    def setSemestre(self, semestre):
        self.semestre = semestre

class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []
    
    def agregar_estudiantes(self, nombre, carrera, semestre):
        estudiante = Estudiante(nombre, carrera, semestre)
        self.estudiantes.append(estudiante) 
        
    def mostrar_universidad(self):
        print(f"Nombre: {self.nombre}")
        for estudiante in self.estudiantes:
            estudiante.mostrar_info()
            
    def getNombre(self):
        return self.nombre
    
    def setNombre(self, nombre):
        self.nombre = nombre 
        
e1 = Universidad("Universidad Mayo de San Andres")

e1.agregar_estudiantes("Jhoana", "Informatica", "Segundo semestre")
e1.agregar_estudiantes("Diego", "Informatica", "Primer semestre")
e1.agregar_estudiantes("Nayeli", "Informatica", "Tercer semestre")
e1.agregar_estudiantes("Missael", "Informatica", "Quinto semestre")

e1.mostrar_universidad()       
    
    
        