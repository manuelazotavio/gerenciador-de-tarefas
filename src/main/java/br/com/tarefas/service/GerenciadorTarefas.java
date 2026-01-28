package br.com.tarefas.service;

import br.com.tarefas.model.Tarefa;
import br.com.tarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class GerenciadorTarefas {
    private final TarefaRepository repository;

    public GerenciadorTarefas(TarefaRepository repository){
        this.repository = repository;
    }
    public void adicionarTarefa(Tarefa tarefa) {
        repository.save(tarefa);
    }

//    public void removerTarefa(String titulo) {
//        tarefas.removeIf(t -> t.getTitulo().equalsIgnoreCase(titulo));
//    }

    public List<Tarefa> listar(){
        return repository.findAll();
    }

//    public List<Tarefa> listarPendentes() {
//
//    }

    public Tarefa buscar(String titulo) {
        return repository.findByTituloIgnoreCase(titulo).orElse(null);
    }

}
