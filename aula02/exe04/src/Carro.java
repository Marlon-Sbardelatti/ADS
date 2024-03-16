public class Carro {
    private String nome;
    private String marca;

    public Carro(String nome, String marca) {
        setNome(nome);
        setMarca(marca);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.isEmpty() || nome == null){
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if (marca.isEmpty() || marca == null){
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        this.marca = marca;
    }

    public String toString(){
        return "Nome: " + getNome() + " -- Marca: " + getMarca();
    }
}