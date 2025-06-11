# Clase Docente hereda de Persona
from Persona import Persona

class Docente(Persona):
    def __init__(self):
        super().__init__()
        self.__nit = "0"
        self.__profesión = "Sin profesión"
        self.__especialidad = "Sin especialidad"

    def __init__(self, ci, nombre, apellido, celular, fechaNac, nit, profesión, especialidad):
        super().__init__(ci, nombre, apellido, celular, fechaNac)
        self.__nit = nit
        self.__profesión = profesión
        self.__especialidad = especialidad
#A
    def get_nit(self):
        return self.__nit

    def set_nit(self, nit):
        self.__nit = nit

    def get_profesión(self):
        return self.__profesión

    def set_profesión(self, profesión):
        self.__profesión = profesión

    def get_especialidad(self):
        return self.__especialidad

    def set_especialidad(self, especialidad):
        self.__especialidad = especialidad

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.__nit}, Profesión: {self.__profesión}, Especialidad: {self.__especialidad}")

    def get_sexo(self):
        return "Masculino" if self.get_nombre().lower().startswith("j") else "Femenino"