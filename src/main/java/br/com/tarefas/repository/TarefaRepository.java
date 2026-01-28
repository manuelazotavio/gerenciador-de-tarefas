package br.com.tarefas.repository;

import br.com.tarefas.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TarefaRepository extends JpaRepository<Tarefa, Long> {
    Optional<Tarefa> findByTituloIgnoreCase(String titulo);
}
