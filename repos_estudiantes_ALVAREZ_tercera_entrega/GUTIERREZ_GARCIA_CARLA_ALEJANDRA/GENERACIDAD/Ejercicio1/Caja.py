from typing import Generic, TypeVar

T = TypeVar('T')

class Caja(Generic[T]):
    def __init__(self):
        self.contenido = None

    def guardar(self, objeto: T):
        self.contenido = objeto
        print(f"Objeto guardado: {objeto}")

    def obtener(self) -> T:
        return self.contenido

caja_entero = Caja[int]()
caja_entero.guardar(42)

caja_texto = Caja[str]()
caja_texto.guardar("Hola mundo")

print("caja entero:", caja_entero.obtener())
print("caja texto:", caja_texto.obtener())