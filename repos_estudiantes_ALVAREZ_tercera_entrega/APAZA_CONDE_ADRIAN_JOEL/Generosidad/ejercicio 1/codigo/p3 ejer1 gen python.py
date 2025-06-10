'''
1. Ejercicio 1: Generocidad
Crea una clase generica Caja<T> para guardar algun tipo de objeto.
a) Agregar metodos guardar() y obtener().
b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo.
c) Muestra el contenido de las cajas.
'''
class Caja:
    def __init__(self):
        self.x = None
    
    # a ) creamos los metodos guardar() y obtener()
    def guardar(self, n):
        self.x = n
    
    def obtener(self):
        return self.x


# b) creando dos instancias de las cajas con diferentes tipos de datos
caja_de_mensajes = Caja()
caja_de_numeros = Caja()

# b) almacenamos datos en las cajas
caja_de_mensajes.guardar("Hola mundo")
caja_de_numeros.guardar(11)

# c ) mostrando el contenido de las dos cajas
print("Contenido de la caja de cadenas: " + str(caja_de_mensajes.obtener()))
print("Contenido de la caja de números: " + str(caja_de_numeros.obtener()))
