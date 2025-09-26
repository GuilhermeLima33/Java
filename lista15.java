package primeiroProjeto;

import java.util.Scanner;

public class lista15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        
        
        String[] frutas = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da fruta " + (i+1) + ": ");
            frutas[i] = sc.next();
        }
        System.out.println("Frutas digitadas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        
       
        int[] numeros10 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros10[i] = sc.nextInt();
        }
        System.out.println("Números digitados:");
        for (int n : numeros10) {
            System.out.println(n);
        }

        
   
        int[] numeros7 = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros7[i] = sc.nextInt();
        }
        System.out.println("Números em ordem inversa:");
        for (int i = 6; i >= 0; i--) {
            System.out.println(numeros7[i]);
        }

        
        
        int[] numeros100 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros100[i] = sc.nextInt();
        }
        for (int n : numeros100) {
            if (n > 100) {
                System.out.println(n + " é maior do que 100");
            }
        }

       
      
        int[] numeros8 = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros8[i] = sc.nextInt();
        }
        System.out.print("Digite um número para procurar: ");
        int procurado = sc.nextInt();
        boolean encontrado = false;
        for (int n : numeros8) {
            if (n == procurado) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Número encontrado no vetor!");
        } else {
            System.out.println("Número não existe no vetor!");
        }

       
       
        String[] nomes = new String[5];
        int[] idades = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da pessoa " + (i+1) + ": ");
            nomes[i] = sc.next();
            System.out.print("Digite a idade de " + nomes[i] + ": ");
            idades[i] = sc.nextInt();
        }
        System.out.println("Informações:");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i] + " tem " + idades[i] + " anos");
        }

        
        
        int[] idades10 = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a idade " + (i+1) + ": ");
            idades10[i] = sc.nextInt();
        }
        for (int idade : idades10) {
            if (idade < 18) {
                System.out.println(idade + " anos - você é menor de idade");
            }
        }

        
        System.out.println("\n===== Exercício 8 - Aumento em massa =====");
        double[] salarios = new double[7];
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o salário da pessoa " + (i+1) + ": ");
            salarios[i] = sc.nextDouble();
        }
        for (double s : salarios) {
            if (s <= 2500) {
                System.out.println("Salário " + s + " - você receberá um aumento");
            }
        }

  
    

	}

}
