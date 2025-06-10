public class Aplicacion {
    public static void main(String[] args) {
        Cocinero c = new Cocinero("Juan", 3400, 2, 54.5f);
        Cocinero c1=new Cocinero("LuCas",3400,0,47.5f);
        Mesero m = new Mesero("Jose", 2500, 3, 40, 70);
        Administrativo a = new Administrativo("Ana", 4000.5f, "secretaria");
        
        // Prueba de la sobrecarga Mostrar(int x)
        System.out.println(c.Mostrar()+" sueldo total: "+c.SueldoTotal());
        System.out.println(c1.Mostrar()+" sueldo total: "+c1.SueldoTotal());
        System.out.println(m.Mostrar()+" sueldo total: "+m.SueldoTotal());
        System.out.println(a.Mostrar());
        System.out.println("----------------------------------------------------");
  
        System.out.println(c.Mostrar(3509));
        System.out.println(c1.Mostrar(3000));
        System.out.println(m.Mostrar(2500));
        System.out.println(a.Mostrar(4000.5f));
    }

}
