import os
import json

rutaBase = "C:/Users/SAMSUNG/Desktop/PERSISTENCIA DE OBJETOS/EJERCICIO3/medicamentos"

class Medicamento:
    def __init__(self, id=None, nombre=None, tipo=None, precio=None, stock=None):
        self.id = id
        self.nombre = nombre
        self.tipo = tipo
        self.precio = precio
        self.stock = stock
        self.archivo = f"{rutaBase}/medicamento{self.id}.json"

    def guardar(self):
        os.makedirs(rutaBase, exist_ok=True)
        datos = {
            "id": self.id,
            "nombre": self.nombre,
            "tipo": self.tipo,
            "precio": self.precio,
            "stock": self.stock
        }
        with open(self.archivo, 'w') as archivo:
            json.dump(datos, archivo, indent=4)

    def cargarDatos(self, rutaArchivo):
        self.archivo = rutaArchivo
        if os.path.isfile(self.archivo):
            with open(self.archivo, 'r') as archivo:
                datos = json.load(archivo)
                self.id = datos.get("id")
                self.nombre = datos.get("nombre")
                self.tipo = datos.get("tipo")
                self.precio = datos.get("precio")
                self.stock = datos.get("stock")
                print(f"Datos cargados: medicamento{self.id}.json")

    def actualizar(self):
        self.guardar()

    def eliminar(self):
        if os.path.isfile(self.archivo):
            os.remove(self.archivo)
            print(f"Archivo medicamento{self.id}.json eliminado.")

    def getTipo(self):
        return self.tipo

    def __str__(self):
        return f"ID: {self.id}, Nombre: {self.nombre}, Tipo: {self.tipo}, Precio: {self.precio}, Stock: {self.stock}"
