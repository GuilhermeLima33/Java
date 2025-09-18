package primeiroProjeto;

import java.util.Scanner;

public class dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
 
int contador=1;
do {
	System.out.println("gui");
	contador ++; //+1
}while (contador<=5);

System.out.println("------------------------------------------");

int idade;
int voltas = 1;
do {
	System.out.println("Qual sua idade? ");
	idade = sc.nextInt();
	if (idade>=18) {
		System.out.println("Maior de idade");
	}else {
		System.out.println("Menor de idade");
	}
	voltas++;
}while (voltas<=3);

System.out.println("-----------------------------------------------");
int senha;
do {
System.out.println("Qual a senha?");	
senha=sc.nextInt();
}while (senha!= 1234);


System.out.println("-----------------------------------------------");
int dias=1;
int totalpassos = 0;
do {
	System.out.println("Quantos passos você deu hoje?");
	int passos = sc.nextInt();
	totalpassos = totalpassos + passos;
	dias++;
}while (dias<= 3);
System.out.println("Você caminhou " + totalpassos);










	}

}
