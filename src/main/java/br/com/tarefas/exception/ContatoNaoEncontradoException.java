package br.com.estudo.agenda.exception;

public class ContatoNaoEncontradoException extends Exception {
    public ContatoNaoEncontradoException(String nome) {
        super("O contato '" + nome + "' não existe na base de dados.");
    }
}