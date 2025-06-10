class Empleado:
    def __init__(self, nombre: str, edad: int, salario: float):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario
    
    def __str__(self):
        return f"Nombre: {self.nombre}, Edad: {self.edad}, Salario: ${self.salario:.2f}"
    
    def to_dict(self):
        return {
            'nombre': self.nombre,
            'edad': self.edad,
            'salario': self.salario
        }
    
    @classmethod
    def from_dict(cls, data):
        return cls(data['nombre'], data['edad'], data['salario'])

class ArchivoEmpleado:
    def __init__(self, nomA: str):
        self.nomA = nomA
        self.crear_archivo()
    
    def crear_archivo(self):
        try:
            with open(self.nomA, 'r') as f:
                pass
        except FileNotFoundError:
            with open(self.nomA, 'w') as f:
                f.write("[]")
    
    def guardar_empleado(self, empleado: Empleado) -> bool:
        try:
            with open(self.nomA, 'r') as f:
                contenido = f.read()
                lista_empleados = eval(contenido) if contenido else []
            
            empleados = [Empleado.from_dict(emp) for emp in lista_empleados]
            empleados.append(empleado)
            empleados_dict = [emp.to_dict() for emp in empleados]
            
            with open(self.nomA, 'w') as f:
                f.write(str(empleados_dict))
            
            return True
        except Exception as ex:
            print(f"Error al guardar empleado: {ex}")
            return False
    
    def buscar_empleado(self, nombre: str) -> Empleado:
        try:
            with open(self.nomA, 'r') as f:
                empleados = eval(f.read())
            
            for emp in empleados:
                if emp['nombre'].lower() == nombre.lower():
                    return Empleado.from_dict(emp)
            
            return None
        except Exception as ex:
            print(f"Error al buscar empleado: {ex}")
            return None
    
    def mayor_salario(self, salario_min: float) -> Empleado:
        try:
            with open(self.nomA, 'r') as f:
                empleados = eval(f.read())
                
            for emp in empleados:
                if emp['salario'] > salario_min:
                    return Empleado.from_dict(emp)
            
            return None
        except Exception as ex:
            print(f"Error al buscar por salario: {ex}")
            return None
    
    def listar_empleados(self) -> list:
        try:
            with open(self.nomA, 'r') as f:
                empleados = eval(f.read())
                return [Empleado.from_dict(emp) for emp in empleados]
        except Exception as ex:
            print(f"Error al listar empleados: {ex}")
            return []


if __name__ == "__main__":
    archivo = ArchivoEmpleado("empleados.dat")
    
    empleados = [
        Empleado("Serj Tankian", 35, 2300),
        Empleado("Anaela del Carme", 28, 3500),
        Empleado("Charlie Cox", 42, 1700)
    ]
    
    for emp in empleados:
        if archivo.guardar_empleado(emp):
            print(f"Empleado guardado: {emp.nombre}")
        else:
            print(f"Error al guardar: {emp.nombre}")
    
    print("\n=== Lista completa de empleados ===")
    for emp in archivo.listar_empleados():
        print(emp)
    
    print("\n=== Buscar empleado existente ===")
    encontrado = archivo.buscar_empleado("Anaela del Carme")
    print(f"Resultado búsqueda: {encontrado if encontrado else 'No encontrado'}")
    
    print("\n=== Buscar empleado inexistente ===")
    encontrado = archivo.buscar_empleado("María Gómez")
    print(f"Resultado búsqueda: {encontrado if encontrado else 'No encontrado'}")
    
    print("\n=== Empleado con salario > 2000 ===")
    mayor = archivo.mayor_salario(2000)
    print(f"Resultado: {mayor if mayor else 'No encontrado'}")
    
    print("\n=== Empleado con salario > 4000 ===")
    mayor = archivo.mayor_salario(4000)
    print(f"Resultado: {mayor if mayor else 'No encontrado'}")