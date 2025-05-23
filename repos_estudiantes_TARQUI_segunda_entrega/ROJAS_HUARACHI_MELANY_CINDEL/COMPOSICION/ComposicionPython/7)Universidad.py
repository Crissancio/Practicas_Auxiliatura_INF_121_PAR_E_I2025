# a)

class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self._nombre = nombre
        self._carrera = carrera
        self._semestre = semestre
    
    # Getters
    def get_nombre(self):
        return self._nombre
    
    def get_carrera(self):
        return self._carrera
    
    def get_semestre(self):
        return self._semestre
    
    # Setters
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
    
    # Getters y setters para nombre
    def get_nombre(self):
        return self._nombre
    
    def set_nombre(self, nombre):
        self._nombre = nombre
    
    def agregar_estudiante(self, estudiante):
        self._estudiantes.append(estudiante)
    
    def mostrar_universidad(self):
        print(f"Universidad: {self._nombre}")
        print("Estudiantes:")
        for estudiante in self._estudiantes:
            estudiante.mostrar_info()


# b) 

uni = Universidad("Universidad Nacional")

est1 = Estudiante("Ana Pérez", "Ingeniería", 3)
est2 = Estudiante("Luis Gómez", "Medicina", 2)
est3 = Estudiante("María López", "Derecho", 5)

uni.agregar_estudiante(est1)
uni.agregar_estudiante(est2)
uni.agregar_estudiante(est3)

# c)

uni.mostrar_universidad()
