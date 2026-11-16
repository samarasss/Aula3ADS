package gerenciadorTasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    static ArrayList<String> nomes = new ArrayList<>();
    static ArrayList<String> descricoes = new ArrayList<String>();

    static void adicionarTarefa(Scanner scanner){
        System.out.println("Digite o nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite a descrição:");
        String descricao = scanner.nextLine();

        nomes.add(nome);
        descricoes.add(descricao);

        System.out.println("Tarefa adicionada!");

    }

    static void listarTarefas(){
        if(nomes.size() == 0){
            System.out.println("Não há tarefas cadastras");
        }else{
            for (int i = 0; i < nomes.size(); i++){
                System.out.println("Nome: " + nomes.get(i));
                System.out.println("Descrição: " + descricoes.get(i));
            }
        }
    }

    static void pesquisarPorNome(Scanner scanner){
        System.out.println("Digite o nome da tarefa pesquisada: ");
        String nomePesquisado = scanner.nextLine();

        boolean encontrado = nomes.contains(nomePesquisado);

        if(encontrado){
            System.out.println("Tarefa encontrada");
        }

//        for (int i = 0; i < indice; i++){
//            if(nomes[i].equalsIgnoreCase(nomePesquisado)){
//                System.out.println("Tarefa encontrada");
//                System.out.println("Descrição: " + descricoes[i]);
//                return;
//            }
//        }

        System.out.println("Tarefa não cadastrada!");
    }

    static void pesquisarPorNomeRepetidos(Scanner scanner){
        System.out.println("Digite o nome da tarefa pesquisada: ");
        String nomePesquisado = scanner.nextLine();
        int contador = 0;
        for (int i = 0; i < nomes.size(); i++){
            if(nomes.get(i).equalsIgnoreCase(nomePesquisado)){
                System.out.println("Tarefa encontrada");
                System.out.println("Descrição: " + descricoes.get(i));
                contador +=1;
            }
        }
        System.out.println("QUantidade de tarefas repetidas: " + contador);
        if(contador ==0){
            System.out.println("Tarefa não cadastrada!");

        }
    }


    static void excluirPorNome(Scanner scanner){
        System.out.println("Digite o nome da tarefa pesquisada: ");
        String nomePesquisado = scanner.nextLine();

        int indiceProcurado = -1;
        for (int i = 0; i < nomes.size(); i++){
            if(nomes.get(i).equalsIgnoreCase(nomePesquisado)){
                indiceProcurado = i;
            }
        }
        if(indiceProcurado != -1){
            nomes.remove(indiceProcurado);
            descricoes.remove(indiceProcurado);
            System.out.println("Tarefa excluida");
        }

    }
}
