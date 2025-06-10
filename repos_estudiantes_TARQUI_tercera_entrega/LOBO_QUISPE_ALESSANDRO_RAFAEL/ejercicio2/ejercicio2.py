from datetime import datetime

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = fecha_nac  # string: "YYYY-MM-DD"
        self.sexo = sexo

    def edad(self):
        nacimiento = datetime.strptime(self.fecha_nac, "%Y-%m-%d")
        hoy = datetime.now()
        return hoy.year - nacimiento.year - ((hoy.month, hoy.day) < (nacimiento.month, nacimiento.day))

    def mostrar(self):
        print(f"{self.nombre} {self.apellido}, CI: {self.ci}, Celular: {self.celular}, Fecha Nac: {self.fecha_nac}, Edad: {self.edad()}, Sexo: {self.sexo}")


class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac, sexo)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}, Fecha Ingreso: {self.fecha_ingreso}, Semestre: {self.semestre}")


class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo, nit, profesion, especialidad):
        super().__init__(ci, nombre, apellido, celular, fecha_nac, sexo)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}, Profesión: {self.profesion}, Especialidad: {self.especialidad}")


# Instancias de prueba
estudiantes = [
    Estudiante("123", "Carlos", "Lopez", "71234567", "1997-05-10", "M", "2020RU", "2020-03-01", 8),
    Estudiante("124", "Maria", "Gomez", "72345678", "2005-04-22", "F", "2023RU", "2023-03-01", 2)
]

docentes = [
    Docente("456", "Luis", "Lopez", "78901234", "1980-02-15", "M", "789456", "Ingeniero", "Sistemas"),
    Docente("457", "Ana", "Gomez", "79876543", "1985-10-10", "F", "654321", "Licenciada", "Matemáticas")
]

print("=== Estudiantes mayores de 25 años ===")
for e in estudiantes:
    if e.edad() > 25:
        e.mostrar()
        print("-" * 40)

print("=== Docente más viejo, Ingeniero y masculino ===")
mayor_ingeniero = None
for d in docentes:
    if d.profesion == "Ingeniero" and d.sexo == "M":
        if mayor_ingeniero is None or d.edad() > mayor_ingeniero.edad():
            mayor_ingeniero = d
if mayor_ingeniero:
    mayor_ingeniero.mostrar()

print("=== Coincidencias de Apellido entre Estudiantes y Docentes ===")
for e in estudiantes:
    for d in docentes:
        if e.apellido == d.apellido:
            print(f"Coincidencia: {e.nombre} {e.apellido} ↔ {d.nombre} {d.apellido}")
