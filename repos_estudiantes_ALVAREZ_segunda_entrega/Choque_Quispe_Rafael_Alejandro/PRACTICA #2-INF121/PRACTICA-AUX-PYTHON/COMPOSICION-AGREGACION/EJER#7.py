class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre
    
    def mostrar_info(self):
        print(f"Nombre: {self.nombre}")
        print(f"Carrera: {self.carrera}")
        print(f"Semestre: {self.semestre}")

class Universidad:
    def __init__(self, nombre):
        self.nombre = nombre
        self.estudiantes = []
    
    def agregar_estudiante(self, estudiante):
        self.estudiantes.append(estudiante)
    
    def mostrar_universidad(self):
        print(f"=== Universidad: {self.nombre} ===")
        print("=== Estudiantes ===")
        for estudiante in self.estudiantes:
            estudiante.mostrar_info()
            print("-------------------")

if __name__ == "__main__":
    # Estudiantes existen independientemente
    juan = Estudiante("Juan Perez", "Informatica", 3)
    maria = Estudiante("Maria Lopez", "Medicina", 5)
    carlos = Estudiante("Carlos Garcia", "Derecho", 2)

    umsa = Universidad("UMSA")
    umsa.agregar_estudiante(juan)
    umsa.agregar_estudiante(maria)
    umsa.agregar_estudiante(carlos)
    umsa.mostrar_universidad()
    # Demostración de agregación
    print("\n=== Estudiantes independientes ===")
    juan.mostrar_info()
    print("-------------------")
    maria.mostrar_info()