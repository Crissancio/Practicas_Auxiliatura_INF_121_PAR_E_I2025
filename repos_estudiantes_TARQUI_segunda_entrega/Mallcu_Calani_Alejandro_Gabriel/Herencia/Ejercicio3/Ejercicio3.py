from datetime import date, datetime

class Persona:
    # Fecha actual para cálculos de edad
    FECHA_ACTUAL = date(2025, 5, 22)

    def __init__(self, ci, nombre, apellido, celular, fecha_nac_str, sexo):
        self._ci = ci
        self._nombre = nombre
        self._apellido = apellido
        self._celular = celular
        try:
            self._fecha_nac = datetime.strptime(fecha_nac_str, "%Y-%m-%d").date()
        except ValueError:
            raise ValueError("Formato de fecha de nacimiento incorrecto. Usar YYYY-MM-DD.")
        self._sexo = sexo

    # Getters
    def get_ci(self): return self._ci
    def get_nombre(self): return self._nombre
    def get_apellido(self): return self._apellido
    def get_celular(self): return self._celular
    def get_fecha_nac(self): return self._fecha_nac
    def get_sexo(self): return self._sexo

    # Setters
    def set_ci(self, ci): self._ci = ci
    def set_nombre(self, nombre): self._nombre = nombre
    def set_apellido(self, apellido): self._apellido = apellido
    def set_celular(self, celular): self._celular = celular
    def set_fecha_nac(self, fecha_nac_str):
        try:
            self._fecha_nac = datetime.strptime(fecha_nac_str, "%Y-%m-%d").date()
        except ValueError:
            raise ValueError("Formato de fecha de nacimiento incorrecto. Usar YYYY-MM-DD.")
    def set_sexo(self, sexo): self._sexo = sexo

    def get_edad(self):
        hoy = Persona.FECHA_ACTUAL
        edad = hoy.year - self._fecha_nac.year - ((hoy.month, hoy.day) < (self._fecha_nac.month, self._fecha_nac.day))
        return edad

    def mostrar(self):
        return (f"CI: {self._ci}, Nombre: {self._nombre} {self._apellido}, Sexo: {self._sexo}, "
                f"Celular: {self._celular}, Fecha Nac: {self._fecha_nac.strftime('%Y-%m-%d')}, Edad: {self.get_edad()}")

class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac_str, sexo, ru, fecha_ingreso_str, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac_str, sexo)
        self._ru = ru
        try:
            self._fecha_ingreso = datetime.strptime(fecha_ingreso_str, "%Y-%m-%d").date()
        except ValueError:
            raise ValueError("Formato de fecha de ingreso incorrecto. Usar YYYY-MM-DD.")
        self._semestre = semestre

    # Getters
    def get_ru(self): return self._ru
    def get_fecha_ingreso(self): return self._fecha_ingreso
    def get_semestre(self): return self._semestre

    # Setters
    def set_ru(self, ru): self._ru = ru
    def set_fecha_ingreso(self, fecha_ingreso_str):
        try:
            self._fecha_ingreso = datetime.strptime(fecha_ingreso_str, "%Y-%m-%d").date()
        except ValueError:
            raise ValueError("Formato de fecha de ingreso incorrecto. Usar YYYY-MM-DD.")
    def set_semestre(self, semestre): self._semestre = semestre

    def mostrar(self):
        return (f"{super().mostrar()}, RU: {self._ru}, "
                f"Fecha Ingreso: {self._fecha_ingreso.strftime('%Y-%m-%d')}, Semestre: {self._semestre}")

class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac_str, sexo, nit, profesion, especialidad):
        super().__init__(ci, nombre, apellido, celular, fecha_nac_str, sexo)
        self._nit = nit
        self._profesion = profesion
        self._especialidad = especialidad

    # Getters
    def get_nit(self): return self._nit
    def get_profesion(self): return self._profesion
    def get_especialidad(self): return self._especialidad

    # Setters
    def set_nit(self, nit): self._nit = nit
    def set_profesion(self, profesion): self._profesion = profesion
    def set_especialidad(self, especialidad): self._especialidad = especialidad

    def mostrar(self):
        return (f"{super().mostrar()}, NIT: {self._nit}, "
                f"Profesión: {self._profesion}, Especialidad: {self._especialidad}")

