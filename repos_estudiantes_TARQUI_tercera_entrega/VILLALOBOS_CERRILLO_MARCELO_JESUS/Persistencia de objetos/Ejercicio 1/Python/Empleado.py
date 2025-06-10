import os

class Empleado:
    def __init__(self, nombre="", edad=0, salario=0.0):
        self.nombre = nombre
        self.edad = edad
        self.salario = salario

    def cargarDatos(self, ruta):
        with open(ruta, 'r') as f:
            self.nombre = f.readline().strip()
            self.edad = int(f.readline().strip())
            self.salario = float(f.readline().strip())

    def guardarDatos(self, ruta):
        with open(ruta, 'w') as f:
            f.write(f"{self.nombre}\n")
            f.write(f"{self.edad}\n")
            f.write(f"{self.salario}\n")

    def eliminarDatos(self, ruta):
        if os.path.exists(ruta):
            os.remove(ruta)

    def __str__(self):
        return f"{self.nombre} - Edad: {self.edad}, Salario: {self.salario}"
