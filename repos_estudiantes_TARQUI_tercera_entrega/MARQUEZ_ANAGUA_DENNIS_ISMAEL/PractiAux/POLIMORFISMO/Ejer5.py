'''5.	Se hace referencia a algunos de los diferentes ambientes de la Universidad mediante las siguientes clases:

a)	Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
b)	Crear un método mostrar() para mostrar los datos de cada objeto
c)	Sobrecargar el método cantidadMuebles(), para conocer el número total de muebles dentro de cada ambiente
'''
class Oficina:
    def __init__(self, nroSillas, nroEscritorios, nroEstanterias):
        self.nroSillas = nroSillas
        self.nroEscritorios = nroEscritorios
        self.nroEstanterias = nroEstanterias

    def mostrar(self):
        print("Oficina:")
        print(f"Sillas: {self.nroSillas}, Escritorios: {self.nroEscritorios}, Estanterías: {self.nroEstanterias}")

    def cantidadMuebles(self):
        return self.nroSillas + self.nroEscritorios + self.nroEstanterias

class Aula:
    def __init__(self, nombre, capacidad, nroPupitres):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroPupitres = nroPupitres

    def mostrar(self):
        print("Aula:")
        print(f"Nombre: {self.nombre}, Capacidad: {self.capacidad}, Pupitres: {self.nroPupitres}")

    def cantidadMuebles(self):
        return self.nroPupitres

class Laboratorio:
    def __init__(self, nombre, capacidad, nroMesas, nroSillas):
        self.nombre = nombre
        self.capacidad = capacidad
        self.nroMesas = nroMesas
        self.nroSillas = nroSillas

    def mostrar(self):
        print("Laboratorio:")
        print(f"Nombre: {self.nombre}, Capacidad: {self.capacidad}, Mesas: {self.nroMesas}, Sillas: {self.nroSillas}")

    def cantidadMuebles(self):
        return self.nroMesas + self.nroSillas



oficina1 = Oficina(10, 5, 3)
oficina2 = Oficina(8, 4, 2)
aula1 = Aula("Aula PRINCIPAL", 40, 40)
aula2 = Aula("Aula INF-112", 30, 30)
laboratorio1 = Laboratorio("LASSIN", 25, 5, 20)

print("Datos de los Objetos")
oficina1.mostrar()
oficina2.mostrar()
aula1.mostrar()
aula2.mostrar()
laboratorio1.mostrar()

print("Cantidad Total de Muebles")
print(f"Oficina 1: {oficina1.cantidadMuebles()} muebles")
print(f"Oficina 2: {oficina2.cantidadMuebles()} muebles")
print(f"Aula 1: {aula1.cantidadMuebles()} muebles")
print(f"Aula 2: {aula2.cantidadMuebles()} muebles")
print(f"Laboratorio: {laboratorio1.cantidadMuebles()} muebles")

