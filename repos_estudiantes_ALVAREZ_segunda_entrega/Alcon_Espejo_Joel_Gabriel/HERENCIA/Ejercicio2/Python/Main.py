from datetime import datetime, date

class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo):
        self._ci = ci
        self._nombre = nombre
        self._apellido = apellido
        self._celular = celular
        self._fecha_nac = fecha_nac
        self._sexo = sexo
    
    # Getters
    @property
    def ci(self):
        return self._ci
    
    @property
    def nombre(self):
        return self._nombre
    
    @property
    def apellido(self):
        return self._apellido
    
    @property
    def celular(self):
        return self._celular
    
    @property
    def fecha_nac(self):
        return self._fecha_nac
    
    @property
    def sexo(self):
        return self._sexo
    
    # Setters
    @ci.setter
    def ci(self, value):
        self._ci = value
    
    @nombre.setter
    def nombre(self, value):
        self._nombre = value
    
    @apellido.setter
    def apellido(self, value):
        self._apellido = value
    
    @celular.setter
    def celular(self, value):
        self._celular = value
    
    @fecha_nac.setter
    def fecha_nac(self, value):
        self._fecha_nac = value
    
    @sexo.setter
    def sexo(self, value):
        self._sexo = value
    
    def calcular_edad(self):
        hoy = date.today()
        edad = hoy.year - self.fecha_nac.year
        if (hoy.month, hoy.day) < (self.fecha_nac.month, self.fecha_nac.day):
            edad -= 1
        return edad
    
    def mostrar(self):
        return (f"CI: {self.ci}, Nombre: {self.nombre} {self.apellido}, "
                f"Celular: {self.celular}, Fecha Nacimiento: {self.fecha_nac.strftime('%d/%m/%Y')}, "
                f"Sexo: {self.sexo}, Edad: {self.calcular_edad()}")


class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo, ru, fecha_ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_nac, sexo)
        self._ru = ru
        self._fecha_ingreso = fecha_ingreso
        self._semestre = semestre
    
    # Getters
    @property
    def ru(self):
        return self._ru
    
    @property
    def fecha_ingreso(self):
        return self._fecha_ingreso
    
    @property
    def semestre(self):
        return self._semestre
    
    # Setters
    @ru.setter
    def ru(self, value):
        self._ru = value
    
    @fecha_ingreso.setter
    def fecha_ingreso(self, value):
        self._fecha_ingreso = value
    
    @semestre.setter
    def semestre(self, value):
        self._semestre = value
    
    def mostrar(self):
        return (super().mostrar() + 
                f", RU: {self.ru}, Fecha Ingreso: {self.fecha_ingreso.strftime('%d/%m/%Y')}, "
                f"Semestre: {self.semestre}")


class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_nac, sexo, nit, profesion, especialidad):
        super().__init__(ci, nombre, apellido, celular, fecha_nac, sexo)
        self._nit = nit
        self._profesion = profesion
        self._especialidad = especialidad
    
    # Getters
    @property
    def nit(self):
        return self._nit
    
    @property
    def profesion(self):
        return self._profesion
    
    @property
    def especialidad(self):
        return self._especialidad
    
    # Setters
    @nit.setter
    def nit(self, value):
        self._nit = value
    
    @profesion.setter
    def profesion(self, value):
        self._profesion = value
    
    @especialidad.setter
    def especialidad(self, value):
        self._especialidad = value
    
    def mostrar(self):
        return (super().mostrar() + 
                f", NIT: {self.nit}, Profesión: {self.profesion}, "
                f"Especialidad: {self.especialidad}")


# Creación de instancias
estudiantes = [
    Estudiante("1234567", "Juan", "Perez", "70123456", date(1995, 5, 15), "M", "2021001", date(2021, 1, 10), 6),
    Estudiante("7654321", "Maria", "Gomez", "68765432", date(2000, 8, 20), "F", "2022002", date(2022, 2, 15), 4),
    Estudiante("9876543", "Carlos", "Lopez", "78901234", date(1998, 3, 10), "M", "2020003", date(2020, 8, 5), 8),
    Estudiante("4567890", "Ana", "Perez", "60012345", date(2002, 11, 25), "F", "2023004", date(2023, 1, 20), 2)
]

docentes = [
    Docente("1122334", "Pedro", "Gomez", "67011223", date(1980, 7, 12), "M", "123456789", "Ingeniero", "Sistemas"),
    Docente("4455667", "Luisa", "Martinez", "73044556", date(1975, 9, 5), "F", "987654321", "Licenciada", "Educación"),
    Docente("7788990", "Roberto", "Perez", "69077889", date(1968, 12, 30), "M", "456123789", "Ingeniero", "Electrónica"),
    Docente("3344556", "Laura", "Fernandez", "72033445", date(1982, 4, 18), "F", "789456123", "Doctora", "Medicina")
]

# b) Mostrar información de todos los estudiantes y docentes
print("=== Todos los estudiantes ===")
for estudiante in estudiantes:
    print(estudiante.mostrar())

print("\n=== Todos los docentes ===")
for docente in docentes:
    print(docente.mostrar())

# c) Mostrar estudiantes mayores de 25 años
print("\n=== Estudiantes mayores de 25 años ===")
for estudiante in estudiantes:
    if estudiante.calcular_edad() > 25:
        print(estudiante.mostrar())

# d) Mostrar docente con profesión "Ingeniero", sexo masculino y mayor edad
print("\n=== Docente Ingeniero masculino de mayor edad ===")
ingenieros_masculinos = [d for d in docentes if d.profesion == "Ingeniero" and d.sexo == "M"]
if ingenieros_masculinos:
    mayor_edad = max(ingenieros_masculinos, key=lambda x: x.calcular_edad())
    print(mayor_edad.mostrar())
else:
    print("No hay docentes que cumplan los criterios")

# e) Mostrar estudiantes y docentes con mismo apellido
print("\n=== Personas con mismos apellidos ===")
apellidos_comunes = set(e.apellido for e in estudiantes) & set(d.apellido for d in docentes)

for apellido in apellidos_comunes:
    print(f"\nApellido: {apellido}")
    
    print("Estudiantes:")
    for e in [x for x in estudiantes if x.apellido == apellido]:
        print(f"  - {e.nombre} {e.apellido}")
    
    print("Docentes:")