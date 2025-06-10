from typing import Generic, TypeVar

T = TypeVar('T')

class Caja(Generic[T]):
    def __init__(self):
        self.objeto = None

    def guardar(self, obj: T):
        self.objeto = obj

    def obtener(self) -> T:
        return self.objeto

# Prueba con tipos diferentes
caja1 = Caja[int]()
caja1.guardar(7)

caja2 = Caja[str]()
caja2.guardar("Hola")

print("Caja1 contiene:", caja1.obtener())
print("Caja2 contiene:", caja2.obtener())
