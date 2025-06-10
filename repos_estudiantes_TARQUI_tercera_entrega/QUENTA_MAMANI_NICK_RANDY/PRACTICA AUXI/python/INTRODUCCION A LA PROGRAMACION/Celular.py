"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"7. Crea una clase Celular con espacio para 20 aplicaciones o 1024Mb de Espacio"
"a) Crea un método para instalar una nueva aplicación"
"b) Crea un método para utilizar una aplicación (las aplicaciones que pesan más de 100Mb utilizan un 2% de batería por cada 10 minutos uso, las que pesan más de 250Mb utilizan 5% por cada 10 minutos de uso, en otros casos utiliza un 1% cada 10 minutos de uso)"
"c) Muestra el porcentaje de batería restante"
"d) Cuando la batería se acabe al tratar de utilizar el celular este debe mostrar el mensaje de celular apagado"

class Celular:
    def __init__(self, espacio, bateria):
        self.espacio = espacio
        self.bateria = bateria

    def instalar_aplicacion(self, tamano):
        if self.espacio >= tamano:
            self.espacio -= tamano
            print(f"Aplicación instalada. Espacio restante: {self.espacio} MB.")
        else:
            print("No hay suficiente espacio para instalar la aplicación.")

    def usar_aplicacion(self, consumo):
        if self.bateria >= consumo:
            self.bateria -= consumo
            print(f"Aplicación usada. Batería restante: {self.bateria}%.")
        else:
            print("La batería no es suficiente. Celular apagado.")


if __name__ == "__main__":
    celular = Celular(1024, 100)

    celular.instalar_aplicacion(100)
    celular.instalar_aplicacion(300)

    celular.usar_aplicacion(100)
    celular.usar_aplicacion(90)
