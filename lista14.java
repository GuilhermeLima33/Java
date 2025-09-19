package primeiroProjeto;

import java.util.Scanner;

public class lista14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
     
        // 1 - Contador
        System.out.println("Exercício 1 - Contador (1 até 10)");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------------------------------");

        // =======================
        // 2 - Somando números de 1 a 100
        System.out.println("Exercício 2 - Somando números de 1 a 100");
        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            soma += i;
        }
        System.out.println("A soma de 1 a 100 é: " + soma);
        System.out.println("------------------------------------");

        // =======================
        // 3 - Números pares de 1 a 20
        System.out.println("Exercício 3 - Números pares de 1 a 20");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n------------------------------------");

        // =======================
        // 4 - Tabuada de um número
        System.out.println("Exercício 4 - Tabuada de um número");
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        System.out.println("------------------------------------");

        // =======================
        // 5 - Contar números divisíveis por 3 de 1 a 50
        System.out.println("Exercício 5 - Contar divisíveis por 3 (1 a 50)");
        int contador = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }
        System.out.println("Existem " + contador + " números divisíveis por 3 entre 1 e 50.");
        System.out.println("------------------------------------");

        // =======================
        // 6 - Números ímpares de 1 até N
        System.out.println("Exercício 6 - Números ímpares de 1 até N");
        System.out.print("Digite o valor de N: ");
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\n------------------------------------");

        // =======================
        // 7 - Multiplicação de valores
        System.out.println("Exercício 7 - Multiplicação de 5 valores");
        int multiplicacao = 1;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o valor " + i + ": ");
            int valor = sc.nextInt();
            multiplicacao *= valor;
        }
        System.out.println("O resultado da multiplicação é: " + multiplicacao);
        System.out.println("------------------------------------");

        // =======================
        // 8 - Premiação da empresa
        System.out.println("Exercício 8 - Premiação da empresa");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o tempo de empresa (em anos) do funcionário " + i + ": ");
            int anos = sc.nextInt();
            if (anos > 10) {
                System.out.println("Funcionário " + i + ": Parabéns! Você irá receber um prêmio.");
            } else {
                System.out.println("Funcionário " + i + ": Quase lá.");
            }
        }
        System.out.println("------------------------------------");

       
    }

	}


