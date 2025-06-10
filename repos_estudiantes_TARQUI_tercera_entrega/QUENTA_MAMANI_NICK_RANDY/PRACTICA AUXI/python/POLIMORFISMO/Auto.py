"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"6. Para el comportamiento de los atributos de un Auto se tiene en cuenta la siguiente clase:"

"a) Sobrecargar el constructor 2 veces"
"b) Instanciar 2 objetos Auto, usando los diferentes constructores."
"c) Sobrecargar el operador ++ para tener un nuevo auto."
"d) Sobrecargar el operador -- para mostrar los atributos de los dos objetos"

class Auto:
    def __init__(self, modelo="Desconocido", placa="Sin placa", color="verde"):
        self.modelo = modelo
        self.placa = placa
        self.color = color

    def mostrar(self):
        
        print(f"Modelo: {self.modelo}")
        print(f"Placa: {self.placa}")
        print(f"Color: {self.color}")

    def incrementar(self):
        
        return Auto("Nuevo Modelo", "Nueva Placa", "Nuevo Color")

    def decrementar(self, otro_auto):
    
        print("Auto actual:")
        self.mostrar()
        print("Otro auto:")
        otro_auto.mostrar()


if __name__ == "__main__":

    auto1 = Auto("Mk", "ABC123")
    auto2 = Auto("Honda", "XYZ789", "Rojo")

    print("Atributos iniciales de los autos:")
    auto1.mostrar()
    auto2.mostrar()

    print("Creando un nuevo auto con:")
    nuevo_auto = auto1.incrementar()
    nuevo_auto.mostrar()

    print("Mostrando atributos de los autos con:")
    auto1.decrementar(auto2)
