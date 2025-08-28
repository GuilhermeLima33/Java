package primeiroProjeto;

import java.util.Scanner;

public class lista6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------------------------------------");
//		1 - Intervalo numérico
		Scanner scanner= new Scanner (System.in);
		System.out.println("Informe um número: ");
		int numero = scanner.nextInt();
		if(numero >= 10 && numero <= 20) {
		System.out.println("Número dentro do intervalo");
		}else {
		System.out.println("Número fora do intervalo");
		}

		
		System.out.println("-------------------------------------------");
		System.out.println("Qual sua idade? ");
		int idade = scanner.nextInt();
		System.out.println("Você tem convite para entrar? (true/false)");
		boolean convite = scanner.nextBoolean();
		if (idade >= 18 && convite) {
		System.out.println("Entrada permitida");
		}else {
		System.out.println("Entrada negada");
		}
		
		
		
		
		
		
		
		System.out.println("-------------------------------------------");
//		3 - Categoria de esporte
        System.out.println("Qual sua idade? ");
        int idad = scanner.nextInt();
        if (idad < 12 || idad >60) {
        System.out.println("Categoria especial");	
        }else {
        System.out.println("Categoria normal");
        }
        
        
        
        
        
        System.out.println("-------------------------------------------");
       // 4 - Desconto no produto
       System.out.println("Qual a forma de pagamento? ");
       String paga = scanner.next();
       System.out.println("qual o valor da compra? ");
       int comp = scanner.nextInt();
       
       double desconto = comp * 0.10;
       double result = comp - desconto;
       
       if (paga.equalsIgnoreCase("Avista") && comp > 100 ) {
      System.out.println("Valor com desconto : " + result);
       }else {
      System.out.println("Valor sem desconto" + paga);
       }
       
       System.out.println("-------------------------------------------");
//		5 - Triagem médica
		
		System.out.println("Qual a temperatura atual de seu corpo? ");
		double temp = scanner.nextDouble();
		System.out.println ("Você está sentindo sintomas? ");
		String resp = scanner.next();
		if (temp >= 30 || resp.equalsIgnoreCase("Sim") ) {
		System.out.println("Recomenda-se procurar um médico");	
		}else {
		System.out.println("Sem sinais preocupantes");	
		}
		
		
		
		
		
		
		System.out.println("-------------------------------------------");
             //	6 - Votação
		
		 System.out.println("Qual a sua idade?? ");
			double anos = scanner.nextDouble();
			System.out.println ("Você é barsileiro? ");
			String br = scanner.next();
			if (anos >= 16 || br.equalsIgnoreCase("Sim") ) {
			System.out.println("Você está liberado para votar");	
			}else {
			System.out.println("Não pode votar");	
			}
		
			System.out.println("-------------------------------------------");
//		7 - Bônus de funcionário
	System.out.println("quantas horas extras você tem esse mês? ");
	int hr = scanner.nextInt();
	System.out.println("Qual seu número de faltas? ");
	int ft = scanner.nextInt();	
	if(hr>20 && ft<5) {
	System.out.println("Ganha bõnus");	
	}else {
	System.out.println("Não ganha bõnus");
	}
			
			
	
	
	
	
	
	
//	8 - Autorização para dirigir
		
	
	 System.out.println("Qual a sua idade?? ");
		double anoss = scanner.nextDouble();
		System.out.println ("Você tem carteira de motorista? ");
		String carro = scanner.next();
		if (anoss >= 18 || carro.equalsIgnoreCase("Sim") ) {
		System.out.println("Você pode possuir carteira de motorista");	
		}else {
		System.out.println("Não pode dirigir");	
		}	
	
	
	
	
	//9 - Elegibilidade para Bolsa de Estudos

		System.out.println("------------------------------");
		System.out.println("Qual sua nota média? (0 a 10)");
		double nota = scanner.nextDouble();
		System.out.println("Qual sua frequência (0 a 100) ");
		int frequencia = scanner.nextInt();
		if (nota >= 7 || frequencia >= 75) {
		System.out.println("Bolsa concedida");
		}else {
		System.out.println("Bolsa não concedida");
		}
	
//	10 - Verificação de Temperatura Ambiente
		
System.out.println("Qual a temperatura atual predominante? ");
double temperatura = scanner.nextDouble();
System.out.println("Qual a umidade local? ");
double umi = scanner.nextDouble();
if (temperatura  > 18 && temperatura < 26 && umi > 60) {
System.out.println("Climatização não necessária");
}else {
	System.out.println("Ajustar climatização");
}
	}

}
