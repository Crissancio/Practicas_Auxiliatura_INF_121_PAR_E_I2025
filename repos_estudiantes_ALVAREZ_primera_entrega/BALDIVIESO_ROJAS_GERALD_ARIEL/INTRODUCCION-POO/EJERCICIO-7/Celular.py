class Celular:
    def __init__(self):
        self.espacio = 1024
        self.bateria = 100
        self.cantidadApp = 0

    def nuevaApp(self, nombre, tamaño):
        self.nombre = nombre
        self.tamaño = tamaño
        self.cantidadApp +=1
        self.espacio -= self.tamaño
        if self.cantidadApp > 20:
            return print("Espacio de aplicaciones llenas")
        elif self.espacio < 1:
            return print("Espacio lleno!!!")
        else:
            # las aplicaciones y su informacion no se almacenan en ningun lugar
            # solo se muestra el nombre y el tamaño de la app
            return print(f"{self.nombre} instalado espacio restante {self.espacio}")
    def App(self):
        # no se manda el nombre de la app
        # no se utiliza lainformacion que se introdujo de la app
        if self.tamaño > 100 and self.tamaño <250:
            self.bateria -= 2
        elif self.tamaño > 250:
            self.bateria -= 5
        else:
            self.bateria -= 1
        if self.bateria < 1:
            self.bateria = 0
            return print("celular apagado") 
        return f"bateria: {self.bateria}"
    def mostrarBateria(self):
        return f"BATERIA: {self.bateria}"

x = Celular()
x.nuevaApp("pol",254)
#por cada app es el uso por 10 minutos 
x.App()
x.App()
x.App()
x.App()
print(x.mostrarBateria())
x.nuevaApp("uui",23)
x.App()
print(x.mostrarBateria())
x.nuevaApp("face",144)
x.App()
print(x.mostrarBateria())


