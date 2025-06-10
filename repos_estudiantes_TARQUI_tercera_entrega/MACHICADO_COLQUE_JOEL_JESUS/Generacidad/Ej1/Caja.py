class Caja:
    def __init__(self):
        self.contenido = None

    def guardar(self, item):
        self.contenido = item

    def obtener(self):
        return self.contenido


caja_texto = Caja()
caja_texto.guardar("¡Hola mundo!")
print(f"Caja de texto: {caja_texto.obtener()}")

caja_numero = Caja()
caja_numero.guardar(123)
print(f"Caja de número: {caja_numero.obtener()}")