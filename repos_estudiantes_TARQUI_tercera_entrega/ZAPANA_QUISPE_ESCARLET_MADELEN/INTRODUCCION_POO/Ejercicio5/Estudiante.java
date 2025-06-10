public class Estudiante {
    public String nombre;
    public int nota_1;
    public int nota_2;
    public Estudiante(String nombre,int nota_1,int nota_2){
        this.nombre=nombre;
        this.nota_1=nota_1;
        this.nota_2=nota_2;
    }
    public void Promedio(){
        int p=this.nota_1+this.nota_2/2;
        System.out.println("el estudiante  "+this.nombre+"  tiene un promedio de "+p);
    }
    public void Aprobo(){
        if(this.nota_1+this.nota_2/2 >=6){
            System.out.println("el estudiante  "+this.nombre+" Aprobo " );
            
        }
        else{
            System.out.println("el estudiante "+this.nombre+" Reprobo");
        }
    }
    
    public static void main(String[] args) {
        Estudiante e1=new Estudiante("ana",4,6);
        Estudiante e2=new Estudiante ("Lucas",3,5);
        Estudiante e3=new Estudiante ("Maria ",8,6);
        e1.Promedio();
        e1.Aprobo();
        e2.Promedio();
        e2.Aprobo();
        e3.Promedio();
        e3.Aprobo();
    }
    
}
