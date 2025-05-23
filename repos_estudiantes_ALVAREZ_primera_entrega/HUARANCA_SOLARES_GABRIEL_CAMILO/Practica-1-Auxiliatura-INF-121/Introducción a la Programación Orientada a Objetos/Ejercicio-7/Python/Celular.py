class Celular:
  def __init__(self):
    self.W = []
    self.ad = 1024
    self.power = 100
    self.na = 0
  def instalarApp(self, nopa, tana):
    if self.na < 20 and self.ad >= tana:
      # se debe almacenar tambien el tamaño de la app
      self.W.append(nopa)
      self.ad -= tana
      self.na = self.na + 1
      print(f"{nopa} Instalado con Éxito")
    else:
        print(f"Espacio Insuficiente")

  # se debe utilizar solo el nombre de la app para buscarlo en las ya instaladas
  def usarApp(self, nopa, tana, time):
    if(self.power > 0):
      consumoBateria = 0
      if nopa in self.W:
           if tana > 250:
             consumoBateria = (time//10)*5
           elif tana > 100:
             consumoBateria = (time//10)*2
           else:
             consumoBateria = (time//10)*1

           if consumoBateria > self.power:
               consumoBateria = self.power

           self.power-=consumoBateria

           if self.power == 0:
            self.bateria = 0

           print(f"{nopa} usando durante {time} min")
      else:
          print("La Aplicacion NO fue encontrada")
    else:
       print("Celular Apagado")
  def mostrarBat(self):
    print(f"Bateria restante: {self.power} %")
  def mensaje(self):
    print(f"Celular Apagandose...")
print("---------------------------------------------------------------------")
print("Celular")
print("---------------------------------------------------------------------")
print("Samsung Galaxy A11")
print("---------------------------------------------------------------------")
C1 = Celular()
print(f"Batería: {C1.power} %")
print(f"Espacio disponible: 1 GB = {C1.ad} MB")
print("---------------------------------------------------------------------")
C1.instalarApp("WhatsApp" , 100)
C1.instalarApp("Call of Duty Mobile" , 300)
C1.instalarApp("You Tube" , 120)
C1.instalarApp("Brawl Stars",170)
C1.instalarApp("Threads",120)
C1.instalarApp("Clash Royale",214)
C1.instalarApp("Mobile Legends",265)
print("---------------------------------------------------------------------")
C1.usarApp("WhatsApp", 100, 20);
C1.mostrarBat()
print("---------------------------------------------------------------------")
C1.usarApp("Call of Duty Mobile", 300, 30);
C1.mostrarBat();
print("---------------------------------------------------------------------")
C1.usarApp("You Tube", 120, 50);
C1.mostrarBat();
print("---------------------------------------------------------------------")
C1.usarApp("Brawl Stars", 170, 35);
C1.mostrarBat();
print("---------------------------------------------------------------------")
C1.usarApp("Tik Tok", 200, 30);
print("---------------------------------------------------------------------")
C1.usarApp("WhatsApp", 100, 70);
C1.mostrarBat();
print("---------------------------------------------------------------------")
C1.usarApp("Threads", 120,15);
C1.mostrarBat();
print("---------------------------------------------------------------------")
C1.usarApp("Call of Duty Mobile", 300, 40);
C1.mostrarBat();
print("---------------------------------------------------------------------")
C1.usarApp("You Tube", 120,30);
C1.mostrarBat();
print("---------------------------------------------------------------------")
C1.usarApp("Brawl Stars", 170, 20);
C1.mostrarBat();
print("---------------------------------------------------------------------")
C1.usarApp("Clash Royale",214,38);
C1.mostrarBat();
print("---------------------------------------------------------------------")
C1.usarApp("Call of Duty Mobile", 300,25);
C1.mostrarBat();
print("---------------------------------------------------------------------")
C1.usarApp("You Tube", 120,50);
C1.mostrarBat();
print("---------------------------------------------------------------------")
C1.usarApp("WhatsApp", 100,40);
C1.mostrarBat();
print("---------------------------------------------------------------------")
C1.mensaje();
print("---------------------------------------------------------------------")
