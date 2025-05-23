class Libro:
    def __init__(self, titulo, autor):
        self.titulo = titulo
        self.autor = autor

    def mostrar_info(self):
        return f"'{self.titulo}' por {self.autor}"

class Biblioteca:
    def __init__(self, nombre):
        self.nombre = nombre
        self.libros = []

    def agregar_libro(self, libro):
        self.libros.append(libro)

    def mostrar_biblioteca(self):
        print(f"Biblioteca: {self.nombre}")
        print("Libros disponibles:")
        for libro in self.libros:
            print("  -", libro.mostrar_info())


# Crear libros
l1 = Libro("Cien Años de Soledad", "Gabriel García Márquez")
l2 = Libro("Don Quijote de la Mancha", "Miguel de Cervantes")
l3 = Libro("1984", "George Orwell")

# Crear biblioteca y agregar libros
biblio = Biblioteca("Biblioteca Central")
biblio.agregar_libro(l1)
biblio.agregar_libro(l2)
biblio.agregar_libro(l3)

# Mostrar la información
print("== Información de la Biblioteca ==")
biblio.mostrar_biblioteca()
