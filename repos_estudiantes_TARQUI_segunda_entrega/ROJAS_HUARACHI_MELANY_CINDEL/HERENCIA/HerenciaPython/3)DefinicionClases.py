from datetime import date

# a) y b) 

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = fecha_nac

    def mostrar(self):
        print(f"{self.nombre} {self.apellido} | CI: {self.ci}")

    def edad(self):
        hoy = date.today()
        return hoy.year - self.fecha_nac.year - ((hoy.month, hoy.day) < (self.fecha_nac.month, self.fecha_nac.day))


class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru} | Semestre: {self.semestre}")


class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, nit, profesion, especialidad, sexo):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit} | Profesión: {self.profesion} | Especialidad: {self.especialidad} | Sexo: {self.sexo}")


# b) 

estudiantes = [
    Estudiante("123", "Ana", "Perez", "12345", date(1998, 6, 10), "RU001", date.today(), 5),
    Estudiante("456", "Luis", "Gomez", "67890", date(2004, 4, 20), "RU002", date.today(), 2)
]

docentes = [
    Docente("789", "Carlos", "Gomez", "54321", date(1975, 1, 5), "NIT001", "Ingeniero", "Sistemas", "Masculino"),
    Docente("101", "Maria", "Perez", "12321", date(1980, 3, 12), "NIT002", "Licenciada", "Matemáticas", "Femenino")
]

# c)
print("\n Estudiantes mayores de 25:")
for e in estudiantes:
    if e.edad() > 25:
        e.mostrar()

# d) 
print("\n Docente Ingeniero, Masculino y Mayor:")
ingenieros = [d for d in docentes if d.profesion == "Ingeniero" and d.sexo == "Masculino"]
if ingenieros:
    mayor = max(ingenieros, key=lambda d: d.edad())
    mayor.mostrar()

# e) 
print("\n Estudiantes y Docentes con el mismo apellido:")
for e in estudiantes:
    for d in docentes:
        if e.apellido == d.apellido:
            print("\nCoincidencia de apellido:")
            e.mostrar()
            d.mostrar()
