
package Ejercicio3;

public class Estudiante extends Persona {
    private int ru, fecha_ingreso, semestre;

    public Estudiante() {
        this.ru = 1213;
        this.fecha_ingreso = 2025;
        this.semestre = 6;
    }

    public Estudiante(String nombre, String apellido, int ru, int fecha_ingreso, int semestre, int ci, int celular, int fecha_Nac) {
        super(nombre, apellido, ci, celular, fecha_Nac);
        this.ru = ru;
        this.fecha_ingreso = fecha_ingreso;
        this.semestre = semestre;
    }

   
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("ru:" +ru+ "\n semestre: " +semestre+ "\n fecha de ingreso: " +fecha_ingreso);
    }
    public void mayor(){
        int Edad= 2025 - getFecha_Nac();

        if(Edad > 25){
            System.out.println("el estudoante : " +getNombre()+ "tiene mas de 25");
        }
    }
    
    
    public int getRu() {
        return ru;
    }

    public void setRu(int ru) {
        this.ru = ru;
    }

    public int getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(int fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    
    
    
   
    
}
