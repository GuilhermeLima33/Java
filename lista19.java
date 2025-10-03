package primeiroProjeto;

public class lista19 {

	public static void main(String[] args) {
		
			
			        Valor(-5);
			        traco();
			        maior(17);
			        traco();
			        boasVindas("gui");
			        traco();
			        tabuada(2);
			        traco();
			        Palavras("Html", "gui");
			        traco();
			        ParOuImpar(17);
			        traco();
			        Temperatura(20);
			        traco();
			        Turno("noite");
			        traco();
			        Media(5,6,10);
			        traco();
			        Aprovacao(10);
			    }
			
			
			
		
			

	public static void traco() {
		System.out.println("---------------------------------------------");
	}
	
		    public static void Valor(int numero) {
		        if (numero > 0) {
		            System.out.println("O número é positivo.");
		        } else if (numero < 0) {
		            System.out.println("O número é negativo.");
		        } else {
		            System.out.println("O número é zero.");
		        }
		    }

		    
		    public static void maior(int idade) {
		        if (idade >= 18) {
		            System.out.println("Maior de idade.");
		        } else {
		            System.out.println("Menor de idade.");
		        }
		    }

		   
		    public static void boasVindas(String nome) {
		        System.out.println("Seja bem-vindo(a), " + nome + "!");
		    }

		    
		    public static void tabuada(int numero) {
		        System.out.println("Tabuada do " + numero + ":");
		        for (int i = 1; i <= 10; i++) {
		            System.out.println(numero + " x " + i + " = " + (numero * i));
		        }
		    }

		    
		    public static void Palavras(String palavra1, String palavra2) {
		        System.out.println("Resultado: " + palavra1 + palavra2);
		    }

		    
		    public static void ParOuImpar(int numero) {
		        if (numero % 2 == 0) {
		            System.out.println(numero + " é par.");
		        } else {
		            System.out.println(numero + " é ímpar.");
		        }
		    }

		    
		    public static void Temperatura(double temperatura) {
		        if (temperatura < 15) {
		            System.out.println("Frio");
		        } else if (temperatura <= 25) {
		            System.out.println("Agradável");
		        } else {
		            System.out.println("Quente");
		        }
		    }

		    
		    public static void Turno(String turno) {
		        switch (turno.toLowerCase()) {
		            case "manhã":
		                System.out.println("Bom dia!");
		                break;
		            case "tarde":
		                System.out.println("Boa tarde!");
		                break;
		            case "noite":
		                System.out.println("Boa noite!");
		                break;
		            default:
		                System.out.println("Turno inválido!");
		        }
		    }

		    
		    public static void Media(double n1, double n2, double n3) {
		        double media = (n1 + n2 + n3) / 3.0;
		        System.out.println("Média: " + media);
		    }

		    
		    public static void Aprovacao(double notaFinal) {
		        if (notaFinal >= 7) {
		            System.out.println("Aprovado");
		        } else if (notaFinal >= 5) {
		            System.out.println("Em recuperação");
		        } else {
		            System.out.println("Reprovado");
		        }
		    }

		    

		}

	


