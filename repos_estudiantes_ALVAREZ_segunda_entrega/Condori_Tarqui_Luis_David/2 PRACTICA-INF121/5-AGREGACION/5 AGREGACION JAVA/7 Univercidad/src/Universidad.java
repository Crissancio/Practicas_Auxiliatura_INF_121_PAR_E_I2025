// TEMA: AGREGACIÓN
// Enunciado:
// 7. Crea un POO para una universidad y sus estudiantes. La universidad contiene estudiantes
// pero los estudiantes pueden existir independientemente de la universidad
//
// Estudiante<nombre, carrera, semestre>
// Métodos: mostrar_info() (muestra el nombre, carrera y semestre del estudiante)
//
// Universidad<nombre, estudiantes (lista de objetos de tipo Estudiante)>
// Métodos: agregar_estudiante(estudiante), mostrar_universidad()
//
// Incisos:
// j) Implementa las clases con sus constructores, getters y setters
// k) Crea una universidad y agrega varios estudiantes.
// l) Muestra la información de la universidad y sus estudiantes

import java.util.ArrayList;

public class Universidad {
    private String nombre;
    private ArrayList<Estudiante> estudiantes;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarUniversidad() {
        System.out.println("Universidad: " + nombre);
        for (Estudiante e : estudiantes) {
            e.mostrarInfo();
        }
    }
}


