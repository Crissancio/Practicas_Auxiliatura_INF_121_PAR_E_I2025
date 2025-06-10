import pickle


class Medicamento:
    def __init__(self, nombre, tipo):
        self.nombre = nombre
        self.tipo = tipo

    def __str__(self):
        return f"{self.nombre} ({self.tipo})"


class Farmacia:
    def __init__(self, numero_sucursal, direccion, medicamentos=[]):
        self.numero_sucursal = numero_sucursal
        self.direccion = direccion
        self.medicamentos = medicamentos

    def __str__(self):
        meds = ', '.join(str(m) for m in self.medicamentos)
        return f"Sucursal {self.numero_sucursal} - {self.direccion} | Medicamentos: {meds}"


def guardar_farmacia(f):
    with open("farmacias.pkl", "ab") as file:
        pickle.dump(f, file)


def medicamentos_para_tos(sucursal_numero):
    try:
        with open("farmacias.pkl", "rb") as file:
            while True:
                f = pickle.load(file)
                if f.numero_sucursal == sucursal_numero:
                    print("Medicamentos para la tos:")
                    for m in f.medicamentos:
                        if "tos" in m.tipo.lower():
                            print("-", m)
                    return
    except EOFError:
        print("No se encontró la sucursal.")
    except FileNotFoundError:
        print("Archivo no encontrado.")


def buscar_farmacias_con_medicamento(nombre_medicamento):
    try:
        with open("farmacias.pkl", "rb") as file:
            while True:
                f = pickle.load(file)
                for m in f.medicamentos:
                    if m.nombre.lower() == nombre_medicamento.lower():
                        print(f"Sucursal {f.numero_sucursal} - Dirección: {f.direccion}")
    except EOFError:
        pass
    except FileNotFoundError:
        print("Archivo no encontrado.")

meds = [Medicamento("Golpex", "tos"), Medicamento("Aspirina", "dolor")]
f = Farmacia(3, "Av. 16 de Julio", meds)
guardar_farmacia(f)
medicamentos_para_tos(3)
buscar_farmacias_con_medicamento("Golpex")