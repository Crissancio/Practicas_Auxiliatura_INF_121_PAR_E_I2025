from datetime import datetime
class Persona:
    def __init__(self, ci="", nombre="", apellido="", celular="", fecha_Nac="2000-01-01"):
        self.__ci = ci
        self.__nombre = nombre
        self.__apellido = apellido
        self.__celular = celular
        self.__fecha_Nac = fecha_Nac  

    def mostrar(self):
        print(f"CI: {self.__ci}, Nombre: {self.__nombre}, Apellido: {self.__apellido}, Celular: {self.__celular}, Fecha Nac: {self.__fecha_Nac}")

    def get_fecha_Nac(self):
        return self.__fecha_Nac

    def get_apellido(self):
        return self.__apellido

    def get_nombre(self):
        return self.__nombre

class Estudiante(Persona):
    def __init__(self, ci="", nombre="", apellido="", celular="", fecha_Nac="2000-01-01", ru="", fecha_Ingreso="2020-01-01", semestre=1):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.__ru = ru
        self.__fecha_Ingreso = fecha_Ingreso
        self.__semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.__ru}, Fecha Ingreso: {self.__fecha_Ingreso}, Semestre: {self.__semestre}")

class Docente(Persona):
    def __init__(self, ci="", nombre="", apellido="", celular="", fecha_Nac="1980-01-01", nit="", profesion="", especialidad="", sexo="M"):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.__nit = nit
        self.__profesion = profesion
        self.__especialidad = especialidad
        self.__sexo = sexo 

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.__nit}, Profesion: {self.__profesion}, Especialidad: {self.__especialidad}, Sexo: {self.__sexo}")

    def get_profesion(self):
        return self.__profesion

    def get_sexo(self):
        return self.__sexo

def edad(fecha_nac):
    hoy = datetime.now()
    nac = datetime.strptime(fecha_nac, "%Y-%m-%d")
    return hoy.year - nac.year - ((hoy.month, hoy.day) < (nac.month, nac.day))

def mostrar_estudiantes_mayores_25(estudiantes):
    print("-------Estudiantes mayores de 25 años:-------")
    for est in estudiantes:
        if edad(est.get_fecha_Nac()) > 25:
            est.mostrar()

def mostrar_docente_ingeniero_mayor(docentes):
    ingenieros = [doc for doc in docentes if doc.get_profesion().lower() == "ingeniero" and doc.get_sexo() == "M"]
    if ingenieros:
        mayor = max(ingenieros, key=lambda d: edad(d.get_fecha_Nac()))
        print("-------Docente Ingeniero, masculino y mayor:-------")
        mayor.mostrar()
    else:
        print("****No hay docente que cumpla los requisitos.****")

def mostrar_mismo_apellido(estudiantes, docentes):
    print("-------Estudiantes y docentes con el mismo apellido:-------")
    for est in estudiantes:
        for doc in docentes:
            if est.get_apellido().lower() == doc.get_apellido().lower():
                print("====Estudiante:====")
                est.mostrar()
                print("====Docente:====")
                doc.mostrar()
                print("---")

estudiantes = [
    Estudiante("13098352", "Juan", "Perez", "78945643", "1995-05-10", "17635267", "2015-02-01", 8),
    Estudiante("12435687", "Ana", "Lopez", "78945723", "2002-03-15", "19463532", "2021-02-01", 2),
    Estudiante("13765894", "Luis", "Perez", "78945812", "1990-07-20", "15847545", "2010-02-01", 12)
]
docentes = [
    Docente("1234567", "Carlos", "Perez", "72436967", "1970-01-01", "128360973657", "Ingeniero", "Sistemas", "M"),
    Docente("1357911", "Maria", "Lopez", "74362087", "1985-04-12", "134265769582", "Licenciado", "Matemáticas", "F"),
    Docente("1245780", "Jose", "Gomez", "71324465", "1965-09-30", "146365870594", "Ingeniero", "Civil", "M")
]

mostrar_estudiantes_mayores_25(estudiantes)
mostrar_docente_ingeniero_mayor(docentes)
mostrar_mismo_apellido(estudiantes, docentes)