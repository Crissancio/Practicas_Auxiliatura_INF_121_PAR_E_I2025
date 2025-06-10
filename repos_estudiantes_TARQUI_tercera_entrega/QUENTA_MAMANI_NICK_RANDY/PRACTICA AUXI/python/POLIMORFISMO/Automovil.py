"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"4. Sean las siguientes clases que detallan 2 tipos de automóviles:"

"a) Instanciar 2 objetos Bus y 1 objeto Camioneta"
"b) Sobrecargar el método asignarConductor() en Camioneta, donde primero solo"
"se añada el nombre del conductor, y el segundo añada al conductor y pida"
"años de experiencia para mostrarlo junto a su nombre."
"c) Sobrecargar el método registrarViaje() en Bus, donde se pida una distancia y"
"esta misma se aumente al kilometraje, y en otro que se pida distancia, lugar de"
"destino y nroPasajeros"


class Automovil:
    def __init__(self, modelo, placa, conductor, kilometraje):
        self.modelo = modelo
        self.placa = placa
        self.conductor = conductor
        self.kilometraje = kilometraje

    def registrar_viaje(self, distancia):
        self.kilometraje += distancia
        print(f"Viaje registrado: {self.kilometraje}")

    def mostrar(self):
        print(f"Modelo: {self.modelo}, Placa: {self.placa}, Conductor: {self.conductor}, Kilometraje: {self.kilometraje}")

class Bus(Automovil):
    def __init__(self, modelo, placa, conductor, kilometraje, nro_pasajeros):
        super().__init__(modelo, placa, conductor, kilometraje)
        self.nro_pasajeros = nro_pasajeros

    def registrar_viaje(self, distancia, destino=None, nro_pasajeros=None):
        self.kilometraje += distancia
        if destino and nro_pasajeros is not None:
            self.nro_pasajeros = nro_pasajeros
            print(f"Viaje a {destino}. Kilometraje: {self.kilometraje}, pasajeros: {self.nro_pasajeros}")
        else:
            print(f"Viaje en Bus, Kilometraje: {self.kilometraje}")

class Camioneta(Automovil):
    def registrar_viaje(self, distancia):
        self.kilometraje += distancia
        print(f"Viaje en Camioneta: {self.kilometraje}")

    def asignar_conductor(self, nombre_conductor):
        self.conductor = nombre_conductor
        print(f"Conductor asignado: {self.conductor}")

if __name__ == "__main__":
    
    bus = Bus("Nissan", "597Ajhn", "Johan", 5000, 40)
    camioneta = Camioneta("Porche", "528GHI", "Andy", 7000)

    bus.mostrar()
    camioneta.mostrar()

    bus.registrar_viaje(100)
    camioneta.registrar_viaje(200)
