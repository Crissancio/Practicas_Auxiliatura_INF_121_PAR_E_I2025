from datetime import datetime

class Persona:
    def __init__(self, ci="Sin CI", nombre="Sin nombre", apellido="Sin apellido", 
                 celular="Sin celular", fecha_Nac="01/01/2000", sexo="No especificado"):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac
        self.sexo = sexo

    def mostrar_info(self):
        print(f"CI: {self.ci}")
        print(f"Nombre: {self.nombre}")
        print(f"Apellido: {self.apellido}")
        print(f"Celular: {self.celular}")
        print(f"Fecha Nacimiento: {self.fecha_Nac}")
        print(f"Sexo: {self.sexo}")

    def calcular_edad(self):
        fecha_nac = datetime.strptime(self.fecha_Nac, "%d/%m/%Y")
        hoy = datetime.now()
        return hoy.year - fecha_nac.year - ((hoy.month, hoy.day) < (fecha_nac.month, fecha_nac.day))

class Estudiante(Persona):
    def __init__(self, ci="Sin CI", nombre="Sin nombre", apellido="Sin apellido", 
                 celular="Sin celular", fecha_Nac="01/01/2000", sexo="No especificado",
                 ru="Sin RU", fecha_Ingreso="01/01/2023", semestre=1):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac, sexo)
        self.ru = ru
        self.fecha_Ingreso = fecha_Ingreso
        self.semestre = semestre

    def mostrar_info(self):
        super().mostrar_info()
        print(f"RU: {self.ru}")
        print(f"Fecha Ingreso: {self.fecha_Ingreso}")
        print(f"Semestre: {self.semestre}")

class Docente(Persona):
    def __init__(self, ci="Sin CI", nombre="Sin nombre", apellido="Sin apellido", 
                 celular="Sin celular", fecha_Nac="01/01/2000", sexo="No especificado",
                 nit="Sin NIT", profesion="Sin profesión", especialidad="Sin especialidad"):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac, sexo)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad

    def mostrar_info(self):
        super().mostrar_info()
        print(f"NIT: {self.nit}")
        print(f"Profesión: {self.profesion}")
        print(f"Especialidad: {self.especialidad}")

# Ejemplo de uso
if __name__ == "__main__":
    estudiantes = [
        Estudiante("123456", "Juan", "Perez", "77712345", "15/05/1995", "Masculino", "123456789", "10/02/2020", 6),
        Estudiante("654321", "Maria", "Gomez", "77754321", "20/10/2000", "Femenino", "987654321", "05/08/2021", 4)
    ]

    docentes = [
        Docente("987654", "Carlos", "Lopez", "77798765", "12/03/1980", "Masculino", "987654321", "Ingeniero", "Sistemas"),
        Docente("456789", "Ana", "Gomez", "77745678", "25/11/1975", "Femenino", "456789123", "Licenciada", "Educación")
    ]

    # c) Estudiantes mayores de 25 años
    print("=== ESTUDIANTES MAYORES DE 25 AÑOS ===")
    for est in estudiantes:
        if est.calcular_edad() > 25:
            est.mostrar_info()
            print("---------------------")
    # d) Docente "Ingeniero", masculino y mayor
    print("=== DOCENTE INGENIERO MASCULINO (MAYOR) ===")
    docente_mayor = None
    for doc in docentes:
        if doc.profesion == "Ingeniero" and doc.sexo == "Masculino":
            if docente_mayor is None or doc.calcular_edad() > docente_mayor.calcular_edad():
                docente_mayor = doc
    if docente_mayor:
        docente_mayor.mostrar_info()
    else:
        print("No se encontró al docente con esos criterios.")

    # e) Estudiantes y docentes con mismo apellido
    print("=== PERSONAS CON MISMO APELLIDO ===")
    for est in estudiantes:
        for doc in docentes:
            if est.apellido == doc.apellido:
                print(f"Estudiante y Docente con apellido {est.apellido}:")
                est.mostrar_info()
                print("-----")
                doc.mostrar_info()
                print("---------------------")