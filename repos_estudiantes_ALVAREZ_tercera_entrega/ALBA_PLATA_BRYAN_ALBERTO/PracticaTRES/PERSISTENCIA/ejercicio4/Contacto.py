import pickle


class Contacto:
    def __init__(self, nombre, email, celular):
        self.nombre = nombre
        self.email = email
        self.celular = celular

    def __str__(self):
        return f"Nombre: {self.nombre}, Email: {self.email}, Celular: {self.celular}"


def guardar_contacto(c):
    with open("contactos.pkl", "ab") as f:
        pickle.dump(c, f)


def buscar_contacto(nombre):
    try:
        with open("contactos.pkl", "rb") as f:
            while True:
                c = pickle.load(f)
                if c.nombre == nombre:
                    print("Email del contacto:", c.email)
                    return
    except EOFError:
        print("Contacto no encontrado.")
    except FileNotFoundError:
        print("Archivo no encontrado.")


def buscar_email(email):
    try:
        with open("contactos.pkl", "rb") as f:
            while True:
                c = pickle.load(f)
                if c.email == email:
                    print("Contacto encontrado:", c)
                    return
    except EOFError:
        print("Email no encontrado.")
    except FileNotFoundError:
        print("Archivo no encontrado.")
guardar_contacto(Contacto("Marta", "marta@gmail.com", "77700000"))
buscar_contacto("Marta")
buscar_email("marta@gmail.com")