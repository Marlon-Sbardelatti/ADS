public class Vetor {
    private Produto[] produtos;

    public Vetor() {
//        this.produtos = new Produto[0];
        setProdutos(new Produto[0]);
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public void cadastrar(Produto produto) {
        int tamanho = getProdutos().length;
        tamanho += 1;

        Produto[] vetorTemp = new Produto[tamanho];

        for (int i = 0; i < getProdutos().length; i++) {
            vetorTemp[i] = getProdutos()[i];
        }

        vetorTemp[tamanho - 1] = produto;

        setProdutos(vetorTemp);
    }

    public String listar() {
        String dados = "";
        for (Produto p : getProdutos()) {
            dados += p.toString() + '\n';
        }

        return dados;
    }

    public String pesquisa(String termo) {
        String dados = "Produtos com o termo: " + termo + '\n';

        for (Produto p : getProdutos()) {
            if (p.getNome().toLowerCase().contains(termo.toLowerCase())) {
                dados += p.toString() + '\n';
            }
        }

        return dados;
    }

    public boolean alterar(String nomeAntigo, String novoNome, double novoValor) {
        for (Produto p : getProdutos()) {
            if (p.getNome().equalsIgnoreCase(nomeAntigo)) {
                p.setNome(novoNome);
                p.setValor(novoValor);
                return true;
            }
        }
        return false;
    }

    public boolean deletar(String nome) {
        int idx = 0;
        boolean found = false;
        for (int i = 0; i < getProdutos().length; i++) {
            if (getProdutos()[i].getNome().equalsIgnoreCase(nome)) {
                idx = i;
                found = true;
            }
        }

        if (found) {
            Produto[] vetorTemp = new Produto[getProdutos().length - 1];
            int count = 0;
            for (int i = 0; i < getProdutos().length; i++) {
                if (i != idx){
                   vetorTemp[count] = getProdutos()[i];
                   count++;
                }
            }
            setProdutos(vetorTemp);
            return true;
        }

        return false;
    }
}
