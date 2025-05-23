#Crea una clase Celular con espacio para 20 aplicaciones o 1024Mb de Espacio
    #a)Crea un método para instalar una nueva aplicación
    #b)Crea un método para utilizar una aplicación (las aplicaciones que pesan más de 100Mb utilizan un 2% de batería por cada 10 minutos uso, las que pesan más de 250Mb utilizan 5% por cada 10 minutos de uso, en otros casos utiliza un 1% cada 10 minutos de uso)
    #c)Muestra el porcentaje de batería restante
    #d)Cuando la batería se acabe al tratar de utilizar el celular este debe mostrar el mensaje de celular apagado

# LAS APLICACIONES DEBEN ALMACENARSE EN AGUNA ESTRUCUTURA DE DATOS

class Celular:
    def __init__(self, espacio_total=1024, bateria=100):
        self.espacio_total = espacio_total
        self.espacio_usado = 0
        self.bateria = bateria

    def instalar_aplicacion(self, tamano):
        if self.espacio_usado + tamano <= self.espacio_total:
            self.espacio_usado += tamano
            print("Aplicación instalada.")
        else:
            print("No hay suficiente espacio.")

    def usar_aplicacion(self, tamano, minutos):
        if self.bateria <= 0:
            print("Celular apagado")
            return

        if tamano > 250:
            consumo = minutos * 0.5
        elif tamano > 100:
            consumo = minutos * 0.2
        else:
            consumo = minutos * 0.1

        if self.bateria - consumo > 0:
            self.bateria -= consumo
            print(f"Aplicación usada, batería restante: {self.bateria}%")
        else:
            self.bateria = 0
            print("Batería agotada. Celular apagado.")

mi_celular = Celular()
mi_celular.instalar_aplicacion(200)
mi_celular.usar_aplicacion(200, 300)
print(f"Batería restante: {mi_celular.bateria}%")
