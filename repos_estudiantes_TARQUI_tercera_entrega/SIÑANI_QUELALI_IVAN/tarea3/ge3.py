class Catalogo:
    def __init__(self):
        self.elementos = []

    def agregar(self, elemento):
        self.elementos.append(elemento)

    def buscar(self, indice):
        return self.elementos[indice] if 0 <= indice < len(self.elementos) else None
    
    def mostrar_catalogo(self):
        for elemento in self.elementos:
            print(elemento)

catalogolibros = Catalogo()
catalogolibros.agregar("Cien años de soledad")
catalogolibros.agregar("El principito")
catalogolibros.mostrar_catalogo()

catalogoproductos = Catalogo()
catalogoproductos.agregar("Laptop - $1200")
catalogoproductos.agregar("Smartphone - $800")
catalogoproductos.mostrar_catalogo()
