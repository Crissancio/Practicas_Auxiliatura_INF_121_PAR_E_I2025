class Celular:
    def __init__(self):
        self.espaciototal = 1024
        self.espaciodisponible = 1024
        self.max = 20
        self.nombres = []     
        self.tamanos = []     
        self.bateria = 100

    def instalarapp(self, nombre, tamaño):
        if tamaño <= self.espaciodisponible and len(self.nombres) < self.max:
            self.nombres.append(nombre)
            self.tamanos.append(tamaño)
            self.espaciodisponible -= tamaño
            print(f"Aplicación '{nombre}' instalada correctamente.")
        else:
            print("No se puede instalar la aplicación. Espacio insuficiente o límite de aplicaciones alcanzado.")

    def usarapp(self, nombreapp, minutos):
        if self.bateria <= 0:
            print("Celular apagado. Sin batería.")
            return

        if nombreapp in self.nombres:
            index = self.nombres.index(nombreapp)
            tamano = self.tamanos[index]

            if tamano > 250:
                consumopor10min = 5
            elif tamano > 100:
                consumopor10min = 2
            else:
                consumopor10min = 1

            consumototal = (minutos // 10) * consumopor10min

            if self.bateria - consumototal <= 0:
                self.bateria = 0
                print("Celular se apagó durante el uso. Sin batería.")
            else:
                self.bateria -= consumototal
                print(f"Usaste '{nombreapp}' por {minutos} minutos. Batería restante: {self.bateria}%")
        else:
            print(f"La aplicación '{nombreapp}' no está instalada.")

    def mostrar_bateria(self):
        print(f"Batería restante: {self.bateria}%")

# Ejemplo de uso
cel = Celular()
cel.instalarapp("Instagram", 120)
cel.instalarapp("JuegoPro", 300)
cel.instalarapp("Notas", 50)

cel.usarapp("Instagram", 20)
cel.mostrar_bateria()

cel.usarapp("JuegoPro", 60)
cel.mostrar_bateria()

cel.usarapp("Notas", 15)
cel.mostrar_bateria()

cel.usarapp("JuegoPro", 200)
cel.mostrar_bateria()

cel.usarapp("Instagram", 10)
