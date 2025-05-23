from datetime import date

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = fecha_nac
        self.sexo = sexo

    def edad(self):
        hoy = date.today()
        return hoy.year - self.fecha_nac.year - ((hoy.month, hoy.day) < (self.fecha_nac.month, self.fecha_nac.day))

    def mostrar(self):
        return f"{self.nombre} {self.apellido} - CI: {self.ci} - Edad: {self.edad()}"

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac, sexo)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre

    def mostrar(self):
        return super().mostrar() + f" | Estudiante RU: {self.ru}, Semestre: {self.semestre}"

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo, nit, profesion, especialidad):
        super().__init__(ci, nombre, apellido, celular, fecha_nac, sexo)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad

    def mostrar(self):
        return super().mostrar() + f" | Docente NIT: {self.nit}, Profesión: {self.profesion}"


personas = [
    Estudiante("123", "Luis", "jueanito", "777123", date(1997, 5, 10), "M", "RU001", "2020-02-10", 8),
    Estudiante("777", "maria", "Lima", "777456", date(2004, 1, 15), "F", "RU002", "2023-01-20", 3),
    Docente("789", "noemi", "Pérez", "777789", date(1975, 3, 8), "M", "NIT001", "Ingeniero", "civil"),
    Docente("101", "deyvis", "quispe", "777101", date(1985, 7, 25), "F", "NIT002", "medicina", "Diseño")
]

print(" Estudiantes mayores de 25 años:")
for p in personas:
    if isinstance(p, Estudiante) and p.edad() > 25:
        print(p.mostrar())

print("\n Docente masculino, Ingeniero y mayor:")
mayor_ingeniero = None
for p in personas:
    if isinstance(p, Docente) and p.profesion.lower() == "ingeniero" and p.sexo.lower() == "m":
        if not mayor_ingeniero or p.edad() > mayor_ingeniero.edad():
            mayor_ingeniero = p
if mayor_ingeniero:
    print(mayor_ingeniero.mostrar())

print("\n Personas con el mismo apellido:")
for i in range(len(personas)):
    for j in range(i + 1, len(personas)):
        if personas[i].apellido.lower() == personas[j].apellido.lower():
            print(personas[i].mostrar(), "<-->", personas[j].mostrar())
            print("noemi chino blanco")
