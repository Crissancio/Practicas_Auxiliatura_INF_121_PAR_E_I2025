from datetime import date

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = fecha_nac
        self.sexo = sexo

    def edad(self):
        hoy = date.today()
        return hoy.year - self.fecha_nac.year - ((hoy.month, hoy.day) < (self.fecha_nac.month, self.fecha_nac.day))

    def mostrar(self):
        print(f"{self.nombre} {self.apellido} - CI: {self.ci}, Edad: {self.edad()} años")


class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac, sexo)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}, Fecha de ingreso: {self.fecha_ingreso}, Semestre: {self.semestre}")


class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo, nit, profesion, especialidad):
        super().__init__(ci, nombre, apellido, celular, fecha_nac, sexo)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}, Profesión: {self.profesion}, Especialidad: {self.especialidad}")

if __name__ == "__main__":
    fecha_nac_est = date(2002, 5, 15)
    fecha_ingreso = date(2021, 2, 10)

    estudiante = Estudiante(
        ci="12345678",
        nombre="Juan",
        apellido="Pérez",
        celular="78945612",
        fecha_nac=fecha_nac_est,
        sexo="M",
        ru="RU001",
        fecha_ingreso=fecha_ingreso,
        semestre=5
    )

    fecha_nac_doc = date(1980, 3, 20)
    docente = Docente(
        ci="87654321",
        nombre="María",
        apellido="Lopez",
        celular="74185296",
        fecha_nac=fecha_nac_doc,
        sexo="F",
        nit="NIT123456",
        profesion="Ingeniera de Sistemas",
        especialidad="Inteligencia Artificial"
    )

    print("Información del Estudiante:")
    estudiante.mostrar()
    print("\nInformación del Docente:")
    docente.mostrar()
