import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Quartos {
    ArrayList<Cadastro> agenda = new ArrayList<Cadastro>();
    ArrayList<Object> quarto1 = new ArrayList<Object>();
    ArrayList<Object> quarto2 = new ArrayList<Object>();
    ArrayList<Object> quarto3 = new ArrayList<Object>();

    public Quartos() {
        quarto1.add("Numero 1 - Quarto de Solteiro Standard:");
        quarto1.add("Numero 2 - Quarto de Solteiro Master:");

        quarto2.add("numero 3 - Duplo Solteiro Standard:");
        quarto2.add("Numero 4 -Duplo Solteiro Master: ");

        quarto3.add("Numero 5 - Quarto Casal Standard:");
        quarto3.add("Numero 6 - Quarto Casal Master: ");
    }

    public void Dados() {

        Cadastro d = new Cadastro();
        int op = 0;
        do {
            d.reserva_quarto = new Leia().msgInt("Digite o número do quarto!!");

            if (d.reserva_quarto == 1) {
                System.out.println("Quarto Disponível");
                quarto1.remove(0);

            } else if (d.reserva_quarto == 2) {
                System.out.println("Quarto Disponível");
                quarto1.remove(1);
            } else if (d.reserva_quarto == 3) {
                System.out.println("Quarto Disponível");
                quarto2.remove(0);
            } else if (d.reserva_quarto == 4) {
                System.out.println("Quarto Disponível");
                quarto2.remove(1);
            } else if (d.reserva_quarto == 5) {
                System.out.println("Quarto Disponível");
                quarto3.remove(0);
            } else if (d.reserva_quarto == 6) {
                System.out.println("Quarto Disponível");
                quarto3.remove(1);
            } else {
                System.out.println("Numero do quarto digitado não encontrado!");
                break;

            }

            d.cpf = new Leia().msgString("Digite seu CPF");

            d.nome = new Leia().msgString("Nome Completo");
            d.telefone = new Leia().msgInt("Digite seu Telefone");
            d.data_entrada = new Leia().msgString("Data de entrada");
            d.data_saida = new Leia().msgString("Data de saida");
            agenda.add(d);
            DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            String DataHora = LocalDateTime.now().format(data);
            System.out.println("Reserva Realizada: " + DataHora);
            break;

        } while (op != 1 || op != 2 || op != 3 || op != 4);
    }

    public void listar() {
        for (int i = 0; i < agenda.size(); i++) {
            Cadastro c = agenda.get(i);
            System.out.println("Nome: " + c.nome + "\nCpf: " + c.cpf + "\nTelefone: " + c.telefone + "\nData entrada: "
                    + c.data_entrada + "\nData Saida: " + c.data_saida);

        }
    }

    public void excluir() {
        String in = new Leia().msgString("Digite o cpf do responsável pela reserva!");
        for (int i = 0; i < agenda.size(); i++) {
            if (agenda.get(i).getCPF().equals(in)) {
                agenda.remove(i);
                i--;
                System.out.println("Excluido com sucesso!");
            } else {
                System.out.println("Cadastro não encontrado!");
            }

        }
    }

    public void listar_quartos() {

        for (Object b : quarto1) {
            System.out.println("\n" + b);
            System.out.println("==========================================");
        }
        for (Object o : quarto2) {
            System.out.println("\n" + o);
            System.out.println("==========================================");
        }
        for (Object j : quarto3) {
            System.out.println("\n" + j);
            System.out.println("==========================================");

        }

    }

}
