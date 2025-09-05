package primeiroProjeto;

import java.util.Scanner;

public class lista8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1 - Classificação de Dia da Semana


		Scanner scanner = new Scanner (System.in);
		System.out.println("Fale um número de 1 a 7: (Representa os dias da semana)");
		int num = scanner.nextInt();
		 switch (num) {
		 case 1:
			 System.out.println("Fim de semana");
			 break;
		 case 2:
			 System.out.println("Dia útil");
			 break;
		 case 3:
			 System.out.println("Dia útil");
			 break;
		 case 4:
			 System.out.println("Dia útil");
			 break;
		 case 5:
			 System.out.println("Dia útil");
			 break;
		 case 6:
			 System.out.println("Dia inválido");
			 break;
		 case 7:
			 System.out.println("Fim de semana");
			 break;
			 default:
				 System.out.println("Dia inválido");
		 }
		 System.out.println("\n\n");
				 
//				 2 - Menu de Bebidas

			System.out.println("Informe o código da sua bebida:");
			System.out.println("1-Café\n2-Chá\n3-Suco\n4-Refrigerante");
			int bebida = scanner.nextInt();
			switch (bebida) {
			case 1:
				System.out.println("$5,00");
				break;
			case 2:
				System.out.println("$3,50");
				break;
			case 3:
				System.out.println("$4,00");
				break;
			case 4:
				System.out.println("$4,50");
				break;
					default:
						System.out.println("Código inválido");
 }
			System.out.println("\n\n");
			
//			3 - Tipo de Veículo

			System.out.println("Informe um veiculo:");
			System.out.println("1-Carro\n2-Moto\n3-Caminhão");
			int auto = scanner.nextInt();
			switch (auto) {
			case 1:
				System.out.println("Leve");
				break;
			case 2:
				System.out.println("Motocicleta");
				break;
			case 3:
				System.out.println("Pesado");
				break;
				default:
					System.out.println("Veículo inválido");
	}
			System.out.println("\n\n");
			
		
//		4 - Escolha de Plano de Assinatura
			System.out.println("Informe o código do seu plano:");
			System.out.println("1-Básico\n2-Intermediário\n3-Premium");
			int plano = scanner.nextInt();
			switch (plano) {
			case 1:
				System.out.println("Acesso limitado");
				break;
			case 2:
				System.out.println("Acesso padrão + suporte");
				break;
			case 3:
				System.out.println("Acesso total + suporte prioritário");
				break;
				default:
					System.out.println("Plano inválido");
			}
			System.out.println("\n\n");
					
//					5 - Seleção de Mês
			System.out.println("Escolha um número de um mês:");
			int mes = scanner.nextInt();
			 switch (mes) {
			 case 1:
				 System.out.println("Verão");
				 break;
			 case 2:
				 System.out.println("Verão");
				 break;
			 case 3:
				 System.out.println("Outono");
				 break;
			 case 4:
				 System.out.println("Outono");
				 break;
			 case 5:
				 System.out.println("Outono");
				 break;
			 case 6:
				 System.out.println("Inverno");
				 break;
			 case 7:
				 System.out.println("Inverno");
				 break;
			 case 8:
				 System.out.println("Inverno");
				 break;
			 case 9:
				 System.out.println("Primavera");
				 break;
			 case 10:
				 System.out.println("Primavera");
				 break;
			 case 11:
				 System.out.println("Primavera");
				 break;
			 case 12:
				 System.out.println("Verão");
				 break;
				 default:
					 System.out.println("Mês inválido");
			 }
	
			
			
			System.out.println("\n\n");
			
//			6 - Tipo de Ingresso
			System.out.println("Informe o código de seu ingresso:");
			System.out.println("1-Inteira\n2-Meia entrada\n3-Vip");
			int ingre = scanner.nextInt();
			switch (ingre) {
			case 1:
				System.out.println("Acesso limitado");
				break;
			case 2:
				System.out.println("Acesso padrão + suporte");
				break;
			case 3:
				System.out.println("Acesso total + suporte prioritário");
				break;
				default:
					System.out.println("Plano inválido");
			}
			System.out.println("\n\n");
//			7 - Escolha de Idioma

			System.out.println("Informe o código de idioma:");
			System.out.println("1-Português\n2-Inglês\n3-Espanhol");
			int idioma = scanner.nextInt();
			switch (idioma) {
			case 1:
				System.out.println("Olá");
				break;
			case 2:
				System.out.println(" Hello");
				break;
			case 3:
				System.out.println("Hola");
				break;
				default:
					System.out.println("Idioma inválido");
			}
			System.out.println("\n\n");
			System.out.println("Informe o código de nível:");
			System.out.println("1-Usuário\n2-Moderador\n3-Administrador");
			int niv = scanner.nextInt();
			switch (niv) {
			case 1:
				System.out.println("Acesso básico");
				break;
			case 2:
				System.out.println("Acesso básico + edição");
				break;
			case 3:
				System.out.println("Acesso total");
				break;
				default:
					System.out.println("Nível inválido");
			}
			System.out.println("\n\n");
			System.out.println("Informe o código de pagamento:");
			System.out.println("1-Dinheiro\n2-Cartão\n3-Pix");
			int pag = scanner.nextInt();
			switch (pag) {
			case 1:
				System.out.println("Pagamento em dinheiro confirmado");
				break;
			case 2:
				System.out.println("Pagamento com cartão processado");
				break;
			case 3:
				System.out.println("Pagamento via Pix realizado");
				break;
				default:
					System.out.println("Método inválido");
			}
			
	}

}
