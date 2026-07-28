package com.exercising.CodeExercises;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExtraExercises {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("sol", "computador", "java", "api", "desenvolvimento");
        System.out.println(filterAndFormat(palavras));

        System.out.println(ifAnagrams("Alergia", "Alegria"));
        System.out.println(ifAnagrams("O rato", "A rota"));
        System.out.println(ifAnagrams("Tom Marvolo Riddle", "I am Lord Voldemort"));

        List<Integer> numbers = Arrays.asList(2, 4, 2, 5, 8, 4, 11);
        System.out.println(evenDistinctSum(numbers));

        System.out.println(validateEmail(Optional.of("usuario.teste")));
        System.out.println(validateEmail(Optional.empty()));
        System.out.println(validateEmail(Optional.of("usuario@teste.com")));

        System.out.println(extractNumbers("O pedido 123 contém 4 itens com prazo de 10 dias."));
        System.out.println(extractNumbers("Sem números aqui"));

    }


    public static String filterAndFormat(List<String> words) {
        return words.stream()
                .filter(p -> p.length() > 4)
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
    }

    public static boolean ifAnagrams(String word1, String word2) {
        String word1clean = word1.replace(" ", "").toLowerCase();
        String word2clean = word2.replace(" ", "").toLowerCase();
        if (word1clean.length() == word2clean.length()) {
            char[] word1letters = word1clean.toCharArray();
            char[] word2letters = word2clean.toCharArray();
            Arrays.sort(word1letters);
            Arrays.sort(word2letters);
            return Arrays.equals(word1letters, word2letters);
        }
        return false;
    }

    public static int evenDistinctSum(List<Integer> numbers) {
        return numbers.stream().filter(n -> n % 2 == 0).distinct().reduce(Integer::sum).get();
    }

    public static boolean validateEmail(Optional<String> email) {
        return email.isPresent() && email.get().contains("@") && email.get().contains(".");
    }

    public static List<Integer> extractNumbers(String text) {
        return Arrays.stream(text.split(" ")).map(s -> {
            try{
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                return null; // não recomendado
            }
        }).filter(Objects::nonNull).toList();
    }
}
