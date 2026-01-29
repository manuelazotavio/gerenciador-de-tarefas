package br.com.tarefas;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Frequencia {

    public static void main(String[] args){
        List<String> nomes = Arrays.asList("Java", "Python", "Java", "C#", "Python", "Java");

        Map<String, Integer> map = new HashMap<>();

        for (String nome : nomes) {
            map.put(nome, map.getOrDefault(nome, 0) + 1);
        }

        System.out.println(map);
    }
}
