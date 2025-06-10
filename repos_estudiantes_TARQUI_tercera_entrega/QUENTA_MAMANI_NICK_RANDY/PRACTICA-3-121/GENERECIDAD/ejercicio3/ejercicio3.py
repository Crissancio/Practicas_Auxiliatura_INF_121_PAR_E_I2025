# 3. Crea una clase genérica Catalogo<T> que almacene productos o libros.
# a) Agrega métodos para agregar y buscar elemento
# b) Prueba el catálogo con libros
# c) Prueba el catálogo con productos

class Catalogo:
    def __init__(self):
        self.elementos = []

    def agregar(self, elemento):
        self.elementos.append(elemento)

    def buscar(self, nombre):
        for e in self.elementos:
            if hasattr(e, 'nombre') and e.nombre == nombre:
                return e
        return None

class Libro:
    def __init__(self, nombre, autor):
        self.nombre = nombre
        self.autor = autor

    def __str__(self):
        return f"Libro: {self.nombre}, Autor: {self.autor}"

cat_libros = Catalogo()
cat_libros.agregar(Libro("Norwegian Wood", "Haruki Murakami"))
cat_libros.agregar(Libro("Kokoro", "Natsume Sōseki"))
cat_libros.agregar(Libro("El rumor de la montaña", "Yasunari Kawabata"))
cat_libros.agregar(Libro("El samurái", "Shusaku Endo"))

print(cat_libros.buscar("Norwegian Wood"))
print(cat_libros.buscar("Kokoro"))
