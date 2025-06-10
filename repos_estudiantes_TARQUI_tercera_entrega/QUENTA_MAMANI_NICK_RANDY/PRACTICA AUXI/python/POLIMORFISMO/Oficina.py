"NOMBRE: QUENTA MAMANI NICK RANDY"
"CI: 10037571"

"5. Se hace referencia a algunos de los diferentes ambientes de la Universidad"
"mediante las siguientes clases:"

"a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio"
"b) Crear un método mostrar() para mostrar los datos de cada objeto"
"c) Sobrecargar el método cantidadMuebles(), para conocer el número total de"
"muebles dentro de cada ambiente"


class Oficina:
    def __init__(self, nro_sillas, nro_escritorios, nro_estanterias):
        self.nro_sillas = nro_sillas
        self.nro_escritorios = nro_escritorios
        self.nro_estanterias = nro_estanterias

    def mostrar(self):
        print("Oficina:")
        print(f"Número de Sillas: {self.nro_sillas}")
        print(f"Número de Escritorios: {self.nro_escritorios}")
        print(f"Número de Estanterias: {self.nro_estanterias}")

    def cantidad_muebles(self):
        return self.nro_sillas + self.nro_escritorios + self.nro_estanterias

class Aula:
    def __init__(self, nombre, capacidad, nro_pupitres):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nro_pupitres = nro_pupitres

    def mostrar(self):
        print("Aula:")
        print(f"Nombre: {self.nombre}")
        print(f"Capacidad: {self.capacidad}")
        print(f"Número de Pupitres: {self.nro_pupitres}")

    def cantidad_muebles(self):
        return self.nro_pupitres

class Laboratorio:
    def __init__(self, nombre, capacidad, nro_mesas, nro_sillas):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nro_mesas = nro_mesas
        self.nro_sillas = nro_sillas

    def mostrar(self):
        print("Laboratorio:")
        print(f"Nombre: {self.nombre}")
        print(f"Capacidad: {self.capacidad}")
        print(f"Número de Mesas: {self.nro_mesas}")
        print(f"Número de Sillas: {self.nro_sillas}")

    def cantidad_muebles(self):
        return self.nro_mesas + self.nro_sillas


if __name__ == "__main__":
    oficina1 = Oficina(5, 3, 2)
    oficina2 = Oficina(6, 4, 3)
    aula1 = Aula("Aula A", 30, 25)
    aula2 = Aula("Aula B", 40, 35)
    laboratorio = Laboratorio("Lab 1", 20, 10, 15)

    print("Ambientes de la Universidad:")
    oficina1.mostrar()
    oficina2.mostrar()
    aula1.mostrar()
    aula2.mostrar()
    laboratorio.mostrar()

    print("\nCantidad de muebles en cada ambiente:")
    print("Oficina 1:", oficina1.cantidad_muebles())
    print("Oficina 2:", oficina2.cantidad_muebles())
    print("Aula 1:", aula1.cantidad_muebles())
    print("Aula 2:", aula2.cantidad_muebles())
    print("Laboratorio:", laboratorio.cantidad_muebles())
