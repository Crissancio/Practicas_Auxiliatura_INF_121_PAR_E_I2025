
class Empleado:
   
    def __init__(self, nombre: str, edad: int, salario: float):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def __str__(self):
        
        return f"{self.nombre},{self.edad},{self.salario:.2f}"

    def __repr__(self):
        
        return self.__str__()

    @staticmethod
    def from_string(empleado_str: str):
        
        try:
            partes = empleado_str.strip().split(',')
            if len(partes) == 3:
                nombre = partes[0]
                edad = int(partes[1])
                salario = float(partes[2])
                return Empleado(nombre, edad, salario)
            else:
                print(f"Advertencia: Formato de linea incorrecto para empleado: {empleado_str}")
                return None
        except (ValueError, IndexError) as e:
            print(f"Error al parsear linea de empleado '{empleado_str}': {e}")
            return None