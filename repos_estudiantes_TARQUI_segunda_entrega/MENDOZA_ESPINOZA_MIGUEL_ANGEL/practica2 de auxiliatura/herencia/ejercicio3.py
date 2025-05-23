from datetime import date, datetime
class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = datetime.strptime(fecha_Nac, '%Y-%m-%d').date()
    def edad(self):
        today = date.today()
        return today.year - self.fecha_Nac.year - ((today.month, today.day) < (self.fecha_Nac.month, self.fecha_Nac.day))
    def mostrar(self):
        print(f"{self.nombre} {self.apellido}, CI: {self.ci}, Celular: {self.celular}, Fecha Nac: {self.fecha_Nac} ({self.edad()} años)")
class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, ru, fecha_Ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.ru = ru
        self.fecha_Ingreso = datetime.strptime(fecha_Ingreso, '%Y-%m-%d').date()
        self.semestre = semestre
    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}, Ingreso: {self.fecha_Ingreso}, Semestre: {self.semestre}")
class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, nit, profesion, especialidad, sexo):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo  # 'M' o 'F'

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}, Profesión: {self.profesion}, Especialidad: {self.especialidad}, Sexo: {self.sexo}")
estudiantes = [
    Estudiante("123", "Ana", "López", "789456", "1998-04-15", "RU001", "2021-02-01", 6),
    Estudiante("124", "Carlos", "García", "745896", "2005-09-20", "RU002", "2023-02-01", 2),
    Estudiante("125", "Luis", "Martínez", "987654", "1995-01-01", "RU003", "2020-02-01", 8)
]
docentes = [
    Docente("321", "José", "García", "123456", "1975-06-10", "NIT001", "Ingeniero", "Sistemas", "M"),
    Docente("322", "María", "López", "654321", "1980-08-20", "NIT002", "Matemática", "Estadística", "F"),
    Docente("323", "Pedro", "Martínez", "111222", "1965-03-25", "NIT003", "Ingeniero", "Industrial", "M")
]
print("\n--- Estudiantes mayores de 25 años ---")
for est in estudiantes:
    if est.edad() > 25:
        est.mostrar()
        print()

print("\n--- Docente masculino ingeniero de mayor edad ---")
ingenieros_masculinos = [d for d in docentes if d.profesion == "Ingeniero" and d.sexo == "M"]
if ingenieros_masculinos:
    mayor = max(ingenieros_masculinos, key=lambda x: x.edad())
    mayor.mostrar()

print("\n--- Estudiantes y Docentes con el mismo apellido ---")
for est in estudiantes:
    for doc in docentes:
        if est.apellido == doc.apellido:
            print(f"Ape: {est.apellido}")
            est.mostrar()
            doc.mostrar()
            print()