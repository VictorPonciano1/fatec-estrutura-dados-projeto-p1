public class PilhaPrioridade {
    
    /* TENTEI FAZER O CODIGO COLOCANDO OS NUMEROS NO LUGAR DOS NOMES POREM NAO DEU CERTO */

    // PRIORIDADE 1
    private PilhaProcesso baixa;
    // PRIORIDADE 2
    private PilhaProcesso normal;
    // PRIORIDADE 3 
    private PilhaProcesso urgente;

    public PilhaPrioridade() {
        baixa = new PilhaProcesso();
        normal = new PilhaProcesso();
        urgente = new PilhaProcesso();
    }

    /* A FINS DE TESTE DE LOGICA FORAM TESTADOS METODOS DE VERIFICACAO DIFERENTES - SWITCH E IF/ELSE */

    // PUSH - DIRECIONA O PROCESSO PARA A PILHA CORRETA CONFORME `p.getPrioridade()`
    public void push(Processo p) {
        switch (p.getPrioridade()) {
            case 3:
                urgente.push(p);
                break;
            case 2:
                normal.push(p);
                break;
            case 1:
                baixa.push(p);
                break;
            default:
                System.out.println("Digite um nivel de prioridade valido!");
                break;
        }
    }

    // POP - RETIRA DA PILHA DE MAIOR PRIORIDADE NAO VAZIA (URGENTE > NORMAL > BAIXA)
    public Processo pop() {
        if(!urgente.estaVazia()) {
            return urgente.pop();
        } else if (!normal.estaVazia()) {
            return normal.pop();
        } else {
            return baixa.pop();
        }
    }

    // PEEK - MESMA LOGICA DO POP POREM SEM REMOVER
    public Processo peek() {
        if(!urgente.estaVazia()) {
            return urgente.peek();
        } else if (!normal.estaVazia()) {
            return normal.peek();
        } else {
            return baixa.peek();
        }
    }
    
    // TAMANHO - SOMA O TAMANHO DAS 3 PILHAS
    public int tamanho() {
        return urgente.tamanho() + normal.tamanho() + baixa.tamanho();
    }

    // LISTAR - EXIBE OS PROCESSOS AGRUPADOS POR PRIORIDADE (URGENTES > NORMAL > BAIXA)
    public void listar() {
        System.out.println("=== PRIORIDADE URGENTE ===");
        urgente.imprimir();

        System.out.println("=== PRIORIDADE NORMAL ===");
        normal.imprimir();

        System.out.println("=== PRIORIDADE BAIXA ===");
        baixa.imprimir();

        // LINHA VAZIA PARA ESPACAMENTO
        System.out.println(" ");
    }

    /* METODOS PARA IMITAR A PILHA PROCESSO PARA EVITAR ERROS */

    // SE A PILHA ESTA VAZIA
    public boolean estaVazia() {
        return tamanho() == 0;
    }

    // PARA IMPRIMIR
    public void imprimir() {
        listar();
    }

}
