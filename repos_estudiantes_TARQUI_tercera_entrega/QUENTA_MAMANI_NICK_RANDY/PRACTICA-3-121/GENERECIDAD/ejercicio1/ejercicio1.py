# 1. Crea una clase genérica Caja<T> para guardar algún tipo de objeto
# a) Agrega métodos guardar() y obtener()
# b) Crea dos instancias de la caja y almacena 2 datos de diferente tipo
# c) Muestra el contenido de las cajas

class Caja:
    def __init__(self):
        self.objeto = None

    def guardar(self, obj):
        self.objeto = obj

    def obtener(self):
        return self.objeto

caja1 = Caja()
caja1.guardar(123445)

caja2 = Caja()
caja2.guardar("Me gusta el anime")

print("Contenido caja1:", caja1.obtener())
print("Contenido caja2:", caja2.obtener())
