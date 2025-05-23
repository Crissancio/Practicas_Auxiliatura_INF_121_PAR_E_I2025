class Persona {
    private String nombre;
    private int edad;
    private String ciudad;

    public Persona(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
    }

    public void saludo() {
        System.out.println("Hola, soy " + nombre + " de " + ciudad);
    }

    public void isAdult() {
        boolean salida = this.edad >= 18;

        if (salida) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }

    }
}