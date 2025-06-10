import json

class Empleado:
    def __init__(self, nombre, edad , salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario
        
    def to_dict(self):
        return{
            'nombre':self.nombre,
            'edad':self.edad,
            'salario':self.salario,
        }
    
    @staticmethod
    def from_dict(datos):
        return Empleado(datos['nombre'], datos['edad'],datos ['salario'])
    
    def __str__(self):
        return f"Empleado: {self.nombre}\n Edad:{self.edad}\nSalario:{self.salario}"
    
class ArchivoEmpleado:
    def __init__(self,nomA):
        self.nomA = nomA
        self.empleados = []
        self.cargar_archivo()
    
    def crear_archivo(self):
        self.empleados = []
        self.guardar_archivo()
    
    #a)
    def guardar_empleado(self, e):
        self.empleados.append(e)
        self.guardar_archivo()
    
    #b)
    def buscar_empleado(self,nombre):
        for e in self.empleados:
            if e.nombre.lower() == nombre.lower():
                return e
        return None

    #c)
    def mayor_salario(self,sueldo):
        for e in self.empleados:
            if e.salario > sueldo:
                return e
        return None
    
    def guardar_archivo(self):
        with open(self.nomA, 'w') as file:
            json.dump([e.to_dict() for e in self.empleados] , file, indent=4)
    
    def cargar_archivo(self):
        try:
            with open(self.nomA, "r") as file:
                datos = json.load(file)
                self.empleados = [Empleado.from_dict(d) for d in datos]
        except FileNotFoundError:
            self.empleados = []
#Main
archivo = ArchivoEmpleado("empleados.json")
archivo.crear_archivo()

#Guardando empleados
archivo.guardar_empleado(Empleado("Ana", 30, 3000))
archivo.guardar_empleado(Empleado("Luis", 25, 3500))
archivo.guardar_empleado(Empleado("Maria", 40, 4000))

#Buscando por nombre
e = archivo.buscar_empleado("Luis")
if e:
    print("Encontrado", e)
else:
    print("No se encontro al empleado...")

#Buscando por salario
mayor = archivo.mayor_salario(3200)
if mayor:
    print("Empleado con salario mayor:" , mayor)
else:
    print("NIngun empleado supera ese salario...")