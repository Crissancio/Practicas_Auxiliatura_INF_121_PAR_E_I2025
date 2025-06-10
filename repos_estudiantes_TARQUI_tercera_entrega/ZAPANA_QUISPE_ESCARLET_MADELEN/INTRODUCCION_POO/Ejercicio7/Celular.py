class Celular:
    def __init__(self):
        self.Bateria = 100
        self.Espacio = 1024

    def instalarApp(self, n, App):
        if App < self.Espacio:
            self.Espacio -= App
            return f"Se instaló la app {n}, de {App} MB queda un {self.Espacio} MB disponible "
        else:
            return "Espacio insuficiente"

    def usarApp(self, App,min):
        if App > 100 and App < 250:
            self.Bateria -= 0.2 * min
        elif App > 250:
            self.Bateria -= 0.5 * min
        else:
            self.Bateria -= 0.1 * min

    def porcentaje(self):
        return f"{self.Bateria}%"

    def Estado(self):
        return "Apagado" if self.Bateria <= 0 else "Encendido"

# Creando un objeto Celular
c = Celular()
print(c.Estado())
print(c.instalarApp("Facebook", 300))
c.usarApp(300,60)
print(c.porcentaje())
print(c.instalarApp("tiktok",240))
c.usarApp(240,50)
print(c.porcentaje())
print(c.instalarApp("Instagram",280))
c.usarApp(280,30)
print(c.porcentaje())
print(c.instalarApp("Duolingo",180))
c.usarApp(180,26)
print(c.porcentaje())
print(c.instalarApp("Music",100))
c.usarApp(300,80)
print(c.Estado())