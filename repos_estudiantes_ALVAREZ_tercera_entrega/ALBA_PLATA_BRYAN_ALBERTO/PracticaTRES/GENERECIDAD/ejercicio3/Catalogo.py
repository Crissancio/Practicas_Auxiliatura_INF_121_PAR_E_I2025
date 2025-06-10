class Catalogo:
    def __init__(self):
        self.items = []

    def agregar(self, item):
        self.items.append(item)

    def buscar(self, nombre):
        return [item for item in self.items if nombre.lower() in str(item).lower()]



catalogo_libros = Catalogo()
catalogo_libros.agregar("Cien Años de Soledad")
catalogo_libros.agregar("Don Quijote de la Mancha")
print("Libros encontrados:", catalogo_libros.buscar("Don"))


catalogo_productos = Catalogo()
catalogo_productos.agregar({"codigo": 101, "nombre": "Mouse"})
catalogo_productos.agregar({"codigo": 102, "nombre": "Teclado"})
print("Productos encontrados:", catalogo_productos.buscar("mouse"))