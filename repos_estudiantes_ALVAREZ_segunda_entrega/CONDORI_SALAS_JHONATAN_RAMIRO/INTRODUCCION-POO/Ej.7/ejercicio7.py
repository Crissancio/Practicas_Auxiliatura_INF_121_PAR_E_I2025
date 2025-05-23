class Celular:
    MAX_APPS = 20
    MAX_STORAGE = 1024
    
    def __init__(self):
        self.aplicaciones = []
        self.tamanos = []
        self.totalApps = 0
        self.espacioDisponible = self.MAX_STORAGE
        self.bateria = 100

    def instalar_aplicacion(self, nombre, tamano):
        print("\nInstalar nueva aplicación:")
        if self.totalApps < self.MAX_APPS and self.espacioDisponible >= tamano:
            self.aplicaciones.append(nombre)
            self.tamanos.append(tamano)
            self.totalApps += 1
            self.espacioDisponible -= tamano
            print(f"Aplicación {nombre} instalada exitosamente.")
            return True
        else:
            print("No se pudo instalar la aplicación. Espacio insuficiente o límite de apps alcanzado.")
            return False

    def usar_aplicacion(self, nombre, minutos):
        print("\nUsar aplicación:")
        if self.bateria <= 0:
            print("Celular apagado. Cargue la batería.")
            return
        
        for i in range(self.totalApps):
            if self.aplicaciones[i] == nombre:
                consumo = self.calcular_consumo_bateria(self.tamanos[i], minutos)
                self.bateria -= consumo
                if self.bateria < 0:
                    self.bateria = 0
                print(f"Usando {nombre} por {minutos} minutos. Batería restante: {self.bateria}%")
                return
        
        print("Aplicación no encontrada.")

    def calcular_consumo_bateria(self, tamano, minutos):
        consumo = 0
        if tamano > 250:
            consumo = (minutos // 10) * 5
        elif tamano > 100:
            consumo = (minutos // 10) * 2
        else:
            consumo = (minutos // 10) * 1
        return consumo

    def mostrar_bateria(self):
        print("\nMostrar batería restante:")
        print(f"Batería restante: {self.bateria}%")

# Ejemplo de uso
mi_celular = Celular()

# a) Instalar nuevas aplicaciones
mi_celular.instalar_aplicacion("WhatsApp", 120)
mi_celular.instalar_aplicacion("Juego 3D", 300)

# b) Usar aplicaciones
mi_celular.usar_aplicacion("WhatsApp", 30)
mi_celular.usar_aplicacion("Juego 3D", 20)

# c) Mostrar batería restante
mi_celular.mostrar_bateria()

# d) Intentar usar el celular cuando la batería está agotada
print("\nIntentar usar el celular cuando la batería está agotada:")
mi_celular.usar_aplicacion("Juego 3D", 600)  # Debería agotar la batería y mostrar el mensaje "Celular apagado"
