from typing import Generic, TypeVar

T = TypeVar('T')

class Catalogo(Generic[T]):
    def __init__(self):
        self.__elementos = []
    
    def agregar(self, elemento:T) ->T:
        self.__elementos.append(elemento)
    
    def buscar(self,elemento:T):
        for i in self.__elementos:
            if i == elemento:
                return True
        return False

#Main
libros = Catalogo()
libros.agregar("Cien años de Soledad")
libros.agregar("El señor de los anillos")
libros.agregar("Orgullo y perjuicio")
print(libros.buscar("Orgullo y perjuicio"))

productos = Catalogo()
productos.agregar("Galletas")
productos.agregar("Refrescos")
productos.agregar("Fideo")
print(productos.buscar("carne"))