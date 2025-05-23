from datetime import datetime

class Persona:
    def __init__(self, ci=0, nombre="SinNombre", apellido="SinApellido", celular=0, fecha_Nac="01-01-2000"):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac

    def mostrar(self):
        print(f"CI: {self.ci} | Nombre: {self.nombre} {self.apellido} | Celular: {self.celular} | Fecha Nac: {self.fecha_Nac}")

    def calcular_edad(self):
        nacimiento = datetime.strptime(self.fecha_Nac, "%d-%m-%Y")
        hoy = datetime.today()
        return hoy.year - nacimiento.year - ((hoy.month, hoy.day) < (nacimiento.month, nacimiento.day))

class Estudiante(Persona):
    def __init__(self, ci=0, nombre="SinNombre", apellido="SinApellido", celular=0, fecha_Nac="01-01-2000",
                 ru=0, fecha_ingreso="01-01-2020", semestre=1):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre


    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru} | Fecha Ingreso: {self.fecha_ingreso} | Semestre: {self.semestre}")

class Docente(Persona):
    def __init__(self, ci=0, nombre="SinNombre", apellido="SinApellido", celular=0, fecha_Nac="01-01-2000",
                 nit=0, profesion="SinProfesion", especialidad="SinEspecialidad", sexo="N"):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo 
    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit} | Profesión: {self.profesion} | Especialidad: {self.especialidad} | Sexo: {self.sexo}")


estudiantes = [
    Estudiante(123, "Ana", "Gomez", 7654321, "10-04-1998", 1001, "01-03-2018", 8),
    Estudiante(124, "Luis", "Perez", 7654322, "15-06-2005", 1002, "01-03-2023", 2)
]

docentes = [
    Docente(222, "Carlos", "Gomez", 1234567, "01-01-1980", 98765, "Ingeniero", "Sistemas", "M"),
    Docente(223, "María", "Torres", 7654323, "20-05-1975", 87654, "Licenciada", "Matemáticas", "F")
]
def mostrar_estudiantes_mayores_25(estudiantes):
    print("\nEstudiantes mayores de 25 años:")
    for est in estudiantes:
        if est.calcular_edad() > 25:
            est.mostrar()
def mostrar_docente_ingeniero_mayor(docentes):
    candidatos = [d for d in docentes if d.profesion.lower() == "ingeniero" and d.sexo.lower() == "m"]
    if not candidatos:
        print("\nNo hay docentes que cumplan los criterios.")
        return
    mayor = max(candidatos, key=lambda d: d.calcular_edad())
    print("\nDocente ingeniero masculino más antiguo:")
    mayor.mostrar()
def mostrar_apellidos_comunes(estudiantes, docentes):
    print("\nPersonas con apellidos comunes:")
    for est in estudiantes:
        for doc in docentes:
            if est.apellido.lower() == doc.apellido.lower():
                print("\nCoincidencia encontrada:")
                est.mostrar()
                doc.mostrar()

mostrar_estudiantes_mayores_25(estudiantes)
mostrar_docente_ingeniero_mayor(docentes)
mostrar_apellidos_comunes(estudiantes, docentes)
