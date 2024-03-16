import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner kb = new Scanner(System.in);
        List<Produto> list = new ArrayList<>();
        System.out.println("(1) - Cadastrar\n(2) - Listar\n(3) - Buscar por Segmento\n(4) - Alterar\n(5) - Remover\n(6) - Sair");
        int res = kb.nextInt();

        while (res != 6) {
            switch (res) {
                case 1:
                    cadastrar(list, kb);
                    break;
                case 2:
                    listar(list);
                    break;
                case 3:
<<<<<<< HEAD
                    pesquisaSegmento(list, kb);
=======
                    pesquisaSegmento(list);
>>>>>>> 2d731af29e9291d2e9f27625e64fb88ed166c531
                    break;
                case 4:
                    alterar(list, kb);
                    break;
                case 5:
                    remover(list, kb);
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }

            System.out.println("(1) - Cadastrar\n(2) - Listar\n(3) - Buscar por Segmento\n(4) - Alterar\n(5) - Remover\n(6) - Sair");
            res = kb.nextInt();
        }


        kb.close();
    }

    public void cadastrar(List<Produto> list, Scanner kb) {
        System.out.println("Nome do produto: ");
        String nome = kb.next();
        System.out.println("Segmento do produto: ");
        String segmento = kb.next();
        list.add(new Produto(nome, segmento));
    }

    public void listar(List<Produto> list) {
        for (Produto p : list) {
            System.out.println(p.toString() + '\n');
        }
    }

    public void pesquisaSegmento(List<Produto> list) {
        int total = 0;
        boolean found = false;
<<<<<<< HEAD
        for (Produto p : list) {
        }


=======
        List<String> segs = new ArrayList<String>();

        for (Produto p : list) {
            if (!segs.contains(p.getSegmento())) {
                segs.add(p.getSegmento());
            }
        }

        String dados = "Segmentos:\n";

        for (String s : segs) {
            int count = 0;
            String dadosPorSeg = s + ":\n";
            for (Produto p : list) {
                if (s.equals(p.getSegmento())) {
                    dadosPorSeg += p.toString() + "\n";
                    count++;
                }
            }
            dados += "Total: " + count + "\n" + dadosPorSeg + '\n';
        }

        System.out.println(dados);
>>>>>>> 2d731af29e9291d2e9f27625e64fb88ed166c531
    }

    public void alterar(List<Produto> list, Scanner kb) {
        System.out.println("Digite o nome do produto: ");
        String nome = kb.next();
        boolean found = false;

        for (Produto p : list) {
            if (p.getNome().equals(nome)) {
                found = true;
                System.out.println("Digite o novo nome: ");
                String novoNome = kb.next();
                System.out.println("Digite o novo segmento: ");
                String novoSegmento = kb.next();

                p.setNome(novoNome);
                p.setSegmento(novoSegmento);
            }
        }

        if (!found) {
            System.out.println("Produto não localizado.");
        }
    }

    public void remover(List<Produto> list, Scanner kb) {
        System.out.println("Digite o nome do produto: ");
        String nome = kb.next();
        boolean found = false;

        for (Produto p : list) {
            if (p.getNome().equals(nome)) {
                list.remove(p);
                found = true;
                System.out.println("Produto removido com sucesso!");
            }
        }

        if (!found) {
            System.out.println("Produto não localizado.");
        }
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 2d731af29e9291d2e9f27625e64fb88ed166c531
