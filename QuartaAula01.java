package br.unipe.java.aula04;

import java.util.Scanner;

//19/02/19: Aula 04: Uso do IDE, loops

public class QuartaAula {
	public static void main(String[] args) { //Atalho Ctrl + Espaço
		Scanner leitor = new Scanner(System.in);
		int cont;
		System.out.println("Vamos começar o loop com quantas? ");
		cont = leitor.nextInt();
		do {
			System.out.println(cont + " cervejas na freezer.\r\n" + 
					"Pego uma garrafa, passo pra frente.\r\n" + 
					"Agora são " + (cont - 1) + " cervejas na freezer.\r\n" + 
					"\r\n");
			cont--;
			
		}while(cont != 0);
		
		System.out.println("Fim!");
	}
}
