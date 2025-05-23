from datetime import date

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = fecha_nac

    def mostrar_info(self):
        print(f"CI: {self.ci}, Nombre: {self.nombre} {self.apellido}, Celular: {self.celular}, Fecha Nac: {self.fecha_nac}")

    def calcular_edad(self):
        today = date.today()
        return today.year - self.fecha_nac.year - ((today.month, today.day) < (self.fecha_nac.month, self.fecha_nac.day))

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre

    def mostrar_info(self):
        super().mostrar_info()
        print(f"RU: {self.ru}, Fecha Ingreso: {self.fecha_ingreso}, Semestre: {self.semestre}")

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, nit, profesion, especialidad):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad

    def mostrar_info(self):
        super().mostrar_info()
        print(f"NIT: {self.nit}, Profesión: {self.profesion}, Especialidad: {self.especialidad}")

estudiantes = [
    Estudiante("123", "Ana", "López", "7894561", date(1997, 5, 20), "RU123", date(2020, 2, 1), 7),
    Estudiante("456", "Luis", "Martínez", "7894562", date(2002, 3, 15), "RU456", date(2021, 3, 10), 4),
    Estudiante("789", "Laura", "Gómez", "7894563", date(1995, 8, 30), "RU789", date(2019, 8, 1), 9)
]

docentes = [
    Docente("321", "Carlos", "Martínez", "7899999", date(1975, 4, 10), "NIT321", "Ingeniero", "Sistemas"),
    Docente("654", "Pedro", "Pérez", "7888888", date(1980, 10, 5), "NIT654", "Licenciado", "Matemáticas")
]

print("Estudiantes mayores de 25 años:")
for est in estudiantes:
    if est.calcular_edad() > 25:
        est.mostrar_info()
        print()

ingenieros = [doc for doc in docentes if doc.profesion.lower() == "ingeniero"]
if ingenieros:
    mayor_ingeniero = max(ingenieros, key=lambda d: d.calcular_edad())
    print("Docente Ingeniero más viejo:")
    mayor_ingeniero.mostrar_info()
    print()

print("Coincidencias de apellido entre estudiantes y docentes:")
for est in estudiantes:
    for doc in docentes:
        if est.apellido.lower() == doc.apellido.lower():
            print(f"{est.nombre} {est.apellido} y {doc.nombre} {doc.apellido} tienen el mismo apellido")
            est.mostrar_info()
            doc.mostrar_info()
            print()
