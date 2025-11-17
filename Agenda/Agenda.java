import java.util.ArrayList;
import java.util.List;

public class Agenda {
    private List<Contato> contatos;

    public Agenda() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato contato) {
        contatos.add(contato);
    }

    public boolean removerContato(String nome) {
        return contatos.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
    }

    public Contato buscarContato(String nome) {
        for (Contato c : contatos) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public void listarContatos() {
        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia!");
            return;
        }
        for (Contato c : contatos) {
            System.out.println("---------------------");
            System.out.println(c);
        }
    }
}
