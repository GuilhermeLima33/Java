package primeiroProjeto;

import java.util.Scanner;

public class lista5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		//1 - Classificação de idade
		int idade;
		System.out.println("Informe sua idade: ");
		idade = scanner.nextInt();
		if(idade < 12) {
		System.out.println("Criança");
		}else if (idade < 17) {
		System.out.println("Adolescente");
		}else if (idade < 59) {
		System.out.println("Adulto");
		}else {
		System.out.println("Idoso");	
		}

		
		//2 - Avaliação de Temperatura
		
		int temp;
		System.out.println("Informe a temperatura atual de sua região: ");
		temp = scanner.nextInt();
		if(temp < 10) {
		System.out.println("Muito Frio");
		}else if (temp < 20) {
		System.out.println("Frio");
		}else if (temp < 30) {
		System.out.println("Agradável");
		}else {
		System.out.println("Muito Quente");	
		}
		
		
		//3 - Sistema de Notas Escolares
		int nota;
		System.out.println("Qual sua nota final do trabalho educacional estudantil ? ");
		nota = scanner.nextInt();
		if(nota < 10) {
		System.out.println("A");
		}else if (nota > 90) {
		System.out.println("B");
		}else if (nota > 80) {
		System.out.println("C");
		}else if (nota > 70) {
		System.out.println("D");	
		}else {
		System.out.println("F");
		}

		//4 - Verificação de senha
		System.out.println("Digite uma senha: ");
		String senha = scanner.next();
		if (senha.equalsIgnoreCase("admin")) {
		System.out.println("Acesso permitido");
		}else {
		System.out.println("Acesso negado");
		}
		
		//5 - Comparação de nomes
		String nome1;
		String nome2;
		System.out.println("informe um nome: ");
		nome1= scanner.next();
		System.out.println("informe outro nome: ");
		nome2= scanner.next();
		if (nome1.equals(nome2)) {
		System.out.println("Os nomes são iguais");
		}else {
		System.out.println("Os nomes são diferentes");	
		}
		
		//6 - Jogo da cor favorita
		System.out.println("Qual sua cor favorita? ");
		String cor= scanner.next();
		if (cor.equalsIgnoreCase("azul")){
		System.out.println("Boa escolha");
	    }else if (cor.equalsIgnoreCase("vermelho")){
		System.out.println("cor Vibrante");
        }else if (cor.equalsIgnoreCase("verde")) {
        System.out.println("Cor da natureza");	
        }else {
        System.out.println("Cor não cadastrada");
        }

		
		//7 - Verificação de vogal
		 
	    System.out.println("Digite uma letra: ");
	    String letra= scanner.next();
	    if (letra.equalsIgnoreCase( "a")){
		System.out.println("É uma vogal");
	    }else if (letra.equalsIgnoreCase( "e")) {
		System.out.println("É uma vogal");
	    }else if (letra.equalsIgnoreCase( "i")) {
		System.out.println("É uma vogal");
	    }else if (letra.equalsIgnoreCase( "o")) {
		System.out.println("É uma vogal");
	    }else if (letra.equalsIgnoreCase( "u")) {
		System.out.println("É uma vogal");
	    }else {
	    System.out.println("Não é vogal");	
	    }


	}

}
