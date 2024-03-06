import java.util.List;
import java.util.Scanner;

public class Main {
    public int index = 0;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner kb = new Scanner(System.in);
        System.out.println("1 - Cadastrar\n2 - Listar\n3 - Alterar\n4 - Remover\n5 - Sair");
        String[] nomes = new String[10];
        int res = kb.nextInt();
        while (res != 5) {
            switch (res) {
                case 1:
                    if (cadastrar(nomes, kb)) {
                        System.out.println("Nome adicionado!");
                    } else {
                        System.out.println("Não foi possível adicionar o nome.");
                    }
                    break;
                case 2:
                    System.out.println('\n');
                    listarTodos(nomes);
                    break;
                case 3:
                    alterar(nomes, kb);
                    break;
                case 4:
                    if (remover(nomes, kb)) {
                        System.out.println("Número removido com sucesso!");
                    } else {
                        System.out.println("Não foi possível remover o nome.");
                    }
                    break;
            }

            System.out.println("\n1 - Cadastrar\n2 - Listar\n3 - Alterar\n4 - Remover\n5 - Sair");
            res = kb.nextInt();
        }
    }

    public boolean cadastrar(String[] nomes, Scanner kb) {
        if (index >= nomes.length) {
            return false;
        }
        System.out.println("Digite um nome: ");
        String nome = kb.next();
        nomes[index] = nome;
        index++;
        return true;
    }


    public void listarTodos(String[] nomes) {
        for (int i = 0; i < nomes.length && nomes[i] != null; i++) {
            System.out.println(nomes[i]);
        }
    }

    public boolean alterar(String[] nomes, Scanner kb) {
        for (int i = 0; i < nomes.length && nomes[i] != null; i++) {
            System.out.println(i + " - " + nomes[i]);
        }

        System.out.println("Digite o index: ");
        int idx = kb.nextInt();
        if (idx > index) {
            return false;
        }
        System.out.println("Digite o novo nome: ");
        String novoNome = kb.next();

        nomes[idx] = novoNome;
        return true;
    }

    public boolean remover(String[] nomes, Scanner kb) {
        System.out.println("Digite o index: ");
        int idx = kb.nextInt();

        if (idx > 9) {
            return false;
        }
        if (nomes[idx] == null) {
            return false;
        }
        for (int i = idx; i < nomes.length - 1; i++) {
            nomes[i] = nomes[i + 1];
        }
        index--;
        nomes[index] = null;
        return true;
    }
}
