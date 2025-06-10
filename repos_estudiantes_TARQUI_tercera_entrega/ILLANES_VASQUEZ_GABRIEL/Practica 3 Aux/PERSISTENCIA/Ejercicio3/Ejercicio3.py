import os
import json

class Cliente:
    def __init__(self, nombre, id, telefono):
        self.nombre = nombre
        self.id = id
        self.telefono = telefono

    def to_dict(self):
        return {
            'nombre': self.nombre,
            'id': self.id,
            'telefono': self.telefono
        }

    @staticmethod
    def from_dict(data):
        return Cliente(data['nombre'], data['id'], data['telefono'])

    def __str__(self):
        return f"Nombre: {self.nombre}, ID: {self.id}, Telefono: {self.telefono}"


class ArchivoCliente:
    def __init__(self, carpeta):
        self.ruta_base = f"C:/Users/Diego/Desktop/mis_clientes2/{carpeta}/"
        self.crear_carpeta()

    def crear_carpeta(self):
        if not os.path.exists(self.ruta_base):
            os.makedirs(self.ruta_base)

    def guarda_cliente(self, cliente):
        ruta = os.path.join(self.ruta_base, f"cliente_{cliente.id}.json")
        with open(ruta, 'w') as f:
            json.dump(cliente.to_dict(), f, indent=4)

    def buscar_cliente(self, id_cliente):
        ruta = os.path.join(self.ruta_base, f"cliente_{id_cliente}.json")
        if not os.path.exists(ruta):
            return None

        with open(ruta, 'r') as f:
            data = json.load(f)
            cliente = Cliente.from_dict(data)

        ruta_buscado = os.path.join(self.ruta_base, "clienteBuscado.json")
        with open(ruta_buscado, 'w') as f:
            json.dump(cliente.to_dict(), f, indent=4)

        return cliente

    def buscar_celular_cliente(self, telefono):
        archivos = os.listdir(self.ruta_base)
        for archivo in archivos:
            if archivo.startswith("cliente_") and archivo.endswith(".json"):
                ruta = os.path.join(self.ruta_base, archivo)
                with open(ruta, 'r') as f:
                    data = json.load(f)
                    if data['telefono'] == telefono:
                        cliente = Cliente.from_dict(data)

                        ruta_celular = os.path.join(self.ruta_base, "celularBuscado.json")
                        with open(ruta_celular, 'w') as f2:
                            json.dump(cliente.to_dict(), f2, indent=4)

                        return cliente
        return None


if __name__ == "__main__":
    archivo = ArchivoCliente("ArchivoCliente")

    c1 = Cliente("Ana", 1, 777123456)
    c2 = Cliente("Luis", 2, 765432109)
    c3 = Cliente("Carlos", 3, 789654321)

    archivo.guarda_cliente(c1)
    archivo.guarda_cliente(c2)
    archivo.guarda_cliente(c3)

    buscado_por_id = archivo.buscar_cliente(2)
    print("Cliente encontrado por ID:", buscado_por_id)

    buscado_por_celular = archivo.buscar_celular_cliente(789654321)
    print("Cliente encontrado por celular:", buscado_por_celular)
