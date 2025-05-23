

class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre

    def mostrar_info(self):
        return f"{self.nombre} - Carrera: {self.carrera}, Semestre: {self.semestre}"

class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []

    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f" Universidad: {self.nombre}")
        print(" Estudiantes:")
        for estudiante in self.estudiantes:
            print(" -", estudiante.mostrar_info())

print("Código realizado por Noemí Chino Blanco\n")

u = Universidad("Universidad mayor de san andres")

e1 = Estudiante("Jose alejandro", "Ingeniería", 3)
e2 = Estudiante("noemi chino", "Medicina", 5)
e3 = Estudiante("maria juanita", "Arquitectura", 2)

u.agregar_estudiante(e1)
u.agregar_estudiante(e2)
u.agregar_estudiante(e3)

u.mostrar_universidad()
