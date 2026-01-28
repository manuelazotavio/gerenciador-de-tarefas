package br.com.tarefas.app;

import br.com.tarefas.model.GerenciadorTarefas;
import br.com.tarefas.model.Tarefa;
import br.com.tarefas.model.Prioridade;
import java.util.List;
import java.util.Scanner;

import static br.com.tarefas.model.Prioridade.ALTA;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        boolean rodando = true;

        while (rodando) {
            System.out.println("\n--- GERENCIADOR DE TAREFAS ---");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Listar todas");
            System.out.println("3. Concluir tarefa");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o título: ");
                    String titulo = scanner.nextLine();
                    System.out.println("Informe a descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.println("Qual a prioridade? (ALTA, MEDIA, BAIXA): ");
                    Prioridade prioridade = Prioridade.valueOf(scanner.nextLine().toUpperCase());

                    gerenciador.adicionarTarefa(new Tarefa(titulo, descricao, prioridade, false));
                    System.out.println("Tarefa adicionada com sucesso.");
                    break;
                case 2:
                    System.out.println("Suas tarefas:");
                    gerenciador.listar().forEach(System.out::println);
                    break;
                case 3:
                    System.out.println("Qual o título da tarefa? ");
                    String busca = scanner.nextLine();
                    Tarefa tarefa = gerenciador.buscar(busca);
                    if (tarefa != null) {
                        tarefa.concluirTarefa();
                        System.out.println(tarefa.toString());
                    } else {
                        System.out.println("Tarefa não encontrada");
                    }
                    break;
                case 4:
                    rodando = false;
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();

    }
}

