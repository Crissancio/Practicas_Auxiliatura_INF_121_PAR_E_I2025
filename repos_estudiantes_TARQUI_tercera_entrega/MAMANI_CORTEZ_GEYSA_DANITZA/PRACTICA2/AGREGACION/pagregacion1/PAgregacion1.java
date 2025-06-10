/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagregacion1;

/**
 *
 * @author Administrador
 */
public class PAgregacion1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        // b) Crear estudiantes 
        Estudiante e1   = new Estudiante("Sofia",   "Ingeniería", "1er Semestre");
        Estudiante e2 = new Estudiante("Teodoro",   "Informatica",    "4to semestre");
        Estudiante e3 = new Estudiante("Charles", "Linguistica",   "5to Semestre");

        // Crear una universidad y agregar estudiantes
        Universidad u = new Universidad("Universidad Mayor de San Simon");

        u.agregarEstudiante(e1);
        u.agregarEstudiante(e2);
        u.agregarEstudiante(e3);

        // c) Mostrar información
        u.mostrarInfo();
       
    }
    
    
}
