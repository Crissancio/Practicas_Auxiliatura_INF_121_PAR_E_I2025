from Estudiante import Estudiante

class Universidad:
    def __init__(self, nombre):
        self.__nombre = nombre
        self.__estudiantes = []

    #A
    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_estudiantes(self):
        return self.__estudiantes

    def set_estudiantes(self, estudiantes):
        self.__estudiantes = estudiantes

    # Método agregar_estudiante
    def agregar_estudiante(self, estudiante):
        self.__estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self.__nombre}")
        print("Estudiantes:")
        for estudiante in self.__estudiantes:
            estudiante.mostrar_info()