class Cliente:
    def __init__(self, id, nombre, telefono):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono

    def __str__(self):
        return f"{self.id},{self.nombre},{self.telefono}"

    @staticmethod
    def from_string(linea):
        partes = linea.strip().split(",")
        return Cliente(int(partes[0]), partes[1], int(partes[2]))


class ArchivoCliente:
    def __init__(self, nombre_archivo):
        self.nombre_archivo = nombre_archivo

    def crear_archivo(self):
        with open(self.nombre_archivo, "w") as f:
            pass  # crea archivo vacío

    def guarda_cliente(self, cliente):
        with open(self.nombre_archivo, "a") as f:
            f.write(str(cliente) + "\n")

    def buscar_cliente(self, id_buscar):
        with open(self.nombre_archivo, "r") as f:
            for linea in f:
                c = Cliente.from_string(linea)
                if c.id == id_buscar:
                    return c
        return None

    def buscar_celular_cliente(self, id_buscar):
        return self.buscar_cliente(id_buscar)

if __name__ == "__main__":
    archivo = ArchivoCliente("clientes.txt")

    archivo.crear_archivo()

    c1 = Cliente(1, "Juan Perez", 123456789)
    c2 = Cliente(2, "Maria Lopez", 987654321)
    c3 = Cliente(3, "Carlos Ruiz", 112233445)

    archivo.guarda_cliente(c1)
    archivo.guarda_cliente(c2)
    archivo.guarda_cliente(c3)

    try:
        id_buscar = int(input("Ingrese ID de cliente a buscar: "))
        cliente_encontrado = archivo.buscar_cliente(id_buscar)

        if cliente_encontrado:
            print("Cliente encontrado:", cliente_encontrado.nombre)
        else:
            print("Cliente no encontrado.")

        id_tel = int(input("Ingrese ID para buscar teléfono: "))
        cliente_tel = archivo.buscar_celular_cliente(id_tel)

        if cliente_tel:
            print("Teléfono del cliente:", cliente_tel.telefono)
        else:
            print("No se encontró el cliente.")

    except Exception as e:
        print("Error:", e)
