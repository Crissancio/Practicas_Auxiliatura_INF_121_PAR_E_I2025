class Catalogo:
    def __init__(self):
        self.elementos = []

    def agregar(self, elemento):
        self.elementos.append(elemento)

    def buscar(self, index):
        if 0 <= index < len(self.elementos):
            return self.elementos[index]
        return None

catalogo_libros = Catalogo()
catalogo_libros.agregar("El Principito")
print(f"Libro encontrado: {catalogo_libros.buscar(0)}")

catalogo_precios = Catalogo()
catalogo_precios.agregar(19.99)
print(f"Precio encontrado: {catalogo_precios.buscar(0)}")
