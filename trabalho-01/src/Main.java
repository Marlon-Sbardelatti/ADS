import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Main();
    }

    public Main(){
        Scanner kb = new Scanner(System.in);
        Queue<Tarefa> tarefas = new LinkedList<>();

        System.out.println("(1) - Cadastrar\n(2) - Concluir tarefa\n(3) - Visualizar próxima tarefa\n(4) - Listar\n(5) - Finalizar\n");
        int res = kb.nextInt();

        while (res != 5){
            switch (res){
                case 1:
                    adicionar(tarefas, kb);
                    break;
                case 2:
                    concluir(tarefas);
                    break;
                case 3:
                    showNext(tarefas);
                    break;
                case 4:
                    listar(tarefas);
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }

            System.out.println("(1) - Cadastrar\n(2) - Concluir tarefa\n(3) - Visualizar próxima tarefa\n(4) - Listar\n(5) - Finalizar\n");
            res = kb.nextInt();
        }

        kb.close();
    }

    private boolean adicionar(Queue<Tarefa> tarefas, Scanner kb){
        System.out.println("Nome da tarefa: ");
        String nome = kb.next();
        System.out.println("Dificuldade da tarefa: ");
        String dificuldade = kb.next();

        Tarefa t = new Tarefa(nome, dificuldade);
        if (!find(tarefas, t.getNome())){
            tarefas.add(t);
            System.out.println("Tarefa adicionado com sucesso!");
            return true;
        }

        System.out.println("Não foi possível adicionar a tarefa.");
        return false;
    }

   private boolean find(Queue<Tarefa> tarefas, String nome) {
        for (Tarefa t : tarefas){
            if (t.getNome().equalsIgnoreCase(nome)){
                return true;
            }
        }

        return false;
   }

   private void listar(Queue<Tarefa> tarefas){
       for (Tarefa t : tarefas){
           System.out.println(t.toString() + "\n");
       }
   }

   private boolean concluir(Queue<Tarefa> tarefas){
        if (tarefas.remove() != null){
            System.out.println("Tarefa concluida com sucesso!");
            return true;
        }
       System.out.println("Não foi possível concluir a tarefa.");
        return false;
   }

   private boolean showNext(Queue<Tarefa> tarefas){
        Tarefa next = tarefas.peek();

        if (next != null){
            System.out.println(next.toString());
            return true;
        }

       System.out.println("Sem tarefas na lista.");
       return false;
   }

}