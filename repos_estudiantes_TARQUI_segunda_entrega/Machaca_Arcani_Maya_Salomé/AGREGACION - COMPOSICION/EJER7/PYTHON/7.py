class Estudiante:
    def __init__(self, nombre: str, carrera: str, semestre: int):
        self.__nombre = nombre
        self.__carrera = carrera
        self.__semestre = semestre

    def mostrar_info(self):
        print(f"Nombre: {self.__nombre}, Carrera: {self.__carrera}, Semestre: {self.__semestre}")

    def get_nombre(self): return self.__nombre
    def get_carrera(self): return self.__carrera
    def get_semestre(self): return self.__semestre

    def set_nombre(self, nombre): self.__nombre = nombre
    def set_carrera(self, carrera): self.__carrera = carrera
    def set_semestre(self, semestre): self.__semestre = semestre


class Universidad:
    def __init__(self, nombre: str):
        self.__nombre = nombre
        self.__estudiantes = []

    def agregar_estudiante(self, estudiante: Estudiante):
        self.__estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self.__nombre}")
        for est in self.__estudiantes:
            est.mostrar_info()
            print("------")

    def get_nombre(self): return self.__nombre
    def set_nombre(self, nombre): self.__nombre = nombre


e1 = Estudiante("Ana", "Informatica", 3)
e2 = Estudiante("Luis", "Electronica", 2)
e3 = Estudiante("Marta", "Sistemas", 5)

umsaxx = Universidad("UMSA")
umsaxx.agregar_estudiante(e1)
umsaxx.agregar_estudiante(e2)
umsaxx.agregar_estudiante(e3)

umsaxx.mostrar_universidad()
