/* TESTE PARA A CLASSE PROCESSO */

public class TesteProcesso {
    
    public static void main(String[] args) {

        Processo p1 = new Processo("Victor", "Financeiro", 3);
        // FELIPE EH O NOME DO MEU IRMAO GEMEO, EH UMA HOMENAGEM
        Processo p2 = new Processo("Felipe", "Saude", 1);

        System.out.println(p1);
        System.out.println(p2);
    }
}
