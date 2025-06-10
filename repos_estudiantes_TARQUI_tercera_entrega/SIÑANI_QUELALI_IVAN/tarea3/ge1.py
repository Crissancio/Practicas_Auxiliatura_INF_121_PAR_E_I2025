class Caja:
    def __init__(self):
        self.objeto = None 

    def guardar(self, objeto):
        self.objeto = objeto

    def obtener(self):
        return self.objeto

cajaenteros = Caja()
cajaenteros.guardar(42)
print("Contenido de caja-enteros:", cajaenteros.obtener())

cajatexto = Caja()
cajatexto.guardar("Hola mundo")
print("Contenido de caja-texto:", cajatexto.obtener())
