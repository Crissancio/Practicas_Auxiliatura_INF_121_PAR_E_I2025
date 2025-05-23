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
        print("Lista de Estudiantes:")
        for est in self.estudiantes:
            print("  -", est.mostrar_info())


# b)
# Estudiantes
e1 = Estudiante("Ana López", "Ingeniería de Sistemas", 5)
e2 = Estudiante("Luis Torres", "Administración", 3)
e3 = Estudiante("María Pérez", "Derecho", 7)

# Universidad
umsa = Universidad("UMSA")
umsa.agregar_estudiante(e1)
umsa.agregar_estudiante(e2)
umsa.agregar_estudiante(e3)

# c) Mostrar la información
print("== Información de la Universidad ==")
umsa.mostrar_universidad()
