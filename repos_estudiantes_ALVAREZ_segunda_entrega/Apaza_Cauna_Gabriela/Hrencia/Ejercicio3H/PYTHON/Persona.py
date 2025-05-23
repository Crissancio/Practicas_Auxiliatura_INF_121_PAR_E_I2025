from datetime import date

class Persona:
    def __init__(self, ci="0000000", nombre="Sin Nombre", apellido="Sin Apellido",
                 celular="00000000", fecha_nac=date(2000, 1, 1)):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nacimiento = fecha_nac

    def get_edad(self):
        today = date.today()
        age = today.year - self.fecha_nacimiento.year - \
              ((today.month, today.day) < (self.fecha_nacimiento.month, self.fecha_nacimiento.day))
        return age

    def mostrar(self):
        print("--- Datos de Persona ---")
        print(f"CI: {self.ci}")
        print(f"Nombre: {self.nombre}")
        print(f"Apellido: {self.apellido}")
        print(f"Celular: {self.celular}")
        print(f"Fecha de Nacimiento: {self.fecha_nacimiento}")
        print(f"Edad: {self.get_edad()} años")
    def get_apellido(self):
        return self.apellido
    def get_nombre(self):
        return self.nombre
    def get_profesion(self):
        return None
    def get_sexo(self):
        return None


class Estudiante(Persona):
    def __init__(self, ci="0000000", nombre="Sin Nombre", apellido="Sin Apellido",
                 celular="00000000", fecha_nac=date(2000, 1, 1),
                 ru="000000000", fecha_ingreso=date(2020, 1, 1), semestre=1):
       
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre

    def mostrar(self):
        super().mostrar() 
        print("--- Datos de Estudiante ---")
        print(f"RU: {self.ru}")
        print(f"Fecha de Ingreso: {self.fecha_ingreso}")
        print(f"Semestre: {self.semestre}")

class Docente(Persona):
    def __init__(self, ci="0000000", nombre="Sin Nombre", apellido="Sin Apellido",
                 celular="00000000", fecha_nac=date(2000, 1, 1),
                 nit="00000000000", profesion="Sin Profesion", especialidad="Sin Especialidad", sexo="Desconocido"):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo

    def mostrar(self):
        super().mostrar() 
        print("--- Datos de Docente ---")
        print(f"NIT: {self.nit}")
        print(f"Profesión: {self.profesion}")
        print(f"Especialidad: {self.especialidad}")
        print(f"Sexo: {self.sexo}")

    def get_profesion(self):
        return self.profesion
    def get_sexo(self):
        return self.sexo

estudiantes = [
    Estudiante("1234567", "Ana", "Gonzales", "77711122", date(1998, 5, 10), "E1001", date(2018, 2, 1), 8), # 26 años
    Estudiante("7654321", "Pedro", "Mamani", "66633344", date(1995, 11, 20), "E1002", date(2015, 8, 1), 10), # 29 años
    Estudiante("1122334", "Maria", "Quispe", "70055566", date(2002, 3, 15), "E1003", date(2020, 2, 1), 5), # 23 años
    Estudiante("4455667", "Juan", "Vargas", "78899900", date(1990, 7, 25), "E1004", date(2010, 8, 1), 12), # 34 años
    Estudiante("8765432", "Laura", "Gonzales", "71122233", date(2001, 9, 5), "E1005", date(2019, 2, 1), 7) # 23 años
]

docentes = [
    Docente("D1001", "Carlos", "Perez", "75511122", date(1970, 1, 1), "NIT111", "Ingeniero", "Sistemas", "Masculino"), # 55 años
    Docente("D1002", "Elena", "Lopez", "76633344", date(1980, 6, 15), "NIT222", "Licenciado", "Matemáticas", "Femenino"), # 44 años
    Docente("D1003", "Roberto", "Gomez", "70055566", date(1965, 9, 20), "NIT333", "Ingeniero", "Electrónica", "Masculino"), # 59 años (¡Este es el que buscamos!)
    Docente("D1004", "Sofia", "Silva", "78899900", date(1975, 4, 10), "NIT444", "Arquitecto", "Urbanismo", "Femenino"), # 50 años
    Docente("D1005", "Daniel", "Herrera", "71122233", date(1960, 12, 5), "NIT555", "Ingeniero", "Civil", "Masculino") # 64 años
]

print("--- Estudiantes mayores de 25 años ---")
for est in estudiantes:
    if est.get_edad() > 25:
        est.mostrar()     
print("\n")
print("--- Docente Ingeniero, Masculino y el Mayor ---")
docente_mayor_ingeniero_masculino = None
edad_mayor = -1

for doc in docentes:
    if doc.get_profesion() and doc.get_profesion().lower() == "ingeniero" and \
       doc.get_sexo() and doc.get_sexo().lower() == "masculino":
        if doc.get_edad() > edad_mayor:
            edad_mayor = doc.get_edad()
            docente_mayor_ingeniero_masculino = doc

if docente_mayor_ingeniero_masculino:
    docente_mayor_ingeniero_masculino.mostrar()
else:
    print("No se encontró ningún docente que cumpla con los criterios.")
print("\n")

print("--- Estudiantes y Docentes con el mismo apellido ---")
found_common_apellido = False
for est in estudiantes:
    for doc in docentes:
        if est.get_apellido().lower() == doc.get_apellido().lower():
            print(f"Apellido en común: {est.get_apellido()}")
            print("Estudiante:")
            est.mostrar()
            print("Docente:")
            doc.mostrar()
            print("----------------------------------------")
            found_common_apellido = True
if not found_common_apellido:
    print("No se encontraron estudiantes y docentes con el mismo apellido.")