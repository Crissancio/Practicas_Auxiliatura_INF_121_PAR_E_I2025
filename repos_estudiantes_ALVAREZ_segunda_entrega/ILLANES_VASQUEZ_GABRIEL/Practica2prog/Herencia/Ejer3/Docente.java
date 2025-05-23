
package Ejercicio3;

class Docente extends Persona {
    private String nit;
    private String profesion;
    private String especialidad;
    private String sexo;

    

    public Docente() {
        this.nit = "xd";
        this.profesion = "docente";
        this.especialidad = "nose";
        this.sexo = "M";
    }

    public Docente(String nit, String profesion, int ci, int celular, int fecha_Nac, String especialidad, String sexo, String nombre, String apellido) {
        super(nombre, apellido, ci, celular, fecha_Nac);
        this.nit = nit;
        this.profesion = profesion;
        this.especialidad = especialidad;
        this.sexo = sexo;
    }

    

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("NIT: " + nit + ", Profesión: " + profesion + ", Especialidad: " + especialidad + ", Sexo: " + sexo);
    }
    
    public void profesion(){
         int Edad= 2025 - getFecha_Nac();
        if(profesion=="Ingeniero" && sexo =="M" && Edad > 18){
            System.out.println("el docente " +getNombre()+ "es ingeniero hombre y mayor de edad" );
        }
    }
    
    
    
    public String getProfesion() {
        return profesion; }
    public String getSexo() { 
        return sexo; }

}
