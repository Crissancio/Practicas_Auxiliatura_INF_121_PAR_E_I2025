class Celular:
    def __init__(self):
        self.aplicaciones = []
        self.espacio_usado = 0
        self.espacio_total = 1024
        self.bateria = 100

    def instalar_aplicacion(self, nombre, tamaño):
        if len(self.aplicaciones) >= 20:
            print("No se pueden instalar más de 20 aplicaciones.")
            return
        if self.espacio_usado + tamaño > self.espacio_total:
            print("No hay suficiente espacio para instalar la aplicación.")
            return

        self.aplicaciones.append(nombre)
        self.espacio_usado += tamaño
        print(f"Aplicación {nombre} instalada con éxito.")

    def usar_aplicacion(self, nombre, minutos):
        if self.bateria == 0:
            print("Celular apagado. Por favor, cargue la batería.")
            return

        for app in self.aplicaciones:
            if app['nombre'] == nombre:
                tamaño = app['tamaño']
                break
        else:
            print("La aplicación no está instalada.")
            return

        if tamaño > 250:
            consumo_bateria = 0.5 * (minutos // 10)
        elif tamaño > 100:
            consumo_bateria = 0.02 * (minutos // 10)
        else:
            consumo_bateria = 0.01 * (minutos // 10)

        self.bateria -= consumo_bateria * 100
        if self.bateria < 0:
            self.bateria = 0

        if self.bateria == 0:
            print("Celular apagado.")
        else:
            print(f"Usando {nombre} por {minutos} minutos. Batería restante: {self.bateria:.2f}%")

    def mostrar_bateria(self):
        print(f"Batería restante: {self.bateria:.2f}%")

celular = Celular()
celular.instalar_aplicacion({"nombre": "WhatsApp", "tamaño": 150})
celular.instalar_aplicacion({"nombre": "Instagram", "tamaño": 300})
celular.usar_aplicacion("WhatsApp", 30)
celular.mostrar_bateria()
celular.usar_aplicacion("Instagram", 20)
celular.mostrar_bateria()
