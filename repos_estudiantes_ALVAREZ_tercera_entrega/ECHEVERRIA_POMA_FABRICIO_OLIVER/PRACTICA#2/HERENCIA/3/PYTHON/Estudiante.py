from Persona import Persona

class Estudiante(Persona):
    def __init__(self):
        super().__init__()
        self.__ru = "0"
        self.__fechaIngreso = "01/01/2020"
        self.__semestre = 1

    def __init__(self, ci, nombre, apellido, celular, fechaNac, ru, fechaIngreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fechaNac)
        self.__ru = ru
        self.__fechaIngreso = fechaIngreso
        self.__semestre = semestre
    #A
    def get_ru(self):
        return self.__ru

    def set_ru(self, ru):
        self.__ru = ru

    def get_fechaIngreso(self):
        return self.__fechaIngreso

    def set_fechaIngreso(self, fechaIngreso):
        self.__fechaIngreso = fechaIngreso

    def get_semestre(self):
        return self.__semestre

    def set_semestre(self, semestre):
        self.__semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.__ru}, Fecha Ingreso: {self.__fechaIngreso}, Semestre: {self.__semestre}")