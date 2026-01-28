package br.com.tarefas.model;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorTarefas {
    private List<Tarefa> tarefas;

    public GerenciadorTarefas() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(String titulo) {
        tarefas.removeIf(t -> t.getTitulo().equalsIgnoreCase(titulo));
    }

    public List<Tarefa> listar(){
        return new ArrayList<>(tarefas);
    }

    public List<Tarefa> listarPendentes() {
        return tarefas.stream()
                .filter(tarefa -> !tarefa.isConcluida())
                .toList();
    }

    public Tarefa buscar(String titulo) {
        return tarefas.stream()
                .filter(tarefa -> tarefa.getTitulo().equalsIgnoreCase(titulo))
                .findFirst()
                .orElse(null);
    }


}
