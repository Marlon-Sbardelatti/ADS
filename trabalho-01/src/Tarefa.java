public class Tarefa {
    private String nome;
    private String dificuldade;

    public Tarefa(String nome, String dificuldade) {
        setNome(nome);
        setDificuldade(dificuldade);
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

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        if (dificuldade == null || dificuldade.isEmpty()){
            throw new IllegalArgumentException("Dificuldade não pode ser nulo ou vazio.");
        }
        this.dificuldade = dificuldade;
    }

    public String toString(){
        return "Nome: " + getNome() + " -- Dificuldade: " + getDificuldade();
    }
}
