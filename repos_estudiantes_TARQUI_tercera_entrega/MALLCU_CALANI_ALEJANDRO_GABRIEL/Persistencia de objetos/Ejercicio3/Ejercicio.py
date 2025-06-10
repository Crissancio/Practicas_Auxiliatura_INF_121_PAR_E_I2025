import pickle
import os

# 1. Clase Cliente: No requiere una declaración especial para ser "pickled" (serializada).
class Cliente:
    def __init__(self, id, nombre, telefono):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono

    def __str__(self):
        return f"Cliente(id={self.id}, nombre='{self.nombre}', telefono={self.telefono})"

# 2. Clase ArchivoCliente: Gestiona las operaciones de persistencia.
class ArchivoCliente:
    def __init__(self, nomA):
        self.nomA = nomA
        self.crearArchivo()

    def crearArchivo(self):
        # El archivo se crea automáticamente al abrirlo en modo escritura ('wb') si no existe.
        # Esta función es más para mantener la consistencia con el diagrama.
        if not os.path.exists(self.nomA):
            with open(self.nomA, 'wb') as f:
                pickle.dump([], f) # Escribe una lista vacía para inicializarlo

    def _leer_clientes(self):
        """Método privado para leer la lista de clientes del archivo."""
        try:
            with open(self.nomA, 'rb') as f:
                # Si el archivo está vacío, lanzará EOFError
                return pickle.load(f)
        except (EOFError, FileNotFoundError):
            return [] # Retorna una lista vacía si el archivo no existe o está vacío
            
    def _escribir_clientes(self, clientes):
        """Método privado para escribir la lista completa de clientes en el archivo."""
        with open(self.nomA, 'wb') as f:
            pickle.dump(clientes, f)

    def guardaCliente(self, c):
        clientes = self._leer_clientes()
        clientes.append(c)
        self._escribir_clientes(clientes)
        print(f"Cliente guardado: {c}")

    # b) Implementación de buscarCliente por ID
    def buscarCliente(self, id_cliente):
        clientes = self._leer_clientes()
        for cliente in clientes:
            if cliente.id == id_cliente:
                return cliente
        return None # Retorna None si no se encuentra

    # c) Implementación de buscarCelularCliente por teléfono
    def buscarCelularCliente(self, telefono):
        clientes = self._leer_clientes()
        for cliente in clientes:
            if cliente.telefono == telefono:
                return cliente
        return None # Retorna None si no se encuentra

# Bloque principal para probar la implementación
if __name__ == "__main__":
    # Inicializamos el gestor de archivos de clientes
    archivo = ArchivoCliente("clientes.pkl") # .pkl es una extensión común para archivos pickle

    # Creamos y guardamos algunos clientes
    print("--- Guardando Clientes ---")
    archivo.guardaCliente(Cliente(101, "Ana Fuentes", 77551122))
    archivo.guardaCliente(Cliente(102, "Carlos Diaz", 77112233))
    archivo.guardaCliente(Cliente(103, "Beatriz Roca", 65544332))
    print()

    # --- Pruebas de Búsqueda ---
    print("--- Búsqueda de Clientes ---")

    # Búsqueda por ID (existente)
    print("Buscando cliente con ID 102...")
    cliente_encontrado = archivo.buscarCliente(102)
    if cliente_encontrado:
        # En Python, para que la salida sea idéntica a la de Java, formateamos el __str__ de la clase.
        # Aquí lo renombramos a "toString" conceptualmente.
        cliente_encontrado.toString = lambda: f"Cliente{{id={cliente_encontrado.id}, nombre='{cliente_encontrado.nombre}', telefono={cliente_encontrado.telefono}}}"
        print(f"Resultado: {cliente_encontrado.toString()}")
    else:
        print("Resultado: Cliente no encontrado.")
        
    # Búsqueda por Celular (existente)
    print("\nBuscando cliente con celular 65544332...")
    cliente_por_celular = archivo.buscarCelularCliente(65544332)
    if cliente_por_celular:
        cliente_por_celular.toString = lambda: f"Cliente{{id={cliente_por_celular.id}, nombre='{cliente_por_celular.nombre}', telefono={cliente_por_celular.telefono}}}"
        print(f"Resultado: {cliente_por_celular.toString()}")
    else:
        print("Resultado: Cliente no encontrado.")

    # Búsqueda por ID (no existente)
    print("\nBuscando cliente con ID 999...")
    cliente_encontrado = archivo.buscarCliente(999)
    if cliente_encontrado:
        cliente_encontrado.toString = lambda: f"Cliente{{id={cliente_encontrado.id}, nombre='{cliente_encontrado.nombre}', telefono={cliente_encontrado.telefono}}}"
        print(f"Resultado: {cliente_encontrado.toString()}")
    else:
        print("Resultado: Cliente no encontrado.")
