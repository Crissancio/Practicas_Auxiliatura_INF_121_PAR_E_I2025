from datetime import date

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = fecha_nac
    
    def mostrar(self):
        print(f"CI: {self.ci}")
        print(f"Nombre: {self.nombre}")
        print(f"Apellido: {self.apellido}")
        print(f"Celular: {self.celular}")
        print(f"Fecha Nacimiento: {self.fecha_nac}")
    
    def calcular_edad(self):
        today = date.today()
        return today.year - self.fecha_nac.year - ((today.month, today.day) < (self.fecha_nac.month, self.fecha_nac.day))

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre
    
    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}")
        print(f"Fecha Ingreso: {self.fecha_ingreso}")
        print(f"Semestre: {self.semestre}")

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, nit, profesion, especialidad):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
    
    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}")
        print(f"Profesion: {self.profesion}")
        print(f"Especialidad: {self.especialidad}")

def main_personas():
    # Crear lista de estudiantes
    estudiantes = [
        Estudiante("123456", "Juan", "Perez", "77711111", date(1995, 5, 15), "123456789", date.today(), 5),
        Estudiante("654321", "Maria", "Lopez", "77722222", date(2000, 8, 20), "987654321", date.today(), 3),
        Estudiante("789012", "Carlos", "Garcia", "77733333", date(1990, 3, 10), "456123789", date.today(), 7)
    ]

    # Crear lista de docentes
    docentes = [
        Docente("321654", "Pedro", "Martinez", "77744444", date(1980, 7, 25), "123", "ingeniero", "Sistemas"),
        Docente("987123", "Ana", "Garcia", "77755555", date(1975, 11, 30), "456", "licenciada", "Educacion"),
        Docente("456789", "Luis", "Perez", "77766666", date(1985, 2, 18), "789", "ingeniero", "Informatica")
    ]

    # Estudiantes mayores de 25 años
    print("=== Estudiantes mayores de 25 años ===")
    for est in estudiantes:
        if est.calcular_edad() > 25:
            est.mostrar()
            print("-------------------")

    # Docente ingeniero, masculino y mayor
    print("\n=== Docente ingeniero, masculino y mayor ===")
    mayor_docente = None
    for doc in docentes:
        if doc.profesion.lower() == "ingeniero" and doc.nombre.endswith("o"):
            if mayor_docente is None or doc.fecha_nac < mayor_docente.fecha_nac:
                mayor_docente = doc
    
    if mayor_docente:
        mayor_docente.mostrar()
    else:
        print("No se encontro docente que cumpla los requisitos")

    # Personas con mismo apellido
    print("\n=== Personas con mismo apellido ===")
    for est in estudiantes:
        for doc in docentes:
            if est.apellido.lower() == doc.apellido.lower():
                print(f"Estudiante y Docente con apellido {est.apellido}:")
                est.mostrar()
                print("---")
                doc.mostrar()
                print("-------------------")

if __name__ == "__main__":
    main_personas()