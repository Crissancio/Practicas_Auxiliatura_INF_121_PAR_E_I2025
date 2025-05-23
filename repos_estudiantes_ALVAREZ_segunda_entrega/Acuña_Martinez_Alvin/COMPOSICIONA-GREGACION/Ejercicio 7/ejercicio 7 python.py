# Enunciado:
# 7. Crea un POO para una universidad y sus estudiantes.
# La universidad contiene estudiantes, pero los estudiantes pueden existir independientemente de la universidad.
#
# Estudiante <nombre, carrera, semestre>
# Métodos: mostrar_info() (muestra nombre, carrera y semestre del estudiante)
#
# Universidad <nombre, estudiantes (lista de objetos Estudiante)>
# Métodos: agregar_estudiante(estudiante), mostrar_universidad() (muestra el nombre de la universidad y la info de todos los estudiantes)
#
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea una universidad y agrega varios estudiantes.
# c) Muestra la información de la universidad y sus estudiantes.

class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre

    def mostrar_info(self):
        print(f"Estudiante: {self.nombre} | Carrera: {self.carrera} | Semestre: {self.semestre}")

class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []

    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self.nombre}")
        for estudiante in self.estudiantes:
            estudiante.mostrar_info()

# b) Crear universidad y agregar estudiantes
est1 = Estudiante("Lucía Méndez", "Ingeniería", 3)
est2 = Estudiante("Carlos Ruiz", "Medicina", 5)
est3 = Estudiante("Ana Torres", "Derecho", 2)

uni = Universidad("Universidad Central")
uni.agregar_estudiante(est1)
uni.agregar_estudiante(est2)
uni.agregar_estudiante(est3)

# c) Mostrar la información de la universidad y sus estudiantes
uni.mostrar_universidad()
