import os

class Cliente:
   
    def __init__(self, id: int, nombre: str, telefono: int):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono

    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, Teléfono: {self.telefono}"

    def __repr__(self):
        return f"Cliente({self.id}, '{self.nombre}', {self.telefono})"

class ArchivoCliente:
    def __init__(self, nomA: str):
        self.nomA = nomA  # Nombre del archivo

    def crearArchivo(self):
        try:
            with open(self.nomA, 'x') as f:
                pass  # Just create the file
        except FileExistsError:
            print(f"El archivo '{self.nomA}' ya existe.")
        except IOError as e:
            print(f"Error al crear el archivo '{self.nomA}': {e}")

    def guardaCliente(self, c: Cliente):
        try:
            with open(self.nomA, 'a') as f:
                f.write(f"{c.id},{c.nombre},{c.telefono}\n")
            print(f"Cliente con ID {c.id} guardado exitosamente.")
        except IOError as e:
            print(f"Error al guardar el cliente en '{self.nomA}': {e}")

    def buscarCliente(self, id_cliente: int) -> Cliente:
        try:
            with open(self.nomA, 'r') as f:
                for line in f:
                    parts = line.strip().split(',')
                    if len(parts) == 3:
                        try:
                            client_id = int(parts[0])
                            if client_id == id_cliente:
                                return Cliente(client_id, parts[1], int(parts[2]))
                        except ValueError:
                            print(f"Advertencia: Línea mal formateada en el archivo: {line.strip()}")
            print(f"Cliente con ID {id_cliente} no encontrado.")
            return None
        except FileNotFoundError:
            print(f"El archivo '{self.nomA}' no existe.")
            return None
        except IOError as e:
            print(f"Error al buscar cliente en '{self.nomA}': {e}")
            return None

    def buscarCelularCliente(self, id_cliente: int) -> tuple:
        cliente = self.buscarCliente(id_cliente)
        if cliente:
            return (cliente, cliente.telefono)
        else:
            return (None, None)

if __name__ == "__main__":
    nombre_archivo = "clientes.txt"
    if os.path.exists(nombre_archivo):
        os.remove(nombre_archivo)
        print(f"Archivo '{nombre_archivo}' eliminado para una prueba limpia.")
    gestor_clientes = ArchivoCliente(nombre_archivo)

    gestor_clientes.crearArchivo()

    cliente1 = Cliente(1, "Alice Smith", 123456789)
    cliente2 = Cliente(2, "Bob Johnson", 987654321)
    cliente3 = Cliente(3, "Charlie Brown", 555123456)
    gestor_clientes.guardaCliente(cliente1)
    gestor_clientes.guardaCliente(cliente2)
    gestor_clientes.guardaCliente(cliente3)


    cliente_encontrado_1 = gestor_clientes.buscarCliente(2)
    if cliente_encontrado_1:
        print(f"Cliente encontrado por ID 2: {cliente_encontrado_1}")

    
    cliente_no_encontrado = gestor_clientes.buscarCliente(99)
    if not cliente_no_encontrado:
        print("El cliente con ID 99 no fue encontrado (como se esperaba).")

  
    cliente_y_celular_1, celular_1 = gestor_clientes.buscarCelularCliente(1)
    if cliente_y_celular_1 and celular_1:
        print(f"Datos del cliente con ID 1: {cliente_y_celular_1}, Número de celular: {celular_1}")


    cliente_y_celular_inexistente, celular_inexistente = gestor_clientes.buscarCelularCliente(4)
    if not cliente_y_celular_inexistente and not celular_inexistente:
        print("Cliente con ID 4 no encontrado (como se esperaba para buscarCelularCliente).")

    try:
        with open(nombre_archivo, 'r') as f:
            print(f.read())
    except FileNotFoundError:
        print("El archivo no se creó o fue eliminado.")
