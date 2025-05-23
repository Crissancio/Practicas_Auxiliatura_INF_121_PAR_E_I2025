class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre

    def mostrar_info(self):
        return f"{self.nombre}, {self.carrera}, Semestre {self.semestre}"


class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []

    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self.nombre}")
        print("Estudiantes:")
        for est in self.estudiantes:
            print(est.mostrar_info())


e1 = Estudiante("Ana", "Ingeniería", 3)
e2 = Estudiante("Luis", "Derecho", 5)
e3 = Estudiante("María", "Arquitectura", 2)

u = Universidad("Universidad Central")
u.agregar_estudiante(e1)
u.agregar_estudiante(e2)
u.agregar_estudiante(e3)

u.mostrar_universidad()
