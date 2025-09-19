package primeiroProjeto;

import java.util.Scanner;

public class lista13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);

        // =======================
        // 1 - Contador
        System.out.println("Exercício 1 - Contador (10 até 30)");
        for (int i = 10; i <= 30; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------------------------------");

        // =======================
        // 2 - Classificação de Idades
        System.out.println("Exercício 2 - Classificação de Idades");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite a idade " + i + ": ");
            int idade = sc.nextInt();
            if (idade >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        }
        System.out.println("------------------------------------");

        // =======================
        // 3 - Eleição
        System.out.println("Exercício 3 - Eleição");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o voto " + i + " (1-4 candidatos, 5=nulo, 6=branco): ");
            int voto = sc.nextInt();
            switch (voto) {
                case 1:
                    System.out.println("Votou no candidato 1");
                    break;
                case 2:
                    System.out.println("Votou no candidato 2");
                    break;
                case 3:
                    System.out.println("Votou no candidato 3");
                    break;
                case 4:
                    System.out.println("Votou no candidato 4");
                    break;
                case 5:
                    System.out.println("Voto Nulo");
                    break;
                case 6:
                    System.out.println("Voto em Branco");
                    break;
                default:
                    System.out.println("Código inválido");
            }
        }
        System.out.println("------------------------------------");

        // =======================
        // 4 - Repetição de Frase
        System.out.println("Exercício 4 - Repetição de Frase");
        sc.nextLine(); // limpar buffer
        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();
        System.out.print("Digite um número: ");
        int repeticoes = sc.nextInt();
        for (int i = 1; i <= repeticoes; i++) {
            System.out.println(frase);
        }
        System.out.println("------------------------------------");

        // =======================
        // 5 - Sequência de 50 até 30
        System.out.println("Exercício 5 - Sequência de 50 até 30");
        for (int i = 50; i >= 30; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------------------------------");

        // =======================
        // 6 - Números alternados (1 a 50 ímpares)
        System.out.println("Exercício 6 - Números alternados (1,3,5...50)");
        for (int i = 1; i <= 50; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n------------------------------------");

        // =======================
        // 7 - Aprovado ou Reprovado
        System.out.println("Exercício 7 - Aprovado ou Reprovado");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a nota " + i + ": ");
            double nota = sc.nextDouble();
            if (nota >= 6) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }
        System.out.println("------------------------------------");

        // =======================
        // 8 - Categoria de Idade
        System.out.println("Exercício 8 - Categoria de Idade");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();
            if (idade <= 12) {
                System.out.println("Criança");
            } else if (idade <= 17) {
                System.out.println("Adolescente");
            } else if (idade <= 59) {
                System.out.println("Adulto");
            } else {
                System.out.println("Idoso");
            }
        }
        System.out.println("------------------------------------");

        // =======================
        // 9 - Número Positivo, Negativo ou Zero
        System.out.println("Exercício 9 - Número Positivo, Negativo ou Zero");
        for (int i = 1; i <= 7; i++) {
            System.out.print("Digite o número " + i + ": ");
            int numero = sc.nextInt();
            if (numero > 0) {
                System.out.println("Positivo");
            } else if (numero < 0) {
                System.out.println("Negativo");
            } else {
                System.out.println("Zero");
            }
        }
        System.out.println("------------------------------------");

        
}
	}


