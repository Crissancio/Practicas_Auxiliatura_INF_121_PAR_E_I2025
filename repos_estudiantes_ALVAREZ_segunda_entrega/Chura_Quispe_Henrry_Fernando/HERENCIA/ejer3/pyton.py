
class Persona:
    def __init__(self, ci: int, nombre: str, apellido: str, celular: int, fecha_nac: int):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = fecha_nac

    def mostrar_info(self):
        print(f"- Nombre: {self.nombre}\n- Apellido: {self.apellido}\n- Celular: {self.celular}\n- Nacimiento: {self.fecha_nac}\n- CI: {self.ci}")


class Estudiante(Persona):
    def __init__(self, ci: int, nombre: str, apellido: str, celular: int, fecha_nac: int, ru: int, fecha_ingreso: int, semestre: str):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre

    def mostrar_info(self):
        print("\nESTUDIANTE:")
        print(f"- RU: {self.ru}\n- Fecha de Ingreso: {self.fecha_ingreso}\n- Semestre: {self.semestre}")
        super().mostrar_info()


class Docente(Persona):
    def __init__(self, ci: int, nombre: str, apellido: str, celular: int, fecha_nac: int, nit: int, profesion: str, especialidad: str):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad

    def mostrar_info(self):
        print("\nDOCENTE:")
        print(f"- NIT: {self.nit}\n- Profesión: {self.profesion}\n- Especialidad: {self.especialidad}")
        super().mostrar_info()


if __name__ == "__main__":
    print("-------------------- ESTUDIANTES --------------------")
    estudiantes = [
        Estudiante(1234567, "Juan", "Rodriguez", 1234567, 1850, 12345, 2025, "4to semestre"),
        Estudiante(12345, "Roberto", "Jaramillo", 1234, 2005, 1234, 2024, "5to semestre"),
        Estudiante(1234567, "Lorenzo", "Chura", 1234567, 2020, 2222, 2025, "6to semestre"),
        Estudiante(12345, "Aldo", "Poma", 1234, 2005, 3344, 2024, "5to semestre"),
        Estudiante(1235453, "Lucho", "Gonzales", 1234567, 1991, 5435, 2021, "3to semestre"),
        Estudiante(5453345, "Ryan", "Garcia", 1234, 1934, 4353, 2020, "7to semestre")
    ]
    
    for estudiante in estudiantes:
        estudiante.mostrar_info()

    print("\n-------------------- DOCENTES --------------------")
    docentes = [
        Docente(12345, "Mauricio", "Sanchez", 123456, 1995, 1234, "Ingeniero", "Agrónomo"),
        Docente(12345, "Julio", "Jaramillo", 123456, 2000, 5433, "Licenciado", "Petrolero"),
        Docente(64345, "Gonzales", "Sanchez", 123456, 2002, 7654, "Ingeniero", "Civil"),
        Docente(143645, "Julio", "Poma", 123456, 2000, 4576, "Doctorado", "Informática"),
        Docente(65445, "Mauricio", "Mauricio", 123456, 1985, 8754, "Ingeniero", "Químico"),
        Docente(23445, "Julio", "Chura", 123456, 2005, 9864, "Magister", "Psicología")
    ]

    for docente in docentes:
        docente.mostrar_info()

    print("\n-------------------- ESTUDIANTES MAYORES DE 25 AÑOS --------------------")
    for estudiante in estudiantes:
        if estudiante.fecha_nac <= 2000:
            estudiante.mostrar_info()

    print("\n-------------------- DOCENTE MÁS VIEJO Y PROFESIÓN 'INGENIERO' --------------------")
    mayor_ingeniero = None
    for docente in docentes:
        if docente.profesion.lower() == "ingeniero":
            if mayor_ingeniero is None or docente.fecha_nac < mayor_ingeniero.fecha_nac:
                mayor_ingeniero = docente
    
    if mayor_ingeniero:
        mayor_ingeniero.mostrar_info()
    else:
        print("❌ No hay ingenieros en la lista.")

    print("\n-------------------- PERSONAS CON EL MISMO APELLIDO --------------------")
    for estudiante in estudiantes:
        for docente in docentes:
            if estudiante.apellido.lower() == docente.apellido.lower():
                print("✅ Coincidencia de apellido:")
                estudiante.mostrar_info()
                docente.mostrar_info()
