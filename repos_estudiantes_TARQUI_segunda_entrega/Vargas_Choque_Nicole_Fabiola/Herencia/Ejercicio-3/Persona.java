import java.util.*;

public class Persona {
    protected String ci, celular;
    protected int edad;
    protected String nombre, fechaNac, apellido, sexo;
    
    public Persona(String ci, String n, String a, int e, String ce, String f , String s)
    {
        this.ci=ci;
        this.nombre=n;
        this.apellido=a;
        this.celular=ce;
        this.sexo=s;
        this.edad=e;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public void mostrar()
    {
        System.out.println("CI: "+ci+" "+"Nombre: "+nombre+" "+"Apellido: "+apellido);
        System.out.println("Celular: "+celular+" "+"Fecha Nacimiento: "+fechaNac+" "+"Edad: "+edad);
    }
}

class Estudiante extends Persona{
    private int semestre;
    private String fechaIngreso, ru;
    
    public Estudiante(String ci, String n, String a, int e, String ce, String s, String f, String r, String fe, int se)
    {
        super(ci, n, a, e, ce, f, s);
        this.ru=r;
        this.fechaIngreso=f;
        this.semestre=se;
    }

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String getCi() {
        return ci;
    }

    @Override
    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public String getCelular() {
        return celular;
    }

    @Override
    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Override
    public void mostrar()
    {
        super.mostrar();
        System.out.println("RU: "+ru+" "+"Fecha Ingreso: "+fechaIngreso);
        System.out.println("Semestre: "+semestre);
    }
}

class Docente extends Persona{
    private  String nit;
    private String profesion, especialidad;
    
    public Docente(String ci, String n, String a, int e, String ce, String s, String f,  String ni, String p, String es)
    {
        super(ci, n, a, e, ce, f, s);
        this.nit=ni;
        this.profesion=p;
        this.especialidad=es;
        this.sexo=s;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String getCi() {
        return ci;
    }

    @Override
    public void setCi(String ci) {
        this.ci = ci;
    }

    @Override
    public String getCelular() {
        return celular;
    }

    @Override
    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    @Override
    public void mostrar()
    {
        super.mostrar();
        System.out.println("Nit: "+nit+" "+"Profesion: "+profesion+" "+"Especialidad: "+especialidad);
    }
}

class App {
    public static void main(String[] args) {
        
        ArrayList<Docente> docentes = new ArrayList<>();
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        estudiantes.add(new Estudiante("9896714", "Nicole", "Vargas", 21, "73072096", "Femenino", "30/01/2004", "1837951", "14/23/2022", 4));
        estudiantes.add(new Estudiante("9896718", "Rai David", "Vargas", 19, "73591756", "Masculino", "22/11/2006", "1937747", "35/07/2023", 1));
        estudiantes.add(new Estudiante("4747080", "Pablo", "Vargas", 35, "73096512", "Masculino", "23/04/1999", "133253", "22/07/2000", 8));

        docentes.add(new Docente("1243543", "Neyzer", "Sandoval", 45, "72094332", "Masculino", "12/12/1953", "4747080", "Doctor", "Dermatologia"));        
        docentes.add(new Docente("1843576", "Luisa", "Morales", 54, "18231889", "Femenino", "13/02/1978", "9896714", "Licenciada en Informatica", "Redes"));
        docentes.add(new Docente("1575369", "Maria", "Zeballos", 34, "77771451", "Femenino", "23/10/1995", "9896718", "Arquitecta", "Construccion"));
        
        System.out.println("Estudiantes mayores de 25 anos:");
        for (Estudiante e : estudiantes) {
            if (e.edad > 25) {
                e.mostrar();
                System.out.println();
            }
        }

        Docente mayor = null;
        for (Docente d : docentes) {
            if (d.sexo.equals("Masculino") && d.getProfesion().equals("Doctor")) {
                if (mayor == null || d.edad > mayor.edad) {
                    mayor = d;
                }
            }
        }
        if (mayor != null) {
            System.out.println("Docente masculino, doctor y mayor:");
            mayor.mostrar();
            System.out.println();
        }

        System.out.println("Estudiantes y docentes con el mismo apellido:");
        for (Estudiante e : estudiantes) {
            for (Docente d : docentes) {
                if (e.apellido.equals(d.apellido)) {
                    System.out.println("Apellido: " + e.apellido);
                    e.mostrar();
                    d.mostrar();
                    System.out.println();
                }
            }
        }
    }
}