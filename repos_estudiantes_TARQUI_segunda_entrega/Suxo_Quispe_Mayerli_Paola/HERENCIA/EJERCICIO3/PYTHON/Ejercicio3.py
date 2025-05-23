from datetime import datetime

# ---------- CLASES ----------
class Persona:
    def __init__(self, ci="", nombre="", apellido="", celular="", fecha_Nac="2000-01-01"):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac
    
    def mostrar(self):
        print(f"CI: {self.ci}, Nombre: {self.nombre} {self.apellido}, Celular: {self.celular}, Fecha Nac: {self.fecha_Nac}")

    def edad(self):
        nacimiento = datetime.strptime(self.fecha_Nac, "%Y-%m-%d")
        hoy = datetime.today()
        return hoy.year - nacimiento.year - ((hoy.month, hoy.day) < (nacimiento.month, nacimiento.day))

class Estudiante(Persona):
    def __init__(self, ci="", nombre="", apellido="", celular="", fecha_Nac="2000-01-01", ru="", fecha_Ingreso="2020-01-01", semestre=1):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.ru = ru
        self.fecha_Ingreso = fecha_Ingreso
        self.semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}, Fecha Ingreso: {self.fecha_Ingreso}, Semestre: {self.semestre}")

class Docente(Persona):
    def __init__(self, ci="", nombre="", apellido="", celular="", fecha_Nac="1980-01-01", nit="", profesion="", especialidad="", sexo=""):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}, Profesión: {self.profesion}, Especialidad: {self.especialidad}, Sexo: {self.sexo}")

# ---------- FUNCIONES ----------
def mostrar_estudiantes_mayores_25(estudiantes):
    print("\n--- Estudiantes mayores de 25 años ---")
    for e in estudiantes:
        if e.edad() > 25:
            e.mostrar()

def docente_ingeniero_masculino_mayor(docentes):
    filtrados = [d for d in docentes if d.profesion.lower() == "ingeniero" and d.sexo.lower() == "masculino"]
    if filtrados:
        mayor = max(filtrados, key=lambda d: d.edad())
        print("\n--- Docente ingeniero masculino mayor ---")
        mayor.mostrar()

def coincidencias_apellido(estudiantes, docentes):
    print("\n--- Coincidencias de apellido entre estudiantes y docentes ---")
    for e in estudiantes:
        for d in docentes:
            if e.apellido.lower() == d.apellido.lower():
                print("\nEstudiante:")
                e.mostrar()
                print("Docente:")
                d.mostrar()

# ---------- DATOS DE PRUEBA ----------
estudiantes = [
    Estudiante(ci="123", nombre="Ana", apellido="López", celular="777111", fecha_Nac="1995-04-20", ru="RU001", fecha_Ingreso="2019-01-01", semestre=8),
    Estudiante(ci="124", nombre="Carlos", apellido="Martínez", celular="777222", fecha_Nac="2003-05-15", ru="RU002", fecha_Ingreso="2022-02-01", semestre=3),
    Estudiante(ci="125", nombre="Luis", apellido="Gómez", celular="777333", fecha_Nac="1998-10-30", ru="RU003", fecha_Ingreso="2020-03-01", semestre=5),
]

docentes = [
    Docente(ci="201", nombre="Miguel", apellido="Gómez", celular="888111", fecha_Nac="1975-09-10", nit="NIT001", profesion="Ingeniero", especialidad="Sistemas", sexo="masculino"),
    Docente(ci="202", nombre="Lucía", apellido="López", celular="888222", fecha_Nac="1985-12-05", nit="NIT002", profesion="Licenciada", especialidad="Matemáticas", sexo="femenino"),
    Docente(ci="203", nombre="Pedro", apellido="Ramírez", celular="888333", fecha_Nac="1980-08-25", nit="NIT003", profesion="Ingeniero", especialidad="Civil", sexo="masculino"),
]

# ---------- LLAMADAS A FUNCIONES ----------
mostrar_estudiantes_mayores_25(estudiantes)
docente_ingeniero_masculino_mayor(docentes)
coincidencias_apellido(estudiantes, docentes)
