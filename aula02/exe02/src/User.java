public class User {
    private String nome;
    private int id;

    public User(String nome, int id) {
        setNome(nome);
        setId(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome não pode ser vazio ou nulo.");
        }
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0){
            throw new IllegalArgumentException("Id não pode ser menor que zero.");
        }
        this.id = id;
    }

    public String toString(){
        return "ID: " + getId() +  " -- Nome: " + getNome();
    }
}
