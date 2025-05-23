
package Ejercicio1;

public class Moto extends Vehiculo {
    private String cilindrada;
    private String tipo_motor;

    public Moto(String marca, String modelo, int año, int precio_base, String cilindrada, String tipo_motor) {
        super(marca, modelo, año, precio_base);
        this.cilindrada=cilindrada;
        this.tipo_motor=tipo_motor;
    }
    
    
    public void mostrar_info(){
        super.mostra_info();
        System.out.println("cilindrada: " +cilindrada+ "\n tipo_motor: " +tipo_motor);
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipo_motor() {
        return tipo_motor;
    }

    public void setTipo_motor(String tipo_motor) {
        this.tipo_motor = tipo_motor;
    }
    
    public void mostrarActual(){
        if(getAño() >= 2025){
            System.out.println("el auto: " +getModelo()+ "es mas actual" );
        }
    }
}
