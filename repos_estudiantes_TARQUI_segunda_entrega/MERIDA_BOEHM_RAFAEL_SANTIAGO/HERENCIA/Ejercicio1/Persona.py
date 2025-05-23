from datetime import datetime

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = fecha_nac  # formato: 'YYYY-MM-DD'

    def mostrar_info(self):
        print(f"{self.nombre} {self.apellido}, CI: {self.ci}, Celular: {self.celular}, Nac: {self.fecha_nac}")

    def calcular_edad(self):
        hoy = datetime.today()
        nacimiento = datetime.strptime(self.fecha_nac, "%Y-%m-%d")
        return hoy.year - nacimiento.year - ((hoy.month, hoy.day) < (nacimiento.month, nacimiento.day))


class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre

    def mostrar_info(self):
        super().mostrar_info()
        print(f"RU: {self.ru}, Ingreso: {self.fecha_ingreso}, Semestre: {self.semestre}")


class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, nit, profesion, especialidad, sexo):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo

    def mostrar_info(self):
        super().mostrar_info()
        print(f"NIT: {self.nit}, Profesión: {self.profesion}, Especialidad: {self.especialidad}, Sexo: {self.sexo}")


# Instancias de prueba
estudiantes = [
    Estudiante("123", "Ana", "López", "78945612", "1998-06-15", "RU001", "2020-02-15", 6),
    Estudiante("456", "Luis", "Gómez", "78945613", "2003-04-20", "RU002", "2022-01-10", 2),
    Estudiante("789", "Clara", "López", "78945614", "1995-03-10", "RU003", "2018-03-10", 8),
]

docentes = [
    Docente("321", "Mario", "López", "78912345", "1980-01-01", "NIT001", "Ingeniero", "Sistemas", "M"),
    Docente("654", "Juana", "Gómez", "78912346", "1975-09-10", "NIT002", "Licenciada", "Matemáticas", "F")
]

print("Estudiantes mayores de 25 años:")
for est in estudiantes:
    if est.calcular_edad() > 25:
        est.mostrar_info()
        print()

print("Docente que es ingeniero, masculino y mayor de todos:")
mayor_docente = None
for doc in docentes:
    if doc.profesion == "Ingeniero" and doc.sexo == "M":
        if mayor_docente is None or doc.calcular_edad() > mayor_docente.calcular_edad():
            mayor_docente = doc

if mayor_docente:
    mayor_docente.mostrar_info()
    print()

print("Estudiantes y docentes que tienen el mismo apellido:")
for est in estudiantes:
    for doc in docentes:
        if est.apellido == doc.apellido:
            est.mostrar_info()
            doc.mostrar_info()
            print()
