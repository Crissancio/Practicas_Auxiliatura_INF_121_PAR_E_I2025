class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2
    # Inciso a
    def promedio(self):
        promedio = (self.nota_1 + self.nota_2) / 2
        return f"El estudiante {self.nombre} tiene un promedio de {promedio}"
    # Inciso b
    def aprobo(self):
        promedio = (self.nota_1 + self.nota_2) / 2
        if promedio >= 6:
            return f"El estudiante {self.nombre} aprobo"
        else:
            return f"El estudiante {self.nombre} no aprobo"
# Inciso c
e1 = Estudiante("Joel", 3, 5)
print(e1.promedio())
print(e1.aprobo())
e2 = Estudiante("Milo", 7, 6)
print(e2.promedio())
print(e2.aprobo())
e3 = Estudiante("Tobias", 9, 9)
print(e3.promedio())
print(e3.aprobo())
