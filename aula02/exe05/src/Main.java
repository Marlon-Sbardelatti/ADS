import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner kb = new Scanner(System.in);
        Map<String, Aluno> alunos = new HashMap<String, Aluno>();

        System.out.println("(1) - Cadastrar\n(2) - Listar\n(3) - Alterar\n(4) - Remover\n(5) - Verificar idade\n(6) - Finalizar\n");
        int res = kb.nextInt();

        while (res != 6) {
            switch (res) {
                case 1:
                    cadastrar(kb, alunos);
                    break;
                case 2:
                    listar(alunos);
                    break;
                case 3:
                    alterar(alunos, kb);
                    break;
                case 4:
                    remover(alunos, kb);
                case 5:
                    verificarIdade(alunos);
                    break;
            }

            System.out.println("\n(1) - Cadastrar\n(2) - Listar\n(3) - Alterar\n(4) - Remover\n(5) - Verificar idade\n(6) - Finalizar\n");
            res = kb.nextInt();
        }
        kb.close();
    }

    public void cadastrar(Scanner kb, Map<String, Aluno> alunos){
        System.out.println("Nome: ");
        String nome = kb.next();
        System.out.println("Idade: ");
        int idade = kb.nextInt();

        if (!alunos.containsKey(nome)){
           alunos.put(nome, new Aluno(nome, idade));
            System.out.println("Aluno cadastrado!");
        }else{
            System.out.println("Não foi possivel cadastrar o aluno.");
        }
    }

    public void listar(Map<String, Aluno> alunos){
       for (Aluno a : alunos.values()){
           System.out.println(a.toString() + "\n");
       }
    }

    public void alterar(Map<String, Aluno> alunos, Scanner kb){
        System.out.println("Digite o nome: ");
        String nomeBusca = kb.next();

        if (alunos.containsKey(nomeBusca)){
            System.out.println("Novo nome: ");
            String nome = kb.next();
            System.out.println("Nova idade: ");
            int idade = kb.nextInt();

            alunos.remove(nomeBusca);
            alunos.put(nome, new Aluno(nome, idade));
            System.out.println("Aluno alterado com sucesso!");
        }else {
            System.out.println("Aluno não encontrado.");
        }

    }

    public void remover(Map<String, Aluno> alunos, Scanner kb){
        System.out.println("Digite o nome: ");
        String nomeBusca = kb.next();

        if (alunos.containsKey(nomeBusca)){
            alunos.remove(nomeBusca);
        }else {
            System.out.println("Aluno não encontrado.");
        }

    }

    public void verificarIdade(Map<String, Aluno> alunos){
        String dados = "";
       for (Aluno a : alunos.values()){
           if (a.getIdade() >= 18){
               dados += a.toString() + '\n';
           }
       }

        System.out.println("Alunos com mais de 18 anos: \n" + dados);
    }
}
