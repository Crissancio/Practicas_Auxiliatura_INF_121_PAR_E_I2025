class Administrativo:
    def __init__(self, nombre, sueldo_mes, cargo):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.cargo = cargo

    def sueldo_total(self, sueldo_filtro=None):
        if sueldo_filtro is None:
            return self.sueldo_mes
        elif self.sueldo_mes == sueldo_filtro:
            print(f"Administrativo con sueldoMes = {sueldo_filtro}: {self.nombre}")


class Cocinero:
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora

    def sueldo_total(self, sueldo_filtro=None):
        if sueldo_filtro is None:
            return self.sueldo_mes + (self.horas_extra * self.sueldo_hora)
        elif self.sueldo_mes == sueldo_filtro:
            print(f"Cocinero con sueldoMes = {sueldo_filtro}: {self.nombre}")


class Mesero:
    def __init__(self, nombre, sueldo_mes, horas_extra, sueldo_hora, propina):
        self.nombre = nombre
        self.sueldo_mes = sueldo_mes
        self.horas_extra = horas_extra
        self.sueldo_hora = sueldo_hora
        self.propina = propina

    def sueldo_total(self, sueldo_filtro=None):
        if sueldo_filtro is None:
            return self.sueldo_mes + (self.horas_extra * self.sueldo_hora) + self.propina
        elif self.sueldo_mes == sueldo_filtro:
            print(f"Mesero con sueldoMes = {sueldo_filtro}: {self.nombre}")


# ----------- "main" embebido al estilo Python -----------

if __name__ == "__main__":
    c1 = Cocinero("Luis", 800, 10, 20)
    m1 = Mesero("Carlos", 700, 5, 15, 50)
    m2 = Mesero("Ana", 700, 8, 15, 40)
    a1 = Administrativo("Pedro", 900, "Jefe de compras")
    a2 = Administrativo("Marta", 1000, "Gerente")

    print("Sueldos Totales:")
    print(f"Cocinero: ${c1.sueldo_total():.2f}")
    print(f"Mesero 1: ${m1.sueldo_total():.2f}")
    print(f"Mesero 2: ${m2.sueldo_total():.2f}")
    print(f"Admin 1: ${a1.sueldo_total():.2f}")
    print(f"Admin 2: ${a2.sueldo_total():.2f}")

    print("\nFiltrar por sueldoMes == 700:")
    c1.sueldo_total(700)
    m1.sueldo_total(700)
    m2.sueldo_total(700)
    a1.sueldo_total(700)  # En Python da igual si es float o int
    a2.sueldo_total(700)  # En Python da igual si es float o int
    