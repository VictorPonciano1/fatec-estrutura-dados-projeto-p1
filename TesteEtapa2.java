/* CODIGO PARA O TESTE FINAL DA ETAPA 2 */

import java.util.Scanner;

public class TesteEtapa2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        CentralAtendimento central = new CentralAtendimento();

        int opcao = -1;

        while (opcao != 0) {

            System.out.println("""
                === MENU ===
                1- ABRIR PROCESSO
                2- ATENDER PROXIMO
                3- DESFAZER ULTIMO ATENDIMENTO                    
                4- LISTAR PENDENTES
                5- LISTAR HISTORICO
                0- SAIR
                """);

            opcao = scanner.nextInt();
            scanner.nextLine(); // LIMPA O ENTER

            switch (opcao) {
                case 1:
                    System.out.print("\nNome: ");
                    String nome = scanner.nextLine();
                
                    System.out.print("\nTipo de servico: ");
                    String tipo = scanner.nextLine();

                    System.out.print("\nPrioridade (1- Baixa / 2- Normal / 3- Urgente): ");
                    int prioridade = scanner.nextInt();
                    scanner.nextLine(); // LIMPA O ENTER

                    Processo p = new Processo(nome, tipo, prioridade);

                    System.out.print("\nData e Hora (formato: dd/MM/yyyy HH:mm):  ");
                    p.setDataHora(scanner.nextLine());

                    central.abrirProcesso(p);
                    System.out.println("=== PROCESSO ABERTO ===");
                    break;
                case 2:
                    try {
                    Processo atendido = central.atenderProximo();
                    System.out.println("Processo atendido: " + atendido);
                    } catch (PilhaVaziaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                    Processo desfeito = central.desfazerUltimoAtendimento();
                    System.out.println("Processo desfeito: " + desfeito);
                    } catch (PilhaVaziaException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    central.listarPendentes();
                    break;
                case 5:
                    central.listarHistorico();
                    break;
                case 0:
                    System.out.println("=== ENCERRANDO PROGRAMA ===");
                    break;
                default:
                    System.out.println("\n=== OPCAO INVALIDA ===");
            }

        }

        scanner.close();
    }
}
