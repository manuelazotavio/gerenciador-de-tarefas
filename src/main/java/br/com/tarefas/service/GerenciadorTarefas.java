package br.com.tarefas.service;

import br.com.tarefas.dto.TarefaRequestDTO;
import br.com.tarefas.dto.TarefaResponseDTO;
import br.com.tarefas.model.Tarefa;
import br.com.tarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GerenciadorTarefas {
    private final TarefaRepository repository;

    public GerenciadorTarefas(TarefaRepository repository) {
        this.repository = repository;
    }

    public TarefaResponseDTO adicionarTarefa(TarefaRequestDTO dto) {
        Tarefa tarefa = new Tarefa(dto.titulo(), dto.descricao(), dto.prioridade(), false);
        Tarefa salva = repository.save(tarefa);
        return new TarefaResponseDTO(salva);
    }

//    public void removerTarefa(String titulo) {
//        tarefas.removeIf(t -> t.getTitulo().equalsIgnoreCase(titulo));
//    }

    public List<TarefaResponseDTO> listar() {
        return repository.findAll().stream().map(TarefaResponseDTO::new).toList();
    }

//    public List<Tarefa> listarPendentes() {
//
//    }

    public Tarefa buscar(String titulo) {
        return repository.findByTituloIgnoreCase(titulo).orElse(null);
    }

}
