// NOMBRE: QUENTA MAMANI NICK RANDY
//CI: 10037571

//6. Para el comportamiento de los atributos de un Auto se tiene en cuenta la
//siguiente clase:
//
//a) Sobrecargar el constructor 2 veces
//b) Instanciar 2 objetos Auto, usando los diferentes constructores.
//c) Sobrecargar el operador ++ para tener un nuevo auto.
//d) Sobrecargar el operador -- para mostrar los atributos de los dos objetos

public class Auto {
    private String modelo;
    private String placa;
    private String color;

    public Auto() {
        this.modelo = "Desconocido";
        this.placa = "Sin placa";
        this.color = "color basico azul, negro";
    }

    public Auto(String modelo, String placa) {
        this.modelo = modelo;
        this.placa = placa;
        this.color = "color basico azul, negro";
    }

    public Auto(String modelo, String placa, String color) {
        this.modelo = modelo;
        this.placa = placa;
        this.color = color;
    }

    public void mostrar() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Color: " + color);
    }

    public Auto incrementar() {
        return new Auto("Nuevo Modelo", "Nueva Placa", "Nuevo Color");
    }

    public void decrementar(Auto auto1, Auto auto2) {
        System.out.println("Auto 1:");
        auto1.mostrar();
        System.out.println("Auto 2:");
        auto2.mostrar();
    }

    public static void main(String[] args) {
        Auto auto1 = new Auto("Mustang GT", "ABC123");
        Auto auto2 = new Auto("Honda Sivic", "XYZ789", "Rojo");

        System.out.println("Atributos iniciales de los autos:");
        auto1.mostrar();
        auto2.mostrar();

        System.out.println("Creando un nuevo auto con :");
        Auto nuevoAuto = auto1.incrementar();
        nuevoAuto.mostrar();

        System.out.println("Mostrando atributos de los autos con :");
        auto1.decrementar(auto1, auto2);
    }
}
