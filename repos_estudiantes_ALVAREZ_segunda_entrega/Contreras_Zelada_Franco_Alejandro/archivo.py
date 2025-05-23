class Archivo:
    nombre=tipo=None
    tamaño=None

    def __init__(self, n,f,t):
        self.nombre=n
        self.tipo=f
        self.tamaño=t

    def mostrar(self):
        print(self.nombre, self.tipo ,self.tamaño)
    
print("")
#PRINCIPAL
A1=Archivo("poema","latex",50)
A1.mostrar()

A2=Archivo("mirar","youtubeMP4",160)
A2.mostrar()