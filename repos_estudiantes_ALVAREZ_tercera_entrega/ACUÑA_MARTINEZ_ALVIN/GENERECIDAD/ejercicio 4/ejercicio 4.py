from typing import TypeVar, Generic, List

T = TypeVar('T')

class Vector(Generic[T]):
    def __init__(self, elementos: List[T]):
        self.elementos = elementos

    def obtener(self, i: int) -> T:
        """Devuelve el valor en la posición i (comienza en 0)."""
        if i < 0 or i >= len(self.elementos):
            raise IndexError("Índice fuera de rango.")
        return self.elementos[i]

    def mayor(self) -> T:
        """Devuelve el valor mayor del vector."""
        if not self.elementos:
            raise ValueError("El vector está vacío.")
        return max(self.elementos)

    def menor(self) -> T:
        """Devuelve el valor menor del vector."""
        if not self.elementos:
            raise ValueError("El vector está vacío.")
        return min(self.elementos)


if __name__ == "__main__":
    # Vector de enteros
    vector_enteros = Vector([10, 4, 7, 21, 3])
    print("Vector:", vector_enteros.elementos)
    print("Elemento en posición 2:", vector_enteros.obtener(2))
    print("Mayor:", vector_enteros.mayor())
    print("Menor:", vector_enteros.menor())

    print("\n---\n")

    # Vector de cadenas (alfabéticamente)
    vector_cadenas = Vector(["zorro", "ave", "león", "tigre"])
    print("Vector:", vector_cadenas.elementos)
    print("Elemento en posición 1:", vector_cadenas.obtener(1))
    print("Mayor (alfabético):", vector_cadenas.mayor())
    print("Menor (alfabético):", vector_cadenas.menor())
