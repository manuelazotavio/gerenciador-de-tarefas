package br.com.tarefas.model;

public class Usuario {

    private Long id;
    private String email;
    private String nome;

    public Usuario(Long id, String email, String nome) {
        this.id = id;
        this.email = email;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return email.equals(usuario.email);
    }

    @Override
    public int hashCode(){
        return email.hashCode();
    }


}
