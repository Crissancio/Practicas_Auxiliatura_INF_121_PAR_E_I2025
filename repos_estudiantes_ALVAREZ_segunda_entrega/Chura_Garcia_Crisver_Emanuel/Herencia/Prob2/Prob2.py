#Definir las clases:
#Persona <ci, nombre, apellido, celular, fecha_Nac>;
#Estudiante (heredado de persona) <ru, fecha_Ingreso, semestre>;
#Docente (heredado de persona) <nit, profesión, especialidad>;
class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac

    def get_ci(self): return self.ci
    def set_ci(self, value): self.ci = value

    def get_nombre(self): return self.nombre
    def set_nombre(self, value): self.nombre = value

    def get_apellido(self): return self.apellido
    def set_apellido(self, value): self.apellido = value

    def get_celular(self): return self.celular
    def set_celular(self, value): self.celular = value

    def get_fecha_Nac(self): return self.fecha_Nac
    def set_fecha_Nac(self, value): self.fecha_Nac = value

    def Mostrar(self): pass

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre

    def get_ru(self): return self.ru
    def set_ru(self, value): self.ru = value

    def get_fecha_ingreso(self): return self.fecha_ingreso
    def set_fecha_ingreso(self, value): self.fecha_ingreso = value

    def get_semestre(self): return self.semestre
    def set_semestre(self, value): self.semestre = value

    def Mostrar(self):
        print(f"Estudiante: {self.get_nombre()} {self.get_apellido()} ci: {self.get_ci()} ru: {self.get_ru()} celular: {self.get_celular()} semestre: {self.get_semestre()} fecha de nacimiento: {self.get_fecha_Nac()} fecha de ingreso: {self.get_fecha_ingreso()}")

    def EstudiantesMayores(self):
        edad = 2025 - self.get_fecha_Nac()
        if edad >= 25:
            self.Mostrar()

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, nit, profesion, especialidad, sexo):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo

    def get_nit(self): return self.nit
    def set_nit(self, value): self.nit = value

    def get_profesion(self): return self.profesion
    def set_profesion(self, value): self.profesion = value

    def get_especialidad(self): return self.especialidad
    def set_especialidad(self, value): self.especialidad = value

    def get_sexo(self): return self.sexo
    def set_sexo(self, value): self.sexo = value

    def Mostrar(self):
        print(f"Docente: {self.get_nombre()} {self.get_apellido()} ci: {self.get_ci()} nit: {self.get_nit()} celular: {self.get_celular()} profesion: {self.get_profesion()} fecha de nacimiento: {self.get_fecha_Nac()} especialidad: {self.get_especialidad()} sexo: {self.get_sexo()}")

estudiantes = []
docentes = []

def agregaEstudiante(estudiante):
    if len(estudiantes) < 6:
        estudiantes.append(estudiante)
    else:
        print("Array estudiantes llena")

def agregaDocente(docente):
    if len(docentes) < 6:
        docentes.append(docente)
    else:
        print("Array docentes llena")

def MostrarIngeMasMay():
    may = 0
    for docente in docentes:
        if docente.get_profesion() == "Ingeniero" and docente.get_sexo() == "Masculino":
            edad = 2025 - docente.get_fecha_Nac()
            if edad > may:
                may = edad

    for docente in docentes:
        if docente.get_profesion() == "Ingeniero" and docente.get_sexo() == "Masculino":
            edad2 = 2025 - docente.get_fecha_Nac()
            if edad2 == may:
                docente.Mostrar()

def MostrarApellido(String):
    for docente in docentes:
        if docente.get_apellido() == String:
            docente.Mostrar()
    
    for estudiante in estudiantes:
        if estudiante.get_apellido() == String:
            estudiante.Mostrar()

# Creación de objetos
est1 = Estudiante(13828325, "Crisver Emanuel", "Chura Garcia", 70145601, 1999, 1865765, "08/02/2024", 3)
est2 = Estudiante(13828326, "Crismar Abraham", "Chura Garcia", 70145620, 2006, 1865800, "10/02/2025", 1)
est3 = Estudiante(13828330, "Samuel Randy", "Chura Garcia", 70145622, 2009, 12345678, "05/02/2028", 1)
est4 = Estudiante(12345678, "Erick Alexander", "Huanca", 12345678, 1999, 78945612, "08/02/2024", 3)
est5 = Estudiante(78945612, "David", "Alejo", 74185296, 1998, 78945612, "08/03/2023", 4)

agregaEstudiante(est1)
agregaEstudiante(est2)
agregaEstudiante(est3)
agregaEstudiante(est4)
agregaEstudiante(est5)

doc1 = Docente(789456213, "Felipez", "Andrade", 12345678, 1975, 78945, "Docente", "Metodos numericos", "Masculino")
doc2 = Docente(123456789, "Carmen", "Huanca", 74185296, 1878, 123546, "Docente", "Base de datos", "Femenino")
doc3 = Docente(740852960, "Rosa", "Mayta", 78952134, 1980, 789123, "Ingeniero", "Fisica aplicada", "Femenino")
doc4 = Docente(102345678, "Fulanito", "Detal", 83214559, 1889, 456025, "Ingeniero", "Software", "Masculino")

agregaDocente(doc1)
agregaDocente(doc2)
agregaDocente(doc3)
agregaDocente(doc4)

print("b) Implementa las clases con sus constructores, datos por defecto y mostrar.")
for estudiante in estudiantes:
    estudiante.Mostrar()

for docente in docentes:
    docente.Mostrar()

print("--------------")
print("c) Mostrar los estudiantes mayores de 25 años.")
for estudiante in estudiantes:
    estudiante.EstudiantesMayores()

print("--------------")
print("d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo masculino y es el mayor de todos.")
MostrarIngeMasMay()

print("--------------")
print("e) Mostrar a los estudiantes y docentes que tienen el mismo apellido.")
MostrarApellido("Huanca")