# 7. Crea un POO para una universidad y sus estudiantes.
# La universidad contiene estudiantes, pero los estudiantes pueden existir independientemente de la universidad.
#
# Estudiante<nombre, carrera, semestre>
# Métodos: mostrar_info() (muestra el nombre, carrera y semestre del estudiante)
#
# Universidad<nombre, estudiantes (lista de objetos de tipo Estudiante)>
# Métodos: agregar_estudiante(estudiante), mostrar_universidad() (muestra el nombre de la universidad y la información de todos los estudiantes)
#
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea una universidad y agrega varios estudiantes.
# c) Muestra la información de la universidad y sus estudiantes.

class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.__nombre = nombre
        self.__carrera = carrera
        self.__semestre = semestre

    def mostrar_info(self):
        return f"{self.__nombre} - {self.__carrera} - Semestre {self.__semestre}"

    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_carrera(self):
        return self.__carrera

    def set_carrera(self, carrera):
        self.__carrera = carrera

    def get_semestre(self):
        return self.__semestre

    def set_semestre(self, semestre):
        self.__semestre = semestre


class Universidad:
    def __init__(self, nombre):
        self.__nombre = nombre
        self.__estudiantes = []

    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def agregar_estudiante(self, estudiante):
        self.__estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self.__nombre}")
        for e in self.__estudiantes:
            print(e.mostrar_info())

e1 = Estudiante("Juan", "Informática", 5)
e2 = Estudiante("María", "Biología", 3)
e3 = Estudiante("Pedro", "Derecho", 8)

uni = Universidad("Universidad Mayor de San Andrés")
uni.agregar_estudiante(e1)
uni.agregar_estudiante(e2)
uni.agregar_estudiante(e3)
uni.mostrar_universidad()
