class Caja:
    def __init__(self):
        self.contenido = None

    def guardar(self, objeto):
        self.contenido = objeto

    def obtener(self):
        return self.contenido
# Prueba
caja_texto = Caja()
caja_texto.guardar("Hola mundo")

caja_numero = Caja()
caja_numero.guardar(123)

print("CajaTexto:", caja_texto.obtener())
print("CajaNumero:", caja_numero.obtener())
