from datetime import date

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac

    def edad(self):
        hoy = date.today()
        return hoy.year - self.fecha_Nac.year - ((hoy.month, hoy.day) < (self.fecha_Nac.month, self.fecha_Nac.day))

    def mostrar(self):
        return f"{self.nombre} {self.apellido}, CI: {self.ci}, Celular: {self.celular}, Fecha Nac: {self.fecha_Nac}, Edad: {self.edad()}"

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, ru, fecha_Ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.ru = ru
        self.fecha_Ingreso = fecha_Ingreso
        self.semestre = semestre

    def mostrar(self):
        return f"{super().mostrar()}, RU: {self.ru}, Ingreso: {self.fecha_Ingreso}, Semestre: {self.semestre}"

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, nit, profesion, especialidad, sexo):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo

    def mostrar(self):
        return f"{super().mostrar()}, NIT: {self.nit}, Profesión: {self.profesion}, Especialidad: {self.especialidad}, Sexo: {self.sexo}"


est1 = Estudiante("123", "Luis", "Pérez", "70000001", date(1998, 5, 20), "RU001", date(2020, 2, 10), 8)
est2 = Estudiante("124", "Ana", "López", "70000002", date(2005, 3, 15), "RU002", date(2023, 1, 20), 2)
est3 = Estudiante("125", "Mario", "Gómez", "70000003", date(1995, 9, 10), "RU003", date(2018, 7, 5), 10)

doc1 = Docente("201", "Carlos", "López", "70010001", date(1980, 1, 10), "NIT001", "Ingeniero", "Sistemas", "M")
doc2 = Docente("202", "María", "Pérez", "70010002", date(1975, 12, 25), "NIT002", "Licenciada", "Matemáticas", "F")
doc3 = Docente("203", "José", "Gómez", "70010003", date(1985, 6, 8), "NIT003", "Ingeniero", "Electrónica", "M")

print(est1.mostrar())
print(est2.mostrar())
print(est3.mostrar())

print(doc1.mostrar())
print(doc2.mostrar())
print(doc3.mostrar())

print("\nEstudiantes mayores de 25:")
for est in [est1, est2, est3]:
    if est.edad() > 25:
        print(est.mostrar())

print("\nDocente ingeniero, masculino y mayor de todos:")
ingenieros_m = [d for d in [doc1, doc2, doc3] if d.profesion == "Ingeniero" and d.sexo == "M"]
if ingenieros_m:
    mayor = max(ingenieros_m, key=lambda x: x.edad())
    print(mayor.mostrar())

print("\nPersonas con mismo apellido:")
for est in [est1, est2, est3]:
    for doc in [doc1, doc2, doc3]:
        if est.apellido == doc.apellido:
            print(est.mostrar())
            print(doc.mostrar())
