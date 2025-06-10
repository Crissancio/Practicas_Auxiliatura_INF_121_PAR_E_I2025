class Perro():
    def __init__(self,nombre,edad,raza):
        self.__nombre=nombre
        self.__edad=edad
        self.__raza=raza
    def mostrar(self):
        return f"Nombre:{self.__nombre}--Edad:{self.__edad}--Raza:{self.__raza}"
    def hacerSonido(self):
        print("GUAu GUAu")
    def moverse(self):
        print("corre")
class Gato():
    def __init__(self,nombre ,color):
        self.__nombre=nombre
        self.__color=color
    def mostrar(self):
        return f"NOmbre:{self.__nombre} color;{self.__color}"
    def hacerSonido(self):
        print("miau")
    def moverse(self):
        print("salta")
class Pajaro():
    def __init__(self,nombre,tipo):
        self.__nombre=nombre
        self.__tipo=tipo
    def mostrar(self):
        return f"Nombre:{self.__nombre}--tipo:{self.__tipo}"
    def hacerSonido(self):
        print("pio pio")
    def moverse(self):
        print("vuelaa")
p=Perro("Darx",5,"chauchau")
print(p.mostrar())
p.hacerSonido()
p.moverse()
g=Gato("Tommy","BLAnco")
print(g.mostrar())
g.hacerSonido()
g.moverse()
p=Pajaro("Piolin","Canario")
print(p.mostrar())
p.hacerSonido()
p.moverse()