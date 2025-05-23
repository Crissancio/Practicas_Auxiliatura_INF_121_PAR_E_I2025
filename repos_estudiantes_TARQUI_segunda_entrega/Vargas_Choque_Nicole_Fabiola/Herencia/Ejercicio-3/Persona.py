class Persona:
    def __init__(self, ci, nombre, apellido, edad, celular, fechaNac, sexo):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self.celular = celular
        self.fechaNac = fechaNac
        self.sexo = sexo

    def mostrar(self):
        print(f"CI: {self.ci} Nombre: {self.nombre} Apellido: {self.apellido}")
        print(f"Celular: {self.celular} Fecha Nacimiento: {self.fechaNac} Edad: {self.edad}")


class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, edad, celular, sexo, fechaNac, ru, fechaIngreso, semestre):
        super().__init__(ci, nombre, apellido, edad, celular, fechaNac, sexo)
        self.ru = ru
        self.fechaIngreso = fechaIngreso
        self.semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru} Fecha Ingreso: {self.fechaIngreso}")
        print(f"Semestre: {self.semestre}")


class Docente(Persona):
    def __init__(self, ci, nombre, apellido, edad, celular, sexo, fechaNac, nit, profesion, especialidad):
        super().__init__(ci, nombre, apellido, edad, celular, fechaNac, sexo)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad

    def mostrar(self):
        super().mostrar()
        print(f"Nit: {self.nit} Profesion: {self.profesion} Especialidad: {self.especialidad}")


# MAIN
if __name__ == "__main__":
    docentes = []
    estudiantes = []

    estudiantes.append(Estudiante("9896714", "Nicole", "Vargas", 21, "73072096", "Femenino", "30/01/2004", "1837951", "14/23/2022", 4))
    estudiantes.append(Estudiante("9896718", "Rai David", "Vargas", 19, "73591756", "Masculino", "22/11/2006", "1937747", "35/07/2023", 1))
    estudiantes.append(Estudiante("4747080", "Pablo", "Vargas", 35, "73096512", "Masculino", "23/04/1999", "133253", "22/07/2000", 8))

    docentes.append(Docente("1243543", "Neyzer", "Sandoval", 45, "72094332", "Masculino", "12/12/1953", "4747080", "Doctor", "Dermatologia"))
    docentes.append(Docente("1843576", "Luisa", "Morales", 54, "18231889", "Femenino", "13/02/1978", "9896714", "Licenciada en Informatica", "Redes"))
    docentes.append(Docente("1575369", "Maria", "Zeballos", 34, "77771451", "Femenino", "23/10/1995", "9896718", "Arquitecta", "Construccion"))

    print("Estudiantes mayores de 25 años:")
    for e in estudiantes:
        if e.edad > 25:
            e.mostrar()
            print()

    mayor = None
    for d in docentes:
        if d.sexo == "Masculino" and d.profesion == "Doctor":
            if mayor is None or d.edad > mayor.edad:
                mayor = d

    if mayor is not None:
        print("Docente masculino, doctor y mayor:")
        mayor.mostrar()
        print()

    print("Estudiantes y docentes con el mismo apellido:")
    for e in estudiantes:
        for d in docentes:
            if e.apellido == d.apellido:
                print(f"Apellido: {e.apellido}")
                e.mostrar()
                d.mostrar()
                print()