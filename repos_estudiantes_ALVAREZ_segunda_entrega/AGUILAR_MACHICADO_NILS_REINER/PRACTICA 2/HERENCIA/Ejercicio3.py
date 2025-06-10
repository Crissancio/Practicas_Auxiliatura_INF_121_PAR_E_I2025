from datetime import datetime

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = fecha_nac  # formato: "YYYY-MM-DD"

    def edad(self):
        nacimiento = datetime.strptime(self.fecha_nac, "%Y-%m-%d")
        hoy = datetime.now()
        return hoy.year - nacimiento.year - ((hoy.month, hoy.day) < (nacimiento.month, nacimiento.day))

    def mostrar(self):
        return f"{self.nombre} {self.apellido} ({self.ci}) - Cel: {self.celular}, Nac: {self.fecha_nac}"

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre

    def mostrar(self):
        return super().mostrar() + f" | RU: {self.ru}, Ingreso: {self.fecha_ingreso}, Semestre: {self.semestre}"

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, nit, profesion, especialidad, sexo):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo

    def mostrar(self):
        return super().mostrar() + f" | NIT: {self.nit}, Profesion: {self.profesion}, Especialidad: {self.especialidad}, Sexo: {self.sexo}"

personas = [
    Estudiante("123", "Ana", "Perez", "7891234", "1997-05-10", "RU001", "2021-01-10", 5),
    Estudiante("456", "Luis", "Gomez", "7891235", "2006-09-15", "RU002", "2023-01-10", 2),
    Docente("789", "Carlos", "Perez", "7891236", "1980-02-20", "NIT001", "Ingeniero", "Sistemas", "M"),
    Docente("321", "Maria", "Gomez", "7891237", "1985-07-01", "NIT002", "Licenciada", "Matemática", "F")
]

print("--- Estudiantes mayores de 25 años ---")
for p in personas:
    if isinstance(p, Estudiante) and p.edad() > 25:
        print(p.mostrar())

print("\n--- Docente Ingeniero, masculino y mayor ---")
docentes_m = [p for p in personas if isinstance(p, Docente) and p.profesion == "Ingeniero" and p.sexo == "M"]
if docentes_m:
    mayor = max(docentes_m, key=lambda d: d.edad())
    print(mayor.mostrar())

print("\n--- Personas con mismo apellido ---")
for i in range(len(personas)):
    for j in range(i + 1, len(personas)):
        if personas[i].apellido == personas[j].apellido:
            print(personas[i].mostrar())
            print(personas[j].mostrar())
