class Persona:
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, sexo):
        self.ci = ci
        self.nombre = nombre
        self.apellido = apellido
        self.celular = celular
        self.fecha_Nac = fecha_Nac
        self.sexo = sexo
    def mostrar_datos(self):
        return (f"C.I:{self.ci}\nNOMBRE:{self.nombre}\nAPELLIDO:{self.apellido}\nCELULAR:{self.celular}\n"
               f"AÑO DE NACIMIENTO:{self.fecha_Nac}\nSEXO:{self.sexo}")
    def edad(self):
        año_actual = 2025
        return año_actual - self.fecha_Nac
    
class Estudiante(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, sexo, ru, fecha_Ingreso, semestre):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac, sexo)
        self.ru = ru
        self.fecha_Ingreso = fecha_Ingreso
        self.semestre = semestre
    def mostrar_datos(self):
        info_datos = super().mostrar_datos()
        return f"{info_datos}\nR.U:{self.ru}\nFECHA DE INGRESO:{self.fecha_Ingreso}\nSEMESTRE:{self.semestre}"
  
class Docente(Persona):
    def __init__(self, ci, nombre, apellido, celular, fecha_Nac, sexo, nit, profesion, especialidad):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac, sexo)
        self.nit = nit
        self.profesion = profesion
        self.especialidad = especialidad
    def mostrar_datos(self):
        info_datos = super().mostrar_datos()
        return f"{info_datos}\nNIT:{self.nit}\nPROFESIÓN:{self.profesion}\nESPECIALIDAD:{self.especialidad}"
    

estudiantes = [
    Estudiante("100036","Daniel","Alvarez","78963102", 1999,"Masculino","116156","2020","6to Semestre"),
    Estudiante("967801","Ana","Montaño","77830145", 2001,"Femenino","665610","2024","1er Semestre"),
    Estudiante("217533","Eduardo","Mamani","69100876", 1997,"Masculino","6546420","2021","2do Semestre")
]

docentes = [
    Docente("123456","Alejandro","Mendizabal","78900036", 1969,"Masculino","8946561165","Ingeniero","Sistemas"),
    Docente("789456","Gabriela","Mamani","69003214", 1974,"Femenino", "461332316516","Licenciada","Derecho"),
    Docente("654913","Pedro","Choque","77936120",1981,"Masculino", "4456132314","Ingeniero","Civil")
]

print("Estudiantes mayores de 25 años:")
for estudiante in estudiantes:
    if estudiante.edad() > 25:
        print(f"{estudiante.nombre} {estudiante.apellido} - Edad: {estudiante.edad()}")
print("____________________________________________________________")        

print("\nDocente Ingeniero, masculino y mayor:")
candidatos = [d for d in docentes if "ingeniero" in d.profesion.lower() and d.sexo.lower() == "masculino"]
if candidatos:
    docente_mayor = max(candidatos, key=lambda d: d.edad())
    print(docente_mayor.mostrar_datos())
else:
    print("No se encontró un docente que cumpla con los requisitos.")

print("____________________________________________________________") 

print("\nApellido en común entre estudiantes y docentes:")
for est in estudiantes:
    for doc in docentes:
        if est.apellido.lower() == doc.apellido.lower():
            print(f"Estudiante: {est.nombre} {est.apellido}")
            print(f"Docente: {doc.nombre} {doc.apellido}")

print("____________________________________________________________") 






