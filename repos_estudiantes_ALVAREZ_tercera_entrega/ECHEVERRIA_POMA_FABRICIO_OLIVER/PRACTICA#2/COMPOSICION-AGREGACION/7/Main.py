'''
TEMA AGREGACION

----------------EJERCICIO 7----------------

Crea un POO para una universidad y sus estudiantes. La universidad contiene
estudiantes, pero los estudiantes pueden existir independientemente de la
universidad.
Estudiante&lt; nombre, carrera, semestre&gt;
Métodos: mostrar_info() (muestra el nombre, carrera y semestre del estudiante)
Universidad&lt;nombre, estudiantes (lista de objetos de tipo Estudiante)&gt;
Métodos: agregar_estudiante(estudiante), mostrar_universidad() (muestra el
nombre de la universidad y la información de todos los estudiantes)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea una universidad y agrega varios estudiantes.
c) Muestra la información de la universidad y sus estudiantes.
'''

from Universidad import Universidad
from Estudiante import Estudiante

#B)
universidad = Universidad("UMSA")
universidad.agregar_estudiante(Estudiante("Elon Musk", "Ingeniería", 5))
universidad.agregar_estudiante(Estudiante("Bill Gates", "Medicina", 3))
universidad.agregar_estudiante(Estudiante("Steve Jobs", "Derecho", 6))
#C
universidad.mostrar_universidad()