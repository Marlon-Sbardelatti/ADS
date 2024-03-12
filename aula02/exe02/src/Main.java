import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner kb = new Scanner(System.in);
        Vector vec = new Vector<>();

        System.out.println("(1) - Cadastrar\n(2) - Listar\n(3) - Pesquisar\n(4) - Alterar\n(5) - Remover\n(6) - Sair");
        int res = kb.nextInt();

        while (res != 6){
            switch (res){
                case 1:
                    cadastrar(vec, kb);
                break;
                case 2:
                    listar(vec);
                break;
                case 3:
                    pesquisar(vec, kb);
                break;
                case 4:
                    alterar(vec, kb);
                break;
                case 5:
                    remover(vec, kb);
                break;
                default:
                    break;
            }

            System.out.println("(1) - Cadastrar\n(2) - Listar\n(3) - Pesquisar\n(4) - Alterar\n(5) - Remover\n(6) - Sair");
            res = kb.nextInt();
        }

        kb.close();
    }

    public boolean cadastrar(Vector vec, Scanner kb) {
        System.out.println("Nome do Usuário: ");
        String nome = kb.next();

        System.out.println("Id do Usuário: ");
        int id = kb.nextInt();

        User user = new User(nome, id);

        for (int i = 0; i < vec.size(); i++) {
            if (vec.get(i) instanceof User) {
                if (((User) vec.get(i)).getNome().equals(user.getNome())) {
                    return false;
                }
            }
        }
        vec.add(user);
        return true;
    }

    public void listar(Vector vec) {
        for (int i = 0; i < vec.size(); i++) {
            System.out.println(vec.get(i).toString() + '\n');
        }
    }

    public void pesquisar(Vector vec, Scanner kb) {
        System.out.println("Digite o termo:");
        String termo = kb.next();

        boolean found = false;
        for (int i = 0; i < vec.size(); i++) {
            if (vec.get(i) instanceof User) {
                if (((User) vec.get(i)).getNome().toLowerCase().contains(termo)) {
                    if (!found) {
                        System.out.println("Termo encontrado no(s) usuários:");
                    }
                    System.out.println(vec.get(i).toString() + '\n');
                    found = true;
                }
            }
        }

    }

    public void alterar(Vector vec, Scanner kb) {
        boolean found = false;
        System.out.println("Digite o nome: ");
        String nome = kb.next();

        for (int i = 0; i < vec.size(); i++) {
            if (vec.get(i) instanceof User) {
                if (((User) vec.get(i)).getNome().equals(nome)) {
                    found = true;
                    System.out.println("Novo nome: ");
                    String novoNome = kb.next();
                    System.out.println("Novo id: ");
                    int id = kb.nextInt();

                    ((User) vec.get(i)).setId(id);
                    ((User) vec.get(i)).setNome(novoNome);
                }
            }
        }

        if (!found) {
            System.out.println("Usuário não encontrado.");
        }
    }

    public void remover(Vector vec, Scanner kb) {
        System.out.println("Digite o nome: ");
        String nome = kb.next();
        boolean found = false;
        for (int i = 0; i < vec.size(); i++) {
            if (vec.get(i) instanceof User) {
                if (((User) vec.get(i)).getNome().equals(nome)) {
                    found = true;
                    vec.remove(vec.get(i));
                    System.out.println("Usuário removido com sucesso!");
                }
            }
        }

        if (!found) {
            System.out.println("Usuário não encontrado.");
        }

    }
}