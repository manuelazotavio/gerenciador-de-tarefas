package br.com.tarefas.controller;

import br.com.tarefas.model.Tarefa;
import br.com.tarefas.service.GerenciadorTarefas;
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
    public List<Tarefa> getTarefas(){
        return gerenciador.listar();
    }

    @PostMapping
    public void criarTarefa(@RequestBody Tarefa tarefa){
        gerenciador.adicionarTarefa(tarefa);
    }
}
