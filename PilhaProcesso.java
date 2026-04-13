public class PilhaProcesso {
    
    // INSTANCIA INTERNA DO "VETOR DINAMICO"
    private VetorDinamico vetor;
    public PilhaProcesso() {
        vetor = new VetorDinamico(4);
    }

    // INSERE NO TOPO (EMPILHA)
    public void push(Processo p) {
        vetor.adiciona(p);
    }

    // REMOVE DO TOPO (DESEMPILHA)
    public Processo pop() {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }
        Processo p = vetor.remove();
        return p;
    }

    // RETORNA O ELEMENTO DO TOPO SEM REMOVE-LO
    public Processo peek() {
        if (estaVazia()) {
            throw new PilhaVaziaException();
        }
        return vetor.getUltimo();
    }

   // EXIBE OS ELEMENTOS DO TOPO PARA A BASE
   public void imprimir() {
    for (int i = vetor.getOcupacao() - 1; i >= 0; i--) {
        System.out.println(vetor.get(i));
    }
   }

   // VERIFICACAO CASO A PILHA ESTEJA VAZIA - PILHA VAZIA != VETOR VAZIO
   public boolean estaVazia() {
    return vetor.getOcupacao() == 0;
   }

   // TAMANHO - SERA USADO NA PILHA PRIORIDADE - PEGA O TAMANHO COM BASE NA OCUPACAO
   public int tamanho() {
    return vetor.getOcupacao();
   }
}
