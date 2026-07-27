package com.exercising.CodeExercises;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.summarizingDouble;

@SpringBootApplication
public class CodeExercisesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CodeExercisesApplication.class, args);
//
//		Scanner input = new Scanner(System.in);
//		System.out.println("Digite um número: ");
//		int num = input.nextInt();
//
//		for (int i = 1; i <= num; i++) {
//			System.out.print(i+" ");
//		}

//        Tarefa tarefa = new Tarefa("acordar", true, "eu mesmo");
//
//        ObjectMapper mapper = new ObjectMapper();
//
//        try {
//            mapper.writeValue(new File("tarefa.json"), tarefa);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//
//
//        try {
//            Tarefa tarefa2 = mapper.readValue(new File("tarefa.json"), Tarefa.class);
//            System.out.println(tarefa2);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
/*
        Operacao multiplicacao = (a, b) -> a*b;
        System.out.println(multiplicacao.executar(2,4));

        Verificacao primo = (a) -> {
            for(int i = 2;i < a;i++){
                if(a % i == 0){
                return false;
                }
            }

            return a > 1;
        };
        System.out.println(primo.verificar(83));

 */
/*
        Conversao maiuscular = (str) -> str.toUpperCase();

        System.out.println(maiuscular.maiuscular("oh bolas!"));


        Verificacao2 verificacao = (a) -> {
            StringBuilder sb = new StringBuilder();
            sb.append(a);
            sb.reverse();
            return a.contentEquals(sb);
        };

        System.out.println(verificacao.verificarPalindromo("ovo"));
 */
        /*
    List<Integer> numeros = Arrays.asList(2,4,6,8,10);
    numeros.replaceAll(n -> n*3);
        System.out.println(numeros);

    big joke motherfuckers!
         */
/*
        List<String> motos = Arrays.asList("Yamaha","Shineray","Honda", "Kawasaki", "Harley-Davidson", "Royal Enfield");
        Collections.sort(motos);
        System.out.println(motos);
 */
        /*
Divisao divisao = (a,b) -> {

         if (b == 0.0){
             throw new ArithmeticException("divisor é zero");
         }

    return a/b;
};

        System.out.println(divisao.dividir(3,0));
         */
/*
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(numeros.stream().filter(n -> n % 2 == 0));

        List<String> palavras = Arrays.asList("java", "stream", "lambda");
        System.out.println(palavras.stream().map(String::toUpperCase));

        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> numeros2filtrados = numeros2.stream()
                .filter(n -> n % 2 != 0)
                .map( n -> n * 2)
                .toList();
        System.out.println(numeros2filtrados);

        List<String> palavras2 = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        System.out.println(palavras2.stream().collect(Collectors.toSet()));
        */
/*
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        List<Integer> listaPrimos = listaDeNumeros.stream().flatMap(List::stream).toList();

        listaPrimos = listaPrimos.stream().filter(n -> {
            for(int i = 2;i < n;i++){
                if(n % i == 0){
                    return false;
                }
            }
            return n > 1;
         }).toList();

        System.out.println(listaPrimos);
*/
        /*
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 22),
                new Pessoa("Bob", 17),
                new Pessoa("Charlie", 19)
        );

        List<String> nomesPessoas = pessoas.stream().filter(p -> p.idade > 18).map(p -> p.nome).sorted().toList();
        System.out.println(nomesPessoas);
         */
/*
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        List<Produto> eletrosBaratos = produtos
                .stream()
                .filter( p -> p.getCategoria().equals("Eletrônicos"))
                .filter(p ->p.getPreco() < 1000 )
                .sorted(Comparator.comparingDouble(Produto::getPreco))
                .limit(3)
                .toList();
        System.out.println(eletrosBaratos);
 */
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

/*
        Map<String,List<Produto>> porCategorias = produtos.stream().collect(Collectors.groupingBy(Produto::getCategoria));
        System.out.println(porCategorias);

        Map<String,Long> quantidadePorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,mapping(Produto::getCategoria,Collectors.counting())));
        System.out.println(quantidadePorCategoria);


        Map<String,Optional<Produto>> maisCaroPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco))));
        System.out.println(maisCaroPorCategoria);
*/
        Map<String, Double> valorTotalPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,Collectors.summingDouble(Produto::getPreco)));
        System.out.println(valorTotalPorCategoria);

    }
}
