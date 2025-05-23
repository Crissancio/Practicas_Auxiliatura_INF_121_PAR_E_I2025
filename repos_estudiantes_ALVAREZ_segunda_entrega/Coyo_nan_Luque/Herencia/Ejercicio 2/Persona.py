class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_nac = fecha_nac
    
    def mostrar(self):
        return f"CI: {self.ci}, Nombre: {self.nombre}, Apellido: {self.apellido}, Celular: {self.celular}, Fecha Nac: {self.fecha_nac}"
    
    def mismos_apellidos(personas):
        apellidos = {}
        for persona in personas:
            if persona.apellido in apellidos:
                apellidos[persona.apellido].append(persona)
            else:
                apellidos[persona.apellido] = [persona]
        
        print("\nPersonas con mismo apellido:")
        for apellido, lista_personas in apellidos.items():
            if len(lista_personas) > 1:
                print(f"Apellido: {apellido}")
                for persona in lista_personas:
                    print(f"  {persona.mostrar()}")

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.ru = ru
        self.fecha_ingreso = fecha_ingreso
        self.semestre = semestre
    
    def mostrar(self):
        return f"Estudiante:.. {super().mostrar()}, RU: {self.ru}, Fecha Ingreso: {self.fecha_ingreso}, Semestre: {self.semestre}"
    
    def estudiantes_mayores_25(personas):
        anio_actual = 2025
        print("\nEstudiantes mayores de 25 años:")
        for persona in personas:
            if hasattr(persona, 'ru'):  # Verifica si es estudiante
                anio_nac = int(persona.fecha_nac.split("-")[0])
                edad = anio_actual - anio_nac
                if edad > 25:
                    print(persona.mostrar())

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, nit, profesion, especialidad, sexo):
        super().__init__(ci, nombre, apellido, celular, fecha_nac)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
        self.sexo = sexo
    
    def mostrar(self):
        return f"Docente:.. {super().mostrar()}, NIT: {self.nit}, Profesion: {self.profesion}, Especialidad: {self.especialidad}, Sexo: {self.sexo}"
    
    def docente_ingeniero_masculino_mayor(personas):
        docente_seleccionado = None
        mayor_edad = 0
        
        for persona in personas:
            if hasattr(persona, 'nit') and persona.profesion == "Ingeniero" and persona.sexo == "M":
                anio_nac = int(persona.fecha_nac.split("-")[0])
                edad = 2025 - anio_nac
                if edad > mayor_edad:
                    mayor_edad = edad
                    docente_seleccionado = persona
        
        print("\nDocente ingeniero masculino y mayor edad:")
        if docente_seleccionado:
            print(docente_seleccionado.mostrar())
        else:
            print("No hay Docentes que cumplen")

personas = [
    Estudiante("1234", "Armando", "Pando", "7211234", "2004-02-15", "20001", "2021-02-01", 5),
    Estudiante("2312", "Selena", "Pasas", "7715678", "2001-01-22", "20002", "2019-06-12", 3),
    Estudiante("4567", "Angel", "Pasas", "7938412", "1999-12-10", "20003", "2020-08-23", 7),
    Docente("4561", "Carla", "Garcia", "7948236", "1989-01-20", "20004", "Ingeniero", "Sistemas", "M"),
    Docente("2387", "Leandro", "Garcia", "79032389", "1985-01-11", "20005", "Ingeniero", "Civil", "F"),
    Docente("6790", "Leon", "Lacios", "73456523", "1995-04-21", "20006", "Medico", "Cirugia", "M")
]

Estudiante.estudiantes_mayores_25(personas)
Docente.docente_ingeniero_masculino_mayor(personas)
Persona.mismos_apellidos(personas)