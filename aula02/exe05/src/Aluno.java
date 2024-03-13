public class Aluno {
    private String name;
    private int idade;

    public Aluno(String name, int idade) {
        setName(name);
        setIdade(idade);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0){
            throw new IllegalArgumentException("Idade não pode ser menor ou igual a zero.");
        }
        this.idade = idade;
    }
    public String toString(){
        return "Nome: " + getName() + " -- Idade: " + getIdade();
    }
}

