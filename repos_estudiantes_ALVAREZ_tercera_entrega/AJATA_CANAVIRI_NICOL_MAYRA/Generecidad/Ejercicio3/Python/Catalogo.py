from typing import TypeVar, Generic, List, Optional

T = TypeVar('T')

class Catalogo(Generic[T]):

    def __init__(self):
        self._elementos: List[T] = []

    # a) 
    def agregar_elemento(self, elemento: T):
       
        self._elementos.append(elemento)
        print(f"Elemento agregado al catalogo: {elemento}")

    def buscar_elemento(self, criterio: str) -> Optional[T]:
        
        print(f"Buscando '{criterio}' en el catalogo")
        for elemento in self._elementos:
           
            if hasattr(elemento, 'es_similar') and callable(getattr(elemento, 'es_similar')):
                if elemento.es_similar(criterio):
                    return elemento
        return None

    def mostrar_catalogo(self):
        
        if not self._elementos:
            print("El catalogo esta vacio")
            return

        print("\n--- Contenido Actual del Catalogo ---")
        for elemento in self._elementos:
            print(elemento)
        print("------------------------------------")
