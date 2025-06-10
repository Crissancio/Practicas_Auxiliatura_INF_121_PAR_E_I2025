import java.util.Scanner;
public class App {

    public static void main(String[] args) {
        Pila<String> ob1=new Pila<>();
        Scanner sc=new Scanner(System.in);
        
        System.out.println("agrega palabras a la pila");
        for (int i=1;i<=4;i++){
            String cadena=sc.nextLine();
            ob1.adicionar(cadena);
        }
        System.out.println("\nEliminando las palabras de la pila:");
        while (!ob1.esVacia()) {
            String palabraEliminada = ob1.eliminar();
            System.out.println("Eliminado: " + palabraEliminada);
        }

        System.out.println(" La pila esta vacia? " + ob1.esVacia());

 
    }
    
}
