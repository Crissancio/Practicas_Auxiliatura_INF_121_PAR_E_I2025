
class Cliente:
   
    def __init__(self, id_cliente: int, nombre: str, telefono: int):
        self.id = id_cliente
        self.nombre = nombre
        self.telefono = telefono

    def __str__(self):
        
        return f"{self.id},{self.nombre},{self.telefono}"

    def __repr__(self):
        
        return self.__str__()

    @staticmethod
    def from_string(cliente_str: str):
        
        try:
            partes = cliente_str.strip().split(',')
            if len(partes) == 3:
                id_cliente = int(partes[0])
                nombre = partes[1]
                telefono = int(partes[2])
                return Cliente(id_cliente, nombre, telefono)
            else:
                print(f"Advertencia: Formato de linea incorrecto para cliente: {cliente_str}")
                return None
        except (ValueError, IndexError) as e:
            print(f"Error al parsear linea de cliente '{cliente_str}': {e}")
            return None

    def get_id(self) -> int:
        return self.id

    def get_nombre(self) -> str:
        return self.nombre

    def get_telefono(self) -> int:
        return self.telefono