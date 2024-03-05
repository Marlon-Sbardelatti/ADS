import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//Utilizei queue por conta da facilidade de retirar os elementos em ordem de chegada(FIFO).

public class Main {
    private Queue<String> pessoas;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner kb = new Scanner(System.in);
        pessoas = new LinkedList<String>();

        System.out.println("(1) - Cadastrar\n(2) - Remover\n(3) - Listar\n(4) - Finalizar");
        int res = kb.nextInt();

        while (res != 4) {
            switch (res) {
                case 1:
                    cadastrar(kb);
                    break;
                case 2:
                    remover(kb);
                    break;
                case 3:
                    listar();
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }

            System.out.println("(1) - Cadastrar\n(2) - Remover\n(3) - Listar\n(4) - Finalizar");
            res = kb.nextInt();
        }
    }

    public boolean cadastrar(Scanner kb) {
        System.out.println("Digite o nome: ");
        String nome = kb.next();
        return pessoas.add(nome);
    }

    public boolean remover(Scanner kb) {
        if (!pessoas.isEmpty()) {
            pessoas.remove();
            return true;
        }
        return false;
    }
    public void listar(){
        System.out.println(pessoas);
    }
}
