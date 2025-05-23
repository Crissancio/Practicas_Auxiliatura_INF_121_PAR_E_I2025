from datetime import datetime

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = datetime.strptime(fecha_nac, '%Y-%m-%d')

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.ru = ru
        self.fecha_ingreso = datetime.strptime(fecha_ingreso, '%Y-%m-%d')
        self.semestre = semestre

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, nit, profesion, especialidad):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad

def mayores_de_25(estudiantes):
    edad_actual = datetime.now().year
    return [estudiante for estudiante in estudiantes if (edad_actual - estudiante.fecha_nac.year) > 25]

def docente_mayor_ingeniero(docentes):
    mayores = [docente for docente in docentes if docente.profesion == "Ingeniero"]
    if mayores:
        return max(mayores, key=lambda d: d.fecha_nac)
    return None

def mismos_apellidos(estudiantes, docentes):
    apellidos = {estudiante.apellido for estudiante in estudiantes}
    return [docente for docente in docentes if docente.apellido in apellidos]

estudiantes = [
    Estudiante("58423697", "Andres", "Sanchez", "58423698", "1995-01-01", "R001", "2020-02-01", 3),
    Docente("34567890", "Sara", "González", "345678901", "1990-07-05", "NIT002", "Doctor", "medico"),
]

docentes = [
    Docente("48619752", "Carlos", "Sanchez", "48619753", "1980-05-12", "NIT001", "Ingeniero", "electrico"),
    Docente("34567890", "Juana", "González", "345678901", "1990-07-05", "NIT002", "Médico", "cirugía"),
]

print("Estudiantes mayores de 25 años:")
for estudiante in mayores_de_25(estudiantes):
    print(estudiante.nombre, estudiante.apellido)

docente_mayor = docente_mayor_ingeniero(docentes)
if docente_mayor:
    print("Docente Ingeniero mayor:")
    print(docente_mayor.nombre, docente_mayor.apellido)

print("Estudiantes y docentes con los mismos apellidos:")
for docente in mismos_apellidos(estudiantes, docentes):
    print(docente.nombre, docente.apellido)

