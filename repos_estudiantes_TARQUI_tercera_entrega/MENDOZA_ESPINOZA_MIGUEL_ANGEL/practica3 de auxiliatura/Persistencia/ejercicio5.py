class Medicamento:
    def __init__(self, nombre, cod, tipo, precio):
        self.nombre = nombre
        self.codMedicamento = cod
        self.tipo = tipo
        self.precio = precio

class Farmacia:
    def __init__(self, nombreFarmacia, sucursal, direccion):
        self.nombreFarmacia = nombreFarmacia
        self.sucursal = sucursal
        self.direccion = direccion
        self.medicamentos = []

    def agregarMedicamento(self, m):
        self.medicamentos.append(m)

    def mostrarMedicamentos(self, tipo):
        return [m for m in self.medicamentos if m.tipo == tipo]

    def buscaMedicamento(self, nombre):
        for m in self.medicamentos:
            if m.nombre == nombre:
                return m
        return None

class ArchFarmacia:
    def __init__(self, na):
        self.na = na
        self.farmacias = []

    def agregarFarmacia(self, f):
        self.farmacias.append(f)

    def mostrarMedicamentosTosSucursal(self, x):
        for f in self.farmacias:
            if f.sucursal == x:
                return f.mostrarMedicamentos("tos")

    def mostrarSucursalGolpex(self):
        result = []
        for f in self.farmacias:
            for m in f.medicamentos:
                if m.nombre == "Golpex":
                    result.append((f.sucursal, f.direccion))
        return result
