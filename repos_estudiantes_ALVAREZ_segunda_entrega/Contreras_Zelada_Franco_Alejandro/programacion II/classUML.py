class Persona:
    def __init__(self, ci="0", nombre="NN", apellido="NN", celular="0", fecha_Nac="01/01/1900"):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac

    def mostrar(self):
        print(f"CI: {self.ci}, Nombre: {self.nombre} {self.apellido}, Celular: {self.celular}, Nacimiento: {self.fecha_Nac}")

    def get_apellido(self):
        return self.apellido

    def get_fecha_nac(self):
        return self.fecha_Nac


class Estudiante(Persona):
    def __init__(self, ci="0", nombre="NN", apellido="NN", celular="0", fecha_Nac="01/01/1900", ru="0", fecha_Ingreso="01/01/2025", semestre=1):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.ru = ru
        self.fecha_Ingreso = fecha_Ingreso
        self.semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}, Ingreso: {self.fecha_Ingreso}, Semestre: {self.semestre}")


class Docente(Persona):
    def __init__(self, ci="0", nombre="NN", apellido="NN", celular="0", fecha_Nac="01/01/1900", nit="0", profesion="NN", especialidad="NN", sexo="M"):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}, Profesión: {self.profesion}, Especialidad: {self.especialidad}, Sexo: {self.sexo}")

    def get_profesion(self):
        return self.profesion

    def get_sexo(self):
        return self.sexo


# Crear instancias de ejemplo
estudiantes = [
    Estudiante("123", "Ana", "Lopez", "7777", "15/03/1998", "2023001", "20/08/2023", 3),
    Estudiante("456", "Luis", "Gonzales", "8888", "20/07/2000", "2024002", "10/02/2024", 2),
    Estudiante("789", "Carla", "Perez", "9999", "05/11/1995", "2022003", "01/03/2022", 5),
]

docentes = [
    Docente("111", "Juan", "Lopez", "6666", "10/05/1980", "987", "Ingeniero", "Sistemas", "M"),
    Docente("222", "Maria", "Vargas", "5555", "25/09/1975", "654", "Abogada", "Civil", "F"),
    Docente("333", "Pedro", "Yujra", "4444", "01/12/1990", "321", "Médico", "General", "M"),
]

# c) Mostrar los estudiantes mayores de 25 años (considerando la fecha actual: 06/05/2025)
from datetime import datetime

print("Estudiantes mayores de 25 años:")
fecha_actual = datetime(2025, 5, 6)
for estudiante in estudiantes:
    fecha_nacimiento_str = estudiante.get_fecha_nac()
    dia, mes, año = map(int, fecha_nacimiento_str.split('/'))
    fecha_nacimiento = datetime(año, mes, dia)
    edad = fecha_actual.year - fecha_nacimiento.year - ((fecha_actual.month, fecha_actual.day) < (fecha_nacimiento.month, fecha_nacimiento.day))
    if edad > 25:
        estudiante.mostrar()

# d) Mostrar al docente ingeniero, masculino y mayor
ingenieros_hombres = [docente for docente in docentes if docente.get_profesion() == "Ingeniero" and docente.get_sexo() == "M"]

if ingenieros_hombres:
    mayor_ingeniero = None
    mayor_edad = -1
    for ingeniero in ingenieros_hombres:
        fecha_nacimiento_str = ingeniero.get_fecha_nac()
        dia, mes, año = map(int, fecha_nacimiento_str.split('/'))
        fecha_nacimiento = datetime(año, mes, dia)
        edad = fecha_actual.year - fecha_nacimiento.year - ((fecha_actual.month, fecha_actual.day) < (fecha_nacimiento.month, fecha_nacimiento.day))
        if edad > mayor_edad:
            mayor_edad = edad
            mayor_ingeniero = ingeniero

    if mayor_ingeniero:
        print("Docente Ingeniero, Masculino y Mayor:")
        mayor_ingeniero.mostrar()
    else:
        print("No se encontraron docentes ingenieros masculinos.")
else:
    print("No se encontraron docentes ingenieros masculinos.")

# e) Mostrar a los estudiantes y docentes que tienen el mismo apellido
print("Estudiantes y docentes con el mismo apellido:")
for estudiante in estudiantes:
    for docente in docentes:
        if estudiante.get_apellido() == docente.get_apellido():
            print("Estudiante:", end=" ")
            estudiante.mostrar()
            print("Docente:", end=" ")
            docente.mostrar()
            print("-" * 30)