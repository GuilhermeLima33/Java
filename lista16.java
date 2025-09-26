package primeiroProjeto;

import java.util.Scanner;

public class lista16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

        
        String[] cores = new String[6];
        for (int i = 0; i < cores.length; i++) {
            System.out.print("Digite a cor " + (i+1) + ": ");
            cores[i] = sc.next();
        }
        System.out.println("Cores digitadas:");
        for (int i = 0; i < cores.length; i++) {
            System.out.println(cores[i]);
        }

        System.out.println("--------------------------------------------------");
        double[] numerosDecimais = new double[8];
        for (int i = 0; i < numerosDecimais.length; i++) {
            System.out.print("Digite o número decimal " + (i+1) + ": ");
            numerosDecimais[i] = sc.nextDouble();
        }
        System.out.println("Números decimais digitados:");
        for (int i = 0; i < numerosDecimais.length; i++) {
            System.out.println(numerosDecimais[i]);
        }

        System.out.println("--------------------------------------------------");
        int[] numerosInteiros = new int[10];
        for (int i = 0; i < numerosInteiros.length; i++) {
            System.out.print("Digite o número inteiro " + (i+1) + ": ");
            numerosInteiros[i] = sc.nextInt();
        }
        System.out.println("Números pares digitados:");
        for (int i = 0; i < numerosInteiros.length; i++) {
            if (numerosInteiros[i] % 2 == 0) {
                System.out.println(numerosInteiros[i]);
            }
        }

        System.out.println("--------------------------------------------------");
        int[] numeros = new int[12];
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
            if (numeros[i] < 50) {
                System.out.println("menor que 50");
            }
        }

        System.out.println("--------------------------------------------------");
        String[] nomes = new String[5];
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i+1) + ": ");
            nomes[i] = sc.next();
        }
        System.out.print("Digite um nome para procurar: ");
        String procurar = sc.next();
        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(procurar)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("O nome existe no vetor!");
        } else {
            System.out.println("O nome não foi encontrado.");
        }

        System.out.println("--------------------------------------------------");
        String[] produtos = new String[4];
        double[] precos = new double[4];
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Digite o nome do produto " + (i+1) + ": ");
            produtos[i] = sc.next();
            System.out.print("Digite o preço do produto " + (i+1) + ": ");
            precos[i] = sc.nextDouble();
        }
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("O produto " + produtos[i] + " custa R$" + precos[i]);
        }

        System.out.println("--------------------------------------------------");
        double[] notas = new double[6];
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota " + (i+1) + ": ");
            notas[i] = sc.nextDouble();
        }
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 6) {
                System.out.println("Nota " + notas[i] + " - aluno reprovado");
            } else if (notas[i] >= 6 && notas[i] < 7) {
                System.out.println("Nota " + notas[i] + " - aluno em recuperação");
            } else {
                System.out.println("Nota " + notas[i] + " - aluno aprovado");
            }
        }

        System.out.println("--------------------------------------------------");
        double[] ingressos = new double[5];
        for (int i = 0; i < ingressos.length; i++) {
            System.out.print("Digite o preço do ingresso " + (i+1) + ": ");
            ingressos[i] = sc.nextDouble();
            if (ingressos[i] > 100) {
                System.out.println("Ingresso com promoção disponível!");
            }
        }

       
    }
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
