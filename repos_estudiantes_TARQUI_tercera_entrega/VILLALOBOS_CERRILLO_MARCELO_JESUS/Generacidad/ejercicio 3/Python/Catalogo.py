class Catalogo:
    def __init__(self):
        self.elementos = []
    def agregar(self, elemento):
        self.elementos.append(elemento)
    def buscar(self, elemento):
        return elemento in self.elementos
    def mostrar(self):
        for e in self.elementos:
            print(e)
l = Catalogo()
l.agregar("Cien Años de Soledad")
l.agregar("Don Quijote")
l.mostrar()
print("existe Don Quijote?:", l.buscar("Don Quijote"))
p = Catalogo()
p.agregar("Laptop")
p.agregar("Telefono")
p.mostrar()