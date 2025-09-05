package primeiroProjeto;

import java.util.Scanner;

public class lista9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
//		1 - Contador:
//		Mostre os números de 1 a 10 no console.
		
		
		int numero =1;
		while(numero <= 10) {
	    System.out.println(numero);
	    numero ++;
		}
		
		System.out.println("\n\n");
		
		int numero2 =10;
		while(numero2 >= 1) {
	    System.out.println(numero2);
	    numero2 --;
		}
		System.out.println("\n\n");
		
		int num = 0;
		while(num <= 100) {
	    System.out.println(num);
	    num+=5;
		}
		
		System.out.println("\n\n");
		int java = 1;
		while(java <= 5) {
		System.out.println("Eu gosto de Java");
		java ++;
		}
		
		System.out.println("\n\n");
		
		
		int number = 0;
		int repetidor = 1;
		int soma;
		System.out.println("Informe 5 números");
		while(repetidor <= 5) {
	    soma = scanner.nextInt();
	    number += soma;
	    repetidor+=1;
	    }
		System.out.println("A soma dos números é:" + number);
		
		System.out.println("\n\n");
		System.out.println("\n\n");
	
		int usu;
		System.out.println("Informe a senha:");
		usu = scanner.nextInt();
		while(usu != 1234) {
		System.out.println("Tente de novo");
		usu = scanner.nextInt();
		}
		System.out.println("Parabéns");
		
		System.out.println("\n\n");
		
		int recres;
		System.out.println("informe um número:");
		recres = scanner.nextInt();
		System.out.println("\n");
		while (recres >= 1) {
			System.out.println(recres);
			recres--;
		}
		
	}
}
