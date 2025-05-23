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


est1 = Estudiante("301", "Javier", "Ramírez", "76543210", date(1997, 8, 14), "RU101", date(2019, 3, 25), 7)
est2 = Estudiante("302", "Elena", "Fernández", "78912345", date(2004, 11, 30), "RU102", date(2022, 5, 18), 3)
est3 = Estudiante("303", "Roberto", "Martínez", "71234567", date(1996, 4, 5), "RU103", date(2017, 9, 10), 9)

doc1 = Docente("401", "Fernando", "García", "75555555", date(1979, 6, 20), "NIT101", "Arquitecto", "Urbanismo", "M")
doc2 = Docente("402", "Laura", "Rodríguez", "76666666", date(1982, 2, 3), "NIT102", "Doctora", "Pediatría", "F")
doc3 = Docente("403", "Miguel", "Hernández", "77777777", date(1984, 10, 12), "NIT103", "Abogado", "Derecho Penal", "M")

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

print("\nDocente arquitecto, masculino y mayor de todos:")
arquitectos_m = [d for d in [doc1, doc2, doc3] if d.profesion == "Arquitecto" and d.sexo == "M"]
if arquitectos_m:
    mayor = max(arquitectos_m, key=lambda x: x.edad())
    print(mayor.mostrar())

print("\nPersonas con mismo apellido:")
for est in [est1, est2, est3]:
    for doc in [doc1, doc2, doc3]:
        if est.apellido == doc.apellido:
            print(est.mostrar())
            print(doc.mostrar())
