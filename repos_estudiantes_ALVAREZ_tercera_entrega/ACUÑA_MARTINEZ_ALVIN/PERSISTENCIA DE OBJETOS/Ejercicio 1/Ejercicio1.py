# Clase Empleado
class Empleado:
    def __init__(self, nombre: str, edad: int, salario: float):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

# Clase ArchivoEmpleado
class ArchivoEmpleado:
    def __init__(self, nomA: str):
        self.nomA = nomA
        self.lista = []

    # a)
    def guardarEmpleado(self, empleado):
        self.lista.append(empleado)

    # b)
    def buscaEmpleado(self, nombre):
        for empleado in self.lista:
            if empleado.nombre == nombre:
                return empleado
        return None

    # c)
    def mayorSalario(self, sueldo):
        for empleado in self.lista:
            if empleado.salario > sueldo:
                return empleado
        return None

def main():
    archivo = ArchivoEmpleado("MiArchivo")

    archivo.guardarEmpleado(Empleado("Ana", 30, 5000))
    archivo.guardarEmpleado(Empleado("Luis", 25, 3000))
    archivo.guardarEmpleado(Empleado("Marta", 40, 7000))

    buscado = archivo.buscaEmpleado("Luis")
    if buscado:
        print("Empleado encontrado:", buscado.nombre)
    else:
        print("Empleado no encontrado.")

    mayor = archivo.mayorSalario(4000)
    if mayor:
        print("Empleado con mayor salario:", mayor.nombre)
    else:
        print("Ningún empleado supera ese salario.")

# 🔷 Ejecutar función principal
if __name__ == "__main__":
    main()
