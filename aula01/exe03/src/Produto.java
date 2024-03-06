//Marlon Sbardelatti
public class Produto {
    private String nome;
    private Double valor;

    public Produto(String nome, Double valor) {
        setNome(nome);
        setValor(valor);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }


    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        if (valor == null || valor < 0){
            throw new IllegalArgumentException("Valor não pode ser nulo ou menor do que zero.");
        }
        this.valor = valor;
    }

    public String toString(){
        return "Nome: " + getNome() + " -- Valor: R$" + getValor();
    }

}
