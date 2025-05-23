class Estudiante:
    def __init__(self, nombre, nota_1, nota_2):
        self.nombre = nombre
        self.nota_1 = nota_1
        self.nota_2 = nota_2

    def get_nombre(self):
        return self.nombre

    def promedio(self):
        return (self.nota_1 + self.nota_2) / 2

    def aprobo(self):
        return "aprobo" if self.promedio() >= 6 else "no aprobo"

def main():
    e1 = Estudiante("Juan", 7, 8)
    e2 = Estudiante("Pedro", 5, 4)
    e3 = Estudiante("Maria", 9, 10)

    print(f"El promedio de {e1.get_nombre()} es {e1.promedio()} y {e1.aprobo()}")
    print(f"El promedio de {e2.get_nombre()} es {e2.promedio()} y {e2.aprobo()}")
    print(f"El promedio de {e3.get_nombre()} es {e3.promedio()} y {e3.aprobo()}")

if __name__ == "__main__":
    main()
