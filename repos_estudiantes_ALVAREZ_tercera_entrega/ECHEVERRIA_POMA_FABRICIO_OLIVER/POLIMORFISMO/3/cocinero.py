class Cocinero:
    def __init__(self, nombre, sueldoMes, horasExtra, sueldoHora):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora

    def sueldoTotal(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora)
    
    def sueldoPorMes(self, X):
        if self.sueldoMes == X:
            print(f"Cocinero:  {self.nombre}, Sueldo Mes: {self.sueldoMes}, Horas Extra: {self.horasExtra}, Sueldo Hora: {self.sueldoHora}")