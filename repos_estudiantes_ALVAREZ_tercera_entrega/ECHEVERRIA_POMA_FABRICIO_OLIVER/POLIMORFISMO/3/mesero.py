class Mesero:
    def __init__ (self, nombre, sueldoMes, horasExtra, sueldoHora, propina):
        self.nombre = nombre
        self.sueldoMes = sueldoMes
        self.horasExtra = horasExtra
        self.sueldoHora = sueldoHora
        self.propina = propina
    #B
    def sueldoTotal(self):
        return self.sueldoMes + (self.horasExtra * self.sueldoHora) + self.propina
    
    def sueldoPorMes(self, X):
        if self.sueldoMes == X:
            print(f"Mesero:  {self.nombre}, Sueldo Mes: {self.sueldoMes}, Horas Extra: {self.horasExtra}, Sueldo Hora: {self.sueldoHora}, Propina: {self.propina}")