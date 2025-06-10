import os

class Medicamento:
    def __init__(self, nombre: str, cod_medicamento: int, tipo: str, precio: float):
        self.nombre = nombre
        self.codMedicamento = cod_medicamento
        self.tipo = tipo
        self.precio = precio

    def __str__(self):
        return f"Nombre: {self.nombre}, Código: {self.codMedicamento}, Tipo: {self.tipo}, Precio: {self.precio:.2f}"

    def __repr__(self):
        return f"Medicamento('{self.nombre}', {self.codMedicamento}, '{self.tipo}', {self.precio})"

    def leer(self):
        print(f"Leyendo datos del medicamento: {self.nombre}")

    def mostrar(self):
        print(self)

    def getTipo(self) -> str:
        return self.tipo

    def getPrecio(self) -> float:
        return self.precio

    def to_csv_string(self) -> str:
        return f"{self.nombre},{self.codMedicamento},{self.tipo},{self.precio}"

    @staticmethod
    def from_csv_string(csv_string: str):
        parts = csv_string.strip().split(',')
        if len(parts) == 4:
            try:
                nombre = parts[0]
                cod_medicamento = int(parts[1])
                tipo = parts[2]
                precio = float(parts[3])
                return Medicamento(nombre, cod_medicamento, tipo, precio)
            except ValueError:
                print(f"Error al parsear línea de medicamento: {csv_string}")
                return None
        return None

class Farmacia:
    def __init__(self, nombre_farmacia: str, sucursal: int, direccion: str):
        self.nombreFarmacia = nombre_farmacia
        self.sucursal = sucursal
        self.direccion = direccion
        self.nroMedicamentos = 0
        self.m = []  # Lista para almacenar objetos Medicamento

    def __str__(self):
        meds_str = "\n".join([f"  - {med}" for med in self.m]) if self.m else "  (Sin medicamentos)"
        return (f"Farmacia: {self.nombreFarmacia}, Sucursal: {self.sucursal}, Dirección: {self.direccion}\n"
                f"  Número de Medicamentos: {self.nroMedicamentos}\n"
                f"  Medicamentos:\n{meds_str}")

    def __repr__(self):
        return (f"Farmacia('{self.nombreFarmacia}', {self.sucursal}, '{self.direccion}', "
                f"[{', '.join(repr(med) for med in self.m)}])")

    def leer(self):
        print(f"Leyendo datos de la farmacia: {self.nombreFarmacia}, Sucursal: {self.sucursal}")

    def mostrar(self):
        print(self)

    def getDireccion(self) -> str:
        return self.direccion

    def getSucursal(self) -> int:
        return self.sucursal

    def adicionarMedicamento(self, medicamento: Medicamento):
        self.m.append(medicamento)
        self.nroMedicamentos = len(self.m)
        print(f"Medicamento '{medicamento.nombre}' añadido a la farmacia {self.nombreFarmacia} (Suc. {self.sucursal}).")

    def buscaMedicamento(self, nombre_medicamento: str) -> Medicamento or None:
        
        for med in self.m:
            if med.nombre.lower() == nombre_medicamento.lower():
                return med
        return None

    def mostrarMedicamentos(self):
        
        if not self.m:
            print(f"La farmacia {self.nombreFarmacia} (Suc. {self.sucursal}) no tiene medicamentos.")
            return

        print(f"Medicamentos en la farmacia {self.nombreFarmacia} (Suc. {self.sucursal}):")
        for med in self.m:
            print(f"  - {med}")

    def to_csv_string(self) -> str:
        
        meds_data = []
        for med in self.m:
            meds_data.append(med.to_csv_string())
        return f"{self.nombreFarmacia},{self.sucursal},{self.direccion},{self.nroMedicamentos},{'|'.join(meds_data)}"

    @staticmethod
    def from_csv_string(csv_string: str):
       
        parts = csv_string.strip().split(',')
        if len(parts) >= 4:
            try:
                nombre_farmacia = parts[0]
                sucursal = int(parts[1])
                direccion = parts[2]
                nro_medicamentos_expected = int(parts[3])

                farmacia = Farmacia(nombre_farmacia, sucursal, direccion)

                # Reconstruir los medicamentos
                if len(parts) > 4: # There are medications stored
                    meds_raw_string = ','.join(parts[4:]) # Join the rest of the parts
                    individual_med_strings = meds_raw_string.split('|')
                    for med_str in individual_med_strings:
                        if med_str: # Avoid empty strings if there are trailing |
                            med = Medicamento.from_csv_string(med_str)
                            if med:
                                farmacia.adicionarMedicamento(med) # This will update nroMedicamentos
                return farmacia
            except ValueError:
                print(f"Error al parsear línea de farmacia: {csv_string}")
                return None
        return None


