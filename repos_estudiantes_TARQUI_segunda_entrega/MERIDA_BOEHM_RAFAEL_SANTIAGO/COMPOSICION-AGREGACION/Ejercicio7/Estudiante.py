class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre

    def mostrar_info(self):
        return f"Estudiante: {self.nombre} | Carrera: {self.carrera} | Semestre: {self.semestre}"

class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []  # Agregación: los estudiantes pueden existir fuera de la universidad

    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self.nombre}")
        print("Lista de estudiantes:")
        for estudiante in self.estudiantes:
            print(f"  - {estudiante.mostrar_info()}")

# Creación de la Universidad y los Estudiantes
universidad = Universidad("Universidad Mayor de San Andrés")
estudiante1 = Estudiante("Carlos Gómez", "Ingeniería Informática", 5)
estudiante2 = Estudiante("Ana Fernández", "Arquitectura", 3)

# Agregar estudiantes a la Universidad
universidad.agregar_estudiante(estudiante1)
universidad.agregar_estudiante(estudiante2)

# Mostrar la Universidad y los estudiantes registrados
universidad.mostrar_universidad()
