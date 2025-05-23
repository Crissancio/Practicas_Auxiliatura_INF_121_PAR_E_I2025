class Estudiante:
    def __init__(self,nombre,carrera,semestre):
        self._nombre=nombre
        self._carrera=carrera
        self._semestre=semestre
    def getNombre(self):
        return self._nombre
    def getCarrera(self):
        return self._carrera
    def getSemestre(self):
        return self._semestre
    def setNombre(self,nombre):
        self._nombre=nombre
    def setCarrera(self,carrera):
        self._carrera=carrera
    def setSemestre(self,semestre):
        self._semestre=semestre

    def mostrar_info(self):
        print(f"Nombre: {self._nombre},Carrera: {self._carrera}, semestre:{self._semestre}")


class Universidad:
    def __init__(self,nombre):
        self._nombre=nombre
        self._estudiantes=[]
    def get_nombre(self):
        return self._nombre
    def get_estudiantes(self):
        return self._estudiantes
    def set_nombre(self,nombre):
        self._nombre=nombre
    def set_estudiantes(self,estudiantes):
        self.estudiantes=estudiantes
    def agregar_estudiante(self,e):
        self._estudiantes.append(e)
    def mostrar_universidad(self):
        print(f"UNIVERSIDAD : {self._nombre}")
        for estudiante in self._estudiantes:
            estudiante.mostrar_info()
est1 = Estudiante("Carla Pérez", "Ingeniería en Sistemas", 3)
est2 = Estudiante("María Rivera", "Ortodoncia", 2)
est3 = Estudiante("Adrian Flores", "Electronica", 7)

uni = Universidad("Umsa")
uni.agregar_estudiante(est1)
uni.agregar_estudiante(est2)
uni.agregar_estudiante(est3)
uni.mostrar_universidad()
