from datetime import date

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = fecha_nac

    def edad(self):
        return date.today().year - self.fecha_nac.year - ((date.today().month, date.today().day) < (self.fecha_nac.month, self.fecha_nac.day))

    def mostrar(self):
        print(f"{self.nombre} {self.apellido}, CI: {self.ci}, Edad: {self.edad()}")

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}, Semestre: {self.semestre}")

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, nit, profesion, especialidad, sexo):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo

    def mostrar(self):
        super().mostrar()
        print(f"Profesión: {self.profesion}, Especialidad: {self.especialidad}, Sexo: {self.sexo}")


estudiantes = [
    Estudiante("123", "Ana", "Perez", "78912345", date(1997, 5, 1), "RU123", date(2020, 2, 1), 8),
    Estudiante("456", "Luis", "Gomez", "78912346", date(2004, 10, 10), "RU456", date(2023, 2, 1), 2)
]

docentes = [
    Docente("789", "Mario", "Perez", "78912347", date(1970, 6, 15), "NIT123", "Ingeniero", "Sistemas", 'M'),
    Docente("101", "Carlos", "Gomez", "78912348", date(1980, 1, 10), "NIT456", "Licenciado", "Matemáticas", 'M')
]

print("Estudiantes mayores de 25:")
for e in estudiantes:
    if e.edad() > 25:
        e.mostrar()

print("\nDocente Ingeniero masculino más viejo:")
ingeniero_mayor = max(
    (d for d in docentes if d.profesion == "Ingeniero" and d.sexo == 'M'),
    key=lambda x: x.edad(),
    default=None
)
if ingeniero_mayor:
    ingeniero_mayor.mostrar()

print("\nPersonas con el mismo apellido:")
for e in estudiantes:
    for d in docentes:
        if e.apellido == d.apellido:
            e.mostrar()
            d.mostrar()
