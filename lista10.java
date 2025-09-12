package primeiroProjeto;

import java.util.Scanner;

public class lista10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		
		
		int num = 10;
		while (num <= 30) {
		System.out.println(num);
		num++;
		
		}
		
		
		
		System.out.println("----------------------");
		int contador3=1;
		int soma1= 0;
		while (contador3 <= 3) {
		System.out.println("Informe o Número" + contador3 + ":");
		int numero = sc.nextInt();
		soma1= soma1 + numero;
		contador3++;
		
		}
		System.out.println("A soma é:"+ soma1);
		System.out.println("------------------------");
		
		
		System.out.println("----------------------");
		int contador2 =1;
		int mult= 1;
		while (contador2 <= 5) {
		System.out.println("Informe o Número" + contador2 + ":");
		int numero2 = sc.nextInt();
		mult= mult * numero2;
		contador2++;
		
		
		}
		System.out.println("A multiplicação é:"+ mult);
		System.out.println("------------------------");
		
		System.out.println("Informe um número:");
		int n1 = sc.nextInt();
		int n2 = 1;
		while (n2<=n1) {
		System.out.println(n2);
		n2++;
		}
		
		System.out.println("------------------------");
		
		int n3 = 1;
		int so = 0;
		while(n3 <= 5) {
			so += n3;
			n3++;
			
		}
		
System.out.println("a soma dos números de 1 a 5 é" + so);
		System.out.println("------------------------");
        System.out.println("\n6 - Tabuada:");
        System.out.print("Digite um número: ");
        int tabuada = sc.nextInt();
        contador2 = 1;
        while (contador2 <= 10) {
            System.out.println(tabuada + " x " + contador2 + " = " + (tabuada * contador2));
            contador2++;
        }

        
       
    
        
	}

}
