package primeiroProjeto;

import java.util.Scanner;

public class lista3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 - Resultado de dois números

		
		Scanner scanner = new Scanner(System.in);
		int n1;
		int n2;
		System.out.println("Informe um número: ");
		n1 = scanner.nextInt();
		System.out.println("Informe outro número: ");
		n2 = scanner.nextInt();
		int soma = n1 + n2;
		System.out.println("O valor da soma é de :" + soma);


		//2 - Divisão e Resto
		int n3;
		int n4;
		System.out.println("Informe um número: ");
		n3 = scanner.nextInt();
		System.out.println("Informe outro número: ");
		n4 = scanner.nextInt();
		int div = n3 / n4;
		int resto = n3 % n4;
		System.out.println("O valor da dvisão é de :" + div);
		System.out.println("O valor do resto é de :" + resto);
		
		
		//3 - Perímetro de um triângulo
		int valor1;
		int valor2;
		int valor3;
		System.out.println("Informe o valor do lado 1: ");
		valor1 = scanner.nextInt();
		System.out.println("Informe o valor do lado 2: ");
		valor2 = scanner.nextInt();
		System.out.println("Informe o valor do lado 3: ");
		valor3 = scanner.nextInt();
		int perimetro = valor1 + valor2 + valor3;
		System.out.println("O perémetro do triângulo é de :" + perimetro);
		

		
		
		//4 - Calculadora de Gorjeta

		int n5;
		int n6;
		System.out.println("Valor da conta: ");
		n5 = scanner.nextInt();
		System.out.println("Gorjeta: ");
		n6 = scanner.nextInt();
		int gorjeta = n5 * (n6 / 100) ;
		int total= n5 + gorjeta ;
		System.out.println("O valor total a se pagar é de :" + total);
		

		
		//5 - Calculadora de área de círculo
		double circulo;
		System.out.println("Qual o raio do círculo em metros: ");
		circulo = scanner.nextDouble();
		double n10 = 3.14159 * circulo * circulo;
		System.out.println("Sua área é de: " + n10);
		
		
		//6 - Conversor de idade em dias
		int idade;
		int meses;
		int dias;
		System.out.println("Informe sua idade em anos: ");
		idade = scanner.nextInt();
		System.out.println("Informe sua idade em meses: ");
		meses = scanner.nextInt();
		System.out.println("Informe sua idade em dias: ");
		dias = scanner.nextInt();
		int totaldias = (idade*365) + (meses*30) + dias;
		System.out.println("Total de dias vividos: " + totaldias);
		
		
		//7 - Calculadora de pagamento por hora
		
		double horas;
		double valorHoras;
		System.out.println("Informe o número de horas trabalhadas: ");
		horas = scanner.nextInt();
		System.out.println("Informe o valor pago por horas trabalhadas: ");
		valorHoras = scanner.nextInt();
		double salarioBruto = horas * valorHoras;
		double imposto = salarioBruto * 0.10;
		double liquido = salarioBruto - imposto;
		System.out.println("Salário bruto: " + salarioBruto);
		System.out.println("Imposto: " + imposto);
		System.out.println("Salário líquido: " + liquido);
		
		
		

		
		
		


		
	}

}
