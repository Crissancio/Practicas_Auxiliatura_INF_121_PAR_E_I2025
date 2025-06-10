import csv

class Cliente:
    def __init__(self, id: int, nombre: str, telefono: int):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono

    def __str__(self):
        return f"Cliente [ID: {self.id}, Nombre: {self.nombre}, Teléfono: {self.telefono}]"

class ArchivoCliente:
    def __init__(self, nom_archivo: str):
        self.nom_archivo = nom_archivo

    def crear_archivo(self):
        try:
            with open(self.nom_archivo, 'x') as file:
                pass  # Crea el archivo vacío
        except FileExistsError:
            pass

    def guardar_cliente(self, cliente: Cliente):
        with open(self.nom_archivo, 'a', newline='') as file:
            writer = csv.writer(file)
            writer.writerow([cliente.id, cliente.nombre, cliente.telefono])

    def leer_clientes(self) -> list[Cliente]:
        clientes = []
        try:
            with open(self.nom_archivo, 'r') as file:
                reader = csv.reader(file)
                for row in reader:
                    if row:  # Evita líneas vacías
                        clientes.append(Cliente(int(row[0]), row[1], int(row[2])))
        except FileNotFoundError:
            pass
        return clientes

    def buscar_cliente(self, id: int) -> Cliente | None:
        clientes = self.leer_clientes()
        for cliente in clientes:
            if cliente.id == id:
                return cliente
        return None

    def buscar_celular_cliente(self, telefono: int) -> Cliente | None:
        clientes = self.leer_clientes()
        for cliente in clientes:
            if cliente.telefono == telefono:
                return cliente
        return None


archivo = ArchivoCliente("clientes.txt")
archivo.crear_archivo()

# Guardar clientes
archivo.guardar_cliente(Cliente(1, "Ana Pérez", 63040711))
archivo.guardar_cliente(Cliente(2, "Luis Gómez", 71234567))
archivo.guardar_cliente(Cliente(3, "María López", 5555678))
archivo.guardar_cliente(Cliente(4, "Carlos Ruiz", 98765432))
archivo.guardar_cliente(Cliente(5, "Laura Torres", 12345678))

# Buscar por ID
print("Cliente encontrado:", archivo.buscar_cliente(1))

# Buscar por teléfono
print("Cliente por teléfono:", archivo.buscar_celular_cliente(63040711))
