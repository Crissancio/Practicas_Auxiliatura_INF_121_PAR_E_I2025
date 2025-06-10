import os
import json

class Empleado:
    def __init__(self, nombre, edad, salario):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def to_dict(self):
        return {
            'nombre': self.nombre,
            'edad': self.edad,
            'salario': self.salario
        }

    @staticmethod
    def from_dict(data):
        return Empleado(data['nombre'], data['edad'], data['salario'])

    def __str__(self):
        return f"Nombre: {self.nombre}\nEdad: {self.edad}\nSalario: {self.salario}"


class ArchivoEmpleado:
    def __init__(self, carpeta):
        self.ruta_base = f"C:/Users/Diego/Desktop/mis_empleados2/{carpeta}/"
        self.crear_carpeta()

    def crear_carpeta(self):
        if not os.path.exists(self.ruta_base):
            os.makedirs(self.ruta_base)

    def guardar_empleado(self, empleado):
        ruta = os.path.join(self.ruta_base, f"empleado_{empleado.nombre}.json")
        with open(ruta, 'w') as f:
            json.dump(empleado.to_dict(), f, indent=4)

    def busca_empleado(self, nombre):
        ruta = os.path.join(self.ruta_base, f"empleado_{nombre}.json")
        if not os.path.exists(ruta):
            return None

        with open(ruta, 'r') as f:
            data = json.load(f)
        empleado = Empleado.from_dict(data)

        buscado_path = os.path.join(self.ruta_base, "empleadoBuscado.json")
        with open(buscado_path, 'w') as f:
            json.dump(empleado.to_dict(), f, indent=4)

        return empleado

    def mayor_salario(self, salario_limite):
        mayor = None
        for archivo in os.listdir(self.ruta_base):
            if archivo.startswith("empleado_") and archivo.endswith(".json"):
                ruta = os.path.join(self.ruta_base, archivo)
                with open(ruta, 'r') as f:
                    data = json.load(f)
                    empleado = Empleado.from_dict(data)
                    if empleado.salario > salario_limite:
                        mayor = empleado

        if mayor:
            ruta_mayor = os.path.join(self.ruta_base, "mayorSalario.json")
            with open(ruta_mayor, 'w') as f:
                json.dump(mayor.to_dict(), f, indent=4)

        return mayor

if __name__ == "__main__":
    archivo = ArchivoEmpleado("ArchivoEmpleado")

    emp1 = Empleado("Gan", 28, 35000.0)
    emp2 = Empleado("XDddd", 32, 4700.5)
    emp3 = Empleado("Jose", 24, 2900.0)

    archivo.guardar_empleado(emp1)
    archivo.guardar_empleado(emp2)
    archivo.guardar_empleado(emp3)

    buscado = archivo.busca_empleado("Gabo")
    print("Empleado buscado:", buscado if buscado else "No encontrado")

    mayor = archivo.mayor_salario(3000)
    print("Empleado con salario mayor a 3000:\n", mayor)
