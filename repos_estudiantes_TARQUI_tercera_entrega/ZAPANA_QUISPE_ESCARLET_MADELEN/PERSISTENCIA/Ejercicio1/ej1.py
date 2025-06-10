import os

class Empleado:
    def __init__(self, nombre: str, edad: int, salario: float):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def __str__(self):
        return f"Nombre: {self.nombre}, Edad: {self.edad}, Salario: {self.salario}"

    def to_csv_string(self):
        
        return f"{self.nombre},{self.edad},{self.salario}"

    @classmethod
    def from_csv_string(cls, csv_string: str):
        parts = csv_string.strip().split(',')
        if len(parts) == 3:
            try:
                nombre = parts[0]
                edad = int(parts[1])
                salario = float(parts[2])
                return cls(nombre, edad, salario)
            except ValueError:
                print(f"Error parsing employee data: {csv_string}")
                return None
        return None

class ArchivoEmpleado:
    def __init__(self, nomA: str):
        self.nomA = nomA

    def crearArchivo(self):
        try:
            with open(self.nomA, 'a') as f:
                pass  
            print(f"File '{self.nomA}' created or already exists.")
        except IOError as e:
            print(f"Error creating file '{self.nomA}': {e}")

    def guardarEmpleado(self, e: Empleado):
        try:
            with open(self.nomA, 'a') as f:
                f.write(e.to_csv_string() + '\n')
            print(f"Empleado '{e.nombre}' guardado exitosamente.")
        except IOError as err:
            print(f"Error al guardar empleado '{e.nombre}': {err}")

    def buscaEmpleado(self, n: str) -> Empleado:
        try:
            with open(self.nomA, 'r') as f:
                for line in f:
                    empleado = Empleado.from_csv_string(line)
                    if empleado and empleado.nombre.lower() == n.lower():
                        return empleado
            print(f"Empleado con nombre '{n}' no encontrado.")
            return None
        except FileNotFoundError:
            print(f"El archivo '{self.nomA}' no existe.")
            return None
        except IOError as err:
            print(f"Error al buscar empleado: {err}")
            return None

    def mayorSalario(self, sueldo: float) -> Empleado:
        try:
            with open(self.nomA, 'r') as f:
                for line in f:
                    empleado = Empleado.from_csv_string(line)
                    if empleado and empleado.salario > sueldo:
                        return empleado
            print(f"No se encontró ningún empleado con salario mayor a {sueldo}.")
            return None
        except FileNotFoundError:
            print(f"El archivo '{self.nomA}' no existe.")
            return None
        except IOError as err:
            print(f"Error al buscar empleado por salario: {err}")
            return None
if __name__ == "__main__":
    file_name = "empleados.txt"
    if os.path.exists(file_name):
        os.remove(file_name)
    ae = ArchivoEmpleado(file_name)
    ae.crearArchivo()
    emp1 = Empleado("Juan Perez", 30, 50000.0)
    emp2 = Empleado("Maria Lopez", 25, 60000.0)
    emp3 = Empleado("Carlos Garcia", 35, 45000.0)
    emp4 = Empleado("Ana Rodriguez", 28, 75000.0)
    print("\n--- Guardando empleados ---")
    ae.guardarEmpleado(emp1)
    ae.guardarEmpleado(emp2)
    ae.guardarEmpleado(emp3)
    ae.guardarEmpleado(emp4)
    print("\n--- Buscando empleados ---")
    found_emp1 = ae.buscaEmpleado("Maria Lopez")
    if found_emp1:
        print(f"Empleado encontrado: {found_emp1}")
    else:
        print("Empleado 'Maria Lopez' no encontrado.")

    found_emp2 = ae.buscaEmpleado("Pedro Ramirez") 
    if found_emp2:
        print(f"Empleado encontrado: {found_emp2}")
    else:
        print("Empleado 'Pedro Ramirez' no encontrado (como se esperaba).")
    print("\n--- Buscando empleado con mayor salario ---")
    high_salary_emp1 = ae.mayorSalario(55000.0)
    if high_salary_emp1:
        print(f"Primer empleado con salario mayor a 55000.0: {high_salary_emp1}")
    else:
        print("No se encontró tal empleado.")

    high_salary_emp2 = ae.mayorSalario(80000.0)
    if high_salary_emp2:
        print(f"Primer empleado con salario mayor a 80000.0: {high_salary_emp2}")
    else:
        print("No se encontró tal empleado (como se esperaba).")

    print(f"\nContents of {file_name}:")
    with open(file_name, 'r') as f:
        print(f.read())
