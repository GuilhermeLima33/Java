package primeiroProjeto;

import java.util.Scanner;

public class lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           //1 - Resultado de dois números

		
		Scanner scanner = new Scanner(System.in);
		int n1;
		int n2;
		System.out.println("Informe um número: " );
		n1 = scanner.nextInt();
		System.out.println("Informe outro número: " );
		n2 = scanner.nextInt();
		int soma = n1+n2;
				int sub=n1-n2;
				int mult=n1*n2;
				int div=n1/n2;
				System.out.println("O valor da soma é: " + soma );	
				System.out.println("O valor da subtração é: " + sub );
				System.out.println("O valor da multiplicação é: " + mult);
				System.out.println("O valor da divisão é: "+ div );
		
				
				
				//2 - Cálculo de temperatura
				double temperatura;
				System.out.println("Informe uma temperatura em Celsius: ");
				temperatura = scanner.nextDouble();
				double total = (temperatura * 1.8) + 32;
				System.out.println(" calculo em fahrenheit: " + total);
				
				
				//3 - Conversão de valor
				double dolar;
				System.out.println("Informe o valor a ser convertido: ");
				dolar = scanner.nextDouble();
		        double real = dolar / 5.70;
                System.out.println("Conversão para real: " + real);
				
                //4 - Área do retângulo
                int base;
                int altura;
                System.out.println("Informe o comprimento da base do retângulo: ");
                base = scanner.nextInt();
                System.out.println("Informe o comprimento da altura do retângulo: ");
                altura = scanner.nextInt();
                int retan = base * altura;
                System.out.println("A área do retângulo é: " + retan);
                
                //5 - Conversor de idade
                int idade;
				System.out.println("Informe sua idade: ");
				idade = scanner.nextInt();
		        int mes = idade * 12;
                System.out.println("Você tem " + mes + " meses de vida");
                
                
                //6 - Conversor de minutos para segundos
                int min;
				System.out.println("Informe o valor em minutos: ");
				min = scanner.nextInt();
		        int seg = min * 60;
                System.out.println("Conversão em segundos: " + seg);
                
                
               //7 - Custo da compra
                int preco;
                int quant;
                System.out.println("Informe o preço do produto: ");
                preco = scanner.nextInt();
                System.out.println("Informe a quantidade comprada: ");
                quant = scanner.nextInt();
                int custo = preco * quant;
                System.out.println("O custo total é de: " + custo);
                
                
               //8 - Divisão de uma conta de restaurante
                int conta;
                int pessoas;
                System.out.println("Qual o valor total da compra? ");
                conta = scanner.nextInt();
                System.out.println("Quantas pessoas tem para dividir o valor igualmente? ");
                pessoas = scanner.nextInt();
                int valor = conta / pessoas;
                System.out.println("Cada pessoa deve pagar R$" + valor);
                
               //9 - Cálculo de troco
                int compra;
                int cliente;
                System.out.println("Qual o valor total da compra? ");
                compra = scanner.nextInt();
                System.out.println("Qual valor pago pelo cliente? ");
                cliente = scanner.nextInt();
                int troco = cliente - compra;
                System.out.println("O troco é de: " + troco);


                
                
                
                
                
                
                
                
	}

}
