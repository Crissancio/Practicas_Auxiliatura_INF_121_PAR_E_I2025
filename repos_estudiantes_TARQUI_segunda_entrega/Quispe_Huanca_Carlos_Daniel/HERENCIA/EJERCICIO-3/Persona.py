from datetime import datetime


class Persona:
    def __init__(self, ci="", nombre="", apellido="", celular="", fecha_Nac="2000-01-01", sexo=""):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac
        self.sexo = sexo

    def calcular_edad(self):
        hoy = datetime.now()
        nacimiento = datetime.strptime(self.fecha_Nac, "%Y-%m-%d")
        edad = hoy.year - nacimiento.year - ((hoy.month, hoy.day) < (nacimiento.month, nacimiento.day))
        return edad

    def mostrar(self):
        print(f"CI: {self.ci}")
        print(f"Nombre: {self.nombre}")
        print(f"Apellido: {self.apellido}")
        print(f"Celular: {self.celular}")
        print(f"Fecha Nacimiento: {self.fecha_Nac}")
        print(f"Sexo: {self.sexo}")
        print(f"Edad: {self.calcular_edad()} años")


class Estudiante(Persona):
    def __init__(self, ci="", nombre="", apellido="", celular="", fecha_Nac="2000-01-01", sexo="", ru="",
                 fecha_Ingreso="2020-01-01", semestre=1):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac, sexo)
        self.ru = ru
        self.fecha_Ingreso = fecha_Ingreso
        self.semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}")
        print(f"Fecha Ingreso: {self.fecha_Ingreso}")
        print(f"Semestre: {self.semestre}")


class Docente(Persona):
    def __init__(self, ci="", nombre="", apellido="", celular="", fecha_Nac="2000-01-01", sexo="", nit="", profesion="",
                 especialidad=""):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac, sexo)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}")
        print(f"Profesión: {self.profesion}")
        print(f"Especialidad: {self.especialidad}")


estudiantes = [
    Estudiante("12345", "Juan", "Perez", "70012345", "1995-05-15", "M", "123456", "2020-01-10", 6),
    Estudiante("67890", "Maria", "Gomez", "60098765", "2000-08-20", "F", "789012", "2021-03-15", 4),
    Estudiante("54321", "Carlos", "Lopez", "71054321", "1990-11-30", "M", "345678", "2019-08-20", 8),
    Estudiante("98765", "Ana", "Gomez", "60011223", "1998-03-10", "F", "901234", "2020-02-05", 5)
]

docentes = [
    Docente("11223", "Pedro", "Martinez", "72033445", "1985-07-12", "M", "111222", "Ingeniero", "Sistemas"),
    Docente("33445", "Luisa", "Gomez", "73055667", "1978-09-25", "F", "333444", "Licenciada", "Educación"),
    Docente("55667", "Jorge", "Fernandez", "74077889", "1970-12-05", "M", "555666", "Ingeniero", "Electrónica"),
    Docente("77889", "Mario", "Lopez", "75099001", "1965-04-18", "M", "777888", "Doctor", "Medicina")
]

print("\nEstudiantes mayores de 25 años:")
for estudiante in estudiantes:
    if estudiante.calcular_edad() > 25:
        estudiante.mostrar()

docentes_ingenieros_masculinos = [d for d in docentes if d.profesion == "Ingeniero" and d.sexo == "M"]
if docentes_ingenieros_masculinos:
    mayor = max(docentes_ingenieros_masculinos, key=lambda d: d.calcular_edad())
    print("\nDocente Ingeniero masculino más mayor:")
    mayor.mostrar()

print("\nPersonas con el mismo apellido:")
apellidos = {}
for persona in estudiantes + docentes:
    if persona.apellido in apellidos:
        apellidos[persona.apellido].append(persona)
    else:
        apellidos[persona.apellido] = [persona]

for apellido, personas in apellidos.items():
    if len(personas) > 1:
        print(f"\nApellido {apellido}:")
        for persona in personas:
            if isinstance(persona, Estudiante):
                print(f"Estudiante: {persona.nombre} {persona.apellido}")
            else:
                print(f"Docente: {persona.nombre} {persona.apellido}")