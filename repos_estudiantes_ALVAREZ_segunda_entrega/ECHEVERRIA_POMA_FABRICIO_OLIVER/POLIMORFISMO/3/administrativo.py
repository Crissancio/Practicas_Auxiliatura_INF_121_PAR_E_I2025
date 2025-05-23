class Administrativo:

    def __init__(self, nombre, sueldoMes, cargo):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.cargo = cargo

    def sueldoTotal(self):
        return self.sueldoMes
    
    def sueldoPorMes(self, X):
        if self.sueldoMes == X:
            print(f"Administrativo: {self.nombre}, Sueldo Mes: {self.sueldoMes}, Cargo: {self.cargo}")