public class Telefone {
    private String rotulo; // Ex: celular, fixo, trabalho
    private String numero;

    public Telefone(String rotulo, String numero) {
        this.rotulo = rotulo;
        this.numero = numero;
    }

    public String getRotulo() {
        return rotulo;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return rotulo + ": " + numero;
    }
}
