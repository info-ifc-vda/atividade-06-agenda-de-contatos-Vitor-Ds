import java.util.ArrayList;
import java.util.List;

public class Contato {
    private String nome;
    private List<Telefone> telefones;
    private List<Email> emails;

    public Contato(String nome) {
        this.nome = nome;
        this.telefones = new ArrayList<>();
        this.emails = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void addTelefone(Telefone telefone) {
        telefones.add(telefone);
    }

    public void addEmail(Email email) {
        emails.add(email);
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public List<Email> getEmails() {
        return emails;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome: ").append(nome).append("\n");

        sb.append("Telefones:\n");
        for (Telefone t : telefones) {
            sb.append("  - ").append(t).append("\n");
        }

        sb.append("Emails:\n");
        for (Email e : emails) {
            sb.append("  - ").append(e).append("\n");
        }
        return sb.toString();
    }
}
