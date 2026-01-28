package br.com.tarefas.dto;

import jakarta.validation.constraints.NotBlank;
import br.com.tarefas.model.Prioridade;
import jakarta.validation.constraints.NotNull;

public record TarefaRequestDTO(
        @NotBlank String titulo,
        @NotBlank String descricao,
        @NotNull Prioridade prioridade
) { }
