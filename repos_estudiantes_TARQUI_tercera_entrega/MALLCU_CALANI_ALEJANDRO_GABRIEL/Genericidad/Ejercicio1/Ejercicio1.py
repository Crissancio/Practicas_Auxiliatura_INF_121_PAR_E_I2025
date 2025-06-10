class Caja:
    def __init__(self):
        """Inicializa una caja vacía."""
        self._contenido = None

    # a) Métodos para guardar y obtener
    def guardar(self, objeto):
        """Guarda un objeto en la caja."""
        self._contenido = objeto

    def obtener(self):
        """Obtiene el objeto guardado en la caja."""
        return self._contenido

# --- Uso de la clase Caja ---

# b) Crear dos instancias y almacenar datos de diferente tipo
caja_de_entero = Caja()
caja_de_entero.guardar(42)

caja_de_texto = Caja()
caja_de_texto.guardar("Hola Python")

# c) Mostrar el contenido de las cajas
print(f"📦 Contenido de la primera caja: {caja_de_entero.obtener()}")
print(f"📦 Contenido de la segunda caja: {caja_de_texto.obtener()}")

# Demostración del tipo de dato almacenado
print(f"Tipo de dato en la primera caja: {type(caja_de_entero.obtener())}")
print(f"Tipo de dato en la segunda caja: {type(caja_de_texto.obtener())}")
