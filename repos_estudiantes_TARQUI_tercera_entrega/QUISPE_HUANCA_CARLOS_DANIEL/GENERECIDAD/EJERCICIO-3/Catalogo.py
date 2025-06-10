from typing import List, TypeVar, Optional

T = TypeVar('T')


class Catalogo:
    def __init__(self):
        self.elementos = []

    def agregar_elemento(self, elemento):
        self.elementos.append(elemento)

    def buscar_elemento(self, criterio):
        for elemento in self.elementos:
            if hasattr(elemento, 'nombre') and elemento.nombre == criterio:
                return elemento
            elif hasattr(elemento, 'titulo') and elemento.titulo == criterio:
                return elemento
        return None

    def __str__(self):
        return "\n".join(str(elemento) for elemento in self.elementos)


class Libro:
    def __init__(self, titulo, autor, datoslibro):
        self.titulo = titulo
        self.autor = autor
        self.datoslibro = datoslibro

    def __str__(self):
        return f"Libro: {self.titulo} por {self.autor} (Datos: {self.datoslibro})"


class Producto:
    def __init__(self, nombre, precio, mantenimiento):
        self.nombre = nombre
        self.precio = precio
        self.mantenimiento = mantenimiento

    def __str__(self):
        return f"Producto: {self.nombre} - ${self.precio:.2f} (Mantenimiento: {self.mantenimiento})"


def prueba_catalogo_libros():
    catalogo_libros = Catalogo()

    libro1 = Libro("Cien años de soledad", "Gabriel García Márquez", "978-0307474728")
    libro2 = Libro("1984", "George Orwell", "978-0451524935")

    catalogo_libros.agregar_elemento(libro1)
    catalogo_libros.agregar_elemento(libro2)

    print("\nCatálogo de Libros:")
    print(catalogo_libros)

    libro_encontrado = catalogo_libros.buscar_elemento("1984")
    print("\nLibro encontrado:", libro_encontrado)


def prueba_catalogo_productos():
    catalogo_productos = Catalogo()

    producto1 = Producto("Laptop", 900, "LP-12345")
    producto2 = Producto("Teléfono", 500, "TL-67890")

    catalogo_productos.agregar_elemento(producto1)
    catalogo_productos.agregar_elemento(producto2)

    print("\nCatálogo de Productos:")
    print(catalogo_productos)

    producto_encontrado = catalogo_productos.buscar_elemento("Laptop")
    print("\nProducto encontrado:", producto_encontrado)


if __name__ == "__main__":
    print("Prueba del Catálogo Genérico")
    prueba_catalogo_libros()
    prueba_catalogo_productos()