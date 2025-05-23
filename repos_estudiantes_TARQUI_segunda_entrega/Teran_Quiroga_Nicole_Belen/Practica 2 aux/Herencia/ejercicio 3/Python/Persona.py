from datetime import date
class Persona:
    def __init__(self, ci, nombre, apellido, celular, nacimiento, sexo):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.nacimiento = nacimiento
        self.sexo = sexo
    def edad(self):
        h = date.today()
        return h.year - self.nacimiento[0] - ((h.month, h.day) < (self.nacimiento[1], self.nacimiento[2]))
    def mostrar(self):
        print(f"{self.nombre} {self.apellido}, CI: {self.ci}, Edad: {self.edad()}")