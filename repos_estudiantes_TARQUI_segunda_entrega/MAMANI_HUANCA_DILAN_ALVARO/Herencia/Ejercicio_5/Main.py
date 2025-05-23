from Gerente import Gerente
from Desarrollador import Desarrollador

def main():
    # b) Creamos las instancias
    g1 = Gerente("Ana", "Torres", 3000, 5, "Ventas", 1200)
    g2 = Gerente("Luis", "Martinez", 2800, 3, "Finanzas", 800)

    d1 = Desarrollador("Carlos", "Lopez", 2500, 4, "Python", 12)
    d2 = Desarrollador("Marta", "Suarez", 2700, 2, "Java", 8)

    # Mostramos los salarios
    print("\nSALARIOS:")
    print(f"{g1.get_nombre_completo()} - Salario: {g1.calcular_salario()}")
    print(f"{g2.get_nombre_completo()} - Salario: {g2.calcular_salario()}")
    print(f"{d1.get_nombre_completo()} - Salario: {d1.calcular_salario()}")
    print(f"{d2.get_nombre_completo()} - Salario: {d2.calcular_salario()}")

    # c) Gerentes con bono gerencial mayor a 1000
    print("\nGERENTES QUE TIENE BONO DE GERENCIAL MAYOR 1000:")
    for g in [g1, g2]:
        if g.get_bono_gerencial() > 1000:
            print(f"{g.get_nombre_completo()} - Bono: {g.get_bono_gerencial()}")

    # d) Desarrolladores con mas de 10 horas extra
    print("\nDESARROLLADORES QUE TRABAJAN MAS DE 10 HRS. EXTRA:")
    for d in [d1, d2]:
        if d.get_horas_extras() > 10:
            print(f"{d.get_nombre_completo()} - Horas extras: {d.get_horas_extras()}")

if __name__ == "__main__":
    main()