class ArchFarmacia:
    
    def __init__(self, na: str):
        self.na = na  # Nombre del archivo

    def crearArchivo(self):
        
        try:
            with open(self.na, 'x') as f:
                pass  # Just create the file
            print(f"Archivo '{self.na}' creado exitosamente.")
        except FileExistsError:
            print(f"El archivo '{self.na}' ya existe.")
        except IOError as e:
            print(f"Error al crear el archivo '{self.na}': {e}")

    def adicionar(self, farmacia: Farmacia):
        
        try:
            with open(self.na, 'a') as f:
                f.write(f"{farmacia.to_csv_string()}\n")
            print(f"Farmacia '{farmacia.nombreFarmacia}' (Suc. {farmacia.sucursal}) guardada exitosamente.")
        except IOError as e:
            print(f"Error al guardar la farmacia en '{self.na}': {e}")

    def listar(self) -> list[Farmacia]:
        
        farmacias = []
        try:
            with open(self.na, 'r') as f:
                for line in f:
                    farmacia = Farmacia.from_csv_string(line)
                    if farmacia:
                        farmacias.append(farmacia)
            return farmacias
        except FileNotFoundError:
            print(f"El archivo '{self.na}' no existe.")
            return []
        except IOError as e:
            print(f"Error al leer el archivo '{self.na}': {e}")
            return []

    def mostrarMedicamentosRestritos(self):
       
        print("\n--- Medicamentos con precio mayor a 50 en todas las farmacias ---")
        farmacias = self.listar()
        found_restricted = False
        for farmacia in farmacias:
            for med in farmacia.m:
                if med.precio > 50:
                    print(f"  Farmacia: {farmacia.nombreFarmacia} (Sucursal: {farmacia.sucursal}), Medicamento: {med}")
                    found_restricted = True
        if not found_restricted:
            print("No se encontraron medicamentos con precio mayor a 50.")

    def precioMedicamentoTo(self, nombre_medicamento: str) -> float or None:
       
        farmacias = self.listar()
        for farmacia in farmacias:
            med = farmacia.buscaMedicamento(nombre_medicamento)
            if med:
                return med.getPrecio()
        print(f"Medicamento '{nombre_medicamento}' no encontrado en ninguna farmacia.")
        return None

    def mostrarMedicamentosMenor(self):
        
        print("\n--- Medicamento con el precio más bajo en todas las farmacias ---")
        farmacias = self.listar()
        min_price = float('inf')
        cheapest_med = None
        cheapest_farmacia_info = ""

        for farmacia in farmacias:
            for med in farmacia.m:
                if med.precio < min_price:
                    min_price = med.precio
                    cheapest_med = med
                    cheapest_farmacia_info = f"Farmacia: {farmacia.nombreFarmacia}, Sucursal: {farmacia.sucursal}"
        
        if cheapest_med:
            print(f"  {cheapest_med} (En: {cheapest_farmacia_info})")
        else:
            print("No hay medicamentos registrados.")

