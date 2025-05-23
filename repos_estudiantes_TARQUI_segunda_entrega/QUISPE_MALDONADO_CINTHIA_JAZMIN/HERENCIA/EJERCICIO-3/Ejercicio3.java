/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author CINTHIA
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e1=new Estudiante(123,"Ana","Quispe",1111,"12-05-1999",3691,"06-01-2020",4);
        Estudiante e2=new Estudiante(456,"Juan","Rojas",2222,"26-10-2003",2645,"15-06-2022",2);
        Estudiante e3 = new Estudiante(789, "Sofia", "Rios", 1333, "10-09-1996", 3264, "01-08-2023", 3);
        
        Docente d1=new Docente(789,"Pedro","Sanches",3333,"30-06-2002",0265,"Ingeniero","Mecanica","M");
        Docente d2=new Docente(951,"Fernanda","Lopez",4444,"16-12-1993",05457,"Salud","Enfermeria","F");
        Docente d3=new Docente(167,"Sebastian","Rojas",2644,"06-03-1998",2546,"Ingeniero","Automotris","M");
        
        e1.mostrar();
        e2.mostrar();
        d1.mostrar();
        d2.mostrar();
        Estudiante[] estudiantes={e1,e2,e3};
        mostrarMay(estudiantes);
        Docente[] docentes={d1,d2,d3};
        masDoc(docentes,"Ingeniero");
        mostrarApe(estudiantes,docentes);
    }
    public static void mostrarMay(Estudiante[] estudiantes){
        System.out.println("*Estudiantes mayores de 25 años. ");
        for(int i=0;i<estudiantes.length;i++){
            if(estudiantes[i].edad()>25){
                estudiantes[i].mostrar();
            }
        }
    }
    public static void masDoc(Docente[] docentes,String X){
        System.out.println("*Docente que tiene la profesión de "+X);
        int n=-1;
        for(int i=0;i<docentes.length;i++){
            if(docentes[i].getProfesion()==X && docentes[i].getSexo().equals("M")){
                if(n==-1||docentes[i].edad()>docentes[n].edad()){
                    n=i;
                }
            }
                
        }
        if(n!=-1){
            docentes[n].mostrar();
        }
    }
    public static void mostrarApe(Estudiante[] estudiantes,Docente[] docentes){
        System.out.println("*Estudiantes y docentes que tienen el mismo apellido.");
        for(int i=0;i<estudiantes.length;i++){
            for(int j=0;j<docentes.length;j++){
                if(estudiantes[i].getApellido().equals(docentes[j].getApellido())){
                    estudiantes[i].mostrar();
                    docentes[j].mostrar();
                }
            }
        }
    }
    
}
