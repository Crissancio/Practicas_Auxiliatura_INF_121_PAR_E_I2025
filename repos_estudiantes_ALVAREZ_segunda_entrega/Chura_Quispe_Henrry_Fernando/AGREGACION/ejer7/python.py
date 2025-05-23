
class Estudiante:
    def __init__(self, nombre: str, carrera: str, semestre: str):
        self.nombre = nombre
        self.carrera = carrera
        self.semestre = semestre

    def mostrar_info(self):
        print(f"📖 {self.nombre} estudia {self.carrera} y está en el {self.semestre}.")


class Universidad:
    def __init__(self, nombre: str):
        self.nombre = nombre
        self.estudiantes = []  

    def agregar_estudiante(self, estudiante: Estudiante):
        self.estudiantes.append(estudiante)
        print(f"✅ Estudiante agregado: {estudiante.nombre}")

    def mostrar_universidad(self):
        print(f"\n🏫 Universidad: {self.nombre}")
        if not self.estudiantes:
            print("No hay estudiantes registrados.")
            return
        
        print("----------------------------------------------")
        for estudiante in self.estudiantes:
            estudiante.mostrar_info()
        print("----------------------------------------------")


if __name__ == "__main__":
    universidad = Universidad("UMSA")


    e1 = Estudiante("Juan", "Informática", "Segundo semestre")
    e2 = Estudiante("Mario", "Ingeniería", "Cuarto semestre")
    e3 = Estudiante("Julio", "Medicina", "Quinto semestre")

    
    for estudiante in [e1, e2, e3]:
        universidad.agregar_estudiante(estudiante)

    universidad.mostrar_universidad()
