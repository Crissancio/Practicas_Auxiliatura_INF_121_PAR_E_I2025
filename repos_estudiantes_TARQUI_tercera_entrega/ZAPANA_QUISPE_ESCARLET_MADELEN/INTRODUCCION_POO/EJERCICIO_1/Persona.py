class Persona:
    def _init_(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def Saludo(self):
        return f"Hola, soy {self.nombre} de {self.ciudad}" 

    def esMayor(self):
        if self.edad >= 18:
            return f"{self.nombre} es mayor de edad"
        else:
            return f"{self.nombre} es menor de edad"
P1 = Persona("Ana", 17, "Chicago")
P2 =Persona("Esteban " ,22,"Colombia")
P3 = Persona("Ariel",45,"Peru")
print(P1.Saludo())   
print(P2.Saludo())
print(P3.Saludo())
print(P1.esMayor())  
print(P2.esMayor()) 
print(P3.esMayor())