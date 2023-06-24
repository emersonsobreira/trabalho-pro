public class Cadastro {
    String nome;
    String cpf;
    double telefone;
    String data_entrada;
    String data_saida;
    int reserva_quarto;
    String dataHoraAtual;
     public void imprimir(){
        System.out.println( "nome:" + nome +" cpf: "+ cpf +"telefone"+telefone+" data_entrada: "+ data_entrada+" data de Saida: "
        + data_saida);
    }
    public Object getCPF() {
        return cpf;
    }
}

