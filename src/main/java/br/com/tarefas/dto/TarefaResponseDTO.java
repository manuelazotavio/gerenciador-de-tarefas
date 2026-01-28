package br.com.tarefas.dto;

import br.com.tarefas.model.Prioridade;
import br.com.tarefas.model.Tarefa;

public record TarefaResponseDTO(
        Long id,
        String titulo,
        String descricao,
        Prioridade prioridade,
        boolean concluida
)
{
    public TarefaResponseDTO(Tarefa tarefa){
        this(tarefa.getId(), tarefa.getTitulo(), tarefa.getDescricao(), tarefa.getPrioridade(), tarefa.isConcluida());
    }
}
