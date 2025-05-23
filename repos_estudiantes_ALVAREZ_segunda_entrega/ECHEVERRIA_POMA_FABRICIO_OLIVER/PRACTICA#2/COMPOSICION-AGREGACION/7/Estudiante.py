class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.__nombre = nombre
        self.__carrera = carrera
        self.__semestre = semestre

    #A
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

    def mostrar_info(self):
        print(f"Nombre: {self.__nombre}, Carrera: {self.__carrera}, Semestre: {self.__semestre}")