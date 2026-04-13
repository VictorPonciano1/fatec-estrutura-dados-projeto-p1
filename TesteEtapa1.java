/* CLASSE UTILIZADA PARA O TESTE DA ETAPA 1 */

public class TesteEtapa1 {
    public static void main(String[] args) {

        VetorDinamico vetor = new VetorDinamico(4);
    
        System.out.println("=== INSERINDO ===");

        for (int i = 0; i < 20; i++) {
            Processo p = new Processo("Pessoa " + i, "Servico", 2);
            vetor.adiciona(p);
            System.out.println("Inserido: " + (i + 1) + " | Capacidade: " + vetor.getCapacidade());
        }

        System.out.println("\n=== REMOVENDO ===");

        for (int i = 0; i < 18; i++) {
            vetor.remove();
            System.out.println("Removido | Capacidade: " + vetor.getCapacidade());
        }
    }
}