class Oficina:
    def __init__(self, nro_sillas, nro_escritorios, nro_estanterias):
        self.nro_sillas = nro_sillas
        self.nro_escritorios = nro_escritorios
        self.nro_estanterias = nro_estanterias

    def mostrar(self):
        print(f"Oficina - Sillas: {self.nro_sillas}, Escritorios: {self.nro_escritorios}, Estanterías: {self.nro_estanterias}")

    def cantidad_muebles(self):
        return self.nro_sillas + self.nro_escritorios + self.nro_estanterias

class Aula:
    def __init__(self, nombre, capacidad, nro_pupitres):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nro_pupitres = nro_pupitres

    def mostrar(self):
        print(f"Aula {self.nombre} - Capacidad: {self.capacidad}, Pupitres: {self.nro_pupitres}")

    def cantidad_muebles(self):
        return self.nro_pupitres

class Laboratorio:
    def __init__(self, nombre, capacidad, nro_mesas, nro_sillas):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nro_mesas = nro_mesas
        self.nro_sillas = nro_sillas

    def mostrar(self):
        print(f"Laboratorio {self.nombre} - Capacidad: {self.capacidad}, Mesas: {self.nro_mesas}, Sillas: {self.nro_sillas}")

    def cantidad_muebles(self):
        return self.nro_mesas + self.nro_sillas

def main():

    oficina1 = Oficina(5, 3, 2)
    oficina2 = Oficina(4, 2, 3)
    aula1 = Aula("Aula Magna", 50, 30)
    aula2 = Aula("Aula 101", 30, 20)
    laboratorio1 = Laboratorio("Lab de Química", 20, 10, 20)

    oficina1.mostrar()
    oficina2.mostrar()
    aula1.mostrar()
    aula2.mostrar()
    laboratorio1.mostrar()

    print(f"Cantidad de muebles en Oficina 1: {oficina1.cantidad_muebles()}")
    print(f"Cantidad de muebles en Oficina 2: {oficina2.cantidad_muebles()}")
    print(f"Cantidad de muebles en Aula Magna: {aula1.cantidad_muebles()}")
    print(f"Cantidad de muebles en Aula 101: {aula2.cantidad_muebles()}")
    print(f"Cantidad de muebles en Lab de Química: {laboratorio1.cantidad_muebles()}")

if __name__ == "__main__":
    main()
