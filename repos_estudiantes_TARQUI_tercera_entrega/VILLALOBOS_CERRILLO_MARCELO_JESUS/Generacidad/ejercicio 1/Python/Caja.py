class Caja:
    def __init__(self):
        self.contenido = None
    def guardar(self, dato):
        self.contenido = dato
    def obtener(self):
        return self.contenido
ct = Caja()
ct.guardar("Hola mundo")
cn = Caja()
cn.guardar(123)
print("texto:", ct.obtener())
print("numero:", cn.obtener())
