'''
1. Crea una clase Persona con nombre, edad y ciudad
a)	Agrega un método para mostrar el saludo: “Hola, soy {nombre} de {ciudad}”
b)	Crea tres personas y muestra su saludo
c)	Agrega un método para verificar si es mayor de edad
'''
class Persona:
    def __init__(self):
        self.nombre = "Axl Rose"
        self.ciudad = "Detroit"
        self.edad = 24
    def Saludo(self):
        return 'Hi, that is {} and I am from {}'.format(self.nombre,self.ciudad)
    def Muestraedad(self):
        if self.edad>18:
            return True
        else:
            return False

'''AQUI HICE DE 2 MANERAS DIFERENTES DE PONER LA EDAD.
PRIMERO PREDETERMINADO Y LOS DOS ULTIMOS INGRESADOS POR TECLADO'''

class Persona1:
    def __init__(self):
        self.nombre = "Jim Morrison"
        self.ciudad = "Texas"
    def Saludo(self):
        return 'Hi, that is {} and I am from {}'.format(self.nombre,self.ciudad)
    def edad(self):
        edad = int(input('Enter the age: '))
        if edad>18:
            return True
        else:
            return False

class Persona2:
    def __init__(self):
        self.nombre = "Paul McCartney"
        self.ciudad = "London"
    def Saludo(self):
        return 'Hi, that is {} and I am from {}'.format(self.nombre,self.ciudad)
    def edad(self):
        edad = int(input('Enter the age: '))
        if edad>18:
            return True
        else:
            return False

person1 = Persona()
print(person1.Saludo())
print("Is legal of age?",person1.Muestraedad())

person2 = Persona1()
print(person2.Saludo())
print("Is legal of age?",person2.edad())

person3 = Persona2()
print(person3.Saludo())
print("Is legal of age?",person3.edad())