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

    def __str__(self):
        return f"Nombre: {self.__nombre}\nCarrera: {self.__carrera}\nSemestre: {self.__semestre}\n" + "-" * 30

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
        print("Universidad:", self.__nombre)
        print("Lista de Estudiantes:")
        print("=" * 30)
        for est in self.__estudiantes:
            print(est)

est1 = Estudiante("Natali Rojas", "Informática", 2)
est2 = Estudiante("Cecilia López", "Informática", 1)
est3 = Estudiante("Marcelo Portillo", "Informática", 3)

umsa = Universidad("Universidad Mayor de San Andrés")

umsa.agregar_estudiante(est1)
umsa.agregar_estudiante(est2)
umsa.agregar_estudiante(est3)
umsa.mostrar_universidad()
