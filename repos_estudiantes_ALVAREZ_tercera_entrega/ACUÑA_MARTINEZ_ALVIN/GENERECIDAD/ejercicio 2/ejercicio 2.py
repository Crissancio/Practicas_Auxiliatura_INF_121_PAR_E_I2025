from typing import Generic, TypeVar

K = TypeVar('K')
V = TypeVar('V')

class Par(Generic[K, V]):
    def __init__(self, clave: K, valor: V):
        self.clave = clave
        self.valor = valor

    def mostrarPar(self):
        print(f"Clave: {self.clave}, Valor: {self.valor}")

if __name__ == "__main__":
    # b) Par (ID, nombre de estudiante)
    estudiante = Par(12345, "Juan Pérez")
    estudiante.mostrarPar()

    # c) Par (Código, Precio de un producto)
    producto = Par("P001", 59.99)
    producto.mostrarPar()
