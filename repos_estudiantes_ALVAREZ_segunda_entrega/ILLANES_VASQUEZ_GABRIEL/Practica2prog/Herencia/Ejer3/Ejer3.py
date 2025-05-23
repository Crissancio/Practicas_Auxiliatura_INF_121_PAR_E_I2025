class Persona:
    def __init__(self, nombre="Gabo", apellido="ronaldo :V", ci=121313123, celular=12323, fecha_nac=2000):
        self.nombre = nombre
        self.apellido = apellido
        self.ci = ci
        self.celular = celular
        self.fecha_nac = fecha_nac

    def mostrar(self):
        print(f"Nombre: {self.nombre}\nApellido: {self.apellido}\nCI: {self.ci}\nCelular: {self.celular}\nFecha de Nacimiento: {self.fecha_nac}")


class Docente(Persona):
    def __init__(self, nit="xd", profesion="docente", ci=0, celular=0, fecha_nac=2000, especialidad="nose", sexo="M", nombre="Gabo", apellido="ronaldo :V"):
        super().__init__(nombre, apellido, ci, celular, fecha_nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}\nProfesión: {self.profesion}\nEspecialidad: {self.especialidad}\nSexo: {self.sexo}")

    def profesion_check(self):
        edad = 2025 - self.fecha_nac
        if self.profesion == "Ingeniero" and self.sexo == "M" and edad > 18:
            print(f"El docente {self.nombre} es ingeniero, hombre y mayor de edad.")

    def get_profesion(self):
        return self.profesion

    def get_sexo(self):
        return self.sexo


class Estudiante(Persona):
    def __init__(self, nombre="Estu", apellido="Perez", ru=0, fecha_ingreso=2025, semestre=1, ci=0, celular=0, fecha_nac=2000):
        super().__init__(nombre, apellido, ci, celular, fecha_nac)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}\nSemestre: {self.semestre}\nFecha de Ingreso: {self.fecha_ingreso}")

    def mayor(self):
        edad = 2025 - self.fecha_nac
        if edad > 25:
            print(f"El estudiante {self.nombre} tiene más de 25 años.")



if __name__ == "__main__":
    estudiante = Estudiante("Jose", "Cuentas", 231, 2025, 4, 12312312, 54034, 1999)
    docente = Docente("nit12", "Ingeniero", 123321, 31232, 1999, "Ingeniero", "M", "Ivan", "Cuentas")

    estudiante.mostrar()
    docente.mostrar()

    estudiante.mayor()
    docente.profesion_check()

    if docente.apellido == estudiante.apellido:
        print(f"El docente {docente.nombre} y el estudiante {estudiante.nombre} tienen el mismo apellido.")
