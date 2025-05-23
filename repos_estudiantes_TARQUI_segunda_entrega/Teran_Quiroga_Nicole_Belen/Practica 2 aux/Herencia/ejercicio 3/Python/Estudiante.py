from Persona import Persona
class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, nacimiento, sexo, ru, ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, nacimiento, sexo)
        self.ru = ru
        self.ingreso = ingreso
        self.semestre = semestre
    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}, Semestre: {self.semestre}")