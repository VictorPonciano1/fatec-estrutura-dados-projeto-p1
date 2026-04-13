public class VetorDinamico {
    
    private Processo[] v;
    private int capacidade;
    private int ocupacao;

    // CONSTRUTOR
    public VetorDinamico(int capacidadeInicial) {
        ocupacao = 0;
        capacidade = capacidadeInicial;
        v = new Processo[capacidadeInicial];
    }

    // METODO REDIMENSIONA - FUNCIONA TANTO PARA REMOVER QUANTO ADICIONAR
    private void redimensiona(int novaCapacidade) {
        Processo[] temp = new Processo[novaCapacidade];
        for (int i = 0; i < ocupacao; i++)
            temp[i] = v[i];
        v = temp;
        capacidade = novaCapacidade;
    }

    // DUPLICA A CAPACIDADE QUANDO O VETOR ESTIVER 100% CHEIO
    public void adiciona(Processo p) {
        if (ocupacao == capacidade) redimensiona(capacidade * 2);
        v[ocupacao++] = p;
    }

    // REDUZ PELA METADE SE TIVER MENOS DE 25% DA OCUPACAO
    public Processo remove() {
        if (ocupacao == 0) return null;
        Processo aux = v[--ocupacao];
        if (ocupacao < capacidade / 4 && capacidade > 4) redimensiona(capacidade / 2);
        return aux;
    }

    // PEGA A CAPACIDADE
    public int getCapacidade() {
        return capacidade;
    }

    // EXIBE PROCESSOS ARMAZENADOS NUMERADOS
    public void listar() {
        for (int i = 0; i < ocupacao; i++) {
            System.out.println("Processo [" + (i+1) + "]: " + v[i]);
        }
    }

    // BUSCA POR PROTOCOLO - RETORN INDICE DO PROCESSO OU -1 (SEGUINDO A BASE DA "BUSCA LINEAR")
    public int buscaPorProtocolo(int protocolo) {
        for (int i = 0; i < ocupacao; i++) {
            if (v[i].getProtocolo() == protocolo) return i;
        }
        return -1;
    }

    // PEGA A OCUPACAO DO VETOR (NUMERO DE ELEMENTOS)
    public int getOcupacao() {
        return ocupacao;
    }

    // RETORNA O ULTIMO ELEMENTO
    public Processo getUltimo() {
        if (ocupacao == 0) return null;
        return v[ocupacao - 1];
    }

    // METODO UTILIZADO PARA IMPRIMIR NA PILHA PROCESSO
    public Processo get(int i) {
        return v[i];
    }

}
