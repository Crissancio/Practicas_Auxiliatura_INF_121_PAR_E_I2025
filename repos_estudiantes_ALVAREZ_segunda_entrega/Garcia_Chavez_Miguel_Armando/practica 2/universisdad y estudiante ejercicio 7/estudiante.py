class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre
    
    def mostrar_info(self):
        return f"Estudiante: {self.nombre}, Carrera: {self.carrera}, Semestre: {self.semestre}"

class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = [] 
    
    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)
    
    def mostrar_universidad(self):
        print(f"Universidad: {self.nombre}")
        print("Estudiantes:")
        for estudiante in self.estudiantes:
            print(f"- {estudiante.mostrar_info()}")

est1 = Estudiante("Ana Machicado", "Informática", 4)
est2 = Estudiante("Analea Garcia", "Medicina", 6)

universidad = Universidad("UMSA")
universidad.agregar_estudiante(est1)
universidad.agregar_estudiante(est2)
universidad.mostrar_universidad()

print("\nEstudiante independiente:")
print(est2.mostrar_info())