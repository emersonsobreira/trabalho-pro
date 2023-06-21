
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import java.util.Scanner;

class Agenda {
    ArrayList<Cadastro> agenda = new ArrayList<Cadastro>();
    ArrayList<Object> quarto1 = new ArrayList<Object>();
    ArrayList<Object> quarto2 = new ArrayList<Object>();
    ArrayList<Object> quarto3 = new ArrayList<Object>();
    Scanner scanner = new Scanner(System.in);
    
    public void Dados() {
        Cadastro d = new Cadastro();
        d.reserva_quarto = new Leia().msgInt("Digite o número do quarto que deseja");
        d.nome = new Leia().msgString("Nome Completo");
        d.cpf = new Leia().msgString("Digite seu CPF");
        d.telefone = new Leia().msgInt("Digite seu Telefone");
        d.data_entrada = new Leia().msgString("Data de entrada");
        d.data_saida = new Leia().msgString("Data de saida");
        agenda.add(d);
        DateTimeFormatter data = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String DataHora = LocalDateTime.now().format(data);
        System.out.println("Reserva Realizada: " + DataHora);

    }

    public void reserva() {
        Object j = new Object();
        System.out.println("-------------------------------------Quartos Disponíveis-------------------------------------");
        quarto1.add("Quarto de Solteiro Standard: " + "Disponivel " + (4));
        quarto1.add("Quarto de Solteiro Master: " + "Disponivel " + (7));
        quarto1.add("Quarto de Solteiro Deluxe: " + "Disponivel " + (5));

        quarto2.add("Duplo Solteiro Standard: " + "Disponivel " + (8));
        quarto2.add("Duplo Solteiro Master: " + "Disponivel " + (3));
        quarto2.add("Duplo Solteiro Deluxe: " + "Disponivel " + (2));
        
        quarto3.add("Quarto Casal Standard: " + "Disponivel " + (4));
        quarto3.add("Quarto Casal Master: " + "Disponivel " + (6));
        quarto3.add("Quarto Casal Standard: " + "Disponivel " + (7));
    

    

    
        for (int i = 0; i < quarto1.size(); i++) {
            Object o = quarto1.get(i);
            System.out.println(o);
        
        }
    }

            

        
    

    public void listar() {
        for (int i = 0; i < agenda.size(); i++) {
            Cadastro c = agenda.get(i);
            System.out.println("Nome: " + c.nome + "\nCpf: " + c.cpf + "\nTelefone: " + c.telefone + "\nData entrada: "
                    + c.data_entrada + "\nData Saida: " + c.data_saida);
                    System.out.printf("índice %d \n",i,agenda.get(i));
        }
    }
    public void excluir(){
        System.out.println("Digite o índice que deseja excluir");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < agenda.size()) {
            agenda.remove(indice);
            System.out.println("Excluido com sucesso!!");
        } else {
            System.out.println("Este índice não existe");
        }

    }

    public void menu() {
        int op = 0;
        do {
            System.out.println(
                    "---------------------------------------- Reserva Online ----------------------------------------");
            System.out.println(
                    "1-quartos disponíveis 2- reservar quarto 3-Listar Reservas  4- excluir reserva  0 - sair");
            op = scanner.nextInt();
            if (op == 1) {
                reserva();
            } else if (op == 2) {
                Dados();
            } else if (op == 3) {
                listar();
            } else if (op == 4) {
                excluir();
            } else if (op == 0) {
                break;
            }
        } while (op != 2 || op != 3 || op == 0);

    }
}

