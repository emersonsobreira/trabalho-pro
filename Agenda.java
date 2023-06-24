
import java.util.Scanner;

class Agenda {

    Scanner scanner = new Scanner(System.in);

    public void menu() {
        Quartos q = new Quartos();
        int op = 0;
        do {
            System.out.println(
                    "---------------------------------------- Reserva Online ----------------------------------------");
            System.out.println(
                    "1-quartos disponíveis 2- reservar quarto 3-Listar Reservas  4- excluir reserva  0 - sair");
            op = scanner.nextInt();
            if (op == 1) {
                q.listar_quartos();

            } else if (op == 2) {
                q.Dados();
            } else if (op == 3) {
                q.listar();
            } else if (op == 4) {
                q.excluir();
            } else if (op == 0) {
                break;
            }
        } while (op != 2 || op != 3 || op == 0);

    }
}
