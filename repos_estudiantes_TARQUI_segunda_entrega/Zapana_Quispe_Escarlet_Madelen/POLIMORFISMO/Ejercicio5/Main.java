public class AppUni {
    public static void main(String[] args) {
        Oficina o1=new Oficina(15,12,4);
        Oficina o2=new Oficina(20,11,3);
        Aula a1=new Aula("LAb3_a1",50,40);
        Aula a2=new Aula("SS-A2",100,80);
        Laboratorio l1=new Laboratorio("LAb_3",50,40,45);
        System.out.println(o1.mostrar());
        System.out.println(o2.mostrar());
        System.out.println(a1.mostrar());
        System.out.println(a2.mostrar());
        System.out.println(l1.mostrar());
        System.out.println("la cantidad de muebles en la oficina 1 es de "+o1.cantidadMuebles());
        System.out.println("la cantidad de muebles en la oficina 2 es de "+o2.cantidadMuebles());
        System.out.println("la cantidad de muebles en el Aula es de "+a1.cantidadMuebles());
        System.out.println("la cantidad de muebles en en LAboratorio es de "+l1.cantidadMuebles());
    }
    
}
