class Catalogo:
    def __init__(self):
        self.elementos = []

    def agregar(self, elemento):
        self.elementos.append(elemento)

    def buscar(self, criterio):
        for elemento in self.elementos:
            if criterio in str(elemento):
                return elemento
        return None

    def mostrar_catalogo(self):
        for elemento in self.elementos:
            print(elemento)

catalogo_libros = Catalogo()
catalogo_libros.agregar("Adela zamudio")
catalogo_libros.agregar("LA VACA")
print(" Catálogo de Libros:")
catalogo_libros.mostrar_catalogo()

catalogo_productos = Catalogo()
catalogo_productos.agregar("radio")
catalogo_productos.agregar("antena")
print(" Catálogo de Productos:")
print("noemi chino blanco")
catalogo_productos.mostrar_catalogo()
