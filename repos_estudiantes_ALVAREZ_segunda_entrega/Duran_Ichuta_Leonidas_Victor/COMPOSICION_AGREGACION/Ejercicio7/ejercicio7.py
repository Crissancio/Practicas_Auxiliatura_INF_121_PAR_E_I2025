#7. Crea un POO para una universidad y sus estudiantes.
#La universidad contiene estudiantes,
#pero los estudiantes pueden existir independientemente de la universidad.
#Estudiante< nombre, carrera, semestre>
#Métodos: mostrar_info() (muestra el nombre, carrera y semestre del estudiante)
#Universidad<nombre, estudiantes (lista de objetos de tipo Estudiante)>
#Métodos: agregar_estudiante(estudiante), mostrar_universidad()
#(muestra el nombre de la universidad y la información de todos los estudiantes)
class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre

    def mostrar_info(self):
        print(f"Nombre: {self.nombre}")
        print(f"Carrera: {self.carrera}")
        print(f"Semestre: {self.semestre}")
        print("-------------------")

    # Getters y setters
    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre

    def get_carrera(self):
        return self.carrera

    def set_carrera(self, carrera):
        self.carrera = carrera


class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []  

    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)
        print(f"Se agregó a {estudiante.nombre} a la {self.nombre}")

    def mostrar_universidad(self):
        print(f"\n------ Universidad: {self.nombre} ------")
        print("Estudiantes:")
        for estudiante in self.estudiantes:
            estudiante.mostrar_info()

    # Getters y setters
    def get_nombre(self):
        return self.nombre

    def set_nombre(self, nombre):
        self.nombre = nombre



if __name__ == "__main__":
    # b) Crear estudiantes independientes
    estudiante1 = Estudiante("Marcelo Lopez", "Ingenieria", 4)
    estudiante2 = Estudiante("Jorge Tinta", "Aeronautica", 6)
    estudiante3 = Estudiante("Victor Duran", "Informatica", 3)

    # Crear universidad y agregar estudiantes
    unam = Universidad("UMSA")
    unam.agregar_estudiante(estudiante1)
    unam.agregar_estudiante(estudiante2)

    # c) Mostrar información
    unam.mostrar_universidad()

    # Demostración de agregación: Los estudiantes existen sin la universidad
    print("\n------ Estudiantes independientes ------")
    estudiante3.mostrar_info()  
