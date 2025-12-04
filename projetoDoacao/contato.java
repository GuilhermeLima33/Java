package projetoDoacao;

public class contato {
	
	private String nome;
	private String email;
	private String assunto;
	private String mensagem;

	public void perguntasFrequentes () {
		System.out.println("Como posso fazer uma doação?\nR: Você pode doar via Pix, transferência bancária ou presencialmente. Aceitamos doações de qualquer valor\n\n");
		System.out.println("Para quem vão as doações?\nR: As doações são destinadas a famílias em situação de vulnerabilidade cadastradas no nosso projeto.\n\n");
		System.out.println("Posso doar roupas e alimentos?\nR: Sim! Aceitamos roupas, alimentos e itens de higiene. Entre em contato para agendar a entrega.\n\n");
		System.out.println("Como sei que minha doação foi recebida?\nR: Enviamos um comprovante digital ou mensagem de agradecimento confirmando o recebimento.\n\n");
		System.out.println("Posso acompanhar o impacto das doações?\nR: Sim! Publicamos relatórios e fotos das ações realizadas com as doações em nossas redes sociais.");
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
}
