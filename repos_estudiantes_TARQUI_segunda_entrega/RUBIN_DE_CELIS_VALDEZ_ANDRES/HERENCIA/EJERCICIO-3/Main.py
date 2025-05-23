from Estudiante import Estudiante
from Docente import Docente

estudiantes = [
    Estudiante("1", "Ana", "Lopez", "123", "15/06/1995", "RU01", "2015", 8),
    Estudiante("2", "Luis", "Garcia", "456", "20/10/2000", "RU02", "2019", 4),
    Estudiante("3", "Jose", "Lopez", "789", "01/01/1990", "RU03", "2010", 10)
]

docentes = [
    Docente("10", "Mario", "Garcia", "321", "25/05/1980", "NIT01", "Ingeniero", "Sistemas"),
    Docente("11", "Laura", "Lopez", "654", "12/12/1985", "NIT02", "Licenciada", "Matematica"),
    Docente("12", "Carlos", "Garcia", "987", "09/09/1975", "NIT03", "Ingeniero", "Electronica")
]

print("\nEstudiantes mayores de 25 años:")
for est in estudiantes:
    if est.calcularEdad() > 25:
        est.mostrar()

print("\nDocente Ingeniero masculino y mayor:")
docente_ingeniero = None
for doc in docentes:
    if doc.profesion == "Ingeniero":
        if docente_ingeniero is None or doc.calcularEdad() > docente_ingeniero.calcularEdad():
            docente_ingeniero = doc
if docente_ingeniero:
    docente_ingeniero.mostrar()

print("\nEstudiantes y docentes con el mismo apellido:")
for est in estudiantes:
    for doc in docentes:
        if est.apellido == doc.apellido:
            print("\nCoincidencia de apellido:")
            est.mostrar()
            doc.mostrar()
