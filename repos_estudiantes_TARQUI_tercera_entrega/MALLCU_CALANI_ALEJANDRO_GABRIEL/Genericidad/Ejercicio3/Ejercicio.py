from typing import Generic, TypeVar, List

T = TypeVar('T')

# Clase genérica Catálogo
class Catalogo(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def agregar(self, elemento: T):
        self.elementos.append(elemento)

    def buscar(self, elemento: T) -> T | None:
        for item in self.elementos:
            if item == elemento:
                return item
        return None

# Clase Libro
class Libro:
    def __init__(self, titulo: str, autor: str):
        self.titulo = titulo
        self.autor = autor

    def __eq__(self, other):
        return isinstance(other, Libro) and self.titulo == other.titulo

    def __str__(self):
        return f"{self.titulo} - {self.autor}"

# Clase Producto
class Producto:
    def __init__(self, nombre: str, precio: float):
        self.nombre = nombre
        self.precio = precio

    def __eq__(self, other):
        return isinstance(other, Producto) and self.nombre == other.nombre

    def __str__(self):
        return f"{self.nombre} - ${self.precio}"

# b) Prueba con libros
catalogo_libros = Catalogo[Libro]()
catalogo_libros.agregar(Libro("El Principito", "Antoine de Saint-Exupéry"))

print("📚 Buscando libro: El Principito")
libro_buscado = catalogo_libros.buscar(Libro("El Principito", ""))
if libro_buscado:
    print(f"Encontrado: {libro_buscado}")

# c) Prueba con productos
catalogo_productos = Catalogo[Producto]()
catalogo_productos.agregar(Producto("Laptop", 999.99))

print("\n🛒 Buscando producto: Laptop")
producto_buscado = catalogo_productos.buscar(Producto("Laptop", 0))
if producto_buscado:
    print(f"Encontrado: {producto_buscado}")
