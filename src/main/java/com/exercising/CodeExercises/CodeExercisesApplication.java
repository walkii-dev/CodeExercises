package com.exercising.CodeExercises;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

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





    }


}
