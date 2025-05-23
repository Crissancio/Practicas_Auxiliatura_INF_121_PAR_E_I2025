from Gerente import Gerente
from Desarrollador import Desarrollador
g = [
    Gerente("María", "Fernández", 2500, 6, "Marketing", 1500),
    Gerente("Jorge", "Ramírez", 2100, 4, "Finanzas", 1100)
]

d = [
    Desarrollador("Elena", "Sánchez", 1900, 3, "C++", 15),
    Desarrollador("Miguel", "Torres", 1750, 5, "JavaScript", 9)
]

for i in g:
    print(f"Gerente: {i.nombre} - Salario: {i.calcular()}")
    if i.bono_gerencial > 1000:
        print(f"Bono gerencial mayor a 1000: {i.bono_gerencial}")
for j in d:
    print(f"Desarrollador: {j.nombre} - Salario: {j.calcular()}")
    if j.horas_extras > 10:
        print(f"Trabaja más de 10 horas extras: {j.horas_extras}")
