import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- AGENDA ---");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Remover contato");
            System.out.println("3. Buscar contato");
            System.out.println("4. Listar todos");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            String opc = sc.nextLine().trim();

            switch (opc) {
                case "1":
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    Contato c = new Contato(nome);

                    System.out.print("Quantos telefones quer adicionar? ");
                    int qtTel = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < qtTel; i++) {
                        System.out.print("Rótulo do telefone (ex: celular): ");
                        String rTel = sc.nextLine();
                        System.out.print("Número: ");
                        String num = sc.nextLine();
                        c.addTelefone(new Telefone(rTel, num));
                    }

                    System.out.print("Quantos emails quer adicionar? ");
                    int qtEmail = Integer.parseInt(sc.nextLine());
                    for (int i = 0; i < qtEmail; i++) {
                        System.out.print("Rótulo do email (ex: trabalho): ");
                        String rE = sc.nextLine();
                        System.out.print("Endereço: ");
                        String end = sc.nextLine();
                        c.addEmail(new Email(rE, end));
                    }

                    agenda.adicionarContato(c);
                    System.out.println("Contato adicionado.");
                    break;

                case "2":
                    System.out.print("Nome do contato a remover: ");
                    String nomeRem = sc.nextLine();
                    boolean removed = agenda.removerContato(nomeRem);
                    System.out.println(removed ? "Removido." : "Contato não encontrado.");
                    break;

                case "3":
                    System.out.print("Nome do contato a buscar: ");
                    String nomeBus = sc.nextLine();
                    Contato encontrado = agenda.buscarContato(nomeBus);
                    if (encontrado != null) {
                        System.out.println(encontrado);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case "4":
                    agenda.listarContatos();
                    break;

                case "0":
                    System.out.println("Saindo...");
                    sc.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
