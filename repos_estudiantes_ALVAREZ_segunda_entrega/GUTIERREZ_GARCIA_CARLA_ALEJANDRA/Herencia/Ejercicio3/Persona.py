class Persona:
    def __init__(self, ci=0, nombre="Nombre", apellido="Apellido", celular=0, fecha_Nac=2000):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac

    def getEdad(self, añoActual):
        return añoActual - self.fecha_Nac

    def mostrar(self):
        print(f"CI: {self.ci}")
        print(f"Nombre: {self.nombre}")
        print(f"Apellido: {self.apellido}")
        print(f"Celular: {self.celular}")
        print(f"Fecha de Nacimiento: {self.fecha_Nac}")

class Estudiante(Persona):
    def __init__(self, ci=1010, nombre="Juan", apellido="Torrez", celular=45454, fecha_Nac=2000, ru=23, fecha_Ingreso="06-agosto-2023", semestre=3):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.ru = ru
        self.fecha_Ingreso = fecha_Ingreso
        self.semestre = semestre

    @classmethod
    def conSemestre(cls, s):
        return cls(1212, "Paolo", "Castillo", 4545, 2001, 1212, "01-enero-2023", s)

    @classmethod
    def completo(cls, ci, nombre, apellido, celular, fecha_Nac, ru, fecha_Ingreso, semestre):
        return cls(ci, nombre, apellido, celular, fecha_Nac, ru, fecha_Ingreso, semestre)

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}")
        print(f"Fecha Ingreso: {self.fecha_Ingreso}")
        print(f"Semestre: {self.semestre}")

    def esMayorDe25(self, añoActual):
        return self.getEdad(añoActual) > 25

class Docente(Persona):
    def __init__(self, ci=6565, nombre="Carla", apellido="Torrez", celular=48484, fecha_Nac=1978, nit=75555, profesion="Administrador", especialidad="Comercio", sexo="femenino"):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo

    @classmethod
    def conSexo(cls, sexo):
        return cls(1234, "Manuel", "Romero", 789456, 1996, 100000, "Ingeniero", "Industrial", sexo)

    @classmethod
    def conCi(cls, ci):
        return cls(ci, "Anahy", "Diaz", 657878, 1989, 2000, "Ingeniero", "Ambiental", "femenino")

    @classmethod
    def completo(cls, ci, nombre, apellido, celular, fecha_Nac, nit, profesion, especialidad, sexo):
        return cls(ci, nombre, apellido, celular, fecha_Nac, nit, profesion, especialidad, sexo)

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}")
        print(f"Profesión: {self.profesion}")
        print(f"Especialidad: {self.especialidad}")
        print(f"Sexo: {self.sexo}")

    def esDeProfesionYSexo(self, profesion, sexo):
        return self.profesion.lower() == profesion.lower() and self.sexo.lower() == sexo.lower()

    def getEdad(self, añoActual):
        return super().getEdad(añoActual)

    @staticmethod
    def mostrarDocenteMayor(docentes, profesion, sexo, añoActual):
        mayor = None
        mayorEdad = 0
        for docente in docentes:
            if docente.esDeProfesionYSexo(profesion, sexo):
                edad = docente.getEdad(añoActual)
                if edad > mayorEdad:
                    mayorEdad = edad
                    mayor = docente
        if mayor:
            print(f"Docente mayor con profesión de {profesion} y sexo {sexo}:")
            mayor.mostrar()
            print(f"Edad: {mayorEdad}")
        else:
            print("No se encontró un docente que cumpla con los criterios.")

if __name__ == "__main__":
    estudiantes = [
        Estudiante(),
        Estudiante.conSemestre(5),
        Estudiante.completo(1313, "Daniela", "Romero", 789123, 1998, 3030, "05-marzo-2021", 8)
    ]
    docentes = [
        Docente(),
        Docente.conSexo("masculino"),
        Docente.conCi(1001),
        Docente.completo(1414, "Carlos", "Romero", 456789, 1975, 123456, "Ingeniero", "Sistemas", "masculino")
    ]
    añoActual = 2025

    print("=== Estudiantes mayores de 25 años ===")
    for est in estudiantes:
        if est.esMayorDe25(añoActual):
            est.mostrar()
            print(f"Edad: {est.getEdad(añoActual)}\n")

    print("=== Docente más mayor que es Ingeniero y masculino ===")
    Docente.mostrarDocenteMayor(docentes, "Ingeniero", "masculino", añoActual)

    print("\n=== Estudiantes y docentes con el mismo apellido ===")
    for est in estudiantes:
        for doc in docentes:
            if est.apellido.lower() == doc.apellido.lower():
                print(f"Coincidencia de apellido: {est.apellido}")
                print("Estudiante:")
                est.mostrar()
                print("Docente:")
                doc.mostrar()
                print()