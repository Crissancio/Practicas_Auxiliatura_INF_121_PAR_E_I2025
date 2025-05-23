from datetime import datetime

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac
    
    def mostrar(self):
        print(f"CI: {self.ci}")
        print(f"Nombre: {self.nombre}")
        print(f"Apellido: {self.apellido}")
        print(f"Celular: {self.celular}")
        print(f"Fecha Nacimiento: {self.fecha_Nac}")
    
    def calcular_edad(self):
        nacimiento = datetime.strptime(self.fecha_Nac, "%d/%m/%Y")
        hoy = datetime.now()
        return hoy.year - nacimiento.year - ((hoy.month, hoy.day) < (nacimiento.month, nacimiento.day))

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, ru, fecha_Ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.ru = ru
        self.fecha_Ingreso = fecha_Ingreso
        self.semestre = semestre
    
    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}")
        print(f"Fecha Ingreso: {self.fecha_Ingreso}")
        print(f"Semestre: {self.semestre}")

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, nit, profesion, especialidad):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
    
    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}")
        print(f"Profesión: {self.profesion}")
        print(f"Especialidad: {self.especialidad}")

if __name__ == "__main__":
    est1 = Estudiante("1234567", "Miguel", "Garcia", "77712345", "15/05/1999", "200010101", "10/02/2020", 6)
    doc1 = Docente("9876543", "Maria", "chavez", "77754321", "20/10/1980", "123456789", "Ingeniero", "Sistemas")

    print("Información del estudiante")
    est1.mostrar()
    
    print("\nInformación del docente")
    doc1.mostrar()