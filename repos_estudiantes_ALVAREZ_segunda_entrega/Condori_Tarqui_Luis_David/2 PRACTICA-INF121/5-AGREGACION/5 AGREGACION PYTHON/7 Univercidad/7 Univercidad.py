# TEMA: AGREGACIÓN
# Enunciado:
# 7. Crea un POO para una universidad y sus estudiantes. La universidad contiene estudiantes,
# pero los estudiantes pueden existir independientemente de la universidad.
#
# Estudiante<nombre, carrera, semestre>
# Métodos: mostrar_info() (muestra el nombre, carrera y semestre del estudiante)
#
# Universidad<nombre, estudiantes (lista de objetos de tipo Estudiante)>
# Métodos: agregar_estudiante(estudiante), mostrar_universidad() (muestra el nombre de la universidad y la información de todos los estudiantes)
#
# Incisos:
# a) Implementa las clases con sus constructores, getters y setters.
# b) Crea una universidad y agrega varios estudiantes.
# c) Muestra la información de la universidad y sus estudiantes.

# a)
class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre

    def mostrar_info(self):
        print(f"{self.nombre} - Carrera: {self.carrera}, Semestre: {self.semestre}")


class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []

    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"Universidad: {self.nombre}")
        for estudiante in self.estudiantes:
            estudiante.mostrar_info()

def main():
# b) Crea una universidad y agrega varios estudiantes

    e1 = Estudiante("Brayan Ramirez", "Ingenieria de Sistemas", 3)
    e2 = Estudiante("Luis Condori", "Medicina", 5)
    e3 = Estudiante("Claudia Perez", "Derecho", 2)

    uni = Universidad("UMSA")
    uni.agregar_estudiante(e1)
    uni.agregar_estudiante(e2)
    uni.agregar_estudiante(e3)
# c) Muestra la información de la universidad y sus estudiantes
    uni.mostrar_universidad()

if __name__ == "__main__":
    main()
