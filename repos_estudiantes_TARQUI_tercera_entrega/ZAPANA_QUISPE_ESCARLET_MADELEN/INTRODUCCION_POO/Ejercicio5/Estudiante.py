class Estudiante:
    def __init__(self,nombre,nota_1,nota_2):
        self.nombre= nombre
        self.nota_1= nota_1
        self.nota_2 = nota_2

    def promedio(self):
        return (self.nota_1+self.nota_2)/2

    def aprobo(self):
        if self.promedio() >=6:
        	return f"el estudiante {self.nombre} aprobo con un promedio de {self.promedio()}"
        else:
        	return (f"El estudiante {self.nombre} reprobo con un promedio de {self.promedio()}")
E1=Estudiante("Roberto",3,8)
print(E1.aprobo())
E2=Estudiante("Maria",9,7)
print(E2.aprobo())