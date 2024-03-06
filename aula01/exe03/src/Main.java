//Marlon Sbardelatti

import java.util.Scanner;

public class Main {
    private Produto[] produtos;

    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Vetor v = new Vetor();
        Scanner kb = new Scanner(System.in);
        System.out.println("(1) - Cadastrar\n(2) - Listar\n(3) - Pesquisar\n(4) - Alterar\n(5) - Remover\n(6) - Sair");
        int res = kb.nextInt();
        while (res != 6) {
            switch (res){
                case 1:
                    System.out.println("Nome do produto: ");
                    String nomeProduto = kb.next();
                    System.out.println("Valor do produto: ");
                    double valorProduto = kb.nextDouble();
                    Produto p = new Produto(nomeProduto, valorProduto);
                    v.cadastrar(p);
                    break;
                case 2:
                    System.out.println('\n' + v.listar());
                    break;
                case 3:
                    System.out.println("Digite o termo de pesquisa(Non case-sensitive): ");
                    String termo = kb.next();
                    System.out.println('\n' + v.pesquisa(termo));
                    break;
                case 4:
                    System.out.println("Digite o nome do produto:");
                    String nomeProdutoAlterado = kb.next();
                    System.out.println("Novo nome: ");
                    String novoNome = kb.next();
                    System.out.println("Novo valor: ");
                    double novoValor = kb.nextDouble();
                    if (v.alterar(nomeProdutoAlterado, novoNome, novoValor)){
                        System.out.println("Produto alterado com sucesso!");
                        break;
                    }
                    System.out.println("Produto não localizado.");
                    break;
                case 5:
                    System.out.println("Digite o nome do produto:");
                    String nomeDeletar = kb.next();
                    if (v.deletar(nomeDeletar)){
                        System.out.println("Produto deletado!");
                        break;
                    }
                    System.out.println("Produto não localizado.");
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
            System.out.println("(1) - Cadastrar\n(2) - Listar\n(3) - Pesquisar\n(4) - Alterar\n(5) - Remover\n(6) - Sair");
            res = kb.nextInt();
        }
        kb.close();
    }


}
