from Estudiante import Estudiante
from Docente import Docente
p = [
    Estudiante("130", "Mario", "López", "788888", (1994, 6, 12), "M", "RU010", "2019", 10),
    Estudiante("131", "Sofía", "Ramírez", "699999", (2002, 9, 22), "F", "RU011", "2023", 2),
    Docente("210", "Javier", "López", "511111", (1975, 2, 17), "M", "NIT010", "Arquitecto", "Diseño"),
    Docente("211", "Elena", "Ramírez", "433333", (1990, 12, 5), "F", "NIT011", "Bióloga", "Genética")
]

print("Estudiantes mayores de 25 años:")
for i in p:
    if isinstance(i, Estudiante) and i.edad() > 25:
        i.mostrar()
print("\nDocente ingeniero, masculino y el mayor:")
inge = [ d for d in p
    if isinstance(d, Docente) and d.profesion == "Ingeniero" and d.sexo.upper() == "M"]
if inge:
    mayor = max(inge, key=lambda d: d.edad())
    mayor.mostrar()
print("\nPersonas con el mismo apellido:")
a = {}
for i in p:
    a.setdefault(i.apellido, []).append(i)
for j in a.values():
    if len(j) > 1:
        for i in j:
            i.mostrar()
