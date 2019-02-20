package br.unipe.java.aula04;

import java.util.Scanner;

public class QuartaAAulaExerc01{
	public static void mainmain(String[] args) {
		int x, y;
		Scanner leitor = new Scanner(System.in);
		System.out.println("Informe um  inteiro: ");
		x = leitor.nextInt();
		System.out.println("Informe um segundo inteiro: ");
		y = leitor.nextInt();
		System.out.println("Soma de " + x + " e " + y + " é " + (x + y));
	}
}
