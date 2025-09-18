package primeiroProjeto;

import java.util.Scanner;

public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int contador = 11;
		do {
			System.out.println("dowhilw");
		}while (contador <= 10);
		
		
		while (contador <= 10);{
			System.out.println("whilw");
		}
		System.out.println("--------------------------");
		int numero=0;
		do {
			System.out.println(numero);
			numero+=5;
		}while(numero <= 20);
		System.out.println("----------------------------------");
		Scanner sc= new Scanner(System.in);
		int secreto = 5 ;
		int escolha = 0;
		do {
		System.out.println("Escolha um número");
		escolha = sc.nextInt();
		if (escolha> secreto) {
			System.out.println("É menor");
		}else if ( escolha <secreto) {
			System.out.println("É maior");
		}
		}while (secreto != escolha);
		System.out.println("Acertouuu");
		
		
		
		System.out.println("Escolha uma opção do menu");
		System. out. println("1 - Ficar na navegação");
		System. out.println("2 - Sair da navegacao");
		int opcao = sc.nextInt();
		do {
			System.out.println("Escolha novamente");

		opcao = sc.nextInt();
		} while(opcao != 2);

		System.out.println("-------------------------------");
		
		
		int idade;
		int cont = 1;
		do {
		System.out.println("Informe uma idade");
		idade = sc.nextInt();
		if(idade <= 12) {
		System.out.println("CRIANÇA");
		} else {
		System.out.println("NÃO É CRIANÇA");

		}

		cont++;
		}while(cont <=5);
		System.out.println("Fim");
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	} 

}
