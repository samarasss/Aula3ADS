package gerenciadorTasks;

import java.util.Scanner;

public class Menu {

    static void main() {

        Scanner sc = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Menu");
            System.out.println("1 - Adicionar Tarefa");
            System.out.println("2 - Pesquisar Tarefa por Nome");
            System.out.println("3 - Excluir Tarefa");
            System.out.println("4 - Listar Tarefas");
            System.out.println("5 - Atualizar Nome ou Descrição da Tarefa");
            System.out.println("6 - Sair");
            System.out.println("Digite sua opção:");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    Metodos.adicionarTarefa(sc);
                    break;
                case 2:
                    Metodos.pesquisarPorNomeRepetidos(sc);
                    break;
                case 3:
                    Metodos.excluirPorNome(sc);
                    break;
                case 4:
                    Metodos.listarTarefas();
                    break;
            }

        }while(opcao != 6);
    }
}
