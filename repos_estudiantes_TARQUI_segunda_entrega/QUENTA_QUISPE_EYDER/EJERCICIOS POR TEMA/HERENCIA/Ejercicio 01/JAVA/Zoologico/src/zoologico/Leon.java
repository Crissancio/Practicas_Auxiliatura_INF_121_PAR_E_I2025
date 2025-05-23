public class Leon extends Animal {
    private String territorio;

    public Leon(String nombre, int edad, String territorio) {
        super(nombre, edad);
        this.territorio = territorio;
    }

    @Override
    public String emitirSonido() {
        return nombre + " ruge fuerte desde " + territorio;
    }
}
