class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre
    def mostrar(self):
        print("Nombre:", self.nombre)
        print("Carrera:", self.carrera)
        print("Semestre:", self.semestre)
class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []
    def agregar(self, estudiante):
        self.estudiantes.append(estudiante)
    def mostrar(self):
        print("Universidad:", self.nombre)
        for e in self.estudiantes:
            e.mostrar()
u =  Universidad("UPB");
u.agregar(Estudiante("Carlos", "Ingeniería", 3));
u.agregar(Estudiante("María", "Arquitectura", 1));
u.mostrar();
