package br.com.tarefas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tarefas")
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Prioridade prioridade;

    private boolean concluida;

    public Tarefa() {
    }

    public Tarefa(String titulo, String descricao, Prioridade prioridade, boolean concluida) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.concluida = false;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void concluirTarefa() {
        this.concluida = true;
    }

    @Override
    public String toString() {
        String status = concluida ? "[X]" : "[ ]";
        return String.format("%s %s - %s (%s)", status, titulo, descricao, prioridade);
    }
}
