# 3. Sea el siguiente diagrama de clases:
# a) Implementar el diagrama de clases.
# b) Implementa buscarContacto(String n)a través del nombre, devolviendo
# el email.
# c) Implementa buscarEmail(String e), que devuelva los datos del cliente
# junto al número de celular.
import json
class Cliente:
    def __init__(self, id, nombre, celular, email):
        self.id = id
        self.nombre = nombre
        self.celular = celular
        self.email = email

    def to_dict(self):
        return {"id": self.id, "nombre": self.nombre, "celular": self.celular, "email": self.email}


def guardarCliente(c):
    with open("clientes.json", "a") as f:
        f.write(json.dumps(c.to_dict()) + "\n")


def buscarCliente(id):
    with open("clientes.json", "r") as f:
        for line in f:
            cliente = json.loads(line)
            if cliente["id"] == id:
                return cliente
    return None


def buscarCelularCliente(id):
    cliente = buscarCliente(id)
    if cliente:
        return cliente["nombre"], cliente["celular"]
    return None

guardarCliente(Cliente(1, "Xiao", "23233", "xiao@mail.com"))
print("Buscar cliente ID 1:", buscarCliente(1))
print("Celular cliente 1:", buscarCelularCliente(1))
