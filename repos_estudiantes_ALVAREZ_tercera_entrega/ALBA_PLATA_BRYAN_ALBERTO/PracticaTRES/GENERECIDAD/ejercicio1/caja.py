class Caja:
    def __init__(self):
        self.objeto = None

    def guardar(self, valor):
        self.objeto = valor

    def obtener(self):
        return self.objeto

caja1 = Caja()
caja1.guardar("comida")

caja2 = Caja()
caja2.guardar(123)

print("Contenido de caja1:", caja1.obtener())
print("Contenido de caja2:", caja2.obtener())