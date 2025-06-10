
class Caja:
    def __init__(self):
        self._contenido = None

    def guardar(self, objeto):
        self._contenido = objeto

    def obtener(self):
        return self._contenido

caja_texto = Caja()
caja_texto.guardar("cajas de abceso")

caja_numero = Caja()
caja_numero.guardar(1231)
print("Contenido de caja_texto:", caja_texto.obtener())
print("Contenido de caja_numero:", caja_numero.obtener())
print("noemi chino blanco")
