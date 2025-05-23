class Oficina:
    def __init__(self, nroSillas, nroEscritorios, nroEstanterias):
        self.nroSillas = nroSillas
        self.nroEscritorios = nroEscritorios
        self.nroEstanterias = nroEstanterias

    def mostrar(self):
        print(f'Oficina: Sillas={self.nroSillas}, Escritorios={self.nroEscritorios}, Estanterias={self.nroEstanterias}')

    def cantidadMuebles(self):
        return self.nroSillas + self.nroEscritorios + self.nroEstanterias


class Aula:
    def __init__(self, nombre, capacidad, nropupitres):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nropupitres = nropupitres

    def mostrar(self):
        print(f'Aula: Nombre={self.nombre}, Capacidad={self.capacidad}, Pupitres={self.nropupitres}')

    def cantidadMuebles(self):
        return self.nropupitres


class Laboratorio:
    def __init__(self, nombre, capacidad, nroMesas, nroSillas):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroMesas = nroMesas
        self.nroSillas = nroSillas

    def mostrar(self):
        print(f'Laboratorio: Nombre={self.nombre}, Capacidad={self.capacidad}, Mesas={self.nroMesas}, Sillas={self.nroSillas}')
    
    def cantidadMuebles(self):
        return self.nroMesas + self.nroSillas


oficina1 = Oficina(10, 5, 3)
oficina2 = Oficina(8, 2, 4)

aula1 = Aula("Aula 1", 45, 25)
aula2 = Aula("Aula 2", 60, 30)

laboratorio1 = Laboratorio("Laboratorio de Química", 25, 10, 15)

oficina1.mostrar()
oficina2.mostrar()
aula1.mostrar()
aula2.mostrar()
laboratorio1.mostrar()

print(f'Total muebles Oficina 1: {oficina1.cantidadMuebles()}')
print(f'Total muebles Oficina 2: {oficina2.cantidadMuebles()}')
print(f'Total muebles Aula 1: {aula1.cantidadMuebles()}')
print(f'Total muebles Aula 2: {aula2.cantidadMuebles()}')
print(f'Total muebles Laboratorio: {laboratorio1.cantidadMuebles()}')
