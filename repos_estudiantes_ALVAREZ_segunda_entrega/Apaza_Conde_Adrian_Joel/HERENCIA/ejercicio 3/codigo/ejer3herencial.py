'''
3. Definir las clases:
Persona <ci, nombre, apellido, celular, fecha_Nac>
Estudiante (heredado de persona) <ru, fecha_Ingreso, semestre>
Docente (heredado de persona) <nit, profesión, especialidad>
a) Diseñar el diagrama UML de las clases anteriores.
b) Implementa las clases con sus constructores, datos por defecto y 
mostrar.
c) Mostrar los estudiantes mayores de 25 años.
d) Mostrar al docente que tiene la profesión de "Ingeniero", es del sexo 
masculino y es el mayor de todos.
e) Mostrar a los estudiantes y docentes que tienen el mismo apellido.
'''

# b)
class Persona:
    def __init__(self, ci="0000000", nombre="Sin nombre", apellido="Sin apellido", 
                 celular="00000000", fecha_Nac="01/01/2000"):
        self._ci = ci
        self._nombre = nombre
        self._apellido = apellido
        self._celular = celular
        self._fecha_Nac = fecha_Nac
    
    def getCi(self):
        return self._ci
    
    def setCi(self, ci):
        self._ci = ci
    
    def getNombre(self):
        return self._nombre
    
    def setNombre(self, nombre):
        self._nombre = nombre
    
    def getApellido(self):
        return self._apellido
    
    def setApellido(self, apellido):
        self._apellido = apellido
    
    def getCelular(self):
        return self._celular
    
    def setCelular(self, celular):
        self._celular = celular
    
    def getFecha_Nac(self):
        return self._fecha_Nac
    
    def setFecha_Nac(self, fecha_Nac):
        self._fecha_Nac = fecha_Nac
    
    def mostrar(self):
        print("ci:", self._ci)
        print("nombre:", self._nombre)
        print("apellido:", self._apellido)
        print("celular:", self._celular)
        print("fecha de nacimiento:", self._fecha_Nac)
    
    def calcularEdad(self):
        añoNac = int(self._fecha_Nac.split('/')[2])
        return 2023 - añoNac


# b)
class Estudiante(Persona):
    def __init__(self, ci="0000000", nombre="Sin nombre", apellido="Sin apellido", 
                 celular="00000000", fecha_Nac="01/01/2000", ru="0123456", 
                 fecha_Ingreso="08/10/2023", semestre=1):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self._ru = ru
        self._fecha_Ingreso = fecha_Ingreso
        self._semestre = semestre
    
    def getRu(self):
        return self._ru
    
    def setRu(self, ru):
        self._ru = ru
    
    def getFecha_Ingreso(self):
        return self._fecha_Ingreso
    
    def setFechaIngreso(self, fecha_Ingreso):
        self._fecha_Ingreso = fecha_Ingreso
    
    def getSemestre(self):
        return self._semestre
    
    def setSemestre(self, semestre):
        self._semestre = semestre
    
    def mostrar(self):
        super().mostrar()
        print("ru:", self._ru)
        print("fecha de ingreso:", self._fecha_Ingreso)
        print("semestre:", self._semestre)
    
    @staticmethod
    def calcularEdadMayora25(a, c):
        print("estudiantes mayores a 25:")
        for i in range(c):
            if a[i].calcularEdad() > 25:
                a[i].mostrar()
    
    @staticmethod
    def mostrarestudiantesMismoApellido(b, c, d, x):
        print("estudiantes con mismos apellidos:")
        for i in range(c):
            for j in range(x):
                if b[i].getApellido() == d[j].getApellido():
                    print("apellidos iguales hallados:")
                    b[i].mostrar()
                    d[j].mostrar()


