from Estudiante import Estudiante
from Universidad import Universidad

def main():
    # b) Creamos Universidad
    nombre_uni = input("Nombre de Universidad: ")
    universidad = Universidad(nombre_uni)
    #Intro. Estudiantes a Agregar
    cantidad = int(input("¿Cuantos estudiantes desea agregar?: "))
    #Agregamos a los Estudiantes
    for i in range(cantidad):
        print(f"\nEstudiante {i + 1}")
        nombre = input("Nombre: ")
        carrera = input("Carrera: ")
        semestre = input("Semestre: ")
        estudiante = Estudiante(nombre, carrera, semestre)
        universidad.agregar_estudiante(estudiante)

    # c) Mostramos informacion de la universidad y estudiantes
    print("\nINFORMACION DE LA UNIVERSIDAD Y SUS ESTUDIANTES:")
    universidad.mostrar_universidad()

if __name__ == "__main__":
    main()
