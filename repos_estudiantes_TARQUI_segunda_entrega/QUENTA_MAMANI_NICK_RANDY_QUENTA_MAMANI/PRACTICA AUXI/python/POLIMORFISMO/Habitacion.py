"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"8. Para la reserva de habitaciones se guía por las siguientes clases:"

"a) Instanciar 1 objeto de cada tipo de habitación"
"b) Implementa el método calcularCosto(int noches), sobrescribiéndolo en"
"HabitacionSimple, HabitacionDoble y Suite, aplicando distintos costos por"
"noche."
"c) Sobrecarga el método reservar() permitiendo reservar con diferentes"
"parámetros (por número de noches o incluyendo el número de personas)."


class Habitacion:
    def __init__(self, tipo, nro_habitacion):
        self.tipo = tipo
        self.nro_habitacion = nro_habitacion

    def calcular_costo(self, noches=None, personas=None):
        if noches is None and personas is None:
            print("habitacion costo.")
            return

        if personas is None:
            
            if self.tipo == "Simple":
                costo = noches * 50
            elif self.tipo == "Doble":
                costo = noches * 80
            elif self.tipo == "Suite":
                costo = noches * 150
            print(f"El costo para {noches} noches es: ${costo}")
        else:
        
            if self.tipo == "Simple" and personas > 1:
                print("Excede la capacidad máxima para una habitación simple.")
            elif self.tipo == "Doble" and personas > 2:
                print("Excede la capacidad máxima para una habitación doble.")
            elif self.tipo == "Suite" and personas > 4:
                print("Excede la capacidad máxima para una suite.")
            else:
                if self.tipo == "Simple":
                    costo = noches * 50
                elif self.tipo == "Doble":
                    costo = noches * 80
                elif self.tipo == "Suite":
                    costo = noches * 150
                print(f"El costo para {noches} noches con {personas} personas es: ${costo}")

class HabitacionSimple(Habitacion):
    def __init__(self, nro_habitacion):
        super().__init__("Simple", nro_habitacion)

class HabitacionDoble(Habitacion):
    def __init__(self, nro_habitacion):
        super().__init__("Doble", nro_habitacion)

class Suite(Habitacion):
    def __init__(self, nro_habitacion):
        super().__init__("Suite", nro_habitacion)

if __name__ == "__main__":
    
    simple = HabitacionSimple(101)
    doble = HabitacionDoble(102)
    suite = Suite(201)


    print("Cálculo de costos:")
    simple.calcular_costo(3)
    doble.calcular_costo(2)
    suite.calcular_costo(5, 3)
    suite.calcular_costo(5, 5) 
