public class Email {
    private String rotulo; // Ex: casa, trabalho
    private String endereco;

    public Email(String rotulo, String endereco) {
        this.rotulo = rotulo;
        this.endereco = endereco;
    }

    public String getRotulo() {
        return rotulo;
    }

    public String getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return rotulo + ": " + endereco;
    }
}
