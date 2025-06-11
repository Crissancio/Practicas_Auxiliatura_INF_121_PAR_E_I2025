/*

--------------------ENUNCIADO-----------------------
 * 5. Se hace referencia a algunos de los diferentes ambientes de la Universidad
mediante las siguientes clases:

a) Instanciar 2 objetos Oficina, 2 Aulas y 1 Laboratorio
b) Crear un método mostrar() para mostrar los datos de cada objeto
c) Sobrecargar el método cantidadMuebles(), para conocer el número total de
muebles dentro de cada ambiente
 * 
 * 
 */
public class Main{
    public static void main(String[] args){
        //A
        Oficina oficina1 = new Oficina(6, 1, 3);
        Oficina oficina2 = new Oficina(7, 9, 9);
        Aula aula1 = new Aula("Aula 121", 30, 20);
        Aula aula2 = new Aula("Aula 333", 10, 10);
        Laboratorio laboratorio = new Laboratorio("Laboratorio", 20, 20, 20);

        System.out.println("Datos");
        oficina1.mostrar();
        System.out.println("Cantidad muebles: " + oficina1.cantidadMuebles());

        oficina2.mostrar();
        System.out.println("Cantidad muebles: " + oficina2.cantidadMuebles());
        System.out.println("--------------------------");

        aula1.mostrar();
        System.out.println("Cantidad muebles: " + aula1.cantidadMuebles());

        aula2.mostrar();
        System.out.println("Cantidad muebles: " + aula2.cantidadMuebles());
        System.out.println("--------------------------");

        laboratorio.mostrar();
        System.out.println("Cantidad muebles: " + laboratorio.cantidadMuebles());
    }
}