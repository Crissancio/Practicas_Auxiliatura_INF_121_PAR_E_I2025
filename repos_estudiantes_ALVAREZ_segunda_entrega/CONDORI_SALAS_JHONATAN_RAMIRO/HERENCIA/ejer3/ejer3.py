from datetime import date, datetime
class Persona:
    def __init__(self, ci="0", nombre="Nombre", apellido="Apellido", celular="0000000", fecha_nac="2000-01-01"):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = datetime.strptime(fecha_nac, "%Y-%m-%d").date()
    def mostrar(self):
        print(f"CI: {self.ci} | Nombre: {self.nombre} {self.apellido} | Celular: {self.celular} | Fecha Nac: {self.fecha_nac}")
    def edad(self):
        hoy = date.today()
        return hoy.year - self.fecha_nac.year - ((hoy.month, hoy.day) < (self.fecha_nac.month, self.fecha_nac.day))
class Estudiante(Persona):
    def __init__(self, ci="0", nombre="Nombre", apellido="Apellido", celular="0000000", fecha_nac="2000-01-01", 
                 ru="RU000", fecha_ingreso="2020-01-01", semestre="1"):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.ru = ru
        self.fecha_ingreso = datetime.strptime(fecha_ingreso, "%Y-%m-%d").date()
        self.semestre = semestre
    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru} | Fecha Ingreso: {self.fecha_ingreso} | Semestre: {self.semestre}\n")
class Docente(Persona):
    def __init__(self, ci="0", nombre="Nombre", apellido="Apellido", celular="0000000", fecha_nac="2000-01-01", 
                 nit="NIT000", profesion="Profesión", especialidad="Especialidad", sexo="Masculino"):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo
    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit} | Profesión: {self.profesion} | Especialidad: {self.especialidad} | Sexo: {self.sexo}\n")

est1 = Estudiante("101", "Carlos", "López", "7654321", "1998-06-15", "RU001", "2021-02-01", "5")
est2 = Estudiante("102", "Ana", "García", "7123456", "2004-03-22", "RU002", "2022-01-01", "2")
est3 = Estudiante("103", "Luis", "Pérez", "7991234", "1995-11-10", "RU003", "2019-08-01", "7")
doc1 = Docente("201", "Mario", "López", "7123876", "1980-10-05", "NIT001", "Ingeniero", "Sistemas", "Masculino")
doc2 = Docente("202", "Elena", "García", "7982321", "1985-09-20", "NIT002", "Arquitecta", "Diseño", "Femenino")
doc3 = Docente("203", "Pablo", "Pérez", "7992222", "1975-04-01", "NIT003", "Ingeniero", "Civil", "Masculino")
estudiantes = [est1, est2, est3]
docentes = [doc1, doc2, doc3]
print("\nEstudiantes mayores de 25 años:")
for est in estudiantes:
    if est.edad() > 25:
        est.mostrar()
print("Docente masculino con profesión 'Ingeniero' y mayor edad:")
ingenieros_mayores = [d for d in docentes if d.profesion == "Ingeniero" and d.sexo == "Masculino"]
if ingenieros_mayores:
    mayor = max(ingenieros_mayores, key=lambda x: x.edad())
    mayor.mostrar()
print("Estudiantes y docentes con apellidos coincidentes:")
for est in estudiantes:
    for doc in docentes:
        if est.apellido == doc.apellido:
            print(f"Coincidencia de apellido: {est.apellido}")
            est.mostrar()
            doc.mostrar()
