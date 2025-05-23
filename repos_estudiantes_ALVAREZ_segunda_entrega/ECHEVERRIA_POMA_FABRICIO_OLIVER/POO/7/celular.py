class Celular:
    def __init__(self):
        self.aplicaciones = {}
        self.espacio_usado=0
        self.bateria=100
    #A
    def instalar(self, aplicacion, peso):
        if self.bateria <=0:
            print("Celular Apagado")
            return
        if aplicacion in self.aplicaciones:
            print(f"La aplicacion {aplicacion} ya esta instalada")
            return
        
        if len(self.aplicaciones)>=20:
            print("No se puede instalar mas aplicaciones")
            return
        if self.espacio_usado + peso > 1024:
            print("No hay suficiente espacio. Espacio disponible: {1024 - self.espacio_usado} MB")
            return
        self.aplicaciones[aplicacion] = peso
        self.espacio_usado += peso
        print(f"Aplicacion {aplicacion} instalada ({peso} MB)")
    #B
    def utilizar (self, aplicacion, tiempo):
        if self.bateria <=0:
            print("Celular Apagado")
            return
        if aplicacion not in self.aplicaciones:
            print(f"La aplicacion {aplicacion} no esta instalada")
            return
        
        peso=self.aplicaciones[aplicacion]
        if peso > 250:
            consumo10min= 5
        elif peso > 100:
            consumo10min= 2
        else:
            consumo10min= 1

        bloque10min= tiempo/10
        consumo= consumo10min*bloque10min
        self.bateria -= consumo

        if self.bateria <= 0:
            self.bateria=0
            print("Celular Apagado")
        else:
            print(f"Usaste {aplicacion} durante {tiempo} minutos. Bateria restante: {self.bateria:.1f}%")
    #C Y #D
    def porcentaje_bateria(self):
        if self.bateria <=0:
            print("Celular Apagado")
            return
        print(f"Bateria restante: {self.bateria:.1f}%")

    
