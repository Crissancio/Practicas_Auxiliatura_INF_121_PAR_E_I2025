class Persona:
    def __init__(self, nombre, edad, ciudad):
        self.nombre = nombre
        self.edad = edad
        self.ciudad = ciudad

    def saludo(self):
        print(f"Hola, soy {self.nombre} de {self.ciudad}")

    def is_adult(self):
        salida = self.edad >= 18
        if salida:
            print("es mayor de edad")
        else:
            print("no es mayor de edad")
        return salida

def main():
    p1 = Persona("Jose Antonio", 21, "La Paz")
    p2 = Persona("Andrea Valera", 25, "La Paz")
    p3 = Persona("Miguel Angel", 16, "Oruro")

    p1.saludo()
    p2.saludo()
    p3.saludo()

    print("")

    p1.is_adult()
    p2.is_adult()
    p3.is_adult()

if __name__ == "__main__":
    main()
