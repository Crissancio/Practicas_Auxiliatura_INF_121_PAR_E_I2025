'''
7. Crea un POO para una universidad y sus estudiantes. La universidad contiene 
estudiantes, pero los estudiantes pueden existir independientemente de la 
universidad.
Estudiante< nombre, carrera, semestre>
Métodos: mostrar_info() (muestra el nombre, carrera y semestre del estudiante)
Universidad<nombre, estudiantes (lista de objetos de tipo Estudiante)>
Métodos: agregar_estudiante(estudiante), mostrar_universidad() (muestra el 
nombre de la universidad y la información de todos los estudiantes)
a) Implementa las clases con sus constructores, getters y setters.
b) Crea una universidad y agrega varios estudiantes.
c) Muestra la información de la universidad y sus estudiantes.
'''

# a)
class Estudiante:
    def __init__(self, n, c, s):
        self._nombre = n
        self._carrera = c
        self._semestre = s
    
    def getNombre(self):
        return self._nombre
    
    def setNombre(self, nombre):
        self._nombre = nombre
    
    def getCarrera(self):
        return self._carrera
    
    def setCarrera(self, carrera):
        self._carrera = carrera
    
    def getSemestre(self):
        return self._semestre
    
    def setSemestre(self, semestre):
        self._semestre = semestre
    
    def mostrar_info(self):
        print("nombre:", self._nombre)
        print("carrera:", self._carrera)
        print("semestre:", self._semestre)

# a)
class Universidad:
    def __init__(self, n):
        self._nombre = n
        self._estudiantes = []
    
    def getNombre(self):
        return self._nombre
    
    def setNombre(self, nombre):
        self._nombre = nombre
    
    def agregar_estudiante(self, e):
        self._estudiantes.append(e)
    
    def mostrar_universidad(self):
        print("La universidad", self._nombre + ":")
        print("\nestudiantes de la U:")
        if not self._estudiantes:
            print("no hay estudiantes en la U")
        else:
            for estudiante in self._estudiantes:
                estudiante.mostrar_info()


if __name__ == "__main__":
    # b) 
    u = Universidad("Universidad Mayor de San Andres (UMSA)")
    
    # b) creando estudiantes
    est1 = Estudiante("Adrian Apaza", "Informática", 3)
    est2 = Estudiante("Mayerly flores", "Informatica", 5)
    est3 = Estudiante("Ariel Arteaga", "Informatica", 2)
    est4 = Estudiante("Angel Manuel", "Gastronomía", 4)
    
    # b) agregando estudiantes a la U
    u.agregar_estudiante(est1)
    u.agregar_estudiante(est2)
    u.agregar_estudiante(est4)
    
    # c) mostrando la universidad y sus estudiantes
    u.mostrar_universidad()
    print("_______________________________")
    
    # descartamos la clase Universidad pero la clase estudiante sigue funcionando
    print("Estudiante:")
    est3.mostrar_info()
