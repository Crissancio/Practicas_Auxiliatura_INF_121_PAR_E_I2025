
package celular;
public class Celular {
    private long arreglo[];
    private int numapli;
    private int espatomb;
    private int Mb;
    public Celular (int espatomb){
        this .numapli=0;
        this.espatomb=espatomb;
        arreglo=new long[espatomb+1];
    }
    // se debe agregar informacion de una aplicacion(nombre y espacio)
    public void agrega(){
        this.numapli=this.numapli+1;
        arreglo[this.numapli]=espatomb;
        System.out.println( +espatomb);
    }
    public void  utilizar(int bateria,int Mb,int tiempo){
        System.out.println("la bateraia anteriorme era:"+bateria);
       double consumoPor10Min = 0; 
        if (Mb>250){
             consumoPor10Min =((bateria*95)/100);
             
        }  
        else{
            if(Mb>=100 || Mb<=250){
                 consumoPor10Min =((bateria*98)/100);
               
            }
            else{
                if(Mb<100){
                    consumoPor10Min=((bateria*99)/100);                    
                }
            }
        }
        double consumoTotal = (tiempo / 10.0) * consumoPor10Min;
        if (bateria < consumoTotal) {
            System.out.println("Celular apagado " );
        } else {
            bateria -= consumoTotal;
            System.out.println("Usando  por " + tiempo + " minutos. Consumo: " + consumoTotal + "%. Batería restante: " + bateria + "%");
        }
    
         System.out.println( "la bat es: "+bateria);
         System.out.println( "la mb total ocupado: "+Mb);
    }
    public static void main(String[] args) {
        Celular aplicacion=new Celular(20);
        aplicacion.agrega();
        aplicacion.utilizar(10,300,30);
        aplicacion.utilizar(10,50,10);
    }
    }
    
    

       
    
    

