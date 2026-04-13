public class CentralAtendimento {
    
    // PILHA PRINCIPAL - ATENDIMENTOS PENDENTES
    private PilhaPrioridade pendentes; // AGORA USAM PILHA PRIORIDADE
    // PILHA AUXILIAR - HISTORICO PARA DESFAZER
    private PilhaPrioridade historico; // AGORA USAM PILHA PRIORIDADE

    // CONSTRUTOR PARA INICIALIZAR AS VARIAVEIS
    public CentralAtendimento() {
        pendentes = new PilhaPrioridade(); // AGORA USAM PILHA PRIORIDADE
        historico = new PilhaPrioridade(); // AGORA USAM PILHA PRIORIDADE
    }

    // EMPILHA NA PRINCIPAL E LIMPA NA AUXILIAR
    public void abrirProcesso(Processo p) {
        pendentes.push(p);
        
        while (!historico.estaVazia()) {
            historico.pop();
        }
    }

    // DESEMPILHA DA PILHA PRINCIPAL E REGISTRA O PROCESSO ATENDIDO NA PILHA AUXILIAR
    public Processo atenderProximo() {
        Processo p = pendentes.pop();
        historico.push(p);
        return p;
    }

    // DESEMPILHA DA PILHA AUXILIAR E REEMPILHA NA PILHA PRINCIPAL
    public Processo desfazerUltimoAtendimento() {
        // FAZ A OPERACAO
        Processo p = historico.pop();
        pendentes.push(p);
        return p;
    }

    // EXIBE TODOS OS PROCESSOS AGUARDANDO O ATENDIMENTO
    public void listarPendentes() {
        System.out.println("=== PENDENTES ===");
        // LINHA VAZIA PARA ESPACAMENTO
        System.out.println(" ");
        pendentes.imprimir();
    }

    // EXIBES TODOS OS PROCESSOS JA ATENDIDOS
    public void listarHistorico() {
        System.out.println("=== HISTORICO ===");
        // LINHA VAZIA PARA ESPACAMENTO
        System.out.println(" ");
        historico.imprimir();
    }
}
