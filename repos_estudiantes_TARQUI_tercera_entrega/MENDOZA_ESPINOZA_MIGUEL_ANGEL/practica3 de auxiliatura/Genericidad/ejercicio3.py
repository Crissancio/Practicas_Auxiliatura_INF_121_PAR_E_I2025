class Catalogo:
    def __init__(self):
        self.elementos = []

    def agregar(self, elemento):
        self.elementos.append(elemento)

    def buscar(self, elemento):
        return elemento in self.elementos

# Prueba
libros = Catalogo()
libros.agregar("El Principito")
print("Buscar libro:", libros.buscar("El Principito"))

productos = Catalogo()
productos.agregar("Celular")
print("Buscar producto:", productos.buscar("Celular"))
