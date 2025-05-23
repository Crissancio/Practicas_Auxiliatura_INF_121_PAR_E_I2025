class Estudiante:
    def __init__(self, nombre, carrera, semestre):
        self._nombre = nombre
        self._carrera = carrera
        self._semestre = semestre
    
    # Getters
    @property
    def nombre(self):
        return self._nombre
    
    @property
    def carrera(self):
        return self._carrera
    
    @property
    def semestre(self):
        return self._semestre
    
    # Setters
    @nombre.setter
    def nombre(self, nuevo_nombre):
        self._nombre = nuevo_nombre
    
    @carrera.setter
    def carrera(self, nueva_carrera):
        self._carrera = nueva_carrera
    
    @semestre.setter
    def semestre(self, nuevo_semestre):
        self._semestre = nuevo_semestre
    
    def mostrar_info(self):
        print(f"Nombre: {self._nombre}")
        print(f"Carrera: {self._carrera}")
        print(f"Semestre: {self._semestre}")
        print("-" * 20)


class Universidad:
    def __init__(self, nombre):
        self._nombre = nombre
        self._estudiantes = []
    
    # Getters
    @property
    def nombre(self):
        return self._nombre
    
    @property
    def estudiantes(self):
        return self._estudiantes
    
    # Setters
    @nombre.setter
    def nombre(self, nuevo_nombre):
        self._nombre = nuevo_nombre
    
    def agregar_estudiante(self, estudiante):
        self._estudiantes.append(estudiante)
    
    def mostrar_universidad(self):
        print(f"Universidad: {self._nombre}")
        print("Estudiantes:")
        print("=" * 20)
        for estudiante in self._estudiantes:
            estudiante.mostrar_info()


# Creación de estudiantes
estudiante1 = Estudiante("Juan Pérez", "Ingeniería Informática", 5)
estudiante2 = Estudiante("María García", "Medicina", 3)
estudiante3 = Estudiante("Carlos López", "Derecho", 7)

# Creación de universidad y agregar estudiantes
universidad = Universidad("Universidad Nacional")
universidad.agregar_estudiante(estudiante1)
universidad.agregar_estudiante(estudiante2)
universidad.agregar_estudiante(estudiante3)

# Mostrar información
universidad.mostrar_universidad()
