from Persona import Persona
class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, nacimiento, sexo, nit, profesion, especialidad):
        super().__init__(ci, nombre, apellido, celular, nacimiento, sexo)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
    def mostrar(self):
        super().mostrar()
        print(f"Profesion: {self.profesion}, Especialidad: {self.especialidad}")