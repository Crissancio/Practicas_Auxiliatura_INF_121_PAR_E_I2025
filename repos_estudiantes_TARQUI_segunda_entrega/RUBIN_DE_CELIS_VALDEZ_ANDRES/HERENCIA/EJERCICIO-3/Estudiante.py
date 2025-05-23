from Persona import Persona

class Estudiante(Persona):
    def __init__(self, ci="", nombre="", apellido="", celular="", fecha_Nac="", ru="", fecha_Ingreso="", semestre=0):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.ru = ru
        self.fecha_Ingreso = fecha_Ingreso
        self.semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}, Fecha Ingreso: {self.fecha_Ingreso}, Semestre: {self.semestre}")
