from datetime import datetime

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac  #"YYYY-MM-DD"

    def mostrar(self):
        return f"{self.nombre} {self.apellido}, CI: {self.ci}, Cel: {self.celular}, Fecha Nac: {self.fecha_Nac}"

    def edad(self):
        nacimiento = datetime.strptime(self.fecha_Nac, "%Y-%m-%d")
        hoy = datetime.now()
        return hoy.year - nacimiento.year - ((hoy.month, hoy.day) < (nacimiento.month, nacimiento.day))

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, ru, fecha_Ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.ru = ru
        self.fecha_Ingreso = fecha_Ingreso
        self.semestre = semestre

    def mostrar(self):
        return super().mostrar() + f", RU: {self.ru}, Ingreso: {self.fecha_Ingreso}, Semestre: {self.semestre}"

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, nit, profesion, especialidad, sexo):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo  

    def mostrar(self):
        return super().mostrar() + f", NIT: {self.nit}, Profesión: {self.profesion}, Especialidad: {self.especialidad}, Sexo: {self.sexo}"


# Datos
estudiantes = [
    Estudiante("123", "Ana", "López", "78912345", "1998-06-15", "RU001", "2017-02-10", 9),
    Estudiante("456", "Luis", "Mamani", "77788899", "2005-03-10", "RU002", "2023-01-20", 1),
    Estudiante("789", "Laura", "Gonzales", "72233445", "1996-12-05", "RU003", "2015-08-12", 10)
]

docentes = [
    Docente("111", "Carlos", "Mamani", "71111222", "1980-04-20", "NIT123", "Ingeniero", "Sistemas", "M"),
    Docente("222", "Teresa", "López", "73334455", "1985-07-15", "NIT456", "Arquitecta", "Diseño", "F"),
    Docente("333", "Mario", "Gonzales", "76667777", "1975-02-28", "NIT789", "Ingeniero", "Electrónica", "M")
]

# c)
print("== Estudiantes mayores de 25 años ==")
for e in estudiantes:
    if e.edad() > 25:
        print(e.mostrar())

# d)
print("\n== Docente Ingeniero Masculino más viejo ==")
mayor_ingeniero = None
for d in docentes:
    if d.profesion == "Ingeniero" and d.sexo == "M":
        if mayor_ingeniero is None or d.edad() > mayor_ingeniero.edad():
            mayor_ingeniero = d
if mayor_ingeniero:
    print(mayor_ingeniero.mostrar())

# e)
print("\n== Personas con el mismo apellido ==")
for e in estudiantes:
    for d in docentes:
        if e.apellido == d.apellido:
            print(f"Coincidencia: {e.nombre} {e.apellido} (Estudiante) - {d.nombre} {d.apellido} (Docente)")
