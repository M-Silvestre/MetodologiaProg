/**
 * Aula 02, Programa 01
 * Classe de exemplo com main para exibir a forma como os valores
 * são atribuídos às variáveis
 * Nome: Matteus Silvestre
 * Data: 12 de fev de 2019
 */

import java.util.Scanner;

public class Main{ //Entrada de dados

	public static void main(String[] args){ 
	//String se declara com letra maiúscula
	//Os [] de array ficam no tipo
		
		//Classe Scanner (entrada de dados)
		Scanner leitor = new Scanner(System.in);
		
		//Declarando variáveis
		String nome;
		int idade;
		
		System.out.println("Informe o seu nome");
		nome = leitor.nextLine();
		
		System.out.println("Informe a sua idade");
		idade = leitor.nextInt();
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
	}
}
