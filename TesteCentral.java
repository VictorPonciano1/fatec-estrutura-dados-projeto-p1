/* TESTE APENAS PARA CONFIRMAR O FUNCIONAMENTO DO CODIGO DA CENTRAL DE ATENDIMENTO */

public class TesteCentral {
    public static void main(String[] args) {
        
        CentralAtendimento central = new CentralAtendimento();

        central.abrirProcesso(new Processo("A", "Servico", 1));
        central.abrirProcesso(new Processo("B", "Servico", 2));
        central.abrirProcesso(new Processo("C", "Servico", 3));

        central.listarPendentes();

        central.atenderProximo();
        central.atenderProximo();

        central.listarPendentes();
        central.listarHistorico();

        central.desfazerUltimoAtendimento();

        central.listarPendentes();
        central.listarHistorico();
    }
}
