from typing import Generic, TypeVar, List
T=TypeVar('T')
class Caja(Generic[T]):
    def __init__(self):
        self._contenido: List[T] = []
    def guardar(self,valor:T):
        self._contenido.append(valor)
    def obtener(self) -> T:
        return self._contenido
    def esta_vacia(self) -> bool:
        return len(self._contenido) == 0
    def mostrar(self):
        print("Contenido de la caja:")
        for item in self._contenido:
            print("   ", item)
            
class Persona:
    def __init__(self, nombre):
        self.nombre = nombre
    def __str__(self):
        return f"Persona: {self.nombre}"

cT=Caja[str]()
cT.guardar("Documentos")
cT.guardar("Tramites")
cN=Caja[int]()
cN.guardar(256)
cN.guardar(3694)
cP=Caja[Persona]()
cP.guardar(Persona("Pedro"))
cP.guardar(Persona("Sebastian"))
cT.mostrar()
cN.mostrar()
cP.mostrar()
