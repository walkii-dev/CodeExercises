package com.exercising.CodeExercises;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CodeExercisesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeExercisesApplication.class, args);

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int num = input.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print(i+" ");
		}
	}

}
