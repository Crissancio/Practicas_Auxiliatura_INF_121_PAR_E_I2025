from datetime import datetime

class Persona:
    def __init__(self, ci="", nombre="", apellido="", celular="", fecha_Nac=""):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac

    def calcularEdad(self):
        nacimiento = datetime.strptime(self.fecha_Nac, "%d/%m/%Y")
        hoy = datetime.now()
        edad = hoy.year - nacimiento.year - ((hoy.month, hoy.day) < (nacimiento.month, nacimiento.day))
        return edad

    def mostrar(self):
        print(f"CI: {self.ci}, Nombre: {self.nombre}, Apellido: {self.apellido}, Celular: {self.celular}, Fecha Nac: {self.fecha_Nac}, Edad: {self.calcularEdad()}")
