class Persona:
    def __init__(self):
        self.__ci = "0"
        self.__nombre = "Sin nombre"
        self.__apellido = "Sin apellido"
        self.__celular = "0"
        self.__fechaNac = "01/01/1900"

    def __init__(self, ci, nombre, apellido, celular, fechaNac):
        self.__ci = ci
        self.__nombre = nombre
        self.__apellido = apellido
        self.__celular = celular
        self.__fechaNac = fechaNac
#A
    def get_ci(self):
        return self.__ci

    def set_ci(self, ci):
        self.__ci = ci

    def get_nombre(self):
        return self.__nombre

    def set_nombre(self, nombre):
        self.__nombre = nombre

    def get_apellido(self):
        return self.__apellido

    def set_apellido(self, apellido):
        self.__apellido = apellido

    def get_celular(self):
        return self.__celular

    def set_celular(self, celular):
        self.__celular = celular

    def get_fechaNac(self):
        return self.__fechaNac

    def set_fechaNac(self, fechaNac):
        self.__fechaNac = fechaNac

    def mostrar(self):
        print(f"CI: {self.__ci}, Nombre: {self.__nombre}, Apellido: {self.__apellido}, Celular: {self.__celular}, Fecha Nacimiento: {self.__fechaNac}")

    def calcular_edad(self):
        añoNac = int(self.__fechaNac.split("/")[2])
        añoActual = 2025
        return añoActual - añoNac