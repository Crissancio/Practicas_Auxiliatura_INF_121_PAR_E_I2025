public class AppSiete {
    public static void main(String[] args) {
        Perro p=new Perro("Brokton",3,"cuker");
        Gato g=new Gato("Baguira","negro");
        Pajaro pj=new Pajaro("piolin","desconocido");
        System.out.println(p.mostrar());
        p.hacerSonido();
        p.moverse();
        System.out.println(g.mostrar());
        g.hacerSonido();
        g.moverse();
        System.out.println(pj.mostrar());
        pj.hacerSonido();
        pj.moverse();
        
        
    }
    
}
