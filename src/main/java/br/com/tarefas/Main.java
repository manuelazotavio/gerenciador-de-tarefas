package br.com.tarefas;


import br.com.tarefas.model.Usuario;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Usuario> teste = new HashSet<>();



        teste.add(new Usuario(1L, "manuelazotavio@gmail.com", "manuela"));
        teste.add(new Usuario(2L, "manuelazotavio@gmail.com", "jassiane"));

        System.out.println(teste);
    }
}
