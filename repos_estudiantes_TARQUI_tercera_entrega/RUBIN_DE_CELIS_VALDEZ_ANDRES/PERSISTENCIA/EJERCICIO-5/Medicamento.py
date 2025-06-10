class Medicamento:
    def __init__(self, nombre="", codigo=0, tipo="", precio=0.0):
        self.nombre = nombre
        self.codMedicamento = codigo
        self.tipo = tipo
        self.precio = precio
    
    def leer(self):
        self.nombre = input("Nombre del medicamento: ")
        self.codMedicamento = int(input("Código: "))
        self.tipo = input("Tipo (resfrio/tos/dolor): ")
        self.precio = float(input("Precio: "))
    
    def mostrar(self):
        print(f"Medicamento: {self.nombre}")
        print(f"Código: {self.codMedicamento}")
        print(f"Tipo: {self.tipo}")
        print(f"Precio: {self.precio:.2f}")
    
    def getTipo(self):
        return self.tipo
    
    def getPrecio(self):
        return self.precio
    
    def to_dict(self):
        return {
            'nombre': self.nombre,
            'codigo': self.codMedicamento,
            'tipo': self.tipo,
            'precio': self.precio
        }
    
    @classmethod
    def from_dict(cls, data):
        return cls(data['nombre'], data['codigo'], data['tipo'], data['precio'])