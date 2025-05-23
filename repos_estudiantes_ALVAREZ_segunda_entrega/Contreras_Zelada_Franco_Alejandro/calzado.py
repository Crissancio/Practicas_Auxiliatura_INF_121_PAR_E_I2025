class Calzado:
    def __init__(self,n,c,t,m):
        self.numero=n
        self.color=c
        self.tipo=t
        self.material=m
    def mostrar(self):
        print(self.numero,self.color,self.tipo,self.material)

#PRINCIPAL
a=Calzado(35,"cafe","tennis","cuero")
a.mostrar()
b=Calzado(40,"blanco","casual","goma")