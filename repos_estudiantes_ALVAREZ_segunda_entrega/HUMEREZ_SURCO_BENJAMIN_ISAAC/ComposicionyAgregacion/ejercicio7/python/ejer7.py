#7. Crea un POO para una universidad y sus estudiantes. La universidad contiene
#estudiantes, pero los estudiantes pueden existir independientemente de la
#universidad.
#Estudiante< nombre, carrera, semestre>
#Métodos: mostrar_info() (muestra el nombre, carrera y semestre del estudiante)
#Universidad<nombre, estudiantes (lista de objetos de tipo Estudiante)>
#Métodos: agregar_estudiante(estudiante), mostrar_universidad() (muestra el
#nombre de la universidad y la información de todos los estudiantes)
#a) Implementa las clases con sus constructores, getters y setters.
#b) Crea una universidad y agrega varios estudiantes.
#c) Muestra la información de la universidad y sus estudiantes

class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self._nombre = nombre
        self._carrera = carrera
        self._semestre = semestre

    
    def get_nombre(self):
        return self._nombre

    def get_carrera(self):
        return self._carrera

    def get_semestre(self):
        return self._semestre

    
    def set_nombre(self, nombre):
        self._nombre = nombre

    def set_carrera(self, carrera):
        self._carrera = carrera

    def set_semestre(self, semestre):
        self._semestre = semestre

    def mostrar_info(self):
        print(f"Nombre: {self._nombre}, Carrera: {self._carrera}, Semestre: {self._semestre}")

class Universidad:
    def __init__(self, nombre):
        self._nombre = nombre
        self._estudiantes = []

    
    def get_nombre(self):
        return self._nombre

    def get_estudiantes(self):
        return self._estudiantes

    
    def set_nombre(self, nombre):
        self._nombre = nombre

    def agregar_estudiante(self, estudiante):
        self._estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self._nombre}")
        print("Estudiantes:")
        for estudiante in self._estudiantes:
            estudiante.mostrar_info()


if __name__ == "__main__":
    estudiante1 = Estudiante("Ana Pérez", "Ingeniería de Sistemas", 3)
    estudiante2 = Estudiante("Carlos López", "Medicina", 5)
    estudiante3 = Estudiante("Sofía Gómez", "Arquitectura", 1)

    mi_universidad = Universidad("Universidad Mayor de San Andrés")
    mi_universidad.agregar_estudiante(estudiante1)
    mi_universidad.agregar_estudiante(estudiante2)
    mi_universidad.agregar_estudiante(estudiante3)

    mi_universidad.mostrar_universidad()

    
    estudiante4 = Estudiante("Pedro Vargas", "Derecho", 2)
    estudiante4.mostrar_info()