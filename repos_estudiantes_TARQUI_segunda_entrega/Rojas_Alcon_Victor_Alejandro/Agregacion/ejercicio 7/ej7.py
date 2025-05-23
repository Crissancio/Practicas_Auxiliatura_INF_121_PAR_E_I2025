class Estudiante:
    def __init__(self, nombre, carrera, semestre):  
        self._nombre = nombre
        self._carrera = carrera
        self._semestre = semestre

    @property
    def nombre(self):
        return self._nombre

    @nombre.setter
    def nombre(self, valor):
        self._nombre = valor

    @property
    def carrera(self):
        return self._carrera

    @carrera.setter
    def carrera(self, valor):
        self._carrera = valor

    @property
    def semestre(self):
        return self._semestre

    @semestre.setter
    def semestre(self, valor):
        self._semestre = valor

    def mostrar_info(self):
        print(f"{self.nombre} | Carrera: {self.carrera} | Semestre: {self.semestre}")

class Universidad:
    def __init__(self, nombre):  
        self._nombre = nombre
        self._estudiantes = []

    @property
    def nombre(self):
        return self._nombre

    def agregar_estudiante(self, estudiante):
        if isinstance(estudiante, Estudiante):
            self._estudiantes.append(estudiante)

    def mostrar_universidad(self):
        print(f"\nUniversidad: {self.nombre}")
        for estudiante in self._estudiantes:
            estudiante.mostrar_info()

if __name__ == "__main__":  
    u = Universidad("Universidad Mayor de San Andres")
    e1 = Estudiante("Ana", "Ingeniería", 3)
    e2 = Estudiante("Luis", "Medicina", 5)
    e3 = Estudiante("Marta", "Derecho", 2)

    u.agregar_estudiante(e1)
    u.agregar_estudiante(e2)
    u.agregar_estudiante(e3)

    u.mostrar_universidad()