# --- Main ---
if __name__ == "__main__":
    # b) Implementa las clases con sus constructores, datos por defecto y mostrar.
    # "Datos por defecto" se interpreta como instanciar con datos de ejemplo.
    print("--- b) Instancias y Mostrar Información ---")
    try:
        estudiante1 = Estudiante("1234567LP", "Juan", "Perez", "70712345", "1998-03-15", "Masculino", "RU-111", "2020-02-10", "Sexto")
        estudiante2 = Estudiante("7654321CB", "Ana", "Lopez", "60698765", "1995-07-22", "Femenino", "RU-222", "2019-08-15", "Octavo")
        estudiante3 = Estudiante("8888888SC", "Carlos", "Vaca", "77755555", "2000-01-30", "Masculino", "RU-333", "2022-02-01", "Cuarto")
        estudiante4 = Estudiante("9999999OR", "Sofia", "Perez", "66644444", "1996-11-05", "Femenino", "RU-444", "2021-02-10", "Septimo")


        docente1 = Docente("2345678LP", "Maria", "Gonzalez", "70011223", "1980-05-20", "Femenino", "NIT-A1", "Ingeniero", "Sistemas")
        docente2 = Docente("3456789CB", "Luis", "Martinez", "69022334", "1975-10-10", "Masculino", "NIT-B2", "Arquitecto", "Diseño Urbano")
        docente3 = Docente("4567890SC", "Pedro", "Chavez", "71733445", "1970-12-01", "Masculino", "NIT-C3", "Ingeniero", "Civil")
        docente4 = Docente("5678901LP", "Laura", "Ramirez", "72744556", "1985-02-25", "Femenino", "NIT-D4", "Licenciado", "Psicologia")
        docente5 = Docente("6789012OR", "Mario", "Soto", "73755667", "1965-07-15", "Masculino", "NIT-E5", "Ingeniero", "Industrial")


        print("Estudiantes:")
        print(f"E1: {estudiante1.mostrar()}")
        print(f"E2: {estudiante2.mostrar()}")
        print(f"E3: {estudiante3.mostrar()}")
        print(f"E4: {estudiante4.mostrar()}")

        print("\nDocentes:")
        print(f"D1: {docente1.mostrar()}")
        print(f"D2: {docente2.mostrar()}")
        print(f"D3: {docente3.mostrar()}")
        print(f"D4: {docente4.mostrar()}")
        print(f"D5: {docente5.mostrar()}")

        lista_estudiantes = [estudiante1, estudiante2, estudiante3, estudiante4]
        lista_docentes = [docente1, docente2, docente3, docente4, docente5]
        todas_las_personas = lista_estudiantes + lista_docentes

        # c) Mostrar los estudiantes mayores de 25 años.
        print("\n--- c) Estudiantes mayores de 25 años ---")
        estudiantes_mayores_25 = [e for e in lista_estudiantes if e.get_edad() > 25]
        if estudiantes_mayores_25:
            for e in estudiantes_mayores_25:
                print(e.mostrar())
        else:
            print("No hay estudiantes mayores de 25 años.")

        # d) Mostrar al docente que tiene la profesión de “Ingeniero”, es del sexo masculino y es el mayor de todos.
        print("\n--- d) Docente Ingeniero, Masculino y Mayor ---")
        docentes_ingenieros_masculinos = [
            d for d in lista_docentes
            if d.get_profesion().lower() == "ingeniero" and d.get_sexo().lower() == "masculino"
        ]

        docente_mayor_ingeniero = None
        if docentes_ingenieros_masculinos:
            docente_mayor_ingeniero = docentes_ingenieros_masculinos[0]
            for d in docentes_ingenieros_masculinos[1:]:
                if d.get_edad() > docente_mayor_ingeniero.get_edad():
                    docente_mayor_ingeniero = d
            print(docente_mayor_ingeniero.mostrar())
        else:
            print("No se encontró ningún docente Ingeniero masculino.")

        # e) Mostrar a los estudiantes y docentes que tienen el mismo apellido.
        print("\n--- e) Personas con el mismo apellido ---")
        apellidos_contados = {}
        for persona in todas_las_personas:
            apellidos_contados[persona.get_apellido()] = apellidos_contados.get(persona.get_apellido(), 0) + 1
        
        apellidos_repetidos = {apellido for apellido, count in apellidos_contados.items() if count > 1}
        
        personas_mismo_apellido_encontradas = False
        if apellidos_repetidos:
            print("Personas que comparten apellido:")
            for apellido_rep in apellidos_repetidos:
                print(f"\nApellido: {apellido_rep}")
                for persona in todas_las_personas:
                    if persona.get_apellido() == apellido_rep:
                        print(persona.mostrar())
                        personas_mismo_apellido_encontradas = True
        
        if not personas_mismo_apellido_encontradas:
             print("No se encontraron estudiantes ni docentes que compartan apellido.")

    except ValueError as ve:
        print(f"Error al crear objeto: {ve}")
    except Exception as e:
        print(f"Ocurrió un error inesperado: {e}")
