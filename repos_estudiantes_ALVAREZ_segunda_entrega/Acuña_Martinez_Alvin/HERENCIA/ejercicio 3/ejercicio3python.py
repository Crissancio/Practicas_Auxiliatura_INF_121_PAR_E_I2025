# 3. Definir las clases:
# Persona <ci, nombre, apellido, celular, fecha_Nac>
# Estudiante (heredado de persona) <ru, fecha_Ingreso, semestre>
# Docente (heredado de persona) <nit, profesión, especialidad>

from datetime import datetime

# a) Clase Persona con atributos y métodos requeridos
class Persona:
    def __init__(self, ci="", nombre="", apellido="", celular="", fecha_nac="2000-01-01"):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = datetime.strptime(fecha_nac, "%Y-%m-%d")

    def get_edad(self):
        hoy = datetime.now()
        return hoy.year - self.fecha_nac.year - ((hoy.month, hoy.day) < (self.fecha_nac.month, self.fecha_nac.day))

    # b) Método mostrar para Persona
    def mostrar(self):
        print(f"CI: {self.ci}, Nombre: {self.nombre} {self.apellido}, Celular: {self.celular}, Fecha Nac: {self.fecha_nac.date()}, Edad: {self.get_edad()}")

# a) Clase Estudiante hereda de Persona
class Estudiante(Persona):
    def __init__(self, ci="", nombre="", apellido="", celular="", fecha_nac="2000-01-01",
                 ru="", fecha_ingreso="2020-01-01", semestre=1):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.ru = ru
        self.fecha_ingreso = datetime.strptime(fecha_ingreso, "%Y-%m-%d")
        self.semestre = semestre

    # b) Método mostrar para Estudiante
    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}, Fecha Ingreso: {self.fecha_ingreso.date()}, Semestre: {self.semestre}")

# a) Clase Docente hereda de Persona
class Docente(Persona):
    def __init__(self, ci="", nombre="", apellido="", celular="", fecha_nac="2000-01-01",
                 nit="", profesion="", especialidad="", sexo=""):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo

    # b) Método mostrar para Docente
    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}, Profesión: {self.profesion}, Especialidad: {self.especialidad}, Sexo: {self.sexo}")

# b) Crear listas de objetos Estudiante y Docente
estudiantes = [
    Estudiante("123", "Juan", "Perez", "789456123", "1995-03-15", "RU001", "2015-03-01", 8),
    Estudiante("124", "Maria", "Lopez", "789456124", "2000-07-20", "RU002", "2018-03-01", 4),
    Estudiante("125", "Carlos", "Gomez", "789456125", "1998-10-10", "RU003", "2017-03-01", 6)
]

docentes = [
    Docente("200", "Luis", "Perez", "789123456", "1970-05-05", "NIT001", "Ingeniero", "Sistemas", "Masculino"),
    Docente("201", "Ana", "Lopez", "789123457", "1980-08-15", "NIT002", "Abogada", "Derecho Penal", "Femenino"),
    Docente("202", "Pedro", "Sanchez", "789123458", "1965-01-25", "NIT003", "Ingeniero", "Civil", "Masculino")
]

# c) Mostrar estudiantes mayores de 25 años
print("Estudiantes mayores de 25 años:")
for e in estudiantes:
    if e.get_edad() > 25:
        e.mostrar()

# d) Mostrar docente ingeniero masculino mayor de todos
print("\nDocente Ingeniero masculino mayor de todos:")
mayor_ingeniero = None
for d in docentes:
    if d.profesion.lower() == "ingeniero" and d.sexo.lower() == "masculino":
        if mayor_ingeniero is None or d.get_edad() > mayor_ingeniero.get_edad():
            mayor_ingeniero = d
if mayor_ingeniero:
    mayor_ingeniero.mostrar()
else:
    print("No se encontró docente con las características.")

# e) Mostrar estudiantes y docentes con el mismo apellido
print("\nEstudiantes y docentes con el mismo apellido:")
for e in estudiantes:
    for d in docentes:
        if e.apellido.lower() == d.apellido.lower():
            print(f"\nApellido: {e.apellido}")
            print("Estudiante:")
            e.mostrar()
            print("Docente:")
            d.mostrar()
