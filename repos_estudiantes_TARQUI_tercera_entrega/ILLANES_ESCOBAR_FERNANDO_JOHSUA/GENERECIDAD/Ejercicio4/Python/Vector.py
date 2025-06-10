from typing import TypeVar, Generic, List

T = TypeVar('T')

class Vector(Generic[T]):
    def __init__(self):
        self.elementos: List[T] = []

    def agregar(self, valor: T):
        self.elementos.append(valor)

    def obtener(self, i: int) -> T:
        if 0 <= i < len(self.elementos):
            return self.elementos[i]
        raise IndexError("Índice fuera de rango")

    def valor_mayor(self) -> T:
        return max(self.elementos)

    def valor_menor(self) -> T:
        return min(self.elementos)

vector = Vector[int]()
vector.agregar(3)
vector.agregar(9)
vector.agregar(1)

print("Elemento en posición 1:", vector.obtener(1))
print("Mayor:", vector.valor_mayor())
print("Menor:", vector.valor_menor())
