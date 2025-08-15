package primeiroProjeto;

import java.util.Scanner;

public class Lista4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner = new Scanner (System.in);
		
		
		//1 - Verificar maioridade
		int idade;
		System.out.println("Qual sua idade? ");
		idade = scanner.nextInt();
		if (idade >= 18) {
			System.out.println("Você tem " + idade + " anos e é maior de idade");
		}else {
			System.out.println("Você tem " + idade + " anos e é menor de idade");
		}

		
		
		//2 - Comparar dois números
		int n1;
		int n2;
		System.out.println("Informe um número: ");
		n1 = scanner.nextInt();
		System.out.println("Informe outro número: ");
		n2 = scanner.nextInt();
		if (n1 > n2) {
			System.out.println("O primeiro número é maior");
		}else {
			System.out.println("O segundo número é maior ou eles são iguais");
		}

		//3 - Aprovação por nota
		double nota1;
		System.out.println("informe sua nota: ");
		nota1 = scanner.nextDouble();
		if (nota1 > 7) {
			System.out.println("Aprovado: sua nota foi " + nota1);
		} else {
			System.out.println("Reprovado sua nota foi: " + nota1);
		}

		
		
		//4 - Verificar número positivo
		
		double numero;
		System.out.println("informe um número: ");
		numero = scanner.nextDouble();
		if (numero > 0) {
			System.out.println("O número é positivo");
		} else {
			System.out.println("O número é negativo ou zero");
		}
		
		
		
		
		
		//5 - Cálculo de frete
		double km;
		double frete;
		System.out.println("Qual a distância em KM da sua localização para a do estabelecimento?");
		km = scanner.nextDouble();
		if (km <= 50) {
	    frete = km + 10;
	    System.out.println("Valor do frete: R$ " + frete );
		}else {
		frete = km * 0.5; 
		System.out.println("Valor do frete: R$ " + frete);
		}

		//6 - O Número é 10?
		double numero2;
		System.out.println("informe um número: ");
		numero2 = scanner.nextDouble();
		if (numero2 == 10) {
			System.out.println("o número é 10");
		} else {
			System.out.println("o número não é 10");
		}

		//7 - Desconto para Associados
		
		String rp;
		System.out.println("Você é associado da loja?: ");
		rp = scanner.next();
		if (rp == "sim") {
			System.out.println("você tem desconto");
		} else {
			System.out.println("você não tem desconto");
		}
		
   
		
		//8 - Cálculo de bônus por horas extras
		
		double horaex;
		double bonus;
		System.out.println("Quantas Horas Extras trabalhadas você fez esse mês? ");
		horaex = scanner.nextDouble();
		if(horaex < 10) {
		bonus = horaex * 20;
		System.out.println("Bônus por hora extra R$ :" + bonus);	
		}else {
		bonus = horaex * 15;
		System.out.println("Bônus por hora extra R$ :" + bonus);
		}
		

		
		
	}

}