# --- Parte a) Crear, leer y mostrar un Archivo de Farmacias ---
if __name__ == "__main__":
    nombre_archivo_farmacias = "farmacias.txt"

    
    if os.path.exists(nombre_archivo_farmacias):
        os.remove(nombre_archivo_farmacias)
        print(f"Archivo '{nombre_archivo_farmacias}' eliminado para una prueba limpia.")

    
    gestor_archivos = ArchFarmacia(nombre_archivo_farmacias)

  
    gestor_archivos.crearArchivo()

  
    med1 = Medicamento("Paracetamol", 101, "Analgésico", 15.50)
    med2 = Medicamento("Ibuprofeno", 102, "Antiinflamatorio", 25.75)
    med3 = Medicamento("Amoxicilina", 103, "Antibiótico", 60.00)
    med4 = Medicamento("Codeína", 104, "Antitusivo", 30.20)
    med5 = Medicamento("Dextrometorfano", 105, "Antitusivo", 12.80)
    med6 = Medicamento("Golpex", 106, "Multivitamínico", 45.00) # Medicamento para la parte c)

   
    farmacia1 = Farmacia("Farmacia Central", 1, "Av. Principal 123")
    farmacia1.adicionarMedicamento(med1)
    farmacia1.adicionarMedicamento(med4) # Antitusivo

    farmacia2 = Farmacia("Farmacia Sur", 2, "Calle Falsa 456")
    farmacia2.adicionarMedicamento(med2)
    farmacia2.adicionarMedicamento(med5) # Antitusivo
    farmacia2.adicionarMedicamento(med6) # Golpex

    farmacia3 = Farmacia("Farmacia Norte", 3, "Pza. Bolívar 789")
    farmacia3.adicionarMedicamento(med3)
    farmacia3.adicionarMedicamento(med1) # Paracetamol otra vez

   
    gestor_archivos.adicionar(farmacia1)
    gestor_archivos.adicionar(farmacia2)
    gestor_archivos.adicionar(farmacia3)

    print("\n--- Listar todas las farmacias desde el archivo ---")
    todas_las_farmacias = gestor_archivos.listar()
    if todas_las_farmacias:
        for f in todas_las_farmacias:
            f.mostrar()
            print("-" * 30) # Separador para mejor lectura
    else:
        print("No se encontraron farmacias en el archivo.")

    
    print("\n-mostrar los medicamentos para la tos, de la Sucursal numero X ---")
    sucursal_buscada = 2
    medicamentos_tos_encontrados = False
    for farmacia in todas_las_farmacias:
        if farmacia.getSucursal() == sucursal_buscada:
            print(f"\nMedicamentos para la tos en Farmacia {farmacia.nombreFarmacia} (Sucursal {sucursal_buscada}):")
            for med in farmacia.m:
                if med.getTipo().lower() == "antitusivo":
                    print(f"  - {med}")
                    medicamentos_tos_encontrados = True
            if not medicamentos_tos_encontrados:
                print(f"  No se encontraron medicamentos para la tos en la sucursal {sucursal_buscada}.")
            break # Found the branch, no need to check others
    if not medicamentos_tos_encontrados and sucursal_buscada not in [f.getSucursal() for f in todas_las_farmacias]:
         print(f"No se encontró la sucursal número {sucursal_buscada}.")


    
    print("\n Mostrar el número de sucursal y su dirección que tienen el medicamento 'Golpex' ---")
    medicamento_buscado = "Golpex"
    farmacias_con_golpex = []
    for farmacia in todas_las_farmacias:
        if farmacia.buscaMedicamento(medicamento_buscado):
            farmacias_con_golpex.append(farmacia)

    if farmacias_con_golpex:
        for f in farmacias_con_golpex:
            print(f"  Sucursal: {f.getSucursal()}, Dirección: {f.getDireccion()} tiene '{medicamento_buscado}'")
    else:
        print(f"Ninguna farmacia tiene el medicamento '{medicamento_buscado}'.")

    
    print("\n--- Demostración de otros métodos de ArchFarmacia ---")
    gestor_archivos.mostrarMedicamentosRestritos()
    
    precio_ibuprofeno = gestor_archivos.precioMedicamentoTo("Ibuprofeno")
    if precio_ibuprofeno is not None:
        print(f"\nEl precio de Ibuprofeno es: {precio_ibuprofeno:.2f}")

    gestor_archivos.mostrarMedicamentosMenor()
