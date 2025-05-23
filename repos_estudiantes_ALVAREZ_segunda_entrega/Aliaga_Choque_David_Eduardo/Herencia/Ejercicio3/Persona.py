from datetime import datetime

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = datetime.strptime(fecha_Nac, "%Y-%m-%d")
        
    def edad(self):
        today = datetime.today()
        return today.year - self.fecha_Nac.year - ((today.month, today.day) < (self.fecha_Nac.month, self.fecha_Nac.day))
    
    def __str__(self):
        return f"{self.nombre} {self.apellido}, CI: {self.ci}, Celular: {self.celular}, Fecha Nac: {self.fecha_Nac.date()}"

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, ru, fecha_Ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.ru = ru
        self.fecha_Ingreso = fecha_Ingreso
        self.semestre = semestre

    def __str__(self):
        return f"Estudiante: {super().__str__()}, RU: {self.ru}, Fecha Ingreso: {self.fecha_Ingreso}, Semestre: {self.semestre}"

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, nit, profesion, especialidad, sexo):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo

    def __str__(self):
        return f"Docente: {super().__str__()}, NIT: {self.nit}, Profesión: {self.profesion}, Especialidad: {self.especialidad}, Sexo: {self.sexo}"

def main():
    # b) Implementa las clases con sus constructores, datos por defecto y mostrar
    estudiantes = [
        Estudiante("123", "Ana", "López", "70012345", "2000-05-12", "RU001", "2019-02-01", "6"),
        Estudiante("124", "Luis", "Pérez", "70054321", "1996-08-21", "RU002", "2017-02-01", "10"),
        Estudiante("125", "María", "López", "70088888", "2005-10-10", "RU003", "2023-02-01", "2")
    ]

    docentes = [
        Docente("300", "Carlos", "Gómez", "70123456", "1970-03-05", "NIT001", "Ingeniero", "Sistemas", "M"),
        Docente("301", "Sofía", "López", "70999999", "1980-07-20", "NIT002", "Licenciada", "Matemáticas", "F"),
        Docente("302", "Juan", "Pérez", "70222222", "1965-01-15", "NIT003", "Ingeniero", "Electrónica", "M")
    ]

    print("Lista de estudiantes:")
    for est in estudiantes:
        print(est)

    print("\nLista de docentes:")
    for doc in docentes:
        print(doc)

    # c) Mostrar los estudiantes mayores de 25 años
    print("\nEstudiantes mayores de 25 años:")
    for est in estudiantes:
        if est.edad() > 25:
            print(est)

    # d) Mostrar al docente que es “Ingeniero”, del sexo masculino y es el mayor de todos
    mayor_ingeniero = None
    for doc in docentes:
        if doc.profesion == "Ingeniero" and doc.sexo == "M":
            if mayor_ingeniero is None or doc.edad() > mayor_ingeniero.edad():
                mayor_ingeniero = doc

    print("\nDocente ingeniero masculino mayor:")
    if mayor_ingeniero:
        print(mayor_ingeniero)

    # e) Mostrar a los estudiantes y docentes que tienen el mismo apellido
    print("\nPersonas con apellidos coincidentes:")
    for est in estudiantes:
        for doc in docentes:
            if est.apellido == doc.apellido:
                print(f"{est.nombre} {est.apellido} (Estudiante) y {doc.nombre} {doc.apellido} (Docente)")

if __name__ == "__main__":
    main()