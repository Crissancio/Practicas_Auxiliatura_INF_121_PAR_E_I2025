import pickle
import os

# 1. Clase Medicamento
class Medicamento:
    def __init__(self, cod_medicamento, nombre, tipo, precio):
        self.cod_medicamento = cod_medicamento
        self.nombre = nombre
        self.tipo = tipo
        self.precio = precio
    
    def mostrar(self):
        # Usamos f-string con formato para el precio
        print(
            f"\t\t- Med: {self.nombre} (Cod: {self.cod_medicamento}, "
            f"Tipo: {self.tipo}, Precio: {self.precio:.2f} Bs.)"
        )

# 2. Clase Farmacia
class Farmacia:
    def __init__(self, nombre_farmacia, sucursal, direccion):
        self.nombre_farmacia = nombre_farmacia
        self.sucursal = sucursal
        self.direccion = direccion
        self.medicamentos = [] # Lista dinámica

    def adicionar_medicamento(self, med):
        self.medicamentos.append(med)
        
    def busca_medicamento(self, nombre_medicamento):
        for med in self.medicamentos:
            if med.nombre.lower() == nombre_medicamento.lower():
                return True
        return False

    def mostrar(self):
        print(f"Farmacia: {self.nombre_farmacia} (Sucursal: {self.sucursal})")
        print(f"\tDirección: {self.direccion}")
        print("\tMedicamentos registrados:")
        if not self.medicamentos:
            print("\t\t(Sin medicamentos)")
        else:
            for med in self.medicamentos:
                med.mostrar()
        print() # Salto de línea

# 3. Clase ArchFarmacia para la persistencia
class ArchFarmacia:
    def __init__(self, na):
        self.na = na

    def crear_archivo(self):
        # Borra el archivo si existe para empezar de cero en cada ejecución
        if os.path.exists(self.na):
            os.remove(self.na)
        with open(self.na, 'wb') as f:
            pickle.dump([], f) # Inicializa con una lista vacía
        print(f"Archivo '{self.na}' creado/limpiado exitosamente.")

    def adicionar(self, farmacia):
        lista = self.listar()
        lista.append(farmacia)
        with open(self.na, 'wb') as f:
            pickle.dump(lista, f)

    def listar(self):
        if not os.path.exists(self.na) or os.path.getsize(self.na) == 0:
            return []
        try:
            with open(self.na, 'rb') as f:
                return pickle.load(f)
        except EOFError:
            return []


# --- Bloque Principal para Ejecución y Pruebas ---
if __name__ == "__main__":
    archivo_farmacias = ArchFarmacia("farmacias.pkl")

    # --- PREPARACIÓN DE DATOS ---
    paracetamol = Medicamento(101, "Paracetamol", "Dolor de cabeza", 5.50)
    golpex = Medicamento(102, "Golpex", "Resfrio", 12.00)
    mentisan = Medicamento(103, "Mentisan", "Resfrio", 15.00)
    ambroxol = Medicamento(201, "Ambroxol", "Tos", 25.50)
    bisolvon = Medicamento(202, "Bisolvon", "Tos", 30.00)

    f1 = Farmacia("Farmacorp", 1, "Av. 6 de Marzo #123")
    f1.adicionar_medicamento(paracetamol)
    f1.adicionar_medicamento(golpex)
    f1.adicionar_medicamento(ambroxol)

    f2 = Farmacia("Bolivia", 2, "Calle 10, Obrajes #456")
    f2.adicionar_medicamento(mentisan)
    f2.adicionar_medicamento(bisolvon)
    f2.adicionar_medicamento(paracetamol)
    
    f3 = Farmacia("Farmacorp", 3, "Plaza del Estudiante #789")
    f3.adicionar_medicamento(golpex)
    f3.adicionar_medicamento(bisolvon)
    
    # --- a) Crear y Adicionar al Archivo ---
    print("--- a) Creando archivo y guardando farmacias ---")
    archivo_farmacias.crear_archivo()
    archivo_farmacias.adicionar(f1)
    archivo_farmacias.adicionar(f2)
    archivo_farmacias.adicionar(f3)
    print("Se guardaron 3 farmacias.")
    print("\n--- a) Mostrando todas las farmacias desde el archivo ---")
    farmacias_leidas = archivo_farmacias.listar()
    if not farmacias_leidas:
        print("No hay farmacias en el archivo.")
    else:
        for f in farmacias_leidas:
            f.mostrar()

    # --- b) Mostrar medicamentos para la tos de la Sucursal X ---
    sucursal_buscada = 2
    print(f"\n--- b) Buscando medicamentos para la Tos en Sucursal {sucursal_buscada} ---")
    sucursal_encontrada = False
    for f in farmacias_leidas:
        if f.sucursal == sucursal_buscada:
            sucursal_encontrada = True
            print(f"Medicamentos para la tos en {f.direccion}:")
            med_encontrado = False
            for med in f.medicamentos:
                if med.tipo.lower() == "tos":
                    med.mostrar()
                    med_encontrado = True
            if not med_encontrado:
                print("\t\t(No se encontraron medicamentos para la tos en esta sucursal)")
    if not sucursal_encontrada:
        print(f"No se encontró la sucursal número {sucursal_buscada}")

    # --- c) Mostrar sucursal y dirección que tienen "Golpex" ---
    med_buscado = "Golpex"
    print(f"\n--- c) Buscando Farmacias con el medicamento '{med_buscado}' ---")
    encontrado = False
    for f in farmacias_leidas:
        if f.busca_medicamento(med_buscado):
            print(f"Encontrado en -> Sucursal: {f.sucursal}, Dirección: {f.direccion}")
            encontrado = True
    if not encontrado:
        print(f"Ninguna farmacia tiene el medicamento '{med_buscado}'.")
