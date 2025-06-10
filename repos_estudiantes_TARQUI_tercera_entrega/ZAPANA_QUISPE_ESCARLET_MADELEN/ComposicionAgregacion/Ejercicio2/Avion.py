class Avion:
    class Parte:
         def __init__(self,nom,p):
             self.__nombre=nom
             self.__peso=p
         def get_nombre(self):
            return self.__nombre
         def get_peso(self):
            return self.__peso
         def set_nombre(self,nombre):
             self.__nombre=nombre
         def set_peso(self,peso):
             self.__peso=peso
         def mostrar(self):
             print(f"Nombre:{self.__nombre} | Peso:{self.__peso} kg")
    def __init__(self,m,f):
        self.__modelo=m
        self.__fabricante=f
        self.__partes=[]
    def añadirPartes(self ,pt):
        self.__partes.append(pt)
    def mostrar(self):
        print(f"\n Modelo:{self.__modelo}| Fabricante:{self.__fabricante}")
        print("Partes del avion ")
        for parte in self.__partes:
            parte.mostrar()
a1=Avion("Boeing 737-800","BCA")
p1=a1.Parte("Alas",700)
p2=a1.Parte("Motores",450)
p3=a1.Parte("treen de aterrizaje",1520)
a1.añadirPartes(p1)
a1.añadirPartes(p2)
a1.añadirPartes(p3)
a1.mostrar()
