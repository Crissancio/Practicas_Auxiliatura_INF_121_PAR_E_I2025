class Cliente:
    def __init__(self, id: int, nombre: str, telefono: int):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono
    
    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, Teléfono: {self.telefono}"

class ArchivoCliente:
    def __init__(self):
        self.clientes = []
    
    def guarda_cliente(self, cliente: Cliente) -> bool:
        for c in self.clientes:
            if c.id == cliente.id:
                print(f"Error: Ya existe un cliente con ID {cliente.id}")
                return False
        
        self.clientes.append(cliente)
        return True
    
    def buscar_cliente(self, id_cliente: int) -> Cliente:
        for cliente in self.clientes:
            if cliente.id == id_cliente:
                return cliente
        return None
    
    def buscar_celular_cliente(self, telefono: int) -> Cliente:
        for cliente in self.clientes:
            if cliente.telefono == telefono:
                return cliente
        return None


if __name__ == "__main__":
    archivo = ArchivoCliente()
    
    cli1 = Cliente(1, "Ana Martínez", 5551234567)
    cli2 = Cliente(2, "Luis González", 5559876543)
    cli3 = Cliente(3, "Carlos Sánchez", 5554567890)
    
    archivo.guarda_cliente(cli1)
    archivo.guarda_cliente(cli2)
    archivo.guarda_cliente(cli3)
    
    cli_repetido = Cliente(1, "Pedro Duarte", 5551112233)
    archivo.guarda_cliente(cli_repetido)
    
    print("\n=== Buscar cliente por ID ===")
    encontrado = archivo.buscar_cliente(2)
    if encontrado:
        print(f"Cliente encontrado: {encontrado}")
    else:
        print("Cliente no encontrado")
    
    print("\n=== Buscar cliente por teléfono ===")
    por_celular = archivo.buscar_celular_cliente(5554567890)
    if por_celular:
        print(f"Cliente encontrado: {por_celular}")
    else:
        print("Cliente no encontrado")