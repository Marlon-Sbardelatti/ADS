public class Produto {
    private String nome;
    private String segmento;

    public Produto(String nome, String segmento) {
        setNome(nome);
        setSegmento(segmento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty() || nome == null){
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    public String getSegmento() {
        return segmento;
    }

    public void setSegmento(String segmento) {
        if (segmento.isEmpty() || segmento == null){
            throw new IllegalArgumentException("Segmento não pode ser nulo ou vazio");
        }
        this.segmento = segmento;
    }

    public String toString(){
        return "Produto: " + getNome() + " -- Segmento: " + getSegmento();
    }
}
