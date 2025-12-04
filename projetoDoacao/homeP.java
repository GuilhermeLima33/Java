package projetoDoacao;

import java.util.Scanner;

public class homeP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("SEJA BEM VINDO AO SITE");
		apresentacao ap = new apresentacao();
		ap.apresentacao();
		Scanner sc = new Scanner(System.in);

		String ficar;
do {
		System.out.println("Qual parte do site você deseja ver?");
		int opcao = sc.nextInt();
		
		

		if (opcao == 3) {
			doacao doacao = new doacao();
			doacao.informacaoDoacao();
			System.out.println("Você deseja fazer uma doação?");
			String resposta = sc.next();
			if (resposta.equalsIgnoreCase("sim")) {
				System.out.println("Qual a forma de pagamento?\n1-Cartão\n2-Pix");
				int pagamento = sc.nextInt();
				if (pagamento == 1) {
					System.out.println("Qual seu nome?");
					String nome = sc.next();
					doacao.setNome(nome);

					System.out.println("Qual seu email");
					String email = sc.next();
					doacao.setEmail(email);

					System.out.println("Qual o número do seu cartão");
					int numero = sc.nextInt();
					doacao.setNumero(numero);

					System.out.println("Qual sua senha?");
					int senha = sc.nextInt();
					doacao.setSenha(senha);

					System.out.println("Qual valor você deseja doar?");
					int valor = sc.nextInt();
					doacao.setValor(valor);

					System.out.println("Você deseja finalizar a doação?");
					String finalizar = sc.next();
					if (finalizar.equalsIgnoreCase("sim")) {
						System.out.println("Pagamento efetuado");
						doacao.doacao(resposta);
					} else {
						System.out.println("Pagamento canceldo");
					}

				} else {
					System.out.println("Chave pix: donateinsafe@gmail.com ");
				}
			}

			

		} else if (opcao == 5) {
			contato contato = new contato();
			System.out.println("Fale conosco:");

			System.out.println("Qual seu nome?");
			String nome = sc.next();
			contato.setNome(nome);

			System.out.println("Qual seu email?");
			String email = sc.next();
			contato.setEmail(email);

			System.out.println("Qual o assunto a ser abordado?");
			String assunto = sc.next();
			contato.setAssunto(assunto);

			System.out.println("Escreva sua mensagem:");
			String mensagem = sc.next();
			contato.setMensagem(mensagem);

			System.out.println("Você deseja enviar esse comentário?");
			String coment = sc.next();
			if (coment.equalsIgnoreCase("sim")) {
				System.out.println("Obrigado pelo comentário");
			} else {
				System.out.println("Comentário cancelado");
			}

			System.out.println("\nDeseja continuar navegando nessa página?");
			String nav = sc.next();
			if (nav.equalsIgnoreCase("sim")) {
				System.out.println("Perguntas Frequentes:\n");
				contato.perguntasFrequentes();
				System.out.println("Nossa localização:\n");
				System.out.println("Av. Sen. Roberto Símonsen, 550 - Jardim Imperador, Suzano - SP, 08673-270\n\n");
			} else {
				System.out.println("Se aventure em outras partes do site");
			}

			

		} else if (opcao == 1) {
			home h = new home();
			h.infoDoar();
			System.out.println("Para doar, vá para a página de doação, deseja fazer isso?");
			String pg = sc.next();
			if (pg.equalsIgnoreCase("sim")) {
				doacao doacao = new doacao();
				doacao.informacaoDoacao();
				System.out.println("Você deseja fazer uma doação?");
				String resposta = sc.next();
				if (resposta.equalsIgnoreCase("sim")) {
					System.out.println("Qual a forma de pagamento?\n1-Cartão\n2-Pix");
					int pagamento = sc.nextInt();
					if (pagamento == 1) {
						System.out.println("Qual seu nome?");
						String nome = sc.next();
						doacao.setNome(nome);

						System.out.println("Qual seu email");
						String email = sc.next();
						doacao.setEmail(email);

						System.out.println("Qual o número do seu cartão");
						int numero = sc.nextInt();
						doacao.setNumero(numero);

						System.out.println("Qual sua senha?");
						int senha = sc.nextInt();
						doacao.setSenha(senha);

						System.out.println("Qual valor você deseja doar?");
						int valor = sc.nextInt();
						doacao.setValor(valor);

						System.out.println("Você deseja finalizar a doação?");
						String finalizar = sc.next();
						if (finalizar.equalsIgnoreCase("sim")) {
							System.out.println("Pagamento efetuado");
							doacao.doacao(resposta);
						} else {
							System.out.println("Pagamento canceldo");
						}

					} else {
						System.out.println("Chave pix: donateinsafe@gmail.com ");
					}
				}
			} else {
				System.out.println("Obrigado, fica para a próxima");
			}

			System.out.println("Você quer continuar nessa página?");
			String hom = sc.next();
			if (hom.equalsIgnoreCase("sim")) {
				h.infoDoar();
				h.juntos();
			} else {
				System.out.println("Se aventure em outras partes do site");
			}

			

		} else if (opcao == 4) {
			instituicao ins = new instituicao();
			System.out.println("Venha conferir nossas parcerias:\n");
			ins.instituicoes();

			
		} else if (opcao == 2) {

			System.out.println("Venha acompanhar nossa história: ");
			historia his = new historia();
			his.historia();
		}

		System.out.println("\nDeseja permanecer no site?");
		ficar = sc.next();
		if (ficar.equalsIgnoreCase("sim")) {
			ap.apresentacao();
		} else {
			System.out.println("Volte sempre");
		}

}while(ficar.equalsIgnoreCase("sim"));






}
		
		
		
		
	}


