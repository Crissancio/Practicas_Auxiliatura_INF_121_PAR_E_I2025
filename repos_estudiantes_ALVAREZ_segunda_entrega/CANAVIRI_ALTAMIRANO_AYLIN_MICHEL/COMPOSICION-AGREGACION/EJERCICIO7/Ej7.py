class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.__nombre = nombre
        self.__carrera = carrera
        self.__semestre = semestre

    def get_nombre(self):
        return self.__nombre

    def get_carrera(self):
        return self.__carrera

    def get_semestre(self):
        return self.__semestre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def set_carrera(self, carrera):
        self.__carrera = carrera

    def set_semestre(self, semestre):
        self.__semestre = semestre

    def mostrar_info(self):
        print(f"Nombre: {self.__nombre}, Carrera: {self.__carrera}, Semestre: {self.__semestre}")

class Universidad:
    def __init__(self, nombre):
        self.__nombre = nombre
        self.__estudiantes = []

    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_estudiantes(self):
        return self.__estudiantes

    def set_estudiantes(self, estudiantes):
        self.__estudiantes = estudiantes

    def agregar_estudiante(self, estudiante):
        self.__estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self.__nombre}")
        print("-------Estudiantes:-------")
        for estudiante in self.__estudiantes:
            estudiante.mostrar_info()

est1 = Estudiante("Ana Pérez", "Ingeniería", 3)
est2 = Estudiante("Luis Gómez", "Medicina", 5)
est3 = Estudiante("María López", "Derecho", 2)

uni = Universidad("UMSA")
uni.agregar_estudiante(est1)
uni.agregar_estudiante(est2)
uni.agregar_estudiante(est3)

uni.mostrar_universidad()