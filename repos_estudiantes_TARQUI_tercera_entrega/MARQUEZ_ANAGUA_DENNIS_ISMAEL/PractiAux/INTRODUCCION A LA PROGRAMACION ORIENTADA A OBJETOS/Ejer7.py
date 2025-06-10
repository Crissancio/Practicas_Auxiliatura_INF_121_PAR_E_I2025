'''
Crea una clase Celular con espacio para 20 aplicaciones o 1024Mb de Espacio
a)	Crea un método para instalar una nueva aplicación
b)	Crea un método para utilizar una aplicación (las aplicaciones que pesan más de 100Mb utilizan un 2% de batería por cada 10 minutos uso,
las que pesan más de 250Mb utilizan 5% por cada 10 minutos de uso, en otros casos utiliza un 1% cada 10 minutos de uso)
c)	Muestra el porcentaje de batería restante
d)	Cuando la batería se acabe al tratar de utilizar el celular este debe mostrar el mensaje de celular apagado
'''
class Celular:
    def __init__(self):
        self.espacio_total = 1024
        self.bateria = 100
        self.aplicaciones = {}
    def instalar_aplicacion(self, nombre, tamanio):

        if len(self.aplicaciones) >= 20:
            print("No se pueden instalar más aplicaciones, límite alcanzado.")
            return
        if tamanio > self.espacio_total:
            print("No hay suficiente espacio para instalar esta aplicación.")
            return
        self.aplicaciones[nombre] = tamanio
        self.espacio_total -= tamanio
        print(f"Aplicación '{nombre}' instalada correctamente. Espacio restante: {self.espacio_total} MB.")

    def utilizar_aplicacion(self, nombre, minutos):
        if self.bateria <= 0:
            print("El celular está apagado. No se puede usar.")
            return
        if nombre not in self.aplicaciones:
            print(f"La aplicación '{nombre}' no está instalada.")
            return
        tamanio = self.aplicaciones[nombre]
        if tamanio > 250:
            consumo_bateria = 5 * (minutos / 10)
        elif tamanio > 100:
            consumo_bateria = 2 * (minutos / 10)
        else:
            consumo_bateria = 1 * (minutos / 10)

        if consumo_bateria > self.bateria:
            print("La batería no es suficiente para usar la aplicación.")
            self.bateria = 0
            print("Celular apagado.")
        else:
            self.bateria -= consumo_bateria
            print(f"Usaste la aplicación '{nombre}' por {minutos} minutos. Batería restante: {self.bateria:.2f}%.")

    def mostrar_bateria(self):
        if self.bateria <= 0:
            print("La batería está completamente agotada. El celular está apagado.")
        else:
            print(f"Porcentaje de batería restante: {self.bateria:.2f}%")

mi_celular = Celular()

mi_celular.instalar_aplicacion(nombre="WhatsApp", tamanio=120)
mi_celular.instalar_aplicacion(nombre="Instagram", tamanio=300)

mi_celular.utilizar_aplicacion(nombre="WhatsApp", minutos=30)
mi_celular.mostrar_bateria()

mi_celular.utilizar_aplicacion(nombre="Instagram", minutos=50)
mi_celular.mostrar_bateria()
