package com.exercising.CodeExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MoreExercises {
    public static void main(String[] args) {
        List<String> input = Arrays.asList("10", "abc", "20", "30x");
/*
        List<Integer> inputOnlyNumbers = new ArrayList<>();
        for (String numero :input){
            try{
                Integer numeroConvertido = Integer.valueOf(numero);
                inputOnlyNumbers.add(numeroConvertido);
            } catch (NumberFormatException e) {
                System.out.println(numero + " não será convertido.");
            }
        }
        System.out.println(inputOnlyNumbers);

        input.stream()
                .map(str -> {
                    try {
                        return Optional.of(Integer.parseInt(str)); }
                    catch (NumberFormatException e)
                    {return Optional.<Integer>empty();}})
                .filter(Optional::isEmpty)
                .map(Optional::get)
                .toList();
 */

//        System.out.println(processaNumero(Optional.of(5)));
//        System.out.println(processaNumero(Optional.of(-3)));
//        System.out.println(processaNumero(Optional.empty()));

//        System.out.println(obterPrimeiroEUltimoNome("  João Carlos Silva   "));
//        System.out.println(obterPrimeiroEUltimoNome("Maria   "));

//        System.out.println(ehPalindromo("socorram me subi no onibus em marrocos"));
//        System.out.println(ehPalindromo("Java"));

//        List<String> emails = Arrays.asList("TESTE@EXEMPLO.COM", "exemplo@Java.com ", "Usuario@teste.Com");
//        System.out.println(converterEmails(emails));

        System.out.println(Mes.MAIO.getNumeroDias());

        System.out.printf("$ %.2f %n",Moeda.DOLAR.converterPara(50));

        System.out.println(CodigoErro.NOT_FOUND.getStatusCode());
        System.out.println(CodigoErro.BAD_REQUEST.getStatusCodeDescription());


    }

    public static Optional<Integer> processaNumero(Optional<Integer> numero) {
    /* if(numero.isPresent() && numero.get() > 0){
            return Optional.of(numero.get() * numero.get());
        }
        return Optional.empty();
    } */
        return numero.filter(n -> n > 0).map(n -> n * n);
    }

    public static String obterPrimeiroEUltimoNome(String nomeCompleto) {
         String[] nome = nomeCompleto.trim().split(" ");
         if(nome.length == 1){ return nome[0]; }
         return nome[1]+" "+nome[nome.length -1];
    }

    public static boolean ehPalindromo(String palavra) {
        StringBuilder verificacao = new StringBuilder(palavra.replace(" ",""));
        verificacao = verificacao.reverse();

        return verificacao.toString().contentEquals(palavra.replace(" ",""));
    }

    public static List<String> converterEmails(List<String> emails) {
        return emails.stream().map(String::toLowerCase).toList();
    }



}

