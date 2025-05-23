#a)
class Parte:
    def __init__(self,nombre, peso):
        self.nombre = nombre
        self.peso = peso
    
    def __str__(self):
        return f'-------------Parte-------------- \n Parte: {self.nombre}, Peso{self.peso} Kg \n'
    def getNombre(self):
        return self.nombre
    def setNombre(self,nombre):
        self.nombre = nombre
    
    def getPeso(self):
        return self.peso
    def setPeso(self,peso):
        self.peso = peso

class Avion:
    def __init__(self,modelo,fabricante):
        self.modelo = modelo
        self.fabricante = fabricante
        self.partes = []
    
    def agregar_parte(self, nombre,peso):
        self.partes.append(Parte(nombre,peso))
    
    def __str__(self):
        print( "---------------------------Avion------------------------- \n")
        cad = ""
        for parte in self.partes:
            cad += str(parte)
        return f"Avion: {self.modelo} \n Fabricante: {self.fabricante} \n Partes:\n{cad} \n"
    
    def getModelo(self):
        return self.modelo
    def setModelo(self,modelo):
        self.modelo = modelo
        
    def getFabricante(self):
        return self.fabricante
    def setFabricante(self,fabricante):
        self.fabricante = fabricante
        
    def getPartes(self):
        return self.partes
    def setPartes(self,partes):
        self.partes = partes
    
#b)
avion  = Avion("Boeing 747", "Boeing")
avion.agregar_parte("Ala", 2000)
avion.agregar_parte("Ala 2" , 2000)
avion.agregar_parte("Fuselaje", 5000)
avion.agregar_parte("Turbina", 1000)
#c)
print(avion)