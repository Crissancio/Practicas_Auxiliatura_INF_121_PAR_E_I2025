class Celular:
    def __init__(self):
        self.aplicaciones = {}  
        self.espacio_maximo = 1024  
        self.bateria = 100  
        self.limite_aplicaciones = 20  

    def instalar_aplicacion(self, nombre, tamano):
        if len(self.aplicaciones) < self.limite_aplicaciones and (self.calcular_espacio_utilizado() + tamano) <= self.espacio_maximo:
            self.aplicaciones[nombre] = tamano
            print(f"Aplicación {nombre} instalada con éxito.")
        else:
            print("No se puede instalar la aplicación: espacio insuficiente o límite de aplicaciones alcanzado.")

    def utilizar_aplicacion(self, nombre, tiempo_minutos):
        if self.bateria <= 0:
            print("Celular apagado")
            return
        
        if nombre in self.aplicaciones:
            tamano = self.aplicaciones[nombre]
            porcentaje_bateria = self.calcular_consumo_bateria(tamano, tiempo_minutos)
            if self.bateria - porcentaje_bateria < 0:
                print("Celular apagado")
                self.bateria = 0
            else:
                self.bateria -= porcentaje_bateria
                print(f"Usando {nombre} por {tiempo_minutos} minutos. Batería restante: {self.bateria}%")
        else:
            print("La aplicación no está instalada.")

    def calcular_consumo_bateria(self, tamano, tiempo_minutos):
        if tamano > 250:
            return (5 * (tiempo_minutos // 10))
        elif tamano > 100:
            return (2 * (tiempo_minutos // 10))
        else:
            return (1 * (tiempo_minutos // 10))

    def calcular_espacio_utilizado(self):
        return sum(self.aplicaciones.values())

    def mostrar_bateria_restante(self):
        print(f"Batería restante: {self.bateria}%")


celular = Celular()
celular.instalar_aplicacion("Juego", 150)
celular.instalar_aplicacion("Red Social", 250)
celular.utilizar_aplicacion("Juego", 30)  
celular.mostrar_bateria_restante()
celular.utilizar_aplicacion("Red Social", 20)  
celular.mostrar_bateria_restante()
celular.utilizar_aplicacion("Juego", 70)  
