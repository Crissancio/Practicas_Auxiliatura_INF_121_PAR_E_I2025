class Caja:
    def __init__(self):
        self._contenido = None
    
    def guardar(self, objeto):
        self._contenido = objeto
    
    def obtener(self):
        return self._contenido


caja_int = Caja()
caja_str = Caja()

caja_int.guardar(40)          
caja_str.guardar("Hi")     

print("Contenido de la caja de entero:", caja_int.obtener())  
print("Contenido de la caja de cadena:", caja_str.obtener())  
