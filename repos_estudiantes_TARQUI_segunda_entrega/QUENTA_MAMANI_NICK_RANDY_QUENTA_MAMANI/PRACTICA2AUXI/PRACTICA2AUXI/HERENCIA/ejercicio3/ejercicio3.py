# 3. Definir las clases:
# Persona <ci, nombre, apellido, celular, fecha_Nac>
# Estudiante (heredado de persona) <ru, fecha_Ingreso, semestre>
# Docente (heredado de persona) <nit, profesión, especialidad>
# a) Diseñar el diagrama UML de las clases anteriores.
# b) Implementa las clases con sus constructores, datos por defecto y
# mostrar.
# c) Mostrar los estudiantes mayores de 25 años.
# d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo
# masculino y es el mayor de todos.
# e) Mostrar a los estudiantes y docentes que tienen el mismo apellido.
from datetime import datetime

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac):
        self.ci, self.nombre, self.apellido, self.celular, self.fecha_nac = ci, nombre, apellido, celular, fecha_nac

    def edad(self):
        n = datetime.strptime(self.fecha_nac, "%Y-%m-%d")
        hoy = datetime.today()
        return hoy.year - n.year - ((hoy.month, hoy.day) < (n.month, n.day))

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.ru, self.fecha_ingreso, self.semestre = ru, fecha_ingreso, semestre

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, nit, profesion, especialidad, sexo):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.nit, self.profesion, self.especialidad, self.sexo = nit, profesion, especialidad, sexo

estudiantes = [
    Estudiante("123", "Luis", "Quispe", "7777", "1997-03-05", "RU123", "2020-01-01", 8),
    Estudiante("124", "Ana", "López", "8888", "2006-05-21", "RU124", "2023-01-01", 2)
]

docentes = [
    Docente("555", "Carlos", "Quispe", "6666", "1980-02-02", "NIT555", "Ingeniero", "Software", "M"),
    Docente("556", "María", "López", "9999", "1985-07-15", "NIT556", "Doctora", "Redes", "F")
]

print("\nEstudiantes mayores de 25:")
for e in estudiantes:
    if e.edad() > 25:
        print(vars(e))

print("\nDocente Ingeniero, M, mayor:")
ingenieros = [d for d in docentes if d.profesion == "Ingeniero" and d.sexo == "M"]
if ingenieros:
    print(vars(max(ingenieros, key=lambda d: d.edad())))

print("\nMismo apellido:")
for e in estudiantes:
    for d in docentes:
        if e.apellido == d.apellido:
            print(f"{e.nombre} y {d.nombre} tienen el mismo apellido: {e.apellido}")
