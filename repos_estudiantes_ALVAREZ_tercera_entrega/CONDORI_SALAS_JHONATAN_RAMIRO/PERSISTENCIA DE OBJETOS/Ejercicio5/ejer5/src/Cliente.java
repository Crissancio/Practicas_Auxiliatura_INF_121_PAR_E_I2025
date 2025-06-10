import java.io.Serializable;

public class Cliente implements Serializable {
    private String nombre;
    private String banco;
    private double saldo;

    public Cliente(String nombre, String banco, double saldo) {
        this.nombre = nombre;
        this.banco = banco;
        this.saldo = saldo;
    }

    public String getBanco() {
        return banco;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cliente: " + nombre + ", Banco: " + banco + ", Saldo: " + saldo;
    }
}
