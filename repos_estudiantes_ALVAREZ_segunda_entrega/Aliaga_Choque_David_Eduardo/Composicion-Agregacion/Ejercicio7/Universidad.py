# a) Implementa las clases con sus constructores, getters y setters
class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self._nombre = nombre
        self._carrera = carrera
        self._semestre = semestre

    def get_nombre(self):
        return self._nombre

    def get_carrera(self):
        return self._carrera

    def get_semestre(self):
        return self._semestre

    def set_nombre(self, nuevo_nombre):
        self._nombre = nuevo_nombre

    def set_carrera(self, nueva_carrera):
        self._carrera = nueva_carrera

    def set_semestre(self, nuevo_semestre):
        self._semestre = nuevo_semestre

    def mostrar_info(self):
        print(f"Nombre: {self._nombre}, Carrera: {self._carrera}, Semestre: {self._semestre}")


class Universidad:
    def __init__(self, nombre):
        self._nombre = nombre
        self._estudiantes = []  

    def get_nombre(self):
        return self._nombre

    def set_nombre(self, nuevo_nombre):
        self._nombre = nuevo_nombre

    def agregar_estudiante(self, estudiante):
        self._estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self._nombre}")
        print("Estudiantes:")
        for estudiante in self._estudiantes:
            estudiante.mostrar_info()
            print("-" * 30)

# b) Crear una universidad y agrega varios estudiantes
est1 = Estudiante("Cristian Ortiz", "Informatica", 5)
est2 = Estudiante("Roselyn Aliaga", "Linguistica", 3)
est3 = Estudiante("Mariela Ramirez", "Ingenieria", 7)
est4 = Estudiante("Roberto Alcon", "Contaduria", 4)

uni = Universidad("UMSA")

uni.agregar_estudiante(est1)
uni.agregar_estudiante(est2)
uni.agregar_estudiante(est3)
uni.agregar_estudiante(est4)

# c) Muestra la información de la universidad y sus estudiantes
uni.mostrar_universidad()