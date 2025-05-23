import java.util.ArrayList;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> Personas = new ArrayList<>();
        Estudiante e1=new Estudiante("1247845","luis","Apaza","344546",2001,4546,"54fr8","quinto");
        Estudiante e2=new Estudiante("1247845","luisa","Quispe","344546",1999,4546,"54fr8","tercero");
        Docente d2=new Docente("552563","Carola","Apaza","3354",1970,8788,"Ingeniero","vnervn");
        Docente d1=new Docente("234543","Marcos","Ruiz","485516",1995,55545,"Ingeniero","titular");
        Personas.add(e1);
        Personas.add(e2);
        Personas.add(d1);
        Personas.add(d2);
        System.out.println("__Personas__");
        for (Persona p : Personas) {
            p.Mostrar();
            System.out.println();
        }
        System.out.println("__Esudiantes mayores de 25 años ___");
        for (Persona p : Personas) {
            if (p instanceof Estudiante Estudiante && Estudiante.getFecha_Nac() > 25) {
                Estudiante.Mostrar();
                System.out.println();
            }
        }
        System.out.println ("__----Docente que es ingeniero---__");
        for (Persona p : Personas) {
            if (p instanceof Docente Docente && Docente.getProfesion().equals("Ingeniero")) {
                Docente.Mostrar();
                System.out.println();
            }
        }
        System.out.println("__Estudiantes y docentes del mismo apellido ----");
        for (Persona p1 : Personas) {
            if (p1 instanceof Estudiante Estudiante) {
                for (Persona p2 : Personas) {
                    if (p2 instanceof Docente Docente && Estudiante.getApellido().equals(Docente.getApellido())) {
                        Estudiante.Mostrar();
                        System.out.println();
                        Docente.Mostrar();
                        System.out.println();
                    }
                }
            }
        }
        

    }
    
}
