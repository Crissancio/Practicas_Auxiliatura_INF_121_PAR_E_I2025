class Ejercicio2:
    class Persona:
        def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo):
            self.ci = ci
            self.nombre = nombre
            self.apellido = apellido
            self.celular = celular
            self.fecha_nac = fecha_nac
            self.sexo = sexo

        def mostrar_info(self):
            print(f"{self.nombre} {self.apellido}, CI: {self.ci}, Celular: {self.celular}, Nacido: {self.fecha_nac}, Sexo: {self.sexo}")

        def calcular_edad(self):
            anio_nac = int(self.fecha_nac.split("-")[0])
            return 2025 - anio_nac

    class Estudiante(Persona):
        def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo, ru, fecha_ingreso, semestre):
            super().__init__(ci, nombre, apellido, celular, fecha_nac, sexo)
            self.ru = ru
            self.fecha_ingreso = fecha_ingreso
            self.semestre = semestre

        def mostrar_info(self):
            super().mostrar_info()
            print(f"RU: {self.ru}, Ingreso: {self.fecha_ingreso}, Semestre: {self.semestre}")

    class Docente(Persona):
        def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo, nit, profesion, especialidad):
            super().__init__(ci, nombre, apellido, celular, fecha_nac, sexo)
            self.nit = nit
            self.profesion = profesion
            self.especialidad = especialidad

        def mostrar_info(self):
            super().mostrar_info()
            print(f"NIT: {self.nit}, Profesión: {self.profesion}, Especialidad: {self.especialidad}")

    def main(self):
        estudiantes = [
            self.Estudiante("123", "Carlos", "López", "789456", "1998-05-10", "M", "RU123", "2020-01-10", 7),
            self.Estudiante("456", "Lucía", "Gómez", "654321", "2004-03-15", "F", "RU456", "2023-02-12", 2),
        ]
        docentes = [
            self.Docente("789", "Mario", "López", "123789", "1980-07-20", "M", "NIT789", "Ingeniero", "Sistemas"),
            self.Docente("321", "Laura", "Gómez", "987654", "1985-09-05", "F", "NIT321", "Licenciada", "Matemáticas"),
        ]
        print("=== Estudiantes mayores de 25 años ===")
        for est in estudiantes:
            if est.calcular_edad() > 25:
                est.mostrar_info()

        print("\n=== Docente hombre con profesión 'Ingeniero' y mayor edad ===")
        ingenieros = [d for d in docentes if d.profesion == "Ingeniero" and d.sexo == "M"]
        if ingenieros:
            mayor = max(ingenieros, key=lambda d: d.calcular_edad())
            mayor.mostrar_info()

        print("\n=== Estudiantes y Docentes con mismo apellido ===")
        for est in estudiantes:
            for doc in docentes:
                if est.apellido == doc.apellido:
                    print("Coincidencia de apellido:", est.apellido)
                    est.mostrar_info()
                    doc.mostrar_info()

Ejercicio2().main()