# b)
class Docente(Persona):
    def __init__(self, ci="0000000", nombre="Sin nombre", apellido="Sin apellido", 
                 celular="00000000", fecha_Nac="01/01/2000", sexo="error", 
                 nit="0123456-0", profesion="cocina", especialidad="salchipapero"):
        super().__init__(ci, nombre, apellido, celular, fecha_Nac)
        self._nit = nit
        self._profesion = profesion
        self._especialidad = especialidad
        self._sexo = sexo
    
    def getNit(self):
        return self._nit
    
    def setNit(self, nit):
        self._nit = nit
    
    def getProfesion(self):
        return self._profesion
    
    def setProfesion(self, profesion):
        self._profesion = profesion
    
    def getEspecialidad(self):
        return self._especialidad
    
    def setEspecialidad(self, especialidad):
        self._especialidad = especialidad
    
    def getSexo(self):
        return self._sexo
    
    def setSexo(self, sexo):
        self._sexo = sexo
    
    def mostrar(self):
        super().mostrar()
        print("nit:", self._nit)
        print("profesión:", self._profesion)
        print("especialidad:", self._especialidad)
        print("sexo:", self._sexo)
    
    @staticmethod
    def mostrarDocenteIngenieroMasculinoYMayorqueTodos(docentes, contDoc):
        print("docentes ingenieros masculinos que son mayores:")
        docenteMayor = None
        for i in range(contDoc):
            if (docentes[i].getProfesion() == "Ingeniero" and 
                docentes[i].getSexo() == "Masculino"):
                if (docenteMayor is None or 
                    docentes[i].calcularEdad() > docenteMayor.calcularEdad()):
                    docenteMayor = docentes[i]
        if docenteMayor is not None:
            docenteMayor.mostrar()
        else:
            print("no existen")
    
    @staticmethod
    def mostrarDocentesMismoApellido(b, c, a, y):
        print("docentes que tienen el mismo apellido")
        for i in range(c):
            for j in range(y):
                if b[i].getApellido() == a[j].getApellido():
                    print("apellidos iguales encontrados:")
                    b[i].mostrar()
                    a[j].mostrar()



if __name__ == "__main__":
    estudiantes = [None] * 10
    docentes = [None] * 10
    contEst = 0
    contDoc = 0
    
    estudiantes[contEst] = Estudiante("1234567", "Juan", "Perez", "77712345", "15/05/1995", 
                                    "123456789", "10/01/2020", 8)
    contEst += 1
    estudiantes[contEst] = Estudiante("7654321", "Maria", "Gomez", "77754321", "20/08/2000", 
                                    "987654321", "15/01/2021", 6)
    contEst += 1
    estudiantes[contEst] = Estudiante("1122334", "Carlos", "Perez", "77711223", "10/03/1998", 
                                    "112233445", "20/01/2019", 10)
    contEst += 1
    
    docentes[contDoc] = Docente("4455667", "Pedro", "Gomez", "77744556", "05/12/1980", 
                              "Masculino", "4455667-0", "Ingeniero", "Sistemas")
    contDoc += 1
    docentes[contDoc] = Docente("7788990", "Ana", "Lopez", "77777889", "12/07/1975", 
                              "Femenino", "7788990-1", "Licenciada", "Educación")
    contDoc += 1
    docentes[contDoc] = Docente("3344556", "Luis", "Perez", "77733445", "25/09/1970", 
                              "Masculino", "3344556-2", "Ingeniero", "Electrónica")
    contDoc += 1
    
    print("Estudiantes:")
    for i in range(contEst):
        estudiantes[i].mostrar()
    
    print("\nDocentes:")
    for i in range(contDoc):
        docentes[i].mostrar()
    
    # c)
    Estudiante.calcularEdadMayora25(estudiantes, contEst)
    
    # d)
    Docente.mostrarDocenteIngenieroMasculinoYMayorqueTodos(docentes, contDoc)
    
    # e)
    Estudiante.mostrarestudiantesMismoApellido(estudiantes, contEst, docentes, contDoc)
