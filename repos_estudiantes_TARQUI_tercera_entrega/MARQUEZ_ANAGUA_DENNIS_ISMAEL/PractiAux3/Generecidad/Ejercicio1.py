class Caja:
    def __init__(self):
        self.contenido = None
    
    def guardar(self, item):
        self.contenido = item
    
    def obtener(self):
        return self.contenido
    
    def __str__(self):
        return f"Caja contiene: {self.contenido}"

caja_entera = Caja()
caja_entera.guardar(23)
print(caja_entera)

caja_texto = Caja()
caja_texto.guardar("System of a Down - Prison Song")
print(caja_texto)