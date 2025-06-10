#3. Sea el siguiente diagrama de clases:
#a) Implementar el diagrama de clases.
#b) Implementa buscarCliente(int c) a través del id.
#c) Implementa buscarCelularCliente(int c), que devuelva los datos del cliente junto al número de celular.
import json

class Cliente:
    def __init__(self, id: int, nombre: str, telefono: int):
        self.id = id
        self.nombre = nombre
        self.telefono = telefono

    def to_dict(self):
        return {"id": self.id, "nombre": self.nombre, "telefono": self.telefono}

    def __str__(self):
        return f"{self.nombre} - ID: {self.id} - Teléfono: {self.telefono}"

class ArchivoCliente:
    def __init__(self, archivo):
        self.archivo = archivo

    def guardar_cliente(self, cliente: Cliente):
        try:
            with open(self.archivo, 'r') as f:
                datos = json.load(f)
        except FileNotFoundError:
            datos = []

        datos.append(cliente.to_dict())
        with open(self.archivo, 'w') as f:
            json.dump(datos, f, indent=4)

    def buscar_cliente(self, id: int):
        with open(self.archivo, 'r') as f:
            datos = json.load(f)
            for c in datos:
                if c['id'] == id:
                    return Cliente(c['id'], c['nombre'], c['telefono'])
        return None

    def buscar_por_telefono(self, telefono: int):
        with open(self.archivo, 'r') as f:
            datos = json.load(f)
            for c in datos:
                if c['telefono'] == telefono:
                    return Cliente(c['id'], c['nombre'], c['telefono'])
        return None

def main():
    archivo = ArchivoCliente("clientes.json")
    archivo.guardar_cliente(Cliente(1, "Lucía", 7894561))
    archivo.guardar_cliente(Cliente(2, "Mario", 7894562))

    print("Buscar cliente por ID 2:", archivo.buscar_cliente(2))
    print("Buscar por teléfono 7894562:", archivo.buscar_por_telefono(7894562))

if __name__ == "__main__":
    main()

