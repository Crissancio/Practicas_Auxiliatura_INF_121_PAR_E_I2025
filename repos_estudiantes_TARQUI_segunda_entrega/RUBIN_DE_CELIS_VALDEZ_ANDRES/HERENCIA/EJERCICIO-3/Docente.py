from Persona import Persona

class Docente(Persona):
    def __init__(self, ci="", nombre="", apellido="", celular="", fecha_Nac="", nit="", profesion="", especialidad=""):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}, Profesion: {self.profesion}, Especialidad: {self.especialidad}")
