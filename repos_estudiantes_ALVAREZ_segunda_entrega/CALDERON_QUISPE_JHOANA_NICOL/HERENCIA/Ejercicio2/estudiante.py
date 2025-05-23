class Persona:
    def __init__(self, nombre, apellido, celular, fecha_Nac, ci, sexo):
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac  
        self.ci = ci
        self.sexo = sexo

    def mostrar(self):
        print(f"Nombre: {self.nombre}, Apellido: {self.apellido}, Celular: {self.celular}, Fecha de Nacimiento: {self.fecha_Nac}, CI: {self.ci}")

    def edad(self):
        dia, mes, año = map(int, self.fecha_Nac.split("/"))
        return 2025 - año


class Estudiante(Persona):
    def __init__(self, nombre, apellido, celular, fecha_Nac, ci, sexo, ru, fecha_Ingreso, semestre):
        super().__init__(nombre, apellido, celular, fecha_Nac, ci, sexo)
        self.ru = ru
        self.fecha_Ingreso = fecha_Ingreso
        self.semestre = semestre

    def mostrar(self):
        super().mostrar()
        print(f"RU: {self.ru}, Fecha de Ingreso: {self.fecha_Ingreso}, Semestre: {self.semestre}")

    @staticmethod
    def mayoresa25(estudiantes):
        for e in estudiantes:
            if e.edad() > 25:
                e.mostrar()
                print(f"Edad: {e.edad()}")


class Docente(Persona):
    def __init__(self, nombre, apellido, celular, fecha_Nac, ci, sexo, nit, profesion, especialidad):
        super().__init__(nombre, apellido, celular, fecha_Nac, ci, sexo)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad

    def mostrar(self):
        super().mostrar()
        print(f"NIT: {self.nit}, Profesión: {self.profesion}, Especialidad: {self.especialidad}")

    @staticmethod
    def docenteingenieromayor(docentes):
        
        i = 0
        while i < len(docentes):
            d = docentes[i]
            if d.profesion == "Ingeniero" and d.sexo == "M":
                mayor = d
                break
            i += 1

        if i == len(docentes):
            print("No hay docentes que cumplan con los criterios.")
            return

        for j in range(i + 1, len(docentes)):
            d = docentes[j]
            if d.profesion == "Ingeniero" and d.sexo == "M":
                if fecha(d.fecha_Nac, mayor.fecha_Nac):
                    mayor = d

        print("Docente Ingeniero, masculino, de mayor edad:")
        mayor.mostrar()





def fecha(f1, f2):
    d1, m1, a1 = map(int, f1.split("/"))
    d2, m2, a2 = map(int, f2.split("/"))
    if a1 < a2:
        return True
    elif a1 == a2:
        if m1 < m2:
            return True
        elif m1 == m2:
            return d1 < d2
    return False

def mostrasmismoapellido(estudiantes, docentes):
    for e in estudiantes:
        for d in docentes:
            if e.apellido == d.apellido:
                print("Estudiante:")
                e.mostrar()
                print("Docente:")
                d.mostrar()
                print("-" * 30)


estudiantes = [
    Estudiante("Jhoana", "Calderon", "73024092", "31/03/2006", "13788898", "F", "18061", "01/02/2017", 2),
    Estudiante("Rafael", "Calderon", "777456", "25/10/2002", "1002", "M", "RU102", "01/02/2020", 8),
    Estudiante("Vanesa", "Blanco", "777789", "03/04/1995", "1003", "F", "RU103", "01/02/2015", 5),
]


docentes = [
    Docente("Marcos", "Calle", "71985331", "15/03/1975", "2001", "M", "NIT001", "Ingeniero", "civil"),
    Docente("Lucía", "Rodriguez", "777654", "18/09/1980", "2002", "F", "NIT002", "Arquitecta", "Diseño"),
    Docente("Elvis", "Gomez", "777987", "01/01/1970", "2003", "M", "NIT003", "Ingeniero", "Electrónica")
]


print("Estudiantes mayores de 25 años:")
Estudiante.mayoresa25(estudiantes)

Docente.docenteingenieromayor(docentes)


print("Estudiantes y docentes con el mismo apellido:")
mostrasmismoapellido(estudiantes, docentes)
