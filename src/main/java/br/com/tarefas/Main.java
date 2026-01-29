package br.com.tarefas;
import br.com.tarefas.model.Usuario;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.nextLine();
        int resultado = firstIndex(palavra);
        System.out.println(palavra.charAt(resultado));
    }

    public static int firstIndex(String a) {
        Map<Character, Integer> letras = new HashMap<>();

        for (char c : a.toCharArray()) {
            letras.put(c, letras.getOrDefault(c, 0) + 1);
        }


        //b

        //b: 1
        //a: 1
        //n: 1
        //a: 2
        //n: 2
        //a: 3

        for (int i = 0; i < a.length(); i++) {
            if (letras.get(a.charAt(i)) == 1) return i;
        }

        return -1;


    }

}
