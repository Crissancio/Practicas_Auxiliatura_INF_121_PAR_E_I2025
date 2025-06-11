'''

-------------------EJERCICIO 3-------------------

Definir las clases:

Persona &lt;ci, nombre, apellido, celular, fecha_Nac&gt;
Estudiante (heredado de persona) &lt;ru, fecha_Ingreso, semestre&gt;
Docente (heredado de persona) &lt;nit, profesión, especialidad&gt;
a) Diseñar el diagrama UML de las clases anteriores.
b) Implementa las clases con sus constructores, datos por defecto y
mostrar.
c) Mostrar los estudiantes mayores de 25 años.
d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo
masculino y es el mayor de todos.
e) Mostrar a los estudiantes y docentes que tienen el mismo apellido.
'''



from Estudiante import Estudiante
from Docente import Docente

# B)
est1 = Estudiante("123456", "Juan", "Perez", "7654321", "01/01/1998", "EST001", "01/01/2020", 5)
est2 = Estudiante("789012", "Maria", "Gomez", "6543210", "15/05/2000", "EST002", "01/01/2022", 3)
doc1 = Docente("345678", "Jose", "Lopez", "5432109", "10/10/1985", "NIT001", "Ingeniero", "Sistemas")
doc2 = Docente("901234", "Ana", "Martinez", "4321098", "20/03/1990", "NIT002", "Médico", "Cardiología")

# B)
print("Información de las personas:")
est1.mostrar()
print()
est2.mostrar()
print()
doc1.mostrar()
print()
doc2.mostrar()
print()

# C)
print("Estudiantes mayores de 25 años:")
personas = [est1, est2, doc1, doc2]
for persona in personas:
    if isinstance(persona, Estudiante) and persona.calcular_edad() > 25:
        persona.mostrar()
        print()

# D)
print("Docente Ingeniero, masculino y mayor:")
max_edad = -1
docente_mayor = None
for persona in personas:
    if isinstance(persona, Docente):
        docente = persona
        edad = persona.calcular_edad()
        if (docente.get_profesión() == "Ingeniero" and 
            docente.get_sexo() == "Masculino" and 
            edad > max_edad):
            max_edad = edad
            docente_mayor = docente
if docente_mayor is not None:
    docente_mayor.mostrar()
    print()

# E)
print("Estudiantes y docentes con el mismo apellido:")
for i in range(len(personas)):
    for j in range(i + 1, len(personas)):
        if personas[i].get_apellido() == personas[j].get_apellido():
            personas[i].mostrar()
            print(" coincide con:")
            personas[j].mostrar()
            print()