class Par:
    def __init__(self, clave, valor):
        self.clave = clave
        self.valor = valor

    def mostrar_par(self):
        print(f"Clave: {self.clave} | Valor: {self.valor}")

estudiante = Par(1001, "Juan Pérez")
estudiante.mostrar_par()

producto = Par("A123", 199.99)
producto.mostrar_par()
