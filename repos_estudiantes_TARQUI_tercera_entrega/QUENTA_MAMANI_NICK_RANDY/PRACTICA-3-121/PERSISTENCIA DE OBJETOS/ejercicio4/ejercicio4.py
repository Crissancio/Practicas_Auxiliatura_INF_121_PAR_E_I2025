# 3. Sea el siguiente diagrama de clases:
# a) Implementar el diagrama de clases.
# b) Implementa buscarContacto(String n)a través del nombre, devolviendo
# el email.
# c) Implementa buscarEmail(String e), que devuelva los datos del cliente
# junto al número de celular.
import json

class Contacto:
    def __init__(self, nombre, celular, email):
        self.nombre = nombre
        self.celular = celular
        self.email = email

    def to_dict(self):
        return {"nombre": self.nombre, "celular": self.celular, "email": self.email}


def guardarContacto(c):
    with open("contactos.json", "a") as f:
        f.write(json.dumps(c.to_dict()) + "\n")


def buscarContacto(nombre):
    with open("contactos.json", "r") as f:
        for line in f:
            contacto = json.loads(line)
            if contacto["nombre"] == nombre:
                return contacto["email"]
    return None


def buscarEmail(email):
    with open("contactos.json", "r") as f:
        for line in f:
            contacto = json.loads(line)
            if contacto["email"] == email:
                return contacto["nombre"], contacto["celular"]
    return None

guardarContacto(Contacto("Sora", "23233", "sora@mail.com"))
print("Email de Sora:", buscarContacto("Sora"))
print("Buscar por email:", buscarEmail("sora@mail.com"))

