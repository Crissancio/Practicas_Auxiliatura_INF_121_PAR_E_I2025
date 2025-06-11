from Cliente import Cliente

class ArchivoCliente:
    def __init__(self, nomA: str):
        self.nomA = nomA
    
    def crearArchivo(self):
        try:
            with open(self.nomA, 'w') as f:
                f.write("")
        except IOError as e:
            print(f"Error creando archivo: {e}")
    
    def guardarCliente(self, c: 'Cliente'):
        try:
            with open(self.nomA, 'a') as f:
                f.write(f"{c.id},{c.nombre},{c.telefono}\n")
        except IOError as e:
            print(f"Error guardando cliente: {e}")
    
    def buscarCliente(self, c: int):
        try:
            with open(self.nomA, 'r') as f:
                for line in f:
                    id, nombre, telefono = line.strip().split(',')
                    if int(id) == c:
                        return Cliente(int(id), nombre, int(telefono))
        except IOError as e:
            print(f"Error buscando cliente: {e}")
        return None
    
    def buscarCelularCliente(self, c: int):
        try:
            with open(self.nomA, 'r') as f:
                for line in f:
                    id, nombre, telefono = line.strip().split(',')
                    if int(id) == c:
                        return Cliente(int(id), nombre, int(telefono))
        except IOError as e:
            print(f"Error buscando celular: {e}")
        return None