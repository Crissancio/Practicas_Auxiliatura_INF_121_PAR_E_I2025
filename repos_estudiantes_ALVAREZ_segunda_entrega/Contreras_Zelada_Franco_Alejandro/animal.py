from multipledispatch import dispatch

class Animal:
   def __init__(self,a,b,c):
       self.tipo=a
       self.raza=b
       self.edad=c
   def mostrar(self):
       print(self.tipo," ",self.raza," ",self.edad)
   @dispatch(str)
   def verificar(self,x:str):
       if self.tipo==x:
          print("IGUAL...")
       else:
          print("DIFERENTE...")

   @dispatch(int)
   def verificar(self, x:int):
       if self.edad>x:
          return True
       else:
          return False
    

#PRINCIPAL
A=Animal("gallina","ponedora",2)
A.mostrar()
A.verificar("conejo")