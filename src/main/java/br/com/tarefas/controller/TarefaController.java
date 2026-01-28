package br.com.tarefas.controller;

import br.com.tarefas.dto.TarefaRequestDTO;
import br.com.tarefas.dto.TarefaResponseDTO;
import br.com.tarefas.model.Tarefa;
import br.com.tarefas.service.GerenciadorTarefas;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {
    private final GerenciadorTarefas gerenciador;

    public TarefaController(GerenciadorTarefas gerenciador) {
        this.gerenciador = gerenciador;
    }

    @GetMapping
    public List<TarefaResponseDTO> listar(){
        return gerenciador.listar();
    }

    @PostMapping
    public TarefaResponseDTO criar(@RequestBody @Valid TarefaRequestDTO dto){
        return gerenciador.adicionarTarefa(dto);
    }
}
