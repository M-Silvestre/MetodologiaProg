public class PrimeiraAula{ //Java é baseado em classes
							//Nomes de classe começam com letra maiúscula

	public static void main(String args[]){ //Java também precisa de uma função main()
		imprimeNome();
		System.out.println(args[0]); //Primeiro argumento
		System.out.println(args[1]); //Segundo Argumento
	}
	public static void imprimeNome(){ //Os "métodos" correspondem às funções em C
									//Nome de método começa com letra minúscula
		System.out.println("Alô Mundo");
	}
	
}
