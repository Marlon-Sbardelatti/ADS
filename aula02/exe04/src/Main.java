import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main() {
        Scanner kb = new Scanner(System.in);
        List<Carro> carros = new LinkedList<>();
        System.out.println("(1) - Cadastrar\n(2) - Listar\n(3) - Finalizar\n");
        int res = kb.nextInt();

        while (res != 3){
            switch (res){
                case 1:
                    cadastrar(carros, kb);
                    break;
                case 2:
                    listar(carros);
                    break;
                default:
                    System.out.println("Operação inválida");
            }

            System.out.println("(1) - Cadastrar\n(2) - Listar\n(3) - Finalizar\n");
            res = kb.nextInt();
        }
        kb.close();
    }

    public void cadastrar(List<Carro> carros, Scanner kb){
        System.out.println("Nome do carro: ");
        String nome = kb.next();
        System.out.println("Marca do carro: ");
        String marca = kb.next();
        Carro carro = new Carro(nome, marca);
        carros.add(carro);
    }

    public void listar(List<Carro> carros){
        for (Carro c : carros){
            System.out.println(c.toString() + '\n');
        }
    }


<<<<<<< HEAD
}
=======
}
>>>>>>> 2d731af29e9291d2e9f27625e64fb88ed166c531
