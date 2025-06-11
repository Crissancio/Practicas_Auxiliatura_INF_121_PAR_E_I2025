"""
-------------------ENUNCIADO-------------------

7. Crea una clase Celular con espacio para 20 aplicaciones o 1024Mb de Espacio
a) Crea un método para instalar una nueva aplicación
b) Crea un método para utilizar una aplicación (las aplicaciones que pesan más
de 100Mb utilizan un 2% de batería por cada 10 minutos uso, las que pesan
más de 250Mb utilizan 5% por cada 10 minutos de uso, en otros casos utiliza
un 1% cada 10 minutos de uso)
c) Muestra el porcentaje de batería restante
d) Cuando la batería se acabe al tratar de utilizar el celular este debe mostrar el
mensaje de celular apagado
"""

from celular import Celular

if __name__ == "__main__":

    celular = Celular()
    print("INSTALANDO APLICACIONES")
    celular.instalar("Binance", 700)
    celular.instalar("TikTok", 220)
    celular.instalar("Kick", 10)
    print("--------------------------")

    print("ESTADO INICIAL")
    celular.porcentaje_bateria()
    print("--------------------------")

    print("USANDO APLICACIONES")
    celular.utilizar("Binance", 20)
    celular.utilizar("TikTok", 17)
    celular.utilizar("Kick", 1)
    print("--------------------------")

    print("ESTADO FINAL")
    celular.porcentaje_bateria()
    print("--------------------------")

    print("AGOTANDO LA BATERIA")
    celular.utilizar("Binance", 1000)
    print("--------------------------")

    print("USO DESPUES DE AGOTAR BATERIA")
    celular.utilizar("Binance", 20)
    celular.porcentaje_bateria